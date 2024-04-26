// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \brief Wrapper around ::OrtValue
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Value extends ValueImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Value(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Value(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Value position(long position) {
        return (Value)super.position(position);
    }
    @Override public Value getPointer(long i) {
        return new Value((Pointer)this).offsetAddress(i);
    }


  /** Create an empty Value object, must be assigned a valid one to be used */
  public Value() { super((Pointer)null); allocate(); }
  private native void allocate();
  /** Used for interop with the C API */
  public Value(OrtValue p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtValue p);
  public Value(@StdMove Value arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@StdMove Value arg0);
  public native @ByRef @Name("operator =") Value put(@StdMove Value arg0);

  public native @ByVal ConstValue GetConst();
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetUnowned();

  /** \brief Creates a tensor with a user supplied buffer. Wraps OrtApi::CreateTensorWithDataAsOrtValue.
   * \tparam T The numeric datatype. This API is not suitable for strings.
   * @param info Memory description of where the p_data buffer resides (CPU vs GPU etc).
   * @param p_data Pointer to the data buffer.
   * @param p_data_element_count The number of elements in the data buffer.
   * @param shape Pointer to the tensor shape dimensions.
   * @param shape_len The number of tensor shape dimensions.
   */
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(@Const OrtMemoryInfo info, FloatPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(@Const OrtMemoryInfo info, FloatBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(@Const OrtMemoryInfo info, float[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(@Const OrtMemoryInfo info, DoublePointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(@Const OrtMemoryInfo info, DoubleBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(@Const OrtMemoryInfo info, double[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(@Const OrtMemoryInfo info, BytePointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(@Const OrtMemoryInfo info, ByteBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(@Const OrtMemoryInfo info, byte[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(@Const OrtMemoryInfo info, ShortPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(@Const OrtMemoryInfo info, ShortBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(@Const OrtMemoryInfo info, short[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(@Const OrtMemoryInfo info, IntPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(@Const OrtMemoryInfo info, IntBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(@Const OrtMemoryInfo info, int[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(@Const OrtMemoryInfo info, @Cast("int64_t*") LongPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(@Const OrtMemoryInfo info, @Cast("int64_t*") LongBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(@Const OrtMemoryInfo info, @Cast("int64_t*") long[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(@Const OrtMemoryInfo info, @Cast("uint8_t*") BytePointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(@Const OrtMemoryInfo info, @Cast("uint8_t*") ByteBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(@Const OrtMemoryInfo info, @Cast("uint8_t*") byte[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(@Const OrtMemoryInfo info, @Cast("uint16_t*") ShortPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(@Const OrtMemoryInfo info, @Cast("uint16_t*") ShortBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(@Const OrtMemoryInfo info, @Cast("uint16_t*") short[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(@Const OrtMemoryInfo info, @Cast("uint32_t*") IntPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(@Const OrtMemoryInfo info, @Cast("uint32_t*") IntBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(@Const OrtMemoryInfo info, @Cast("uint32_t*") int[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(@Const OrtMemoryInfo info, @Cast("uint64_t*") LongPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(@Const OrtMemoryInfo info, @Cast("uint64_t*") LongBuffer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(@Const OrtMemoryInfo info, @Cast("uint64_t*") long[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") BoolPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") boolean[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") BoolPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") boolean[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") BoolPointer p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(@Const OrtMemoryInfo info, @Cast("bool*") boolean[] p_data, @Cast("size_t") long p_data_element_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);

  /** \brief Creates a tensor with a user supplied buffer. Wraps OrtApi::CreateTensorWithDataAsOrtValue.
   *
   * @param info Memory description of where the p_data buffer resides (CPU vs GPU etc).
   * @param p_data Pointer to the data buffer.
   * @param p_data_byte_count The number of bytes in the data buffer.
   * @param shape Pointer to the tensor shape dimensions.
   * @param shape_len The number of tensor shape dimensions.
   * @param type The data type.
   */
  public static native @StdMove Value CreateTensor(@Const OrtMemoryInfo info, Pointer p_data, @Cast("size_t") long p_data_byte_count, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len,
                              @Cast("ONNXTensorElementDataType") int type);
  public static native @StdMove Value CreateTensor(@Const OrtMemoryInfo info, Pointer p_data, @Cast("size_t") long p_data_byte_count, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len,
                              @Cast("ONNXTensorElementDataType") int type);
  public static native @StdMove Value CreateTensor(@Const OrtMemoryInfo info, Pointer p_data, @Cast("size_t") long p_data_byte_count, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len,
                              @Cast("ONNXTensorElementDataType") int type);

  /** \brief Creates an OrtValue with a tensor using a supplied OrtAllocator. Wraps OrtApi::CreateTensorAsOrtValue.
   *         This overload will allocate the buffer for the tensor  according to the supplied shape and data type.
   *         The allocated buffer will be owned by the returned OrtValue and will be freed when the OrtValue is released.
   *         The input data would need to be copied into the allocated buffer.
   *         This API is not suitable for strings.
   *
   * \tparam T The numeric datatype. This API is not suitable for strings.
   * @param allocator The allocator to use.
   * @param shape Pointer to the tensor shape dimensions.
   * @param shape_len The number of tensor shape dimensions.
   */
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<float>") @StdMove Value CreateTensorFloat(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<double>") @StdMove Value CreateTensorDouble(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int8_t>") @StdMove Value CreateTensorByte(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int16_t>") @StdMove Value CreateTensorShort(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int32_t>") @StdMove Value CreateTensorInt(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<int64_t>") @StdMove Value CreateTensorLong(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint8_t>") @StdMove Value CreateTensorUByte(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint16_t>") @StdMove Value CreateTensorUShort(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint32_t>") @StdMove Value CreateTensorUInt(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<uint64_t>") @StdMove Value CreateTensorULong(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len);
  public static native @Name("CreateTensor<bool>") @StdMove Value CreateTensorBool(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len);

  /** \brief Creates an OrtValue with a tensor using the supplied OrtAllocator.
   *   Wraps OrtApi::CreateTensorAsOrtValue.
   *   The allocated buffer will be owned by the returned OrtValue and will be freed when the OrtValue is released.
   *   The input data would need to be copied into the allocated buffer.
   *   This API is not suitable for strings.
   *
   * @param allocator The allocator to use.
   * @param shape Pointer to the tensor shape dimensions.
   * @param shape_len The number of tensor shape dimensions.
   * @param type The data type.
   */
  public static native @StdMove Value CreateTensor(OrtAllocator allocator, @Cast("const int64_t*") LongPointer shape, @Cast("size_t") long shape_len, @Cast("ONNXTensorElementDataType") int type);
  public static native @StdMove Value CreateTensor(OrtAllocator allocator, @Cast("const int64_t*") LongBuffer shape, @Cast("size_t") long shape_len, @Cast("ONNXTensorElementDataType") int type);
  public static native @StdMove Value CreateTensor(OrtAllocator allocator, @Cast("const int64_t*") long[] shape, @Cast("size_t") long shape_len, @Cast("ONNXTensorElementDataType") int type);

  /** \brief Creates an OrtValue with a Map Onnx type representation.
   *  The API would ref-count the supplied OrtValues and they will be released
   *  when the returned OrtValue is released. The caller may release keys and values after the call
   *  returns.
   *
   * @param keys an OrtValue containing a tensor with primitive data type keys.
   * @param values an OrtValue that may contain a tensor. Ort currently supports only primitive data type values.
   */
  /** Wraps OrtApi::CreateValue */
  public static native @StdMove Value CreateMap(@StdMove Value keys, @StdMove Value values);

  /** \brief Creates an OrtValue with a Sequence Onnx type representation.
   *  The API would ref-count the supplied OrtValues and they will be released
   *  when the returned OrtValue is released. The caller may release the values after the call
   *  returns.
   *
   * @param values a vector of OrtValues that must have the same Onnx value type.
   */
  /** Wraps OrtApi::CreateValue */
  public static native @StdMove Value CreateSequence(@StdMove ValueVector values);

  /** \brief Creates an OrtValue wrapping an Opaque type.
   *  This is used for experimental support of non-tensor types.
   *
   * \tparam T - the type of the value.
   * @param domain - zero terminated utf-8 string. Domain of the type.
   * @param type_name - zero terminated utf-8 string. Name of the type.
   * @param value - the value to be wrapped.
   */

// #if !defined(DISABLE_SPARSE_TENSORS)
  /** <summary>
   *  This is a simple forwarding method to the other overload that helps deducing
   *  data type enum value from the type of the buffer.
   *  </summary>
   *  <typeparam name="T">numeric datatype. This API is not suitable for strings.</typeparam>
   *  <param name="info">Memory description where the user buffers reside (CPU vs GPU etc)</param>
   *  <param name="p_data">pointer to the user supplied buffer, use nullptr for fully sparse tensors</param>
   *  <param name="dense_shape">a would be dense shape of the tensor</param>
   *  <param name="values_shape">non zero values shape. Use a single 0 shape for fully sparse tensors.</param>
   *  <returns></returns> */

  /** <summary>
   *  Creates an OrtValue instance containing SparseTensor. This constructs
   *  a sparse tensor that makes use of user allocated buffers. It does not make copies
   *  of the user provided data and does not modify it. The lifespan of user provided buffers should
   *  eclipse the life span of the resulting OrtValue. This call constructs an instance that only contain
   *  a pointer to non-zero values. To fully populate the sparse tensor call Use<Format>Indices() API below
   *  to supply a sparse format specific indices.
   *  This API is not suitable for string data. Use CreateSparseTensor() with allocator specified so strings
   *  can be properly copied into the allocated buffer.
   *  </summary>
   *  <param name="info">Memory description where the user buffers reside (CPU vs GPU etc)</param>
   *  <param name="p_data">pointer to the user supplied buffer, use nullptr for fully sparse tensors</param>
   *  <param name="dense_shape">a would be dense shape of the tensor</param>
   *  <param name="values_shape">non zero values shape. Use a single 0 shape for fully sparse tensors.</param>
   *  <param name="type">data type</param>
   *  <returns>Ort::Value instance containing SparseTensor</returns> */
  public static native @StdMove Value CreateSparseTensor(@Const OrtMemoryInfo info, Pointer p_data, @Const @ByRef Shape dense_shape,
                                    @Const @ByRef Shape values_shape, @Cast("ONNXTensorElementDataType") int type);

  /** <summary>
   *  This is a simple forwarding method to the below CreateSparseTensor.
   *  This helps to specify data type enum in terms of C++ data type.
   *  Use CreateSparseTensor<T>
   *  </summary>
   *  <typeparam name="T">numeric data type only. String data enum must be specified explicitly.</typeparam>
   *  <param name="allocator">allocator to use</param>
   *  <param name="dense_shape">a would be dense shape of the tensor</param>
   *  <returns>Ort::Value</returns> */

  /** <summary>
   *  Creates an instance of OrtValue containing sparse tensor. The created instance has no data.
   *  The data must be supplied by on of the FillSparseTensor<Format>() methods that take both non-zero values
   *  and indices. The data will be copied into a buffer that would be allocated using the supplied allocator.
   *  Use this API to create OrtValues that contain sparse tensors with all supported data types including
   *  strings.
   *  </summary>
   *  <param name="allocator">allocator to use. The allocator lifespan must eclipse that of the resulting OrtValue</param>
   *  <param name="dense_shape">a would be dense shape of the tensor</param>
   *  <param name="type">data type</param>
   *  <returns>an instance of Ort::Value</returns> */
  public static native @StdMove Value CreateSparseTensor(OrtAllocator allocator, @Const @ByRef Shape dense_shape, @Cast("ONNXTensorElementDataType") int type);

// #endif  // !defined(DISABLE_SPARSE_TENSORS)
}
