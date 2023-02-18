// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Name("Ort::detail::ValueImpl<OrtValue>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ValueImpl extends ConstValueImpl {
    static { Loader.load(); }
    /** Default native constructor. */
    public ValueImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ValueImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ValueImpl position(long position) {
        return (ValueImpl)super.position(position);
    }
    @Override public ValueImpl getPointer(long i) {
        return new ValueImpl((Pointer)this).offsetAddress(i);
    }


  /** <summary>
   *  Returns a non-const typed pointer to an OrtValue/Tensor contained buffer
   *  No type checking is performed, the caller must ensure the type matches the tensor type.
   *  </summary>
   *  <returns>non-const pointer to data, no copies made</returns> */
  public native @Name("GetTensorMutableData<float>") FloatPointer GetTensorMutableDataFloat();
  public native @Name("GetTensorMutableData<double>") DoublePointer GetTensorMutableDataDouble();
  public native @Name("GetTensorMutableData<int8_t>") BytePointer GetTensorMutableDataByte();
  public native @Name("GetTensorMutableData<int16_t>") ShortPointer GetTensorMutableDataShort();
  public native @Name("GetTensorMutableData<int32_t>") IntPointer GetTensorMutableDataInt();
  public native @Cast("int64_t*") @Name("GetTensorMutableData<int64_t>") LongPointer GetTensorMutableDataLong();
  public native @Cast("uint8_t*") @Name("GetTensorMutableData<uint8_t>") BytePointer GetTensorMutableDataUByte();
  public native @Cast("uint16_t*") @Name("GetTensorMutableData<uint16_t>") ShortPointer GetTensorMutableDataUShort();
  public native @Cast("uint32_t*") @Name("GetTensorMutableData<uint32_t>") IntPointer GetTensorMutableDataUInt();
  public native @Cast("uint64_t*") @Name("GetTensorMutableData<uint64_t>") LongPointer GetTensorMutableDataULong();
  public native @Cast("bool*") @Name("GetTensorMutableData<bool>") BoolPointer GetTensorMutableDataBool();

  /** <summary>
   *  Returns a non-typed non-const pointer to a tensor contained data.
   *  </summary>
   *  <returns>pointer to data, no copies made</returns> */
  public native Pointer GetTensorMutableRawData();

  /** <summary> */
  //  Obtain a reference to an element of data at the location specified
  /** by the vector of dims.
  /** </summary>
  /** <typeparam name="R"></typeparam>
  /** <param name="location">[in] expressed by a vecotr of dimensions offsets</param>
  /** <returns></returns> */

  /** <summary>
   *  Set all strings at once in a string tensor
   *  </summary>
   *  <param name="s">[in] An array of strings. Each string in this array must be null terminated.</param>
   *  <param name="s_len">[in] Count of strings in s (Must match the size of \p value's tensor shape)</param> */
  public native void FillStringTensor(@Cast("const char*const*") PointerPointer s, @Cast("size_t") long s_len);
  public native void FillStringTensor(@Cast("const char*const*") @ByPtrPtr BytePointer s, @Cast("size_t") long s_len);
  public native void FillStringTensor(@Cast("const char*const*") @ByPtrPtr ByteBuffer s, @Cast("size_t") long s_len);
  public native void FillStringTensor(@Cast("const char*const*") @ByPtrPtr byte[] s, @Cast("size_t") long s_len);

  /** <summary>
   *  Set a single string in a string tensor
   *  </summary>
   *  <param name="s">[in] A null terminated UTF-8 encoded string</param>
   *  <param name="index">[in] Index of the string in the tensor to set</param> */
  public native void FillStringTensorElement(@Cast("const char*") BytePointer s, @Cast("size_t") long index);
  public native void FillStringTensorElement(String s, @Cast("size_t") long index);

