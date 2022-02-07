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


@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ForwardADLevel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ForwardADLevel(Pointer p) { super(p); }

  public ForwardADLevel(@Cast("uint64_t") long idx) { super((Pointer)null); allocate(idx); }
  private native void allocate(@Cast("uint64_t") long idx);

  public static native @Cast("uint64_t") long get_next_idx();
  public static native void release_idx(@Cast("uint64_t") long idx);
  public static native @SharedPtr ForwardADLevel get_by_idx(@Cast("uint64_t") long idx);
  public static native @SharedPtr ForwardADLevel try_get_by_idx(@Cast("uint64_t") long idx);

  public native void erase(@SharedPtr ForwardGrad grad);

    public native void insert(@SharedPtr ForwardGrad grad);

}
