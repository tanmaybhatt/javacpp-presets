// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


/* ---- cl_longn ---- */
@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_long2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_long2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_long2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_long2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_long2 position(long position) {
        return (cl_long2)super.position(position);
    }
    @Override public cl_long2 getPointer(long i) {
        return new cl_long2((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_long") int s(int i); public native cl_long2 s(int i, int setter);
    @MemberGetter public native @Cast("cl_long*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_LONG2__)
// #endif
}
