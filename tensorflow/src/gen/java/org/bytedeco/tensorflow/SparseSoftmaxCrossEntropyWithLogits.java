// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes softmax cross entropy cost and gradients to backpropagate.
 * 
 *  Unlike {@code SoftmaxCrossEntropyWithLogits}, this operation does not accept
 *  a matrix of label probabilities, but rather a single label per row
 *  of features.  This label is considered to have probability 1.0 for the
 *  given row.
 * 
 *  Inputs are the logits, not probabilities.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * features: batch_size x num_classes matrix
 *  * labels: batch_size vector with values in [0, num_classes).
 *  This is the label for the given minibatch entry.
 * 
 *  Returns:
 *  * {@code Output} loss: Per example loss (batch_size vector).
 *  * {@code Output} backprop: backpropagated gradients (batch_size x num_classes matrix). */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSoftmaxCrossEntropyWithLogits extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSoftmaxCrossEntropyWithLogits(Pointer p) { super(p); }

  public SparseSoftmaxCrossEntropyWithLogits(@Const @ByRef Scope scope,
                                      @ByVal Input features,
                                      @ByVal Input labels) { super((Pointer)null); allocate(scope, features, labels); }
  private native void allocate(@Const @ByRef Scope scope,
                                      @ByVal Input features,
                                      @ByVal Input labels);

  public native @ByRef Operation operation(); public native SparseSoftmaxCrossEntropyWithLogits operation(Operation setter);
  public native @ByRef Output loss(); public native SparseSoftmaxCrossEntropyWithLogits loss(Output setter);
  public native @ByRef Output backprop(); public native SparseSoftmaxCrossEntropyWithLogits backprop(Output setter);
}
