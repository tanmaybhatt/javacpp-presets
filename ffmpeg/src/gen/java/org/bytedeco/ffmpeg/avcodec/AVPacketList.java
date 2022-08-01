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


// #if FF_API_INIT_PACKET
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVPacketList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacketList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPacketList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacketList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPacketList position(long position) {
        return (AVPacketList)super.position(position);
    }
    @Override public AVPacketList getPointer(long i) {
        return new AVPacketList((Pointer)this).offsetAddress(i);
    }

    public native @ByRef AVPacket pkt(); public native AVPacketList pkt(AVPacket setter);
    public native AVPacketList next(); public native AVPacketList next(AVPacketList setter);
}
