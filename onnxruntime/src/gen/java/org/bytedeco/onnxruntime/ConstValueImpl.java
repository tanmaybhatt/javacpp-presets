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


@Name("Ort::detail::ConstValueImpl<OrtValue>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ConstValueImpl extends BaseValue {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConstValueImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConstValueImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstValueImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConstValueImpl position(long position) {
        return (ConstValueImpl)super.position(position);
    }
    @Override public ConstValueImpl getPointer(long i) {
        return new ConstValueImpl((Pointer)this).offsetAddress(i);
    }


  /** <summary>
   *  Obtains a pointer to a user defined data for experimental purposes
   *  </summary> */

  /** Returns true if Value is a tensor, false for other types like map/sequence/etc */
  public native @Cast("bool") boolean IsTensor();
  public native @Cast("bool") boolean HasValue();  /** < Return true if OrtValue contains data and returns false if the OrtValue is a None */

  public native @Cast("size_t") long GetCount();  // If a non tensor, returns 2 for map and N for sequence, where N is the number of elements
  public native @StdMove Value GetValue(int index, OrtAllocator allocator);

  /** <summary>
   *  This API returns a full length of string data contained within either a tensor or a sparse Tensor.
   *  For sparse tensor it returns a full length of stored non-empty strings (values). The API is useful
   *  for allocating necessary memory and calling GetStringTensorContent().
   *  </summary>
   *  <returns>total length of UTF-8 encoded bytes contained. No zero terminators counted.</returns> */
  
  ///
  public native @Cast("size_t") long GetStringTensorDataLength();

  /** <summary>
   *  The API copies all of the UTF-8 encoded string data contained within a tensor or a sparse tensor
   *  into a supplied buffer. Use GetStringTensorDataLength() to find out the length of the buffer to allocate.
   *  The user must also allocate offsets buffer with the number of entries equal to that of the contained
   *  strings.
   * 
   *  Strings are always assumed to be on CPU, no X-device copy.
   *  </summary>
   *  <param name="buffer">user allocated buffer</param>
   *  <param name="buffer_length">length in bytes of the allocated buffer</param>
   *  <param name="offsets">a pointer to the offsets user allocated buffer</param>
   *  <param name="offsets_count">count of offsets, must be equal to the number of strings contained.
   *    that can be obtained from the shape of the tensor or from GetSparseTensorValuesTypeAndShapeInfo()
   *    for sparse tensors</param> */
  public native void GetStringTensorContent(Pointer buffer, @Cast("size_t") long buffer_length, @Cast("size_t*") SizeTPointer offsets, @Cast("size_t") long offsets_count);

  /** <summary>
   *  Returns a const typed pointer to the tensor contained data.
   *  No type checking is performed, the caller must ensure the type matches the tensor type.
   *  </summary>
   *  <typeparam name="T"></typeparam>
   *  <returns>const pointer to data, no copies made</returns> */

  /** <summary>
   *  Returns a non-typed pointer to a tensor contained data.
   *  </summary>
   *  <returns>const pointer to data, no copies made</returns> */
  public native @Const Pointer GetTensorRawData();

  /** <summary>
   *  The API returns type information for data contained in a tensor. For sparse
   *  tensors it returns type information for contained non-zero values.
   *  It returns dense shape for sparse tensors.
   *  </summary>
   *  <returns>TypeInfo</returns> */
  public native @ByVal TypeInfo GetTypeInfo();

  /** <summary>
   *  The API returns type information for data contained in a tensor. For sparse
   *  tensors it returns type information for contained non-zero values.
   *  It returns dense shape for sparse tensors.
   *  </summary>
   *  <returns>TensorTypeAndShapeInfo</returns> */
  public native @ByVal TensorTypeAndShapeInfo GetTensorTypeAndShapeInfo();

  /** <summary>
   *  This API returns information about the memory allocation used to hold data.
   *  </summary>
   *  <returns>Non owning instance of MemoryInfo</returns> */
  public native @ByVal @Cast("Ort::ConstMemoryInfo*") MemoryInfoImpl GetTensorMemoryInfo();

  /** <summary>
   *  The API copies UTF-8 encoded bytes for the requested string element
   *  contained within a tensor or a sparse tensor into a provided buffer.
   *  Use GetStringTensorElementLength() to obtain the length of the buffer to allocate.
   *  </summary>
   *  <param name="buffer_length"></param>
   *  <param name="element_index"></param>
   *  <param name="buffer"></param> */
  public native void GetStringTensorElement(@Cast("size_t") long buffer_length, @Cast("size_t") long element_index, Pointer buffer);

  /** <summary>
   *  The API returns a byte length of UTF-8 encoded string element
   *  contained in either a tensor or a spare tensor values.
   *  </summary>
   *  <param name="element_index"></param>
   *  <returns>byte length for the specified string element</returns> */
  public native @Cast("size_t") long GetStringTensorElementLength(@Cast("size_t") long element_index);

// #if !defined(DISABLE_SPARSE_TENSORS)
  /** <summary>
   *  The API returns the sparse data format this OrtValue holds in a sparse tensor.
   *  If the sparse tensor was not fully constructed, i.e. Use*() or Fill*() API were not used
   *  the value returned is ORT_SPARSE_UNDEFINED.
   *  </summary>
   *  <returns>Format enum</returns> */
  public native @Cast("OrtSparseFormat") int GetSparseFormat();

  /** <summary>
   *  The API returns type and shape information for stored non-zero values of the
   *  sparse tensor. Use GetSparseTensorValues() to obtain values buffer pointer.
   *  </summary>
   *  <returns>TensorTypeAndShapeInfo values information</returns> */
  public native @ByVal TensorTypeAndShapeInfo GetSparseTensorValuesTypeAndShapeInfo();

  /** <summary>
   *  The API returns type and shape information for the specified indices. Each supported
   *  indices have their own enum values even if a give format has more than one kind of indices.
   *  Use GetSparseTensorIndicesData() to obtain pointer to indices buffer.
   *  </summary>
   *  <param name="format">enum requested</param>
   *  <returns>type and shape information</returns> */
  public native @ByVal TensorTypeAndShapeInfo GetSparseTensorIndicesTypeShapeInfo(OrtSparseIndicesFormat format);
  public native @ByVal TensorTypeAndShapeInfo GetSparseTensorIndicesTypeShapeInfo(@Cast("OrtSparseIndicesFormat") int format);

  /** <summary>
   *  The API retrieves a pointer to the internal indices buffer. The API merely performs
   *  a convenience data type casting on the return type pointer. Make sure you are requesting
   *  the right type, use GetSparseTensorIndicesTypeShapeInfo();
   *  </summary>
   *  <typeparam name="T">type to cast to</typeparam>
   *  <param name="indices_format">requested indices kind</param>
   *  <param name="num_indices">number of indices entries</param>
   *  <returns>Pinter to the internal sparse tensor buffer containing indices. Do not free this pointer.</returns> */

  /** <summary>
   *  Returns true if the OrtValue contains a sparse tensor
   *  </summary>
   *  <returns></returns> */
  public native @Cast("bool") boolean IsSparseTensor();

  /** <summary>
   *  The API returns a pointer to an internal buffer of the sparse tensor
   *  containing non-zero values. The API merely does casting. Make sure you
   *  are requesting the right data type by calling GetSparseTensorValuesTypeAndShapeInfo()
   *  first.
   *  </summary>
   *  <typeparam name="T">numeric data types only. Use GetStringTensor*() to retrieve strings.</typeparam>
   *  <returns>a pointer to the internal values buffer. Do not free this pointer.</returns> */

// #endif
}
