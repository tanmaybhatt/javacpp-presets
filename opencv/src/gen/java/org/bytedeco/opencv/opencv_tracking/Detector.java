// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


@Namespace("cv::detail::tracking::online_boosting") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class Detector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Detector(Pointer p) { super(p); }


  public Detector( StrongClassifierDirectSelection classifier ) { super((Pointer)null); allocate(classifier); }
  private native void allocate( StrongClassifierDirectSelection classifier );

  public native void classifySmooth( @Const @ByRef MatVector image, float minMargin/*=0*/ );
  public native void classifySmooth( @Const @ByRef MatVector image );

  public native int getNumDetections();
  public native float getConfidence( int patchIdx );
  public native float getConfidenceOfDetection( int detectionIdx );

  public native float getConfidenceOfBestDetection();
  public native int getPatchIdxOfBestDetection();

  public native int getPatchIdxOfDetection( int detectionIdx );

  public native @StdVector IntPointer getIdxDetections();
  public native @StdVector FloatPointer getConfidences();

  public native @Const @ByRef Mat getConfImageDisplay();
}
