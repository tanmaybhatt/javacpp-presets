// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXStringSet extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXStringSet() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXStringSet(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXStringSet(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXStringSet position(long position) {
        return (CXStringSet)super.position(position);
    }
    @Override public CXStringSet getPointer(long i) {
        return new CXStringSet((Pointer)this).offsetAddress(i);
    }

  public native CXString Strings(); public native CXStringSet Strings(CXString setter);
  public native @Cast("unsigned") int Count(); public native CXStringSet Count(int setter);
}
