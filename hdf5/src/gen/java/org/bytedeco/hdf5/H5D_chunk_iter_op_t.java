// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5D_gather_func_t_snip] -->
 <p>
 *  <!-- [H5D_chunk_iter_op_t_snip] -->
/**
 * \brief Callback for H5Dchunk_iter()
 *
 * @param offset [in]      Logical position of the chunk’s first element in units of dataset elements
 * @param filter_mask [in] Bitmask indicating the filters used when the chunk was written
 * @param addr [in]        Chunk address in the file
 * @param size [in]        Chunk size in bytes, 0 if the chunk does not exist
 * @param op_data [in,out]     Pointer to any user-defined data associated with
 *                            the operation.
 * @return \li Zero (#H5_ITER_CONT) causes the iterator to continue, returning
 *              zero when all elements have been processed.
 *          \li A positive value (#H5_ITER_STOP) causes the iterator to
 *              immediately return that value, indicating short-circuit success.
 *          \li A negative (#H5_ITER_ERROR) causes the iterator to immediately
 *              return that value, indicating failure.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_chunk_iter_op_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_chunk_iter_op_t(Pointer p) { super(p); }
    protected H5D_chunk_iter_op_t() { allocate(); }
    private native void allocate();
    public native int call(@Cast("const hsize_t*") LongPointer offset, @Cast("unsigned") int filter_mask, @Cast("haddr_t") long addr, @Cast("hsize_t") long size,
                                   Pointer op_data);
}
