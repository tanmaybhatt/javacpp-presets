// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


/** \defgroup frame Frame Listeners
 * Receive decoded image frames, and the frame format.
 */

/** Frame format and metadata. \ingroup frame */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class Frame extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Frame(Pointer p) { super(p); }

  /** Available types of frames. */
  /** enum libfreenect2::Frame::Type */
  public static final int
    /** 1920x1080. BGRX or RGBX. */
    Color = 1,
    /** 512x424 float. Range is [0.0, 65535.0]. */
    Ir = 2,
    /** 512x424 float, unit: millimeter. Non-positive, NaN, and infinity are invalid or missing data. */
    Depth = 4;

  /** Pixel format. */
  /** enum libfreenect2::Frame::Format */
  public static final int
    /** Invalid format. */
    Invalid = 0,
    /** Raw bitstream. 'bytes_per_pixel' defines the number of bytes */
    Raw = 1,
    /** A 4-byte float per pixel */
    Float = 2,
    /** 4 bytes of B, G, R, and unused per pixel */
    BGRX = 4,
    /** 4 bytes of R, G, B, and unused per pixel */
    RGBX = 5,
    /** 1 byte of gray per pixel */
    Gray = 6;

  /** Length of a line (in pixels). */
  public native @Cast("size_t") long width(); public native Frame width(long setter);
  /** Number of lines in the frame. */
  public native @Cast("size_t") long height(); public native Frame height(long setter);
  /** Number of bytes in a pixel. If frame format is 'Raw' this is the buffer size. */
  public native @Cast("size_t") long bytes_per_pixel(); public native Frame bytes_per_pixel(long setter);
  /** Data of the frame (aligned). @see See Frame::Type for pixel format. */
  public native @Cast("unsigned char*") BytePointer data(); public native Frame data(BytePointer setter);
  /** Unit: roughly or exactly 0.1 millisecond */
  public native @Cast("uint32_t") int timestamp(); public native Frame timestamp(int setter);
  /** Increasing frame sequence number */
  public native @Cast("uint32_t") int sequence(); public native Frame sequence(int setter);
  /** From 0.5 (very bright) to ~60.0 (fully covered) */
  public native float exposure(); public native Frame exposure(float setter);
  /** From 1.0 (bright) to 1.5 (covered) */
  public native float gain(); public native Frame gain(float setter);
  /** From 1.0 (bright) to 6.4 (covered) */
  public native float gamma(); public native Frame gamma(float setter);
  /** zero if ok; non-zero for errors. */
  public native @Cast("uint32_t") int status(); public native Frame status(int setter);
  /** Byte format. Informative only, doesn't indicate errors. */
  public native @Cast("libfreenect2::Frame::Format") int format(); public native Frame format(int setter);

  /** Construct a new frame.
   * @param width Width in pixel
   * @param height Height in pixel
   * @param bytes_per_pixel Bytes per pixel
   * @param data_ Memory to store frame data. If {@code NULL}, new memory is allocated.
   */
  public Frame(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") BytePointer data_/*=NULL*/) { super((Pointer)null); allocate(width, height, bytes_per_pixel, data_); }
  private native void allocate(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") BytePointer data_/*=NULL*/);
  public Frame(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel) { super((Pointer)null); allocate(width, height, bytes_per_pixel); }
  private native void allocate(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel);
  public Frame(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") ByteBuffer data_/*=NULL*/) { super((Pointer)null); allocate(width, height, bytes_per_pixel, data_); }
  private native void allocate(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") ByteBuffer data_/*=NULL*/);
  public Frame(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") byte[] data_/*=NULL*/) { super((Pointer)null); allocate(width, height, bytes_per_pixel, data_); }
  private native void allocate(@Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long bytes_per_pixel, @Cast("unsigned char*") byte[] data_/*=NULL*/);
}
