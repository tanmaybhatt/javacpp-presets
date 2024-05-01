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


/** \brief An object representing a shape tuple. */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ShapeTupleObj extends TVMObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public ShapeTupleObj() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ShapeTupleObj(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeTupleObj(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ShapeTupleObj position(long position) {
        return (ShapeTupleObj)super.position(position);
    }
    @Override public ShapeTupleObj getPointer(long i) {
        return new ShapeTupleObj((Pointer)this).offsetAddress(i);
    }

  /** \brief The type of shape index element. */
  /** \brief The pointer to shape tuple data. */
  public native @Cast("tvm::runtime::ShapeTupleObj::index_type*") LongPointer data(); public native ShapeTupleObj data(LongPointer setter);
  /** \brief The size of the shape tuple object. */
  public native @Cast("uint64_t") long size(); public native ShapeTupleObj size(long setter);

  /** \brief Get "numel", meaning the number of elements of an array if the array has this shape */
  public native @Cast("tvm::runtime::ShapeTupleObj::index_type") long Product();

  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
