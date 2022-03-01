// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/** Base message - buffer of binary data */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Buffer extends ADatatype {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Buffer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Buffer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Buffer position(long position) {
        return (Buffer)super.position(position);
    }
    @Override public Buffer getPointer(long i) {
        return new Buffer((Pointer)this).offsetAddress(i);
    }

    /** Creates Buffer message */
    public Buffer() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Buffer(@SharedPtr RawBuffer ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawBuffer ptr);

    // helpers
    /**
     * \brief Get non-owning reference to internal buffer
     * @return Reference to internal buffer
     */
    public native @Cast("std::uint8_t*") @StdVector BytePointer getData();

    /**
     * @param data Copies data to internal buffer
     */
    public native void setData(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native void setData(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native void setData(@Cast("std::uint8_t*") @StdVector byte[] data);

    /**
     * @param data Moves data to internal buffer
     */
}
