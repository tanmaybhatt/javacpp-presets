// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

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

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief Video reader interface.
<p>
\note
   -   An example on how to use the videoReader class can be found at
        opencv_source_code/samples/gpu/video_reader.cpp
 */
@Name("cv::cudacodec::VideoReader") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class VideoReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoReader(Pointer p) { super(p); }


    /** \brief Grabs, decodes and returns the next video frame.
    <p>
    If no frames has been grabbed (there are no more frames in video file), the methods return false .
    The method throws Exception if error occurs.
     */
    public native @Cast("bool") boolean nextFrame(@ByRef GpuMat frame, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native @Cast("bool") boolean nextFrame(@ByRef GpuMat frame);

    /** \brief Returns information about video file format.
    */
    public native @ByVal FormatInfo format();

    /** \brief Grabs the next frame from the video source.
    <p>
    @return {@code true} (non-zero) in the case of success.
    <p>
    The method/function grabs the next frame from video file or camera and returns true (non-zero) in
    the case of success.
    <p>
    The primary use of the function is for reading both the encoded and decoded video data when rawMode is enabled.  With rawMode enabled
    retrieve() can be called following grab() to retrieve all the data associated with the current video source since the last call to grab() or the creation of the VideoReader.
     */
    public native @Cast("bool") boolean grab(@ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native @Cast("bool") boolean grab();

    /** \brief Returns previously grabbed video data.
    <p>
    @param frame [out] The returned data which depends on the provided idx.  If there is no new data since the last call to grab() the image will be empty.
    @param idx Determins the returned data inside image. The returned data can be the:
    Decoded frame, idx = get(PROP_DECODED_FRAME_IDX).
    Extra data if available, idx = get(PROP_EXTRA_DATA_INDEX).
    Raw encoded data package.  To retrieve package i,  idx = get(PROP_RAW_PACKAGES_BASE_INDEX) + i with i < get(PROP_NUMBER_OF_RAW_PACKAGES_SINCE_LAST_GRAB)
    @return {@code false} if no frames has been grabbed
    <p>
    The method returns data associated with the current video source since the last call to grab() or the creation of the VideoReader. If no data is present
    the method returns false and the function returns an empty image.
     */
    public native @Cast("bool") boolean retrieve(@ByVal Mat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal Mat frame);
    public native @Cast("bool") boolean retrieve(@ByVal UMat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal UMat frame);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat frame);

    /** \brief Sets a property in the VideoReader.
    <p>
    @param property Property identifier from cv::cudacodec::VideoReaderProps (eg. cv::cudacodec::PROP_DECODED_FRAME_IDX, cv::cudacodec::PROP_EXTRA_DATA_INDEX, ...)
    @param propertyVal Value of the property.
    @return {@code true} if the property has been set.
     */
    public native @Cast("bool") boolean set(@Cast("const cv::cudacodec::VideoReaderProps") int property, double propertyVal);

    /** \brief Returns the specified VideoReader property
    <p>
    @param property Property identifier from cv::cudacodec::VideoReaderProps (eg. cv::cudacodec::PROP_DECODED_FRAME_IDX, cv::cudacodec::PROP_EXTRA_DATA_INDEX, ...)
    @param propertyVal Optional value for the property.
    @return Value for the specified property. Value -1 is returned when querying a property that is not supported.
    */
    public native int get(@Cast("const cv::cudacodec::VideoReaderProps") int property, int propertyVal/*=-1*/);
    public native int get(@Cast("const cv::cudacodec::VideoReaderProps") int property);
}
