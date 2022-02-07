// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;



//////////////////////////////////////
// HoughLinesP

/** \brief Base class for line segments detector algorithm. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class HoughSegmentDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HoughSegmentDetector(Pointer p) { super(p); }

    /** \brief Finds line segments in a binary image using the probabilistic Hough transform.
    <p>
    @param src 8-bit, single-channel binary source image.
    @param lines Output vector of lines. Each line is represented by a 4-element vector
    {@code (x_1, y_1, x_2, y_2)} , where {@code (x_1,y_1)} and {@code (x_2, y_2)} are the ending points of each detected
    line segment.
    @param stream Stream for the asynchronous version.
    <p>
    @see HoughLinesP
     */
    public native void detect(@ByVal Mat src, @ByVal Mat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat src, @ByVal Mat lines);
    public native void detect(@ByVal UMat src, @ByVal UMat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat src, @ByVal UMat lines);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat lines);

    public native void setRho(float rho);
    public native float getRho();

    public native void setTheta(float theta);
    public native float getTheta();

    public native void setMinLineLength(int minLineLength);
    public native int getMinLineLength();

    public native void setMaxLineGap(int maxLineGap);
    public native int getMaxLineGap();

    public native void setMaxLines(int maxLines);
    public native int getMaxLines();
}
