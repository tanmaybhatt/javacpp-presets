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


/** \brief Ort custom thread creation function
 *
 * The function should return a thread handle to be used in onnxruntime thread pools
 * Onnxruntime will throw exception on return value of nullptr or 0, indicating that the function failed to create a thread
 */
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCustomCreateThreadFn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    OrtCustomCreateThreadFn(Pointer p) { super(p); }
    protected OrtCustomCreateThreadFn() { allocate(); }
    private native void allocate();
    public native @Cast("OrtCustomThreadHandle") OrtCustomHandleType call(Pointer ort_custom_thread_creation_options, OrtThreadWorkerFn ort_thread_worker_fn, Pointer ort_worker_fn_param);
}
