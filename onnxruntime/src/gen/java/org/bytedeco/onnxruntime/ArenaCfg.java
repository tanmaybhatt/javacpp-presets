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


/** \struct Ort::ArenaCfg
 * \brief it is a structure that represents the configuration of an arena based allocator
 * \details Please see docs/C_API.md for details
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ArenaCfg extends BaseArenaCfg {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArenaCfg(Pointer p) { super(p); }

  /**
   * Wraps OrtApi::CreateArenaCfg
   * @param max_mem - use 0 to allow ORT to choose the default
   * @param arena_extend_strategy -  use -1 to allow ORT to choose the default, 0 = kNextPowerOfTwo, 1 = kSameAsRequested
   * @param initial_chunk_size_bytes - use -1 to allow ORT to choose the default
   * @param max_dead_bytes_per_chunk - use -1 to allow ORT to choose the default
   * See docs/C_API.md for details on what the following parameters mean and how to choose these values
   */
  public ArenaCfg(@Cast("size_t") long max_mem, int arena_extend_strategy, int initial_chunk_size_bytes, int max_dead_bytes_per_chunk) { super((Pointer)null); allocate(max_mem, arena_extend_strategy, initial_chunk_size_bytes, max_dead_bytes_per_chunk); }
  private native void allocate(@Cast("size_t") long max_mem, int arena_extend_strategy, int initial_chunk_size_bytes, int max_dead_bytes_per_chunk);
}
