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

@Name("Ort::detail::Base<Ort::detail::Unowned<const OrtSession> >") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseConstSession extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseConstSession(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseConstSession(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseConstSession position(long position) {
        return (BaseConstSession)super.position(position);
    }
    @Override public BaseConstSession getPointer(long i) {
        return new BaseConstSession((Pointer)this).offsetAddress(i);
    }


  public BaseConstSession() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseConstSession(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtSession> >::contained_type*") UnownedAllocator p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtSession> >::contained_type*") UnownedAllocator p);

  
  

  public BaseConstSession(@ByRef(true) BaseConstSession v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseConstSession v);
  public native @ByRef @Name("operator =") @NoException(true) BaseConstSession put(@ByRef(true) BaseConstSession v);

  public native @Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtSession> >::contained_type*") @Name("operator Ort::detail::Base<Ort::detail::Unowned<const OrtSession> >::contained_type*") @NoException(true) UnownedAllocator asUnownedAllocator();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  
}
