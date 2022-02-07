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

@Name("torch::nn::functional::ConvTransposeFuncOptions<3>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose3dFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConvTranspose3dFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvTranspose3dFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose3dFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConvTranspose3dFuncOptions position(long position) {
        return (ConvTranspose3dFuncOptions)super.position(position);
    }
    @Override public ConvTranspose3dFuncOptions getPointer(long i) {
        return new ConvTranspose3dFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor bias();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer stride();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer padding();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer output_padding();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer groups();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer dilation();
}
