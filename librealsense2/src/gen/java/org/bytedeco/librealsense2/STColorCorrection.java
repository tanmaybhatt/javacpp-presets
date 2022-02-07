// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STColorCorrection extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STColorCorrection() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STColorCorrection(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STColorCorrection(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STColorCorrection position(long position) {
        return (STColorCorrection)super.position(position);
    }
    @Override public STColorCorrection getPointer(long i) {
        return new STColorCorrection((Pointer)this).offsetAddress(i);
    }

    public native float colorCorrection1(); public native STColorCorrection colorCorrection1(float setter);
    public native float colorCorrection2(); public native STColorCorrection colorCorrection2(float setter);
    public native float colorCorrection3(); public native STColorCorrection colorCorrection3(float setter);
    public native float colorCorrection4(); public native STColorCorrection colorCorrection4(float setter);
    public native float colorCorrection5(); public native STColorCorrection colorCorrection5(float setter);
    public native float colorCorrection6(); public native STColorCorrection colorCorrection6(float setter);
    public native float colorCorrection7(); public native STColorCorrection colorCorrection7(float setter);
    public native float colorCorrection8(); public native STColorCorrection colorCorrection8(float setter);
    public native float colorCorrection9(); public native STColorCorrection colorCorrection9(float setter);
    public native float colorCorrection10(); public native STColorCorrection colorCorrection10(float setter);
    public native float colorCorrection11(); public native STColorCorrection colorCorrection11(float setter);
    public native float colorCorrection12(); public native STColorCorrection colorCorrection12(float setter);
}
