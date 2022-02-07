// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace c10

// make symbol behave like an integer in hash tables
@Name("std::hash<c10::Symbol>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymbolHash extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SymbolHash() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymbolHash(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolHash(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SymbolHash position(long position) {
        return (SymbolHash)super.position(position);
    }
    @Override public SymbolHash getPointer(long i) {
        return new SymbolHash((Pointer)this).offsetAddress(i);
    }

  public native @Cast("std::size_t") @Name("operator ()") long apply(@ByVal Symbol s);
}
