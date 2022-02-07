// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to hold encoder session data
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlEncoderSessionInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlEncoderSessionInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlEncoderSessionInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlEncoderSessionInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlEncoderSessionInfo_t position(long position) {
        return (nvmlEncoderSessionInfo_t)super.position(position);
    }
    @Override public nvmlEncoderSessionInfo_t getPointer(long i) {
        return new nvmlEncoderSessionInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Unique session ID */
    public native @Cast("unsigned int") int sessionId(); public native nvmlEncoderSessionInfo_t sessionId(int setter);
    /** Owning process ID */
    public native @Cast("unsigned int") int pid(); public native nvmlEncoderSessionInfo_t pid(int setter);
    /** Owning vGPU instance ID (only valid on vGPU hosts, otherwise zero) */
    public native @Cast("nvmlVgpuInstance_t") int vgpuInstance(); public native nvmlEncoderSessionInfo_t vgpuInstance(int setter);
    /** Video encoder type */
    public native @Cast("nvmlEncoderType_t") int codecType(); public native nvmlEncoderSessionInfo_t codecType(int setter);
    /** Current encode horizontal resolution */
    public native @Cast("unsigned int") int hResolution(); public native nvmlEncoderSessionInfo_t hResolution(int setter);
    /** Current encode vertical resolution */
    public native @Cast("unsigned int") int vResolution(); public native nvmlEncoderSessionInfo_t vResolution(int setter);
    /** Moving average encode frames per second */
    public native @Cast("unsigned int") int averageFps(); public native nvmlEncoderSessionInfo_t averageFps(int setter);
    /** Moving average encode latency in microseconds */
    public native @Cast("unsigned int") int averageLatency(); public native nvmlEncoderSessionInfo_t averageLatency(int setter);
}
