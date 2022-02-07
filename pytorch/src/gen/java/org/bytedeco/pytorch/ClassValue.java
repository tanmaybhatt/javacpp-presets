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


// Represents a class, analagous to `int` or `dict`. Instances of classes,
// like `1` or `{"foo": 5}`, are represented as SimpleValues
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ClassValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClassValue(Pointer p) { super(p); }

  public ClassValue(@SharedPtr @ByVal ClassType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @ByVal ClassType type);

  // Call the type's constructor, as in:
  //    n = Foo(constructor_arg)
  public native @SharedPtr @ByVal SugaredValue call(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @ByVal NamedValueArrayRef args,
        @ByVal NamedValueArrayRef kwargs,
        @Cast("size_t") long n_binders);

  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString BytePointer field);
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString String field);

  public native @StdString BytePointer kind();

  public native @SharedPtr @ByRef ClassType type_(); public native ClassValue type_(ClassType setter);
}
