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


/** <summary>
 *  This entire structure is deprecated, but we not marking
 *  it as a whole yet since we want to preserve for the next release.
 *  </summary> */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class CustomOpApi extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CustomOpApi(Pointer p) { super(p); }

  public CustomOpApi(@Const @ByRef OrtApi api) { super((Pointer)null); allocate(api); }
  private native void allocate(@Const @ByRef OrtApi api);

  /** @deprecated use Ort::Value::GetTensorTypeAndShape()
   * [[deprecated]]
   * This interface produces a pointer that must be released. Not exception safe.
   */
  public native @Deprecated OrtTensorTypeAndShapeInfo GetTensorTypeAndShape(@Const OrtValue value);

  /** @deprecated use Ort::TensorTypeAndShapeInfo::GetElementCount()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("size_t") @Deprecated long GetTensorShapeElementCount(@Const OrtTensorTypeAndShapeInfo info);

  /** @deprecated use Ort::TensorTypeAndShapeInfo::GetElementType()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("ONNXTensorElementDataType") @Deprecated int GetTensorElementType(@Const OrtTensorTypeAndShapeInfo info);

  /** @deprecated use Ort::TensorTypeAndShapeInfo::GetDimensionsCount()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("size_t") @Deprecated long GetDimensionsCount(@Const OrtTensorTypeAndShapeInfo info);

  /** @deprecated use Ort::TensorTypeAndShapeInfo::GetShape()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Deprecated void GetDimensions(@Const OrtTensorTypeAndShapeInfo info, @Cast("int64_t*") LongPointer dim_values, @Cast("size_t") long dim_values_length);
  public native @Deprecated void GetDimensions(@Const OrtTensorTypeAndShapeInfo info, @Cast("int64_t*") LongBuffer dim_values, @Cast("size_t") long dim_values_length);
  public native @Deprecated void GetDimensions(@Const OrtTensorTypeAndShapeInfo info, @Cast("int64_t*") long[] dim_values, @Cast("size_t") long dim_values_length);

  /** @deprecated
   * [[deprecated]]
   * This interface sets dimensions to TensorTypeAndShapeInfo, but has no effect on the OrtValue.
   */
  public native @Deprecated void SetDimensions(OrtTensorTypeAndShapeInfo info, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count);
  public native @Deprecated void SetDimensions(OrtTensorTypeAndShapeInfo info, @Cast("const int64_t*") LongBuffer dim_values, @Cast("size_t") long dim_count);
  public native @Deprecated void SetDimensions(OrtTensorTypeAndShapeInfo info, @Cast("const int64_t*") long[] dim_values, @Cast("size_t") long dim_count);

  /** @deprecated use Ort::Value::GetTensorMutableData()
   * [[deprecated]]
   * This interface is redundant.
   */

  /** @deprecated use Ort::Value::GetTensorData()
   * [[deprecated]]
   * This interface is redundant.
   */

  /** @deprecated use Ort::Value::GetTensorMemoryInfo()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Const @Deprecated OrtMemoryInfo GetTensorMemoryInfo(@Const OrtValue value);

  /** @deprecated use Ort::TensorTypeAndShapeInfo::GetShape()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("int64_t*") @StdVector LongPointer GetTensorShape(@Const OrtTensorTypeAndShapeInfo info);

  /** @deprecated use TensorTypeAndShapeInfo instances for automatic ownership.
   * [[deprecated]]
   * This interface is not exception safe.
   */
  public native @Deprecated void ReleaseTensorTypeAndShapeInfo(OrtTensorTypeAndShapeInfo input);

  /** @deprecated use Ort::KernelContext::GetInputCount
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("size_t") @Deprecated long KernelContext_GetInputCount(@Const OrtKernelContext context);

  /** @deprecated use Ort::KernelContext::GetInput
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Const @Deprecated OrtValue KernelContext_GetInput(@Const OrtKernelContext context, @Cast("size_t") long index);

  /** @deprecated use Ort::KernelContext::GetOutputCount
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Cast("size_t") @Deprecated long KernelContext_GetOutputCount(@Const OrtKernelContext context);

  /** @deprecated use Ort::KernelContext::GetOutput
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Deprecated OrtValue KernelContext_GetOutput(OrtKernelContext context, @Cast("size_t") long index, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count);
  public native @Deprecated OrtValue KernelContext_GetOutput(OrtKernelContext context, @Cast("size_t") long index, @Cast("const int64_t*") LongBuffer dim_values, @Cast("size_t") long dim_count);
  public native @Deprecated OrtValue KernelContext_GetOutput(OrtKernelContext context, @Cast("size_t") long index, @Cast("const int64_t*") long[] dim_values, @Cast("size_t") long dim_count);

  /** @deprecated use Ort::KernelContext::GetGPUComputeStream
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Deprecated Pointer KernelContext_GetGPUComputeStream(@Const OrtKernelContext context);

  /** @deprecated use Ort::ThrowOnError()
   * [[deprecated]]
   * This interface is redundant.
   */
  public native @Deprecated void ThrowOnError(OrtStatus result);

  /** @deprecated use Ort::OpAttr
   * [[deprecated]]
   * This interface is not exception safe.
   */
  public native @Deprecated OrtOpAttr CreateOpAttr(@Cast("const char*") BytePointer name,
                                                              @Const Pointer data,
                                                              int len,
                                                              @Cast("OrtOpAttrType") int type);
  public native @Deprecated OrtOpAttr CreateOpAttr(String name,
                                                              @Const Pointer data,
                                                              int len,
                                                              @Cast("OrtOpAttrType") int type);

  /** @deprecated use Ort::OpAttr
   * [[deprecated]]
   * This interface is not exception safe.
   */
  public native @Deprecated void ReleaseOpAttr(OrtOpAttr op_attr);

  /** @deprecated use Ort::Op
   * [[deprecated]]
   * This interface is not exception safe.
   */
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  @Cast("const char*") BytePointer op_name,
                                                  @Cast("const char*") BytePointer domain,
                                                  int version,
                                                  @Cast("const char**") PointerPointer type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") IntPointer type_constraint_values,
                                                  int type_constraint_count,
                                                  @Cast("const OrtOpAttr*const*") PointerPointer attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  @Cast("const char*") BytePointer op_name,
                                                  @Cast("const char*") BytePointer domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr BytePointer type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") IntPointer type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  String op_name,
                                                  String domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr ByteBuffer type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") IntBuffer type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  @Cast("const char*") BytePointer op_name,
                                                  @Cast("const char*") BytePointer domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr byte[] type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") int[] type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  String op_name,
                                                  String domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr BytePointer type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") IntPointer type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  @Cast("const char*") BytePointer op_name,
                                                  @Cast("const char*") BytePointer domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr ByteBuffer type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") IntBuffer type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);
  public native @Deprecated OrtOp CreateOp(@Const OrtKernelInfo info,
                                                  String op_name,
                                                  String domain,
                                                  int version,
                                                  @Cast("const char**") @ByPtrPtr byte[] type_constraint_names,
                                                  @Cast("const ONNXTensorElementDataType*") int[] type_constraint_values,
                                                  int type_constraint_count,
                                                  @Const @ByPtrPtr OrtOpAttr attr_values,
                                                  int attr_count,
                                                  int input_count,
                                                  int output_count);

  /** @deprecated use Ort::Op::Invoke
   * [[deprecated]]
   * This interface is redundant
   */
  public native @Deprecated void InvokeOp(@Const OrtKernelContext context,
                                                        @Const OrtOp ort_op,
                                                        @Cast("const OrtValue*const*") PointerPointer input_values,
                                                        int input_count,
                                                        @Cast("OrtValue*const*") PointerPointer output_values,
                                                        int output_count);
  public native @Deprecated void InvokeOp(@Const OrtKernelContext context,
                                                        @Const OrtOp ort_op,
                                                        @Const @ByPtrPtr OrtValue input_values,
                                                        int input_count,
                                                        @ByPtrPtr OrtValue output_values,
                                                        int output_count);

  /** @deprecated use Ort::Op for automatic lifespan management.
   * [[deprecated]]
   * This interface is not exception safe.
   */
  public native @Deprecated void ReleaseOp(OrtOp ort_op);

  /** @deprecated use Ort::KernelInfo for automatic lifespan management or for
   * querying attributes
   * [[deprecated]]
   * This interface is redundant
   */

  /** @deprecated use Ort::KernelInfo::Copy
   * querying attributes
   * [[deprecated]]
   * This interface is not exception safe
   */
  public native @Deprecated OrtKernelInfo CopyKernelInfo(@Const OrtKernelInfo info);

  /** @deprecated use Ort::KernelInfo for lifespan management
   * querying attributes
   * [[deprecated]]
   * This interface is not exception safe
   */
  public native @Deprecated void ReleaseKernelInfo(OrtKernelInfo info_copy);
}
