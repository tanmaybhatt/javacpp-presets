// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** <!-- [H5Z_filter_func_t_snip] -->
/**
 *  Filter callback function definition
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5Z_filter_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5Z_filter_func_t(Pointer p) { super(p); }
    protected H5Z_filter_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("H5Z_cb_return_t") int call(@Cast("H5Z_filter_t") int filter, Pointer buf, @Cast("size_t") long buf_size, Pointer op_data);
}
