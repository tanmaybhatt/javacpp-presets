// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace std

@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringView(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringView(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringView position(long position) {
        return (StringView)super.position(position);
    }
    @Override public StringView getPointer(long i) {
        return new StringView((Pointer)this).offsetAddress(i);
    }

  public StringView() { super((Pointer)null); allocate(); }
  private native void allocate();
  public StringView(@Cast("const char*") BytePointer str_ptr) { super((Pointer)null); allocate(str_ptr); }
  private native void allocate(@Cast("const char*") BytePointer str_ptr);
  public StringView(String str_ptr) { super((Pointer)null); allocate(str_ptr); }
  private native void allocate(String str_ptr);

  public native @Cast("const char*") BytePointer str();

  

  

  
}
