// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_binary
 <p>
 *  \addtogroup dnnl_api_matmul Matrix Multiplication
 * 
 *  A primitive to perform matrix-matrix multiplication. The batched mode
 *  is supported with 3D tensors.
 * 
 *  @see \ref dev_guide_matmul in developer guide
 * 
 * 
 *  \{
 <p>
 *  Matrix multiplication (matmul) primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class matmul extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public matmul(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public matmul(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public matmul position(long position) {
        return (matmul)super.position(position);
    }
    @Override public matmul getPointer(long i) {
        return new matmul((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a matmul primitive. */
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

        /** Constructs a primitive descriptor for a matmul primitive
         *      without bias.
         * 
         *  @param aengine Engine to use.
         *  @param src_desc Memory descriptor for source (matrix A).
         *  @param weights_desc Memory descriptor for weights (matrix B).
         *  @param dst_desc Memory descriptor for destination (matrix C).
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, src_desc, weights_desc, dst_desc, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc) { super((Pointer)null); allocate(aengine, src_desc, weights_desc, dst_desc); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc);

        /** Constructs a primitive descriptor for a matmul primitive with bias.
         * 
         *  @param aengine Engine to use.
         *  @param src_desc Memory descriptor for source (matrix A).
         *  @param weights_desc Memory descriptor for weights (matrix B).
         *  @param dst_desc Memory descriptor for destination (matrix C).
         *  @param bias_desc Memory descriptor for bias.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, src_desc, weights_desc, bias_desc, dst_desc, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc) { super((Pointer)null); allocate(aengine, src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc);

        /** Constructs a primitive descriptor for a matmul primitive from a C
         *  API primitive descriptor that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a matmul primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc weights_desc();

        /** \copydoc dnnl::convolution_forward::primitive_desc::bias_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc bias_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public matmul() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a matmul primitive.
     *  @param pd Primitive descriptor for a matmul primitive. */
    public matmul(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a matmul primitive from a cache blob.
     *  @param pd Primitive descriptor for a matmul primitive.
     *  @param cache_blob Cache blob. */
    public matmul(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public matmul(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public matmul(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
