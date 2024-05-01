// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Element of the "Args" list. The key might give more information about what
 * the semantics of the value are, e.g. "Callee" will tell you that the value
 * is a symbol that names a function.
 *
 * @since REMARKS_API_VERSION=0
 */
@Name("LLVMRemarkOpaqueArg") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMRemarkArgRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMRemarkArgRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMRemarkArgRef(Pointer p) { super(p); }
}
