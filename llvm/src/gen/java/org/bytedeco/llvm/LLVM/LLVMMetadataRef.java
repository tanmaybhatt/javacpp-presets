// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents an LLVM Metadata.
 *
 * This models llvm::Metadata.
 */
@Name("LLVMOpaqueMetadata") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMetadataRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMMetadataRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMMetadataRef(Pointer p) { super(p); }
}
