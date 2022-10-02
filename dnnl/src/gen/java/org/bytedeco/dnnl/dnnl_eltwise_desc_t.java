// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_shuffle
 <p>
 *  \addtogroup dnnl_api_eltwise
 *  \{
 <p>
 *  A descriptor of a element-wise operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_eltwise_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_eltwise_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_eltwise_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_eltwise_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_eltwise_desc_t position(long position) {
        return (dnnl_eltwise_desc_t)super.position(position);
    }
    @Override public dnnl_eltwise_desc_t getPointer(long i) {
        return new dnnl_eltwise_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_eltwise. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_eltwise_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward, and #dnnl_backward_data. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_eltwise_desc_t prop_kind(int setter);
    /** The kind of eltwise algorithm. Possible values: #dnnl_eltwise_relu,
     *  #dnnl_eltwise_tanh, #dnnl_eltwise_elu, #dnnl_eltwise_square,
     *  #dnnl_eltwise_abs, #dnnl_eltwise_sqrt, #dnnl_eltwise_linear,
     *  #dnnl_eltwise_bounded_relu, #dnnl_eltwise_soft_relu,
     *  #dnnl_eltwise_soft_relu_v2, #dnnl_eltwise_logistic, #dnnl_eltwise_exp,
     *  #dnnl_eltwise_gelu_tanh, #dnnl_eltwise_swish, #dnnl_eltwise_log,
     *  #dnnl_eltwise_clip, #dnnl_eltwise_clip_v2, #dnnl_eltwise_pow,
     *  #dnnl_eltwise_gelu_erf, #dnnl_eltwise_round, #dnnl_eltwise_logsigmoid,
     *  #dnnl_eltwise_mish, #dnnl_eltwise_hardswish, #dnnl_eltwise_hardsigmoid.
     *  Possible values for passing destination memory on backward:
     *  #dnnl_eltwise_relu_use_dst_for_bwd, #dnnl_eltwise_tanh_use_dst_for_bwd,
     *  #dnnl_eltwise_elu_use_dst_for_bwd, #dnnl_eltwise_sqrt_use_dst_for_bwd,
     *  #dnnl_eltwise_logistic_use_dst_for_bwd,
     *  #dnnl_eltwise_exp_use_dst_for_bwd,
     *  #dnnl_eltwise_clip_v2_use_dst_for_bwd. */
    public native @Cast("dnnl_alg_kind_t") int alg_kind(); public native dnnl_eltwise_desc_t alg_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t data_desc(); public native dnnl_eltwise_desc_t data_desc(dnnl_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_data_desc(); public native dnnl_eltwise_desc_t diff_data_desc(dnnl_memory_desc_t setter);
    /** Algorithm specific parameter.
     *  Accordance table:
     *   - #dnnl_eltwise_relu: \p alpha -- negative slope, \p beta ignored
     *   - #dnnl_eltwise_tanh: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_elu: \p alpha -- negative slope, \p beta ignored
     *   - #dnnl_eltwise_square: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_abs: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_sqrt: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_linear: \p alpha -- scale, \p beta -- shift
     *   - #dnnl_eltwise_bounded_relu: \p alpha -- upper bound, \p beta ignored
     *   - #dnnl_eltwise_soft_relu: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_soft_relu_v2: \p alpha -- soft_relu_v2 arg scaling, \p beta ignored
     *   - #dnnl_eltwise_logistic: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_exp: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_gelu_tanh: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_swish: \p alpha -- sigmoid arg scaling, \p beta ignored
     *   - #dnnl_eltwise_log: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_clip: \p alpha -- lower bound, \p beta -- upper bound
     *   - #dnnl_eltwise_clip_v2: \p alpha -- lower bound, \p beta -- upper bound
     *   - #dnnl_eltwise_pow: \p alpha -- scale, \p beta -- exponent
     *   - #dnnl_eltwise_gelu_erf: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_round: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_logsigmoid: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_mish: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_hardswish: \p alpha and \p beta ignored
     *   - #dnnl_eltwise_hardsigmoid: \p alpha -- scale, \p beta -- shift */
    public native float alpha(); public native dnnl_eltwise_desc_t alpha(float setter);
    public native float beta(); public native dnnl_eltwise_desc_t beta(float setter);
}
