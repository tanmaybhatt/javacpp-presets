// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* VFD initialization function */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5FD_init_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5FD_init_t(Pointer p) { super(p); }
    protected H5FD_init_t() { allocate(); }
    private native void allocate();
    public native @Cast("hid_t") long call();
}
