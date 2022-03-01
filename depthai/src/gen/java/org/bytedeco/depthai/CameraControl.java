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


/**
 * CameraControl message.
 * Specifies various camera control commands like:
 *
 *  - Still capture
 *
 *  - Auto focus
 *
 *  - Anti banding
 *
 *  - Auto white balance
 *
 *  - Scene
 *
 *  - Effect
 *
 *  - ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraControl extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraControl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CameraControl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CameraControl position(long position) {
        return (CameraControl)super.position(position);
    }
    @Override public CameraControl getPointer(long i) {
        return new CameraControl((Pointer)this).offsetAddress(i);
    }


    /** Construct CameraControl message */
    public CameraControl() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CameraControl(@SharedPtr RawCameraControl ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawCameraControl ptr);

    /**
     * Set a command to capture a still image
     */
    public native @ByRef CameraControl setCaptureStill(@Cast("bool") boolean capture);

    /**
     * Set a command to start streaming
     */
    public native @ByRef CameraControl setStartStreaming();

    /**
     * Set a command to stop streaming
     */
    public native @ByRef CameraControl setStopStreaming();

    // Focus
    /**
     * Set a command to specify autofocus mode
     */
    public native @ByRef CameraControl setAutoFocusMode(RawCameraControl.AutoFocusMode mode);
    public native @ByRef CameraControl setAutoFocusMode(@Cast("dai::RawCameraControl::AutoFocusMode") byte mode);

    /**
     * Set a command to trigger autofocus
     */
    public native @ByRef CameraControl setAutoFocusTrigger();

    /**
     * Set a command to specify focus region in pixels
     * @param startX X coordinate of top left corner of region
     * @param startY Y coordinate of top left corner of region
     * @param width Region width
     * @param height Region height
     */
    public native @ByRef CameraControl setAutoFocusRegion(@Cast("uint16_t") short startX, @Cast("uint16_t") short startY, @Cast("uint16_t") short width, @Cast("uint16_t") short height);

    /**
     * Set a command to specify manual focus position
     * @param lensPosition specify lens position 0..255
     */
    public native @ByRef CameraControl setManualFocus(@Cast("uint8_t") byte lensPosition);

    // Exposure
    /**
     * Set a command to enable auto exposure
     */
    public native @ByRef CameraControl setAutoExposureEnable();

    /**
     * Set a command to specify lock auto exposure
     * @param lock Auto exposure lock mode enabled or disabled
     */
    public native @ByRef CameraControl setAutoExposureLock(@Cast("bool") boolean lock);

    /**
     * Set a command to specify auto exposure region in pixels
     * @param startX X coordinate of top left corner of region
     * @param startY Y coordinate of top left corner of region
     * @param width Region width
     * @param height Region height
     */
    public native @ByRef CameraControl setAutoExposureRegion(@Cast("uint16_t") short startX, @Cast("uint16_t") short startY, @Cast("uint16_t") short width, @Cast("uint16_t") short height);

    /**
     * Set a command to specify auto exposure compensation
     * @param compensation Compensation value between -9..9
     */
    public native @ByRef CameraControl setAutoExposureCompensation(int compensation);

    /**
     * Set a command to specify auto banding mode
     * @param mode Auto banding mode to use
     */
    public native @ByRef CameraControl setAntiBandingMode(RawCameraControl.AntiBandingMode mode);
    public native @ByRef CameraControl setAntiBandingMode(@Cast("dai::RawCameraControl::AntiBandingMode") byte mode);

    /**
     * Set a command to manually specify exposure
     * @param exposureTimeUs Exposure time in microseconds
     * @param sensitivityIso Sensitivity as ISO value, usual range 100..1600
     */
    public native @ByRef CameraControl setManualExposure(@Cast("uint32_t") int exposureTimeUs, @Cast("uint32_t") int sensitivityIso);

    // White Balance
    /**
     * Set a command to specify auto white balance mode
     * @param mode Auto white balance mode to use
     */
    public native @ByRef CameraControl setAutoWhiteBalanceMode(RawCameraControl.AutoWhiteBalanceMode mode);
    public native @ByRef CameraControl setAutoWhiteBalanceMode(@Cast("dai::RawCameraControl::AutoWhiteBalanceMode") byte mode);

    /**
     * Set a command to specify auto white balance lock
     * @param lock Auto white balance lock mode enabled or disabled
     */
    public native @ByRef CameraControl setAutoWhiteBalanceLock(@Cast("bool") boolean lock);

    /**
     * Set a command to manually specify white-balance color correction
     * @param colorTemperatureK Light source color temperature in kelvins, range 1000..12000
     */
    public native @ByRef CameraControl setManualWhiteBalance(int colorTemperatureK);

    // Other image controls
    /**
     * Set a command to adjust image brightness
     * @param value Brightness, range -10..10
     */
    public native @ByRef CameraControl setBrightness(int value);

    /**
     * Set a command to adjust image contrast
     * @param value Contrast, range -10..10
     */
    public native @ByRef CameraControl setContrast(int value);

    /**
     * Set a command to adjust image saturation
     * @param value Saturation, range -10..10
     */
    public native @ByRef CameraControl setSaturation(int value);

    /**
     * Set a command to adjust image sharpness
     * @param value Sharpness, range 0..4
     */
    public native @ByRef CameraControl setSharpness(int value);

    /**
     * Set a command to adjust luma denoise amount
     * @param value Luma denoise amount, range 0..4
     */
    public native @ByRef CameraControl setLumaDenoise(int value);

    /**
     * Set a command to adjust chroma denoise amount
     * @param value Chroma denoise amount, range 0..4
     */
    public native @ByRef CameraControl setChromaDenoise(int value);

    /**
     * Set a command to specify scene mode
     * @param mode Scene mode
     */
    public native @ByRef CameraControl setSceneMode(RawCameraControl.SceneMode mode);
    public native @ByRef CameraControl setSceneMode(@Cast("dai::RawCameraControl::SceneMode") byte mode);

    /**
     * Set a command to specify effect mode
     * @param mode Effect mode
     */
    public native @ByRef CameraControl setEffectMode(RawCameraControl.EffectMode mode);
    public native @ByRef CameraControl setEffectMode(@Cast("dai::RawCameraControl::EffectMode") byte mode);

    // Functions to retrieve properties
    /**
     * Check whether command to capture a still is set
     * @return True if capture still command is set
     */
    public native @Cast("bool") boolean getCaptureStill();
}