// #if !defined(DISABLE_SPARSE_TENSORS)
  /** <summary>
   *  Supplies COO format specific indices and marks the contained sparse tensor as being a COO format tensor.
   *  Values are supplied with a CreateSparseTensor() API. The supplied indices are not copied and the user
   *  allocated buffers lifespan must eclipse that of the OrtValue.
   *  The location of the indices is assumed to be the same as specified by OrtMemoryInfo argument at the creation time.
   *  </summary>
   *  <param name="indices_data">pointer to the user allocated buffer with indices. Use nullptr for fully sparse tensors.</param>
   *  <param name="indices_num">number of indices entries. Use 0 for fully sparse tensors</param> */
  public native void UseCooIndices(@Cast("int64_t*") LongPointer indices_data, @Cast("size_t") long indices_num);
  public native void UseCooIndices(@Cast("int64_t*") LongBuffer indices_data, @Cast("size_t") long indices_num);
  public native void UseCooIndices(@Cast("int64_t*") long[] indices_data, @Cast("size_t") long indices_num);

  /** <summary>
   *  Supplies CSR format specific indices and marks the contained sparse tensor as being a CSR format tensor.
   *  Values are supplied with a CreateSparseTensor() API. The supplied indices are not copied and the user
   *  allocated buffers lifespan must eclipse that of the OrtValue.
   *  The location of the indices is assumed to be the same as specified by OrtMemoryInfo argument at the creation time.
   *  </summary>
   *  <param name="inner_data">pointer to the user allocated buffer with inner indices or nullptr for fully sparse tensors</param>
   *  <param name="inner_num">number of csr inner indices or 0 for fully sparse tensors</param>
   *  <param name="outer_data">pointer to the user allocated buffer with outer indices or nullptr for fully sparse tensors</param>
   *  <param name="outer_num">number of csr outer indices or 0 for fully sparse tensors</param> */
  public native void UseCsrIndices(@Cast("int64_t*") LongPointer inner_data, @Cast("size_t") long inner_num, @Cast("int64_t*") LongPointer outer_data, @Cast("size_t") long outer_num);
  public native void UseCsrIndices(@Cast("int64_t*") LongBuffer inner_data, @Cast("size_t") long inner_num, @Cast("int64_t*") LongBuffer outer_data, @Cast("size_t") long outer_num);
  public native void UseCsrIndices(@Cast("int64_t*") long[] inner_data, @Cast("size_t") long inner_num, @Cast("int64_t*") long[] outer_data, @Cast("size_t") long outer_num);

  /** <summary>
   *  Supplies BlockSparse format specific indices and marks the contained sparse tensor as being a BlockSparse format tensor.
   *  Values are supplied with a CreateSparseTensor() API. The supplied indices are not copied and the user
   *  allocated buffers lifespan must eclipse that of the OrtValue.
   *  The location of the indices is assumed to be the same as specified by OrtMemoryInfo argument at the creation time.
   *  </summary>
   *  <param name="indices_shape">indices shape or a {0} for fully sparse</param>
   *  <param name="indices_data">user allocated buffer with indices or nullptr for fully spare tensors</param> */
  public native void UseBlockSparseIndices(@Const @ByRef Shape indices_shape, IntPointer indices_data);
  public native void UseBlockSparseIndices(@Const @ByRef Shape indices_shape, IntBuffer indices_data);
  public native void UseBlockSparseIndices(@Const @ByRef Shape indices_shape, int[] indices_data);

  /** <summary>
   *  The API will allocate memory using the allocator instance supplied to the CreateSparseTensor() API
   *  and copy the values and COO indices into it. If data_mem_info specifies that the data is located
   *  at difference device than the allocator, a X-device copy will be performed if possible.
   *  </summary>
   *  <param name="data_mem_info">specified buffer memory description</param>
   *  <param name="values_param">values buffer information.</param>
   *  <param name="indices_data">coo indices buffer or nullptr for fully sparse data</param>
   *  <param name="indices_num">number of COO indices or 0 for fully sparse data</param> */
  public native void FillSparseTensorCoo(@Const OrtMemoryInfo data_mem_info, @Const @ByRef OrtSparseValuesParam values_param,
                             @Cast("const int64_t*") LongPointer indices_data, @Cast("size_t") long indices_num);
  public native void FillSparseTensorCoo(@Const OrtMemoryInfo data_mem_info, @Const @ByRef OrtSparseValuesParam values_param,
                             @Cast("const int64_t*") LongBuffer indices_data, @Cast("size_t") long indices_num);
  public native void FillSparseTensorCoo(@Const OrtMemoryInfo data_mem_info, @Const @ByRef OrtSparseValuesParam values_param,
                             @Cast("const int64_t*") long[] indices_data, @Cast("size_t") long indices_num);

  /** <summary>
   *  The API will allocate memory using the allocator instance supplied to the CreateSparseTensor() API
   *  and copy the values and CSR indices into it. If data_mem_info specifies that the data is located
   *  at difference device than the allocator, a X-device copy will be performed if possible.
   *  </summary>
   *  <param name="data_mem_info">specified buffer memory description</param>
   *  <param name="values">values buffer information</param>
   *  <param name="inner_indices_data">csr inner indices pointer or nullptr for fully sparse tensors</param>
   *  <param name="inner_indices_num">number of csr inner indices or 0 for fully sparse tensors</param>
   *  <param name="outer_indices_data">pointer to csr indices data or nullptr for fully sparse tensors</param>
   *  <param name="outer_indices_num">number of csr outer indices or 0</param> */
  public native void FillSparseTensorCsr(@Const OrtMemoryInfo data_mem_info,
                             @Const @ByRef OrtSparseValuesParam values,
                             @Cast("const int64_t*") LongPointer inner_indices_data, @Cast("size_t") long inner_indices_num,
                             @Cast("const int64_t*") LongPointer outer_indices_data, @Cast("size_t") long outer_indices_num);
  public native void FillSparseTensorCsr(@Const OrtMemoryInfo data_mem_info,
                             @Const @ByRef OrtSparseValuesParam values,
                             @Cast("const int64_t*") LongBuffer inner_indices_data, @Cast("size_t") long inner_indices_num,
                             @Cast("const int64_t*") LongBuffer outer_indices_data, @Cast("size_t") long outer_indices_num);
  public native void FillSparseTensorCsr(@Const OrtMemoryInfo data_mem_info,
                             @Const @ByRef OrtSparseValuesParam values,
                             @Cast("const int64_t*") long[] inner_indices_data, @Cast("size_t") long inner_indices_num,
                             @Cast("const int64_t*") long[] outer_indices_data, @Cast("size_t") long outer_indices_num);

  /** <summary>
   *  The API will allocate memory using the allocator instance supplied to the CreateSparseTensor() API
   *  and copy the values and BlockSparse indices into it. If data_mem_info specifies that the data is located
   *  at difference device than the allocator, a X-device copy will be performed if possible.
   *  </summary>
   *  <param name="data_mem_info">specified buffer memory description</param>
   *  <param name="values">values buffer information</param>
   *  <param name="indices_shape">indices shape. use {0} for fully sparse tensors</param>
   *  <param name="indices_data">pointer to indices data or nullptr for fully sparse tensors</param> */
  public native void FillSparseTensorBlockSparse(@Const OrtMemoryInfo data_mem_info,
                                     @Const @ByRef OrtSparseValuesParam values,
                                     @Const @ByRef Shape indices_shape,
                                     @Const IntPointer indices_data);
  public native void FillSparseTensorBlockSparse(@Const OrtMemoryInfo data_mem_info,
                                     @Const @ByRef OrtSparseValuesParam values,
                                     @Const @ByRef Shape indices_shape,
                                     @Const IntBuffer indices_data);
  public native void FillSparseTensorBlockSparse(@Const OrtMemoryInfo data_mem_info,
                                     @Const @ByRef OrtSparseValuesParam values,
                                     @Const @ByRef Shape indices_shape,
                                     @Const int[] indices_data);

// #endif
}
