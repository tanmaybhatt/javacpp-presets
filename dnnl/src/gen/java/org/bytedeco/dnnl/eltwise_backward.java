// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Elementwise unary operation backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class eltwise_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public eltwise_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public eltwise_backward position(long position) {
        return (eltwise_backward)super.position(position);
    }
    @Override public eltwise_backward getPointer(long i) {
        return new eltwise_backward((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for eltwise backward propagation. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an elementwise backward
         *      propagation primitive with an alpha parameter.
         * 
         *  @param aengine Engine to use.
         *  @param aalgorithm Elementwise algorithm kind.
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param data_desc Destination memory descriptor if one of the
         *      "use_dst_for_bwd" algorithms are used (such as
         *      #dnnl_eltwise_relu_use_dst_for_bwd), source memory descriptor
         *      otherwise.
         *  @param hint_fwd_pd Primitive descriptor for an elementwise
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an elementwise backward
         *      propagation primitive with an alpha parameter.
         * 
         *  @param aengine Engine to use.
         *  @param aalgorithm Elementwise algorithm kind.
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param data_desc Destination memory descriptor if one of the
         *      "use_dst_for_bwd" algorithms are used (such as
         *      #dnnl_eltwise_relu_use_dst_for_bwd), source memory descriptor
         *      otherwise.
         *  @param alpha The alpha parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm.
         *  @param hint_fwd_pd Primitive descriptor for an elementwise
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an elementwise backward
         *      propagation primitive with an alpha and beta parameters.
         * 
         *  @param aengine Engine to use.
         *  @param aalgorithm Elementwise algorithm kind.
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param data_desc Destination memory descriptor if one of the
         *      "use_dst_for_bwd" algorithms are used (such as
         *      #dnnl_eltwise_relu_use_dst_for_bwd), source memory descriptor
         *      otherwise.
         *  @param alpha The alpha parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm.
         *  @param beta The beta parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm.
         *  @param hint_fwd_pd Primitive descriptor for an elementwise
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, beta, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, beta, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, algorithm aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, beta, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aalgorithm, diff_src_desc, diff_dst_desc, data_desc, alpha, beta, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc data_desc, float alpha, float beta,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an eltwise backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an eltwise backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_desc();

        /** \copydoc dnnl::primitive_desc_base::get_algorithm()const */
        public native algorithm get_algorithm();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();

        /** \copydoc dnnl::primitive_desc_base::get_alpha()const */
        public native float get_alpha();

        /** \copydoc dnnl::primitive_desc_base::get_beta()const */
        public native float get_beta();
    }

    /** Default constructor. Produces an empty object. */
    public eltwise_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an eltwise backward propagation primitive.
     *  @param pd Primitive descriptor for an eltwise backward propagation
     *      primitive. */
    public eltwise_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs an eltwise backward propagation primitive from a cache blob.
     *  @param pd Primitive descriptor for an eltwise backward propagation
     *      primitive.
     *  @param cache_blob Cache blob. */
    public eltwise_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public eltwise_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public eltwise_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
