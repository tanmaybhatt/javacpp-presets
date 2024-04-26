// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief Used internally by the C++ API. C++ wrapper types inherit from this.
 *   This is a zero cost abstraction to wrap the C API objects and delete them on destruction.
 *
 * All of the C++ classes
 *  a) serve as containers for pointers to objects that are created by the underlying C API.
 *     Their size is just a pointer size, no need to dynamically allocate them. Use them by value.
 *  b) Each of struct XXXX, XXX instances function as smart pointers to the underlying C API objects.
 *     they would release objects owned automatically when going out of scope, they are move-only.
 *  c) ConstXXXX and UnownedXXX structs function as non-owning, copyable containers for the above pointers.
 *     ConstXXXX allow calling const interfaces only. They give access to objects that are owned by somebody else
 *     such as Onnxruntime or instances of XXXX classes.
 *  d) serve convenient interfaces that return C++ objects and further enhance exception and type safety so they can be used
 *     in C++ code.
 *
 */

/** <summary>
/** This is a non-const pointer holder that is move-only. Disposes of the pointer on destruction.
/** </summary> */
@Name("Ort::detail::Base<Ort::detail::Unowned<const OrtValue> >") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseConstValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseConstValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseConstValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseConstValue position(long position) {
        return (BaseConstValue)super.position(position);
    }
    @Override public BaseConstValue getPointer(long i) {
        return new BaseConstValue((Pointer)this).offsetAddress(i);
    }


  public BaseConstValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseConstValue(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtValue> >::contained_type*") UnownedAllocator p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtValue> >::contained_type*") UnownedAllocator p);

  
  

  public BaseConstValue(@ByRef(true) BaseConstValue v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseConstValue v);
  public native @ByRef @Name("operator =") @NoException(true) BaseConstValue put(@ByRef(true) BaseConstValue v);

  public native @Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtValue> >::contained_type*") @Name("operator Ort::detail::Base<Ort::detail::Unowned<const OrtValue> >::contained_type*") @NoException(true) UnownedAllocator asUnownedAllocator();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  
}
