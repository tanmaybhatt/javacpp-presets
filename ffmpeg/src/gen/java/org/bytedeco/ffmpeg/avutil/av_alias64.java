// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class av_alias64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public av_alias64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public av_alias64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public av_alias64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public av_alias64 position(long position) {
        return (av_alias64)super.position(position);
    }
    @Override public av_alias64 getPointer(long i) {
        return new av_alias64((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint64_t") long u64(); public native av_alias64 u64(long setter);
    public native @Cast("uint32_t") int u32(int i); public native av_alias64 u32(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer u32();
    public native @Cast("uint16_t") short u16(int i); public native av_alias64 u16(int i, short setter);
    @MemberGetter public native @Cast("uint16_t*") ShortPointer u16();
    public native @Cast("uint8_t") byte u8(int i); public native av_alias64 u8(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer u8();
    public native double f64(); public native av_alias64 f64(double setter);
    public native float f32(int i); public native av_alias64 f32(int i, float setter);
    @MemberGetter public native FloatPointer f32();
}
