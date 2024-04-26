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


/**
 * \brief Union type of values
 *  being passed through API and function calls.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMValue extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TVMValue() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMValue(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMValue(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TVMValue position(long position) {
        return (TVMValue)super.position(position);
    }
    @Override public TVMValue getPointer(long i) {
        return new TVMValue((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t") long v_int64(); public native TVMValue v_int64(long setter);
  public native double v_float64(); public native TVMValue v_float64(double setter);
  public native Pointer v_handle(); public native TVMValue v_handle(Pointer setter);
  public native @Cast("const char*") BytePointer v_str(); public native TVMValue v_str(BytePointer setter);
  public native @ByRef DLDataType v_type(); public native TVMValue v_type(DLDataType setter);
  public native @ByRef DLDevice v_device(); public native TVMValue v_device(DLDevice setter);
}
