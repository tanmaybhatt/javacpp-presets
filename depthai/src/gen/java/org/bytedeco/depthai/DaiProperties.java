// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

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


/** Base Properties structure */
@Name("dai::Properties") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DaiProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DaiProperties(Pointer p) { super(p); }

    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] data);
    public native @UniquePtr DaiProperties clone();
}
