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

@Name("Ort::detail::Base<OrtSequenceTypeInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseSequenceTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseSequenceTypeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseSequenceTypeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseSequenceTypeInfo position(long position) {
        return (BaseSequenceTypeInfo)super.position(position);
    }
    @Override public BaseSequenceTypeInfo getPointer(long i) {
        return new BaseSequenceTypeInfo((Pointer)this).offsetAddress(i);
    }


  public BaseSequenceTypeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseSequenceTypeInfo(@Cast("Ort::detail::Base<OrtSequenceTypeInfo>::contained_type*") OrtSequenceTypeInfo p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtSequenceTypeInfo>::contained_type*") OrtSequenceTypeInfo p);

  
  

  public BaseSequenceTypeInfo(@ByRef(true) BaseSequenceTypeInfo v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseSequenceTypeInfo v);
  public native @ByRef @Name("operator =") @NoException(true) BaseSequenceTypeInfo put(@ByRef(true) BaseSequenceTypeInfo v);

  public native @Cast("Ort::detail::Base<OrtSequenceTypeInfo>::contained_type*") @Name("operator Ort::detail::Base<OrtSequenceTypeInfo>::contained_type*") @NoException(true) OrtSequenceTypeInfo asOrtSequenceTypeInfo();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtSequenceTypeInfo>::contained_type*") OrtSequenceTypeInfo release();
}
