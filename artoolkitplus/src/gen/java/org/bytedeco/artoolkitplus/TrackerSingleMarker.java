// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


/**
 * Defines a simple interface for single-marker tracking with ARToolKitPlus
 *  ARToolKitPlus::TrackerSingleMarker provides all methods to access ARToolKit for
 *  single marker tracking without needing to mess around with it low level methods directly.
 *
 *  Per default the tracker searches for Id-based markers with normal border and uses
 *  the RPP algorithm for pose estimation. You can override this using the according methods.
 *
 *  If you need multi-marker tracking use TrackerMultiMarker.
 */
@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class TrackerSingleMarker extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerSingleMarker(Pointer p) { super(p); }

    /**
     * These parameters control the way the toolkit warps a found
     * marker to a perfect square. The square has size
     * pattWidth * pattHeight, the projected
     * square in the image is subsampled at a min of
     * pattWidth/pattHeight and a max of pattSamples
     * steps in both x and y direction
     *  @param imWidth width of the source image in px
     *  @param imHeight height of the source image in px
     *  @param maxImagePatterns describes the maximum number of patterns that can be analyzed in a camera image.
     *  @param pattWidth describes the pattern image width (must be 6 for binary markers)
     *  @param pattHeight describes the pattern image height (must be 6 for binary markers)
     *  @param pattSamples describes the maximum resolution at which a pattern is sampled from the camera image
     *  (6 by default, must a a multiple of pattWidth and pattHeight).
     *  @param maxLoadPatterns describes the maximum number of pattern files that can be loaded.
     *  Reduce maxLoadPatterns and maxImagePatterns to reduce memory footprint.
     */
    public TrackerSingleMarker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { super((Pointer)null); allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public TrackerSingleMarker(int imWidth, int imHeight) { super((Pointer)null); allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * initializes TrackerSingleMarker
     * @param nCamParamFile is the name of the camera parameter file
     */
    public native @Cast("bool") boolean init(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean init(String nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * adds a pattern to ARToolKit
     * pass the patterns filename
     */
    public native int addPattern(@Cast("const char*") BytePointer nFileName);
    public native int addPattern(String nFileName);

    /**
     * calculates the transformation matrix
     * pass the image as RGBX (32-bits)
     * @return detected markers in image
     */
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer nMarker_info/*=NULL*/, IntPointer nNumMarkers/*=NULL*/);
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage);
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, IntPointer nNumMarkers/*=NULL*/);
    public native @StdVector IntBuffer calc(@Cast("const uint8_t*") ByteBuffer nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, IntBuffer nNumMarkers/*=NULL*/);
    public native @StdVector IntBuffer calc(@Cast("const uint8_t*") ByteBuffer nImage);
    public native @StdVector int[] calc(@Cast("const uint8_t*") byte[] nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, int[] nNumMarkers/*=NULL*/);
    public native @StdVector int[] calc(@Cast("const uint8_t*") byte[] nImage);

    /**
     * manually select one of the detected markers
     * instead of using the best one
     */
    public native void selectDetectedMarker(int id);

    /**
     * Select the best marker based on Confidence
     */
    public native int selectBestMarkerByCf();

    /**
     * Sets the width and height of the patterns in OpenGL units
     * defaults to 2.0, so the unity cube fits the marker surface
     */
    public native void setPatternWidth(@Cast("ARFloat") float nWidth);

    /**
     * Provides access to ARToolKit' patt_trans matrix
     *  This method is primarily for compatibility issues with code previously using
     *  ARToolKit rather than ARToolKitPlus. patt_trans is the original transformation
     *  matrix ARToolKit calculates rather than the OpenGL style version of this matrix
     *  that can be retrieved via getModelViewMatrix().
     */
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") float[] nMatrix);

    /**
     * Returns the confidence value of the currently best detected marker.
     */
    public native float getConfidence();
}
