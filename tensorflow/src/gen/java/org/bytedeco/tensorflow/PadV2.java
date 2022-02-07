// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Pads a tensor.
 * 
 *  This operation pads {@code input} according to the {@code paddings} and {@code constant_values}
 *  you specify. {@code paddings} is an integer tensor with shape {@code [Dn, 2]}, where n is
 *  the rank of {@code input}. For each dimension D of {@code input}, {@code paddings[D, 0]} indicates
 *  how many padding values to add before the contents of {@code input} in that dimension,
 *  and {@code paddings[D, 1]} indicates how many padding values to add after the contents
 *  of {@code input} in that dimension. {@code constant_values} is a scalar tensor of the same
 *  type as {@code input} that indicates the value to use for padding {@code input}.
 * 
 *  The padded size of each dimension D of the output is:
 * 
 *  {@code paddings(D, 0) + input.dim_size(D) + paddings(D, 1)}
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 't' is [[1, 1], [2, 2]]
 *  # 'paddings' is [[1, 1], [2, 2]]
 *  # 'constant_values' is 0
 *  # rank of 't' is 2
 *  pad(t, paddings) ==> [[0, 0, 0, 0, 0, 0]
 *                        [0, 0, 1, 1, 0, 0]
 *                        [0, 0, 2, 2, 0, 0]
 *                        [0, 0, 0, 0, 0, 0]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PadV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PadV2(Pointer p) { super(p); }

  public PadV2(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal Input paddings, @ByVal Input constant_values) { super((Pointer)null); allocate(scope, input, paddings, constant_values); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal Input paddings, @ByVal Input constant_values);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native PadV2 operation(Operation setter);
  public native @ByRef Output output(); public native PadV2 output(Output setter);
}
