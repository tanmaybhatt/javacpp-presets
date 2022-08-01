// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * Stream structure.
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVStream) must not be used outside libav*.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVStream extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVStream() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVStream(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVStream(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVStream position(long position) {
        return (AVStream)super.position(position);
    }
    @Override public AVStream getPointer(long i) {
        return new AVStream((Pointer)this).offsetAddress(i);
    }

// #if FF_API_AVSTREAM_CLASS
// #endif

    /** stream index in AVFormatContext */
    public native int index(); public native AVStream index(int setter);
    /**
     * Format-specific stream ID.
     * decoding: set by libavformat
     * encoding: set by the user, replaced by libavformat if left unset
     */
    public native int id(); public native AVStream id(int setter);

    public native Pointer priv_data(); public native AVStream priv_data(Pointer setter);

    /**
     * This is the fundamental unit of time (in seconds) in terms
     * of which frame timestamps are represented.
     *
     * decoding: set by libavformat
     * encoding: May be set by the caller before avformat_write_header() to
     *           provide a hint to the muxer about the desired timebase. In
     *           avformat_write_header(), the muxer will overwrite this field
     *           with the timebase that will actually be used for the timestamps
     *           written into the file (which may or may not be related to the
     *           user-provided one, depending on the format).
     */
    public native @ByRef AVRational time_base(); public native AVStream time_base(AVRational setter);

    /**
     * Decoding: pts of the first frame of the stream in presentation order, in stream time base.
     * Only set this if you are absolutely 100% sure that the value you set
     * it to really is the pts of the first frame.
     * This may be undefined (AV_NOPTS_VALUE).
     * \note The ASF header does NOT contain a correct start_time the ASF
     * demuxer must NOT set this.
     */
    public native @Cast("int64_t") long start_time(); public native AVStream start_time(long setter);

    /**
     * Decoding: duration of the stream, in stream time base.
     * If a source file does not specify a duration, but does specify
     * a bitrate, this value will be estimated from bitrate and file size.
     *
     * Encoding: May be set by the caller before avformat_write_header() to
     * provide a hint to the muxer about the estimated duration.
     */
    public native @Cast("int64_t") long duration(); public native AVStream duration(long setter);

    /** number of frames in this stream if known or 0 */
    public native @Cast("int64_t") long nb_frames(); public native AVStream nb_frames(long setter);

    /**
     * Stream disposition - a combination of AV_DISPOSITION_* flags.
     * - demuxing: set by libavformat when creating the stream or in
     *             avformat_find_stream_info().
     * - muxing: may be set by the caller before avformat_write_header().
     */
    public native int disposition(); public native AVStream disposition(int setter);

    /** Selects which packets can be discarded at will and do not need to be demuxed. */
    public native @Cast("AVDiscard") int discard(); public native AVStream discard(int setter);

    /**
     * sample aspect ratio (0 if unknown)
     * - encoding: Set by user.
     * - decoding: Set by libavformat.
     */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVStream sample_aspect_ratio(AVRational setter);

    public native AVDictionary metadata(); public native AVStream metadata(AVDictionary setter);

    /**
     * Average framerate
     *
     * - demuxing: May be set by libavformat when creating the stream or in
     *             avformat_find_stream_info().
     * - muxing: May be set by the caller before avformat_write_header().
     */
    public native @ByRef AVRational avg_frame_rate(); public native AVStream avg_frame_rate(AVRational setter);

    /**
     * For streams with AV_DISPOSITION_ATTACHED_PIC disposition, this packet
     * will contain the attached picture.
     *
     * decoding: set by libavformat, must not be modified by the caller.
     * encoding: unused
     */
    public native @ByRef AVPacket attached_pic(); public native AVStream attached_pic(AVPacket setter);

    /**
     * An array of side data that applies to the whole stream (i.e. the
     * container does not allow it to change between packets).
     *
     * There may be no overlap between the side data in this array and side data
     * in the packets. I.e. a given side data is either exported by the muxer
     * (demuxing) / set by the caller (muxing) in this array, then it never
     * appears in the packets, or the side data is exported / sent through
     * the packets (always in the first packet where the value becomes known or
     * changes), then it does not appear in this array.
     *
     * - demuxing: Set by libavformat when the stream is created.
     * - muxing: May be set by the caller before avformat_write_header().
     *
     * Freed by libavformat in avformat_free_context().
     *
     * @see av_format_inject_global_side_data()
     */
    public native AVPacketSideData side_data(); public native AVStream side_data(AVPacketSideData setter);
    /**
     * The number of elements in the AVStream.side_data array.
     */
    public native int nb_side_data(); public native AVStream nb_side_data(int setter);

    /**
     * Flags indicating events happening on the stream, a combination of
     * AVSTREAM_EVENT_FLAG_*.
     *
     * - demuxing: may be set by the demuxer in avformat_open_input(),
     *   avformat_find_stream_info() and av_read_frame(). Flags must be cleared
     *   by the user once the event has been handled.
     * - muxing: may be set by the user after avformat_write_header(). to
     *   indicate a user-triggered event.  The muxer will clear the flags for
     *   events it has handled in av_[interleaved]_write_frame().
     */
    public native int event_flags(); public native AVStream event_flags(int setter);
/**
 * - demuxing: the demuxer read new metadata from the file and updated
 *     AVStream.metadata accordingly
 * - muxing: the user updated AVStream.metadata and wishes the muxer to write
 *     it into the file
 */
public static final int AVSTREAM_EVENT_FLAG_METADATA_UPDATED = 0x0001;
/**
 * - demuxing: new packets for this stream were read from the file. This
 *   event is informational only and does not guarantee that new packets
 *   for this stream will necessarily be returned from av_read_frame().
 */
public static final int AVSTREAM_EVENT_FLAG_NEW_PACKETS = (1 << 1);

    /**
     * Real base framerate of the stream.
     * This is the lowest framerate with which all timestamps can be
     * represented accurately (it is the least common multiple of all
     * framerates in the stream). Note, this value is just a guess!
     * For example, if the time base is 1/90000 and all frames have either
     * approximately 3600 or 1800 timer ticks, then r_frame_rate will be 50/1.
     */
    public native @ByRef AVRational r_frame_rate(); public native AVStream r_frame_rate(AVRational setter);

    /**
     * Codec parameters associated with this stream. Allocated and freed by
     * libavformat in avformat_new_stream() and avformat_free_context()
     * respectively.
     *
     * - demuxing: filled by libavformat on stream creation or in
     *             avformat_find_stream_info()
     * - muxing: filled by the caller before avformat_write_header()
     */
    public native AVCodecParameters codecpar(); public native AVStream codecpar(AVCodecParameters setter);

    /**
     * Number of bits in timestamps. Used for wrapping control.
     *
     * - demuxing: set by libavformat
     * - muxing: set by libavformat
     *
     */
    public native int pts_wrap_bits(); public native AVStream pts_wrap_bits(int setter);
}
