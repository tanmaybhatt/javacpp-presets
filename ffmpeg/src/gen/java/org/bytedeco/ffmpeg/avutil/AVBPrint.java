// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVBPrint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBPrint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBPrint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBPrint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBPrint position(long position) {
        return (AVBPrint)super.position(position);
    }
    @Override public AVBPrint getPointer(long i) {
        return new AVBPrint((Pointer)this).offsetAddress(i);
    }

    
    /** string so far */
    public native @Cast("char*") BytePointer str(); public native AVBPrint str(BytePointer setter);
    /** length so far */
    public native @Cast("unsigned") int len(); public native AVBPrint len(int setter);
    /** allocated memory */
    public native @Cast("unsigned") int size(); public native AVBPrint size(int setter);
    /** maximum allocated memory */
    public native @Cast("unsigned") int size_max(); public native AVBPrint size_max(int setter);
    public native @Cast("char") byte reserved_internal_buffer(int i); public native AVBPrint reserved_internal_buffer(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved_internal_buffer();
    public native @Cast("char") byte reserved_padding(int i); public native AVBPrint reserved_padding(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved_padding();
}
