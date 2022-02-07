// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libffi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libffi.global.ffi.*;

// #endif

    @Properties(inherit = org.bytedeco.libffi.presets.ffi.class)
public class ffi_closure extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ffi_closure() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ffi_closure(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ffi_closure(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ffi_closure position(long position) {
        return (ffi_closure)super.position(position);
    }
    @Override public ffi_closure getPointer(long i) {
        return new ffi_closure((Pointer)this).offsetAddress(i);
    }

// #if 0
// #else
    public native @Cast("char") byte tramp(int i); public native ffi_closure tramp(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer tramp();
    public native Pointer ftramp(); public native ffi_closure ftramp(Pointer setter);
// #endif
  public native ffi_cif cif(); public native ffi_closure cif(ffi_cif setter);
  public static class Fun_ffi_cif_Pointer_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fun_ffi_cif_Pointer_PointerPointer_Pointer(Pointer p) { super(p); }
      protected Fun_ffi_cif_Pointer_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(ffi_cif arg0,Pointer arg1,@Cast("void**") PointerPointer arg2,Pointer arg3);
  }
  public native Fun_ffi_cif_Pointer_PointerPointer_Pointer fun(); public native ffi_closure fun(Fun_ffi_cif_Pointer_PointerPointer_Pointer setter);
  public native Pointer user_data(); public native ffi_closure user_data(Pointer setter);
}
    
