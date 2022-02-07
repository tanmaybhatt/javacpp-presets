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
 // namespace detail

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Half extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Half(Pointer p) { super(p); }

  public native @Cast("unsigned short") short x(); public native Half x(short setter);

  @Opaque public static class from_bits_t extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public from_bits_t() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public from_bits_t(Pointer p) { super(p); }
  }
  public static native @Const @ByVal from_bits_t from_bits();

  // HIP wants __host__ __device__ tag, CUDA does not
// #ifdef __HIP_PLATFORM_HCC__
  public Half() { super((Pointer)null); allocate(); }
  private native void allocate();
// #else
// #endif

  public Half(@Cast("unsigned short") short bits, @ByVal from_bits_t arg1) { super((Pointer)null); allocate(bits, arg1); }
  private native void allocate(@Cast("unsigned short") short bits, @ByVal from_bits_t arg1);
  public Half(float value) { super((Pointer)null); allocate(value); }
  private native void allocate(float value);
  public native @Name("operator float") float asFloat();

// #if defined(__CUDACC__) || defined(__HIPCC__)
// #endif
}
