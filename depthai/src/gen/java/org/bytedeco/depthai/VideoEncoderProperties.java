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
 * Specify properties for VideoEncoder such as profile, bitrate, ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class VideoEncoderProperties extends VideoEncoderPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public VideoEncoderProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VideoEncoderProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoEncoderProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public VideoEncoderProperties position(long position) {
        return (VideoEncoderProperties)super.position(position);
    }
    @Override public VideoEncoderProperties getPointer(long i) {
        return new VideoEncoderProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Rate control mode specifies if constant or variable bitrate should be used (H264 / H265)
     */
    public enum RateControlMode { CBR(0), VBR(1);

        public final int value;
        private RateControlMode(int v) { this.value = v; }
        private RateControlMode(RateControlMode e) { this.value = e.value; }
        public RateControlMode intern() { for (RateControlMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /**
     * Encoding profile, H264 (AVC), H265 (HEVC) or MJPEG
     */
    public enum Profile { H264_BASELINE(0), H264_HIGH(1), H264_MAIN(2), H265_MAIN(3), MJPEG(4);

        public final int value;
        private Profile(int v) { this.value = v; }
        private Profile(Profile e) { this.value = e.value; }
        public Profile intern() { for (Profile e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    /**
     * Specifies preferred bitrate (in bit/s) of compressed output bitstream in CBR mode
     *
     * "0" for automatic computation, based on input resolution and FPS:
     * 720p30: 4Mbps, 1080p30: 8.5Mbps, 1440p30: 14Mbps, 2160p30: 20Mbps
     */
    public native @Cast("std::int32_t") int bitrate(); public native VideoEncoderProperties bitrate(int setter);
    /**
     * Every x number of frames a keyframe will be inserted
     */
    public native @Cast("std::int32_t") int keyframeFrequency(); public native VideoEncoderProperties keyframeFrequency(int setter);
    /**
     * Specifies maximum bitrate (in bit/s) of compressed output bitstream in CBR mode
     *
     * "0" to follow {@code bitrate} setting
     */
    public native @Cast("std::int32_t") int maxBitrate(); public native VideoEncoderProperties maxBitrate(int setter);
    /**
     * Specifies number of B frames to be inserted
     */
    public native @Cast("std::int32_t") int numBFrames(); public native VideoEncoderProperties numBFrames(int setter);
    /**
     * This options specifies how many frames are available in this node's pool.
     * Helps when receiver is slow at consuming.
     *
     * Value "0" indicates automatic number of frames assignment
     */
    public native @Cast("std::uint32_t") int numFramesPool(); public native VideoEncoderProperties numFramesPool(int setter);
    /**
     * Encoding profile, H264, H265 or MJPEG
     */
    public native Profile profile(); public native VideoEncoderProperties profile(Profile setter);
    /**
     * Value between 0-100% (approximates quality)
     */
    public native @Cast("std::int32_t") int quality(); public native VideoEncoderProperties quality(int setter);
    /**
     * Lossless mode ([M]JPEG only)
     */
    public native @Cast("bool") boolean lossless(); public native VideoEncoderProperties lossless(boolean setter);
    /**
     * Rate control mode specifies if constant or variable bitrate should be used (H264 / H265)
     */
    public native RateControlMode rateCtrlMode(); public native VideoEncoderProperties rateCtrlMode(RateControlMode setter);
    /**
     * Frame rate
     */
    public native float frameRate(); public native VideoEncoderProperties frameRate(float setter);
}
