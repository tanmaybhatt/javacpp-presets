// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVSubtitleRect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVSubtitleRect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVSubtitleRect(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVSubtitleRect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVSubtitleRect position(long position) {
        return (AVSubtitleRect)super.position(position);
    }
    @Override public AVSubtitleRect getPointer(long i) {
        return new AVSubtitleRect((Pointer)this).offsetAddress(i);
    }

    /** top left corner  of pict, undefined when pict is not set */
    public native int x(); public native AVSubtitleRect x(int setter);
    /** top left corner  of pict, undefined when pict is not set */
    public native int y(); public native AVSubtitleRect y(int setter);
    /** width            of pict, undefined when pict is not set */
    public native int w(); public native AVSubtitleRect w(int setter);
    /** height           of pict, undefined when pict is not set */
    public native int h(); public native AVSubtitleRect h(int setter);
    /** number of colors in pict, undefined when pict is not set */
    public native int nb_colors(); public native AVSubtitleRect nb_colors(int setter);

    /**
     * data+linesize for the bitmap of this subtitle.
     * Can be set for text/ass as well once they are rendered.
     */
    public native @Cast("uint8_t*") BytePointer data(int i); public native AVSubtitleRect data(int i, BytePointer setter);
    @MemberGetter public native @Cast("uint8_t**") PointerPointer data();
    public native int linesize(int i); public native AVSubtitleRect linesize(int i, int setter);
    @MemberGetter public native IntPointer linesize();

    public native @Cast("AVSubtitleType") int type(); public native AVSubtitleRect type(int setter);

    /** 0 terminated plain UTF-8 text */
    public native @Cast("char*") BytePointer text(); public native AVSubtitleRect text(BytePointer setter);

    /**
     * 0 terminated ASS/SSA compatible event line.
     * The presentation of this is unaffected by the other values in this
     * struct.
     */
    public native @Cast("char*") BytePointer ass(); public native AVSubtitleRect ass(BytePointer setter);

    public native int flags(); public native AVSubtitleRect flags(int setter);
}
