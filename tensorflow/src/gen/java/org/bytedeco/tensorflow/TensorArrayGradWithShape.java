// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a TensorArray for storing multiple gradients of values in the given handle.
 * 
 *  Similar to TensorArrayGradV3. However it creates an accumulator with an
 *  expanded shape compared to the input TensorArray whose gradient is being
 *  computed. This enables multiple gradients for the same TensorArray to be
 *  calculated using the same accumulator.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to the forward TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 *  * shape_to_prepend: An int32 vector representing a shape. Elements in the gradient accumulator will
 *  have shape which is this shape_to_prepend value concatenated with shape of the
 *  elements in the TensorArray corresponding to the input handle.
 *  * source: The gradient source string, used to decide which gradient TensorArray
 *  to return.
 * 
 *  Returns:
 *  * {@code Output} grad_handle
 *  * {@code Output} flow_out */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayGradWithShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayGradWithShape(Pointer p) { super(p); }

  public TensorArrayGradWithShape(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input flow_in,
                           @ByVal Input shape_to_prepend, @StringPiece BytePointer source) { super((Pointer)null); allocate(scope, handle, flow_in, shape_to_prepend, source); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input flow_in,
                           @ByVal Input shape_to_prepend, @StringPiece BytePointer source);
  public TensorArrayGradWithShape(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input flow_in,
                           @ByVal Input shape_to_prepend, @StringPiece String source) { super((Pointer)null); allocate(scope, handle, flow_in, shape_to_prepend, source); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input flow_in,
                           @ByVal Input shape_to_prepend, @StringPiece String source);

  public native @ByRef Operation operation(); public native TensorArrayGradWithShape operation(Operation setter);
  public native @ByRef Output grad_handle(); public native TensorArrayGradWithShape grad_handle(Output setter);
  public native @ByRef Output flow_out(); public native TensorArrayGradWithShape flow_out(Output setter);
}
