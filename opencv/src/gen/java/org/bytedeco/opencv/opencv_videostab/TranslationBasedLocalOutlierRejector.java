// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class TranslationBasedLocalOutlierRejector extends IOutlierRejector {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TranslationBasedLocalOutlierRejector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TranslationBasedLocalOutlierRejector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TranslationBasedLocalOutlierRejector position(long position) {
        return (TranslationBasedLocalOutlierRejector)super.position(position);
    }
    @Override public TranslationBasedLocalOutlierRejector getPointer(long i) {
        return new TranslationBasedLocalOutlierRejector((Pointer)this).offsetAddress(i);
    }

    public TranslationBasedLocalOutlierRejector() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void setCellSize(@ByVal Size val);
    public native @ByVal Size cellSize();

    public native void setRansacParams(@ByVal RansacParams val);
    public native @ByVal RansacParams ransacParams();

    public native void process(
                @ByVal Size frameSize, @ByVal Mat points0, @ByVal Mat points1, @ByVal Mat mask);
    public native void process(
                @ByVal Size frameSize, @ByVal UMat points0, @ByVal UMat points1, @ByVal UMat mask);
    public native void process(
                @ByVal Size frameSize, @ByVal GpuMat points0, @ByVal GpuMat points1, @ByVal GpuMat mask);
}
