// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class FileAccPropList
    \brief Class FileAccPropList inherits from PropList and provides
    wrappers for the HDF5 file access property list.
*/
//  Inheritance: PropList -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class FileAccPropList extends PropList {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileAccPropList(Pointer p) { super(p); }

    /**\brief Default file access property list. */
    @MemberGetter public static native @Const @ByRef FileAccPropList DEFAULT();

    // Creates a file access property list.
    public FileAccPropList() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Modifies this property list to use the H5FD_STDIO driver
    public native void setStdio();

    // Set file driver for this property list
    public native void setDriver(@Cast("hid_t") long new_driver_id, @Const Pointer new_driver_info);

    // Returns a low-level file driver identifier.
    public native @Cast("hid_t") long getDriver();

    // Sets offset for family driver.
    public native void setFamilyOffset(@Cast("hsize_t") long offset);

    // Gets offset for family driver.
    public native @Cast("hsize_t") long getFamilyOffset();

    // Modifies this file access property list to use the sec2 driver.
    public native void setSec2();

    // Modifies this file access property list to use the H5FD_CORE
    // driver.
    public native void setCore(@Cast("size_t") long increment, @Cast("hbool_t") boolean backing_store);

    // Queries H5FD_CORE driver properties.
    public native void getCore(@Cast("size_t*") @ByRef SizeTPointer increment, @Cast("hbool_t*") @ByRef BoolPointer backing_store);
    public native void getCore(@Cast("size_t*") @ByRef SizeTPointer increment, @Cast("hbool_t*") @ByRef boolean[] backing_store);

    // Sets this file access properties list to the family driver.
    public native void setFamily(@Cast("hsize_t") long memb_size, @Const @ByRef FileAccPropList memb_plist);

    // Returns information about the family file access property list.
    public native void getFamily(@Cast("hsize_t*") @ByRef LongPointer memb_size, @ByRef FileAccPropList memb_plist);
    public native void getFamily(@Cast("hsize_t*") @ByRef LongBuffer memb_size, @ByRef FileAccPropList memb_plist);
    public native void getFamily(@Cast("hsize_t*") @ByRef long[] memb_size, @ByRef FileAccPropList memb_plist);
    public native @ByVal FileAccPropList getFamily(@Cast("hsize_t*") @ByRef LongPointer memb_size);
    public native @ByVal FileAccPropList getFamily(@Cast("hsize_t*") @ByRef LongBuffer memb_size);
    public native @ByVal FileAccPropList getFamily(@Cast("hsize_t*") @ByRef long... memb_size);

    // Emulates the old split file driver,
    public native void setSplit(@Const @ByRef FileAccPropList meta_plist,
                  @Const @ByRef FileAccPropList raw_plist,
                  @Cast("const char*") BytePointer meta_ext/*=".meta"*/,
                  @Cast("const char*") BytePointer raw_ext/*=".raw"*/ );
    public native void setSplit(@Const @ByRef FileAccPropList meta_plist,
                  @Const @ByRef FileAccPropList raw_plist,
                  String meta_ext/*=".meta"*/,
                  String raw_ext/*=".raw"*/ );
    

    // Sets the maximum size of the data sieve buffer.
    public native void setSieveBufSize(@Cast("size_t") long bufsize);

    // Returns the current settings for the data sieve buffer size
    // property
    public native @Cast("size_t") long getSieveBufSize();

    // Sets the minimum size of metadata block allocations.
    public native void setMetaBlockSize(@Cast("hsize_t*") @ByRef LongPointer block_size);
    public native void setMetaBlockSize(@Cast("hsize_t*") @ByRef LongBuffer block_size);
    public native void setMetaBlockSize(@Cast("hsize_t*") @ByRef long... block_size);

    // Returns the current metadata block size setting.
    public native @Cast("hsize_t") long getMetaBlockSize();

    // Modifies this file access property list to use the logging driver.
    public native void setLog(@Cast("const char*") BytePointer logfile, @Cast("unsigned") int flags, @Cast("size_t") long buf_size);
    public native void setLog(String logfile, @Cast("unsigned") int flags, @Cast("size_t") long buf_size);

    // Sets alignment properties of this file access property list
    public native void setAlignment(@Cast("hsize_t") long threshold/*=1*/, @Cast("hsize_t") long alignment/*=1*/);
    public native void setAlignment();

    // Retrieves the current settings for alignment properties from
    // this property list.
    public native void getAlignment(@Cast("hsize_t*") @ByRef LongPointer threshold, @Cast("hsize_t*") @ByRef LongPointer alignment);
    public native void getAlignment(@Cast("hsize_t*") @ByRef LongBuffer threshold, @Cast("hsize_t*") @ByRef LongBuffer alignment);
    public native void getAlignment(@Cast("hsize_t*") @ByRef long[] threshold, @Cast("hsize_t*") @ByRef long... alignment);

    // Sets data type for multi driver.
    public native void setMultiType(@Cast("H5FD_mem_t") int dtype);

    // Returns the data type property for MULTI driver.
    public native @Cast("H5FD_mem_t") int getMultiType();

    // Sets the meta data cache and raw data chunk cache parameters.
    public native void setCache(int mdc_nelmts, @Cast("size_t") long rdcc_nelmts, @Cast("size_t") long rdcc_nbytes, double rdcc_w0);

    // Queries the meta data cache and raw data chunk cache parameters.
    public native void getCache(@ByRef IntPointer mdc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef DoublePointer rdcc_w0);
    public native void getCache(@ByRef IntBuffer mdc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef DoubleBuffer rdcc_w0);
    public native void getCache(@ByRef int[] mdc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nelmts, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef double[] rdcc_w0);

    // Sets the degree for the file close behavior.
    public native void setFcloseDegree(@Cast("H5F_close_degree_t") int degree);

    // Returns the degree for the file close behavior.
    public native @Cast("H5F_close_degree_t") int getFcloseDegree();

    // Sets file access property list to use the H5FD_DIRECT driver.
    

    // Retrieves information about the direct file access property list.
    

    // Sets garbage collecting references flag.
    public native void setGcReferences(@Cast("unsigned") int gc_ref/*=0*/);
    public native void setGcReferences();

    // Returns garbage collecting references setting.
    public native @Cast("unsigned") int getGcReferences();

    // Sets file locking parameters.
    public native void setFileLocking(@Cast("hbool_t") boolean use_file_locking, @Cast("hbool_t") boolean ignore_when_disabled);

    // Gets file locking parameters.
    public native void getFileLocking(@Cast("hbool_t*") @ByRef BoolPointer use_file_locking, @Cast("hbool_t*") @ByRef BoolPointer ignore_when_disabled);
    public native void getFileLocking(@Cast("hbool_t*") @ByRef boolean[] use_file_locking, @Cast("hbool_t*") @ByRef boolean[] ignore_when_disabled);

    // Sets bounds on versions of library format to be used when creating
    // or writing objects.
    public native void setLibverBounds(@Cast("H5F_libver_t") int libver_low, @Cast("H5F_libver_t") int libver_high);

    // Gets the current settings for the library version format bounds.
    public native void getLibverBounds(@Cast("H5F_libver_t*") @ByRef IntPointer libver_low, @Cast("H5F_libver_t*") @ByRef IntPointer libver_high);
    public native void getLibverBounds(@Cast("H5F_libver_t*") @ByRef IntBuffer libver_low, @Cast("H5F_libver_t*") @ByRef IntBuffer libver_high);
    public native void getLibverBounds(@Cast("H5F_libver_t*") @ByRef int[] libver_low, @Cast("H5F_libver_t*") @ByRef int[] libver_high);

    /**\brief Returns this class name. */
    public native @StdString @Override BytePointer fromClass();

    // Copy constructor: same as the original FileAccPropList.
    public FileAccPropList(@Const @ByRef FileAccPropList original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef FileAccPropList original);

    // Creates a copy of an existing file access property list
    // using the property list id.
    public FileAccPropList(@Cast("const hid_t") long plist_id) { super((Pointer)null); allocate(plist_id); }
    private native void allocate(@Cast("const hid_t") long plist_id);

    // Noop destructor

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

    // Deletes the global constant, should only be used by the library
    public static native void deleteConstants();

}
