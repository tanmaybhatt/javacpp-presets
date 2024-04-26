// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief Helper to represent nullptr for optional. */
@Namespace("tvm::runtime") @Opaque @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class NullOptType extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NullOptType() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullOptType(Pointer p) { super(p); }
}
