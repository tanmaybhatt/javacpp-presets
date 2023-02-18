// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5FD_file_image_callbacks_t_snip] -->
<p>
/**
 * Define structure to hold "ctl memory copy" parameters
 */
/** <!-- [H5FD_ctl_memcpy_args_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5FD_ctl_memcpy_args_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5FD_ctl_memcpy_args_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5FD_ctl_memcpy_args_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5FD_ctl_memcpy_args_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5FD_ctl_memcpy_args_t position(long position) {
        return (H5FD_ctl_memcpy_args_t)super.position(position);
    }
    @Override public H5FD_ctl_memcpy_args_t getPointer(long i) {
        return new H5FD_ctl_memcpy_args_t((Pointer)this).offsetAddress(i);
    }

    /** Destination buffer */
    public native Pointer dstbuf(); public native H5FD_ctl_memcpy_args_t dstbuf(Pointer setter);
    /** Offset within destination buffer */
    public native @Cast("hsize_t") long dst_off(); public native H5FD_ctl_memcpy_args_t dst_off(long setter);
    /** Source buffer */
    public native @Const Pointer srcbuf(); public native H5FD_ctl_memcpy_args_t srcbuf(Pointer setter);
    /** Offset within source buffer */
    public native @Cast("hsize_t") long src_off(); public native H5FD_ctl_memcpy_args_t src_off(long setter);
    /** Length of data to copy from source buffer */
    public native @Cast("size_t") long len(); public native H5FD_ctl_memcpy_args_t len(long setter);
}
