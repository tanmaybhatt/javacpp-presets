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

/**
 * EepromData structure
 *
 * Contains the Calibration and Board data stored on device
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EepromData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EepromData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EepromData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EepromData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EepromData position(long position) {
        return (EepromData)super.position(position);
    }
    @Override public EepromData getPointer(long i) {
        return new EepromData((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int version(); public native EepromData version(int setter);
    public native @StdString BytePointer boardName(); public native EepromData boardName(BytePointer setter);
    public native @StdString BytePointer boardRev(); public native EepromData boardRev(BytePointer setter);
    public native @ByRef CameraBoardSocketCameraInfoMap cameraData(); public native EepromData cameraData(CameraBoardSocketCameraInfoMap setter);
    public native @ByRef StereoRectification stereoRectificationData(); public native EepromData stereoRectificationData(StereoRectification setter);
    public native @ByRef Extrinsics imuExtrinsics(); public native EepromData imuExtrinsics(Extrinsics setter);
    public native @Cast("uint8_t*") @StdVector BytePointer miscellaneousData(); public native EepromData miscellaneousData(BytePointer setter);
}
