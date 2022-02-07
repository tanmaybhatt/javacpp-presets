// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _frozen extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _frozen() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _frozen(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _frozen(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _frozen position(long position) {
        return (_frozen)super.position(position);
    }
    @Override public _frozen getPointer(long i) {
        return new _frozen((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native _frozen name(BytePointer setter);                 /* ASCII encoded string */
    public native @Cast("const unsigned char*") BytePointer code(); public native _frozen code(BytePointer setter);
    public native int size(); public native _frozen size(int setter);
}
