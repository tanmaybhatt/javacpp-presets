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


/** Base class for all (dimension-specialized) batchnorm modules. */
@Name("torch::nn::BatchNormImplBase<1,torch::nn::BatchNorm1dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNorm1dImplBase extends BatchNorm1dImplBaseBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNorm1dImplBase(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code BatchNorm{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
