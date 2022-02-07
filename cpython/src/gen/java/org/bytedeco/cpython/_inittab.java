// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _inittab extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _inittab() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _inittab(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _inittab(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _inittab position(long position) {
        return (_inittab)super.position(position);
    }
    @Override public _inittab getPointer(long i) {
        return new _inittab((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native _inittab name(BytePointer setter);           /* ASCII encoded string */
    public static class PyObject_Initfunc extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    PyObject_Initfunc(Pointer p) { super(p); }
        protected PyObject_Initfunc() { allocate(); }
        private native void allocate();
        public native PyObject call();
    }
    public native PyObject_Initfunc initfunc(); public native _inittab initfunc(PyObject_Initfunc setter);
}
