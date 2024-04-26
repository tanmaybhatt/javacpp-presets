// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_attributes
 <p>
 *  \addtogroup dnnl_api_primitives_common
 *  \{
 <p>
 *  Base class for all primitive descriptors. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive_desc_base extends dnnl_primitive_desc_handle {
    static { Loader.load(); }

    
        public primitive_desc_base() { super((Pointer)null); allocate(); }
        private native void allocate();
        public primitive_desc_base(@Const @ByRef primitive_desc_base arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef primitive_desc_base arg0);
        
        ///
        public primitive_desc_base(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
        private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
        public primitive_desc_base(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
        private native void allocate(dnnl_primitive_desc t);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_desc_base(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive_desc_base(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive_desc_base position(long position) {
        return (primitive_desc_base)super.position(position);
    }
    @Override public primitive_desc_base getPointer(long i) {
        return new primitive_desc_base((Pointer)this).offsetAddress(i);
    }


    /** Default constructor. Produces an empty object. */

    /** Returns the engine of the primitive descriptor.
     *  @return The engine of the primitive descriptor. */
    public native @ByVal engine get_engine();

    /** Returns implementation name.
     *  @return The implementation name. */
    public native @Cast("const char*") BytePointer impl_info_str();

    /** Returns a memory::dim value (same as int64_t).
     *  @param what The value to query.
     *  @return The result of the query. */
    public native @Cast("dnnl::memory::dim") long query_s64(query what);
    public native @Cast("dnnl::memory::dim") long query_s64(@Cast("dnnl::query") int what);

    /** Returns strides.
     *  @return Strides.
     *  @return An empty #dnnl::memory::dims if the primitive does not have
     *      a strides parameter. */
    public native @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByVal LongPointer get_strides();

    /** Returns dilations.
     *  @return Dilations.
     *  @return An empty #dnnl::memory::dims if the primitive does not have
     *      a dilations parameter. */
    public native @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByVal LongPointer get_dilations();

    /** Returns a left padding.
     *  @return A left padding.
     *  @return An empty #dnnl::memory::dims if the primitive does not have
     *      a left padding parameter. */
    public native @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByVal LongPointer get_padding_l();

    /** Returns a right padding.
     *  @return A right padding.
     *  @return An empty #dnnl::memory::dims if the primitive does not have
     *      a right padding parameter. */
    public native @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByVal LongPointer get_padding_r();

    /** Returns an epsilon.
     *  @return An epsilon.
     *  @return Zero if the primitive does not have an epsilon parameter. */
    public native float get_epsilon();

    /** Returns flags.
     *  \tparam T Flags enumeration type.
     *  @return Flags.
     *  @return Zero if the primitive does not have a flags parameter. */

    /** Returns an algorithm kind.
     *  @return An algorithm kind.
     *  @return #dnnl::algorithm::undef if the primitive does not have an
     *      algorithm parameter. */
    public native algorithm get_algorithm();

    /** Returns an alpha.
     *  @return An alpha.
     *  @return Zero if the primitive does not have an alpha parameter. */
    public native float get_alpha();

    /** Returns a beta.
     *  @return A beta.
     *  @return Zero if the primitive does not have a beta parameter. */
    public native float get_beta();

    /** Returns an axis.
     *  @return An axis.
     *  @return A negative number if the primitive does not have an axis
     *      parameter. */
    public native int get_axis();

    /** Returns an LRN local size parameter.
     *  @return An LRN local size parameter.
     *  @return Zero if the primitive does not have an LRN local size
     *      parameter. */
    public native @Cast("dnnl::memory::dim") long get_local_size();

    /** Returns an LRN K parameter.
     *  @return An LRN K parameter.
     *  @return Zero if the primitive does not have an LRN K parameter. */
    public native float get_k();

    /** Returns a reduction P parameter.
     *  @return A reduction P parameter.
     *  @return Zero if the primitive does not have a reduction P parameter. */
    public native float get_p();

    /** Returns a resampling factors parameters.
     *  @return A vector of factors.
     *  @return An empty vector if the primitive does not have a resampling
     *      factors parameter. */
    public native @StdVector FloatPointer get_factors();

    /** Returns an RNN cell kind parameter.
     *  @return An RNN cell kind parameter.
     *  @return #dnnl::algorithm::undef if the primitive does not have an
     *      RNN cell kind parameter. */
    public native algorithm get_cell_kind();

    /** Returns an RNN direction parameter.
     *  @return An RNN direction parameter.
     *  @return #dnnl::rnn_direction::undef if the primitive does not have
     *      an RNN direction parameter. */
    public native rnn_direction get_direction();

    /** Returns an RNN activation kind parameter.
     *  @return An RNN activation kind parameter.
     *  @return #dnnl::algorithm::undef if the primitive does not have an
     *      RNN activation kind parameter. */
    public native algorithm get_activation_kind();

    /** Returns a pooling kernel parameter.
     *  @return A pooling kernel parameter.
     *  @return An empty #dnnl::memory::dims if the primitive does not have
     *      a pooling kernel parameter. */
    public native @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByVal LongPointer get_kernel();

    /** Returns a group size parameter.
     *  @return A group size parameter.
     *  @return Zero if the primitive does not have a group size
     *      parameter. */
    public native @Cast("dnnl::memory::dim") long get_group_size();

    /** Returns a propagation kind.
     *  @return A propagation kind.
     *  @return #dnnl::prop_kind::undef if the primitive does not have
     *      a propagation parameter. */
    
    ///
    ///
    public native prop_kind get_prop_kind();

    /** Returns a memory descriptor.
     * 
     *  \note
     *      There are also convenience methods
     *      #dnnl::primitive_desc_base::src_desc(),
     *      #dnnl::primitive_desc_base::dst_desc(), and others.
     * 
     *  @param what The kind of parameter to query; can be
     *      #dnnl::query::src_md, #dnnl::query::dst_md, etc.
     *  @param idx Index of the parameter. For example, convolution bias can
     *      be queried with what = #dnnl::query::weights_md and idx = 1.
     *  @return The requested memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      parameter of the specified kind or index. */
    public native @ByVal org.bytedeco.dnnl.memory.desc query_md(query what, int idx/*=0*/);
    public native @ByVal org.bytedeco.dnnl.memory.desc query_md(query what);
    public native @ByVal org.bytedeco.dnnl.memory.desc query_md(@Cast("dnnl::query") int what, int idx/*=0*/);
    public native @ByVal org.bytedeco.dnnl.memory.desc query_md(@Cast("dnnl::query") int what);

    /** Returns a source memory descriptor.
     *  @param idx Source index.
     *  @return Source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      source parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc src_desc(int idx);

    /** Returns a destination memory descriptor.
     *  @param idx Destination index.
     *  @return Destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      destination parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc(int idx);

    /** Returns a weights memory descriptor.
     *  @param idx Weights index.
     *  @return Weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      weights parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc weights_desc(int idx);

    /** Returns a diff source memory descriptor.
     *  @param idx Diff source index.
     *  @return Diff source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff source parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_desc(int idx);

    /** Returns a diff destination memory descriptor.
     *  @param idx Diff destination index.
     *  @return Diff destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff destination parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_desc(int idx);

    /** Returns a diff weights memory descriptor.
     *  @param idx Diff weights index.
     *  @return Diff weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff weights parameter with index \p idx. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_desc(int idx);

    // Separate versions without the index argument for documentation
    // purposes.

    /** Returns a source memory descriptor.
     *  @return Source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      source parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

    /** Returns a destination memory descriptor.
     *  @return Destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      destination parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();

    /** Returns a weights memory descriptor.
     *  @return Weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      weights parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc weights_desc();

    /** Returns a diff source memory descriptor.
     *  @return Diff source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff source memory with. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_desc();

    /** Returns a diff destination memory descriptor.
     *  @return Diff destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff destination parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_desc();

    /** Returns a diff weights memory descriptor.
     *  @return Diff weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff weights parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_desc();

    /** Returns the workspace memory descriptor.
     *  @return Workspace memory descriptor.
     *  @return A zero memory descriptor if the primitive does not require
     *      workspace parameter. */
    public native @ByVal org.bytedeco.dnnl.memory.desc workspace_desc();

    /** Returns the scratchpad memory descriptor.
     *  @return scratchpad memory descriptor.
     *  @return A zero memory descriptor if the primitive does not require
     *      scratchpad parameter.
     *  @see \ref dev_guide_attributes_scratchpad */
    public native @ByVal org.bytedeco.dnnl.memory.desc scratchpad_desc();

    /** Returns the engine on which the scratchpad memory is located.
     *  @return The engine on which the scratchpad memory is located. */
    public native @ByVal engine scratchpad_engine();

    /** Returns the primitive attributes.
     *  @return The primitive attributes. */
    public native @ByVal primitive_attr get_primitive_attr();

    /** Returns the kind of the primitive descriptor.
     *  @return The kind of the primitive descriptor. */
    public native primitive.kind get_kind();

    /** Returns the cache blob ID of the primitive descriptor.
     *  @return The cache blob ID of the primitive descriptor. */
    public native @Cast("uint8_t*") @StdVector BytePointer get_cache_blob_id();
}
