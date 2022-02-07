// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WOW64_FLOATING_SAVE_AREA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WOW64_FLOATING_SAVE_AREA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WOW64_FLOATING_SAVE_AREA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WOW64_FLOATING_SAVE_AREA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WOW64_FLOATING_SAVE_AREA position(long position) {
        return (WOW64_FLOATING_SAVE_AREA)super.position(position);
    }
    @Override public WOW64_FLOATING_SAVE_AREA getPointer(long i) {
        return new WOW64_FLOATING_SAVE_AREA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ControlWord(); public native WOW64_FLOATING_SAVE_AREA ControlWord(int setter);
    public native @Cast("DWORD") int StatusWord(); public native WOW64_FLOATING_SAVE_AREA StatusWord(int setter);
    public native @Cast("DWORD") int TagWord(); public native WOW64_FLOATING_SAVE_AREA TagWord(int setter);
    public native @Cast("DWORD") int ErrorOffset(); public native WOW64_FLOATING_SAVE_AREA ErrorOffset(int setter);
    public native @Cast("DWORD") int ErrorSelector(); public native WOW64_FLOATING_SAVE_AREA ErrorSelector(int setter);
    public native @Cast("DWORD") int DataOffset(); public native WOW64_FLOATING_SAVE_AREA DataOffset(int setter);
    public native @Cast("DWORD") int DataSelector(); public native WOW64_FLOATING_SAVE_AREA DataSelector(int setter);
    public native @Cast("BYTE") byte RegisterArea(int i); public native WOW64_FLOATING_SAVE_AREA RegisterArea(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer RegisterArea();
    public native @Cast("DWORD") int Cr0NpxState(); public native WOW64_FLOATING_SAVE_AREA Cr0NpxState(int setter);
}
