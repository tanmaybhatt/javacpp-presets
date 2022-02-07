// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class MipsFeatures extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MipsFeatures() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MipsFeatures(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MipsFeatures(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MipsFeatures position(long position) {
        return (MipsFeatures)super.position(position);
    }
    @Override public MipsFeatures getPointer(long i) {
        return new MipsFeatures((Pointer)this).offsetAddress(i);
    }

  public native @NoOffset int msa(); public native MipsFeatures msa(int setter);  // MIPS SIMD Architecture
                // https://www.mips.com/products/architectures/ase/simd/
  public native @NoOffset int eva(); public native MipsFeatures eva(int setter);  // Enhanced Virtual Addressing
                // https://www.mips.com/products/architectures/mips64/
  public native @NoOffset int r6(); public native MipsFeatures r6(int setter);   // True if is release 6 of the processor.

  // Make sure to update MipsFeaturesEnum below if you add a field here.
}
