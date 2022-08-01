// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class unaligned_16 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public unaligned_16() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public unaligned_16(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public unaligned_16(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public unaligned_16 position(long position) {
        return (unaligned_16)super.position(position);
    }
    @Override public unaligned_16 getPointer(long i) {
        return new unaligned_16((Pointer)this).offsetAddress(i);
    }
 public native @Cast("uint16_t") short l(); public native unaligned_16 l(short setter); }
