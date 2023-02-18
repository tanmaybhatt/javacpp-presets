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


@Name("Ort::detail::SessionOptionsImpl<OrtSessionOptions>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class SessionOptionsImpl extends ConstSessionOptionsImpl {
    static { Loader.load(); }
    /** Default native constructor. */
    public SessionOptionsImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SessionOptionsImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SessionOptionsImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SessionOptionsImpl position(long position) {
        return (SessionOptionsImpl)super.position(position);
    }
    @Override public SessionOptionsImpl getPointer(long i) {
        return new SessionOptionsImpl((Pointer)this).offsetAddress(i);
    }


  /** Wraps OrtApi::SetIntraOpNumThreads */
  public native @ByRef SessionOptionsImpl SetIntraOpNumThreads(int intra_op_num_threads);
  /** Wraps OrtApi::SetInterOpNumThreads */
  public native @ByRef SessionOptionsImpl SetInterOpNumThreads(int inter_op_num_threads);
  /** Wraps OrtApi::SetSessionGraphOptimizationLevel */
  public native @ByRef SessionOptionsImpl SetGraphOptimizationLevel(@Cast("GraphOptimizationLevel") int graph_optimization_level);

  /** Wraps OrtApi::EnableCpuMemArena */
  public native @ByRef SessionOptionsImpl EnableCpuMemArena();
  /** Wraps OrtApi::DisableCpuMemArena */
  public native @ByRef SessionOptionsImpl DisableCpuMemArena();

  /** Wraps OrtApi::SetOptimizedModelFilePath */
  public native @ByRef SessionOptionsImpl SetOptimizedModelFilePath(@Cast("const ORTCHAR_T*") Pointer optimized_model_file);

  /** Wraps OrtApi::EnableProfiling */
  public native @ByRef SessionOptionsImpl EnableProfiling(@Cast("const ORTCHAR_T*") Pointer profile_file_prefix);
  /** Wraps OrtApi::DisableProfiling */
  public native @ByRef SessionOptionsImpl DisableProfiling();

  /** Wraps OrtApi::EnableOrtCustomOps */
  public native @ByRef SessionOptionsImpl EnableOrtCustomOps();

  /** Wraps OrtApi::EnableMemPattern */
  public native @ByRef SessionOptionsImpl EnableMemPattern();
  /** Wraps OrtApi::DisableMemPattern */
  public native @ByRef SessionOptionsImpl DisableMemPattern();

  /** Wraps OrtApi::SetSessionExecutionMode */
  public native @ByRef SessionOptionsImpl SetExecutionMode(@Cast("ExecutionMode") int execution_mode);

  /** Wraps OrtApi::SetSessionLogId */
  public native @ByRef SessionOptionsImpl SetLogId(@Cast("const char*") BytePointer logid);
  public native @ByRef SessionOptionsImpl SetLogId(String logid);
  /** Wraps OrtApi::SetSessionLogSeverityLevel */
  public native @ByRef SessionOptionsImpl SetLogSeverityLevel(int level);

  /** Wraps OrtApi::AddCustomOpDomain */
  public native @ByRef SessionOptionsImpl Add(OrtCustomOpDomain custom_op_domain);

  /** Wraps OrtApi::DisablePerSessionThreads */
  public native @ByRef SessionOptionsImpl DisablePerSessionThreads();

  /** Wraps OrtApi::AddSessionConfigEntry */
  public native @ByRef SessionOptionsImpl AddConfigEntry(@Cast("const char*") BytePointer config_key, @Cast("const char*") BytePointer config_value);
  public native @ByRef SessionOptionsImpl AddConfigEntry(String config_key, String config_value);

  /** Wraps OrtApi::AddInitializer */
  public native @ByRef SessionOptionsImpl AddInitializer(@Cast("const char*") BytePointer name, @Const OrtValue ort_val);
  public native @ByRef SessionOptionsImpl AddInitializer(String name, @Const OrtValue ort_val);
  /** Wraps OrtApi::AddExternalInitializers */
  public native @ByRef SessionOptionsImpl AddExternalInitializers(@Const @ByRef StringVector names, @StdMove ValueVector ort_values);

  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_CUDA */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_CUDA(@Const @ByRef OrtCUDAProviderOptions provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_CUDA_V2 */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_CUDA_V2(@Const @ByRef OrtCUDAProviderOptionsV2 provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_ROCM */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_ROCM(@Const @ByRef OrtROCMProviderOptions provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_OpenVINO */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_OpenVINO(@Const @ByRef OrtOpenVINOProviderOptions provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_TensorRT */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_TensorRT(@Const @ByRef OrtTensorRTProviderOptions provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_TensorRT */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_TensorRT_V2(@Const @ByRef OrtTensorRTProviderOptionsV2 provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider_MIGraphX
   *  Wraps OrtApi::SessionOptionsAppendExecutionProvider_CANN */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_MIGraphX(@Const @ByRef OrtMIGraphXProviderOptions provider_options);
  public native @ByRef SessionOptionsImpl AppendExecutionProvider_CANN(@Const @ByRef OrtCANNProviderOptions provider_options);
  /** Wraps OrtApi::SessionOptionsAppendExecutionProvider. Currently supports SNPE and XNNPACK. */
  public native @ByRef SessionOptionsImpl AppendExecutionProvider(@StdString BytePointer provider_name,
                                                @Const @ByRef(nullValue = "std::unordered_map<std::string,std::string>{}") StringStringMap provider_options);
  public native @ByRef SessionOptionsImpl AppendExecutionProvider(@StdString BytePointer provider_name);
  public native @ByRef SessionOptionsImpl AppendExecutionProvider(@StdString String provider_name,
                                                @Const @ByRef(nullValue = "std::unordered_map<std::string,std::string>{}") StringStringMap provider_options);
  public native @ByRef SessionOptionsImpl AppendExecutionProvider(@StdString String provider_name);

  /** Wraps OrtApi::SessionOptionsSetCustomCreateThreadFn */
  public native @ByRef SessionOptionsImpl SetCustomCreateThreadFn(OrtCustomCreateThreadFn ort_custom_create_thread_fn);
  /** Wraps OrtApi::SessionOptionsSetCustomThreadCreationOptions */
  public native @ByRef SessionOptionsImpl SetCustomThreadCreationOptions(Pointer ort_custom_thread_creation_options);
  /** Wraps OrtApi::SessionOptionsSetCustomJoinThreadFn
   <p>
   *  Registers the custom operator from the specified shared library via OrtApi::RegisterCustomOpsLibrary_V2.
   *  The custom operator configurations are optional. If provided, custom operator configs are set via
   *  OrtApi::AddSessionConfigEntry. */
  public native @ByRef SessionOptionsImpl SetCustomJoinThreadFn(OrtCustomJoinThreadFn ort_custom_join_thread_fn);
  public native @ByRef SessionOptionsImpl RegisterCustomOpsLibrary(@Cast("const ORTCHAR_T*") Pointer library_name, @Const @ByRef(nullValue = "Ort::CustomOpConfigs{}") CustomOpConfigs custom_op_configs);
  public native @ByRef SessionOptionsImpl RegisterCustomOpsLibrary(@Cast("const ORTCHAR_T*") Pointer library_name);

  /** Wraps OrtApi::RegisterCustomOpsUsingFunction */
  public native @ByRef SessionOptionsImpl RegisterCustomOpsUsingFunction(@Cast("const char*") BytePointer function_name);
  public native @ByRef SessionOptionsImpl RegisterCustomOpsUsingFunction(String function_name);
}
