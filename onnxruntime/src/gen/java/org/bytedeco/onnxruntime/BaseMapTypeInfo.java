// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("Ort::detail::Base<OrtMapTypeInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseMapTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseMapTypeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseMapTypeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseMapTypeInfo position(long position) {
        return (BaseMapTypeInfo)super.position(position);
    }
    @Override public BaseMapTypeInfo getPointer(long i) {
        return new BaseMapTypeInfo((Pointer)this).offsetAddress(i);
    }


  public BaseMapTypeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseMapTypeInfo(@Cast("Ort::detail::Base<OrtMapTypeInfo>::contained_type*") OrtMapTypeInfo p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtMapTypeInfo>::contained_type*") OrtMapTypeInfo p);

  
  

  public BaseMapTypeInfo(@ByRef(true) BaseMapTypeInfo v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseMapTypeInfo v);
  public native @ByRef @Name("operator =") @NoException(true) BaseMapTypeInfo put(@ByRef(true) BaseMapTypeInfo v);

  public native @Cast("Ort::detail::Base<OrtMapTypeInfo>::contained_type*") @Name("operator Ort::detail::Base<OrtMapTypeInfo>::contained_type*") @NoException(true) OrtMapTypeInfo asOrtMapTypeInfo();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtMapTypeInfo>::contained_type*") OrtMapTypeInfo release();
}
