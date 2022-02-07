// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class PlatformType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PlatformType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PlatformType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlatformType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PlatformType position(long position) {
        return (PlatformType)super.position(position);
    }
    @Override public PlatformType getPointer(long i) {
        return new PlatformType((Pointer)this).offsetAddress(i);
    }

  public native @Cast("char") byte platform(int i); public native PlatformType platform(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer platform();       // 0 terminated string
  public native @Cast("char") byte base_platform(int i); public native PlatformType base_platform(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer base_platform();  // 0 terminated string
}
