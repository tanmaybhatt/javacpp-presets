// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5P_cls_copy_func_t_snip] -->
 <p>
 *  <!-- [H5P_cls_close_func_t_snip] -->
/**
 * \brief Callback function for H5Pcreate_class()
 *
 * @param prop_id [in]    The identifier of the property list class being created
 * @param close_data [in] User pointer to any close data required
 * @return \herr_t
 *
 * \details This function is called when a property list of the class
 *          with which this function was registered is being closed.  The
 *          function is called after any registered parent close function is
 *          called for each property value.
 *
 *          If the close function returns a negative value, the new list is not
 *          returned to the user and the property list close routine returns
 *          an error value.
 *
 * @since 1.4.0
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5P_cls_close_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5P_cls_close_func_t(Pointer p) { super(p); }
    protected H5P_cls_close_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long prop_id, Pointer close_data);
}
