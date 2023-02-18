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


/** \brief Wrapper around ::OrtSequenceTypeInfo
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class SequenceTypeInfo extends BaseSequenceTypeInfoImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SequenceTypeInfo(Pointer p) { super(p); }

  /** Used for interop with the C API */
  public SequenceTypeInfo(OrtSequenceTypeInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtSequenceTypeInfo p);
  public native @ByVal @Cast("Ort::ConstSequenceTypeInfo*") BaseSequenceTypeInfoImpl GetConst();
}
