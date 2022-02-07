// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __half2_raw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __half2_raw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __half2_raw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half2_raw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __half2_raw position(long position) {
        return (__half2_raw)super.position(position);
    }
    @Override public __half2_raw getPointer(long i) {
        return new __half2_raw((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned short") short x(); public native __half2_raw x(short setter);
    public native @Cast("unsigned short") short y(); public native __half2_raw y(short setter);
}
