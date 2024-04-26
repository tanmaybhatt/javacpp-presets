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


/** <summary>
 *  This struct owns the OrtKernInfo* pointer when a copy is made.
 *  For convenient wrapping of OrtKernelInfo* passed to kernel constructor
 *  and query attributes, warp the pointer with Ort::Unowned<KernelInfo> instance
 *  so it does not destroy the pointer the kernel does not own.
 *  </summary> */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class KernelInfo extends KernelInfoImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelInfo(Pointer p) { super(p); }

  /** Take ownership of the instance */
  public KernelInfo(OrtKernelInfo info) { super((Pointer)null); allocate(info); }
  private native void allocate(OrtKernelInfo info);
  public native @ByVal @Cast("Ort::ConstKernelInfo*") KernelInfoImpl GetConst();
}
