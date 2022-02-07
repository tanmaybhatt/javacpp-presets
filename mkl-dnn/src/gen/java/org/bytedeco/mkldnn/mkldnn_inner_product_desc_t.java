// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of an inner product operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_inner_product_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_inner_product_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_inner_product_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_inner_product_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_inner_product_desc_t position(long position) {
        return (mkldnn_inner_product_desc_t)super.position(position);
    }
    @Override public mkldnn_inner_product_desc_t getPointer(long i) {
        return new mkldnn_inner_product_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_inner_product. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_inner_product_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, #mkldnn_backward_data,
     * #mkldnn_backward_weights, and #mkldnn_backward_bias. */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_inner_product_desc_t prop_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t src_desc(); public native mkldnn_inner_product_desc_t src_desc(mkldnn_memory_desc_t setter);
    /** Source gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_src_desc(); public native mkldnn_inner_product_desc_t diff_src_desc(mkldnn_memory_desc_t setter);
    /** Weights memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t weights_desc(); public native mkldnn_inner_product_desc_t weights_desc(mkldnn_memory_desc_t setter);
    /** Weights gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_weights_desc(); public native mkldnn_inner_product_desc_t diff_weights_desc(mkldnn_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t bias_desc(); public native mkldnn_inner_product_desc_t bias_desc(mkldnn_memory_desc_t setter);
    /** Bias gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_bias_desc(); public native mkldnn_inner_product_desc_t diff_bias_desc(mkldnn_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t dst_desc(); public native mkldnn_inner_product_desc_t dst_desc(mkldnn_memory_desc_t setter);
    /** Destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_dst_desc(); public native mkldnn_inner_product_desc_t diff_dst_desc(mkldnn_memory_desc_t setter);
    /** The accumulator data type. Initialized automatically. */
    public native @Cast("mkldnn_data_type_t") int accum_data_type(); public native mkldnn_inner_product_desc_t accum_data_type(int setter);
}
