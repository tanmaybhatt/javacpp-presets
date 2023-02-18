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


@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCustomHandleType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtCustomHandleType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtCustomHandleType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtCustomHandleType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtCustomHandleType position(long position) {
        return (OrtCustomHandleType)super.position(position);
    }
    @Override public OrtCustomHandleType getPointer(long i) {
        return new OrtCustomHandleType((Pointer)this).offsetAddress(i);
    }

  public native @Cast("char") byte __place_holder(); public native OrtCustomHandleType __place_holder(byte setter);
}
