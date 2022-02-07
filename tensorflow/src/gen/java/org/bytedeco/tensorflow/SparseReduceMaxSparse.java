// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the max of elements across dimensions of a SparseTensor.
 * 
 *  This Op takes a SparseTensor and is the sparse counterpart to
 *  {@code tf.reduce_max()}.  In contrast to SparseReduceMax, this Op returns a
 *  SparseTensor.
 * 
 *  Reduces {@code sp_input} along the dimensions given in {@code reduction_axes}.  Unless
 *  {@code keep_dims} is true, the rank of the tensor is reduced by 1 for each entry in
 *  {@code reduction_axes}. If {@code keep_dims} is true, the reduced dimensions are retained
 *  with length 1.
 * 
 *  If {@code reduction_axes} has no entries, all dimensions are reduced, and a tensor
 *  with a single element is returned.  Additionally, the axes can be negative,
 *  which are interpreted according to the indexing rules in Python.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_indices: 2-D.  {@code N x R} matrix with the indices of non-empty values in a
 *  SparseTensor, possibly not in canonical ordering.
 *  * input_values: 1-D.  {@code N} non-empty values corresponding to {@code input_indices}.
 *  * input_shape: 1-D.  Shape of the input SparseTensor.
 *  * reduction_axes: 1-D.  Length-{@code K} vector containing the reduction axes.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * keep_dims: If true, retain reduced dimensions with length 1.
 * 
 *  Returns:
 *  * {@code Output} output_indices
 *  * {@code Output} output_values
 *  * {@code Output} output_shape */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseReduceMaxSparse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseReduceMaxSparse(Pointer p) { super(p); }

  /** Optional attribute setters for SparseReduceMaxSparse */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If true, retain reduced dimensions with length 1.
     * 
     *  Defaults to false */
    public native @ByVal Attrs KeepDims(@Cast("bool") boolean x);

    public native @Cast("bool") boolean keep_dims_(); public native Attrs keep_dims_(boolean setter);
  }
  public SparseReduceMaxSparse(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                        @ByVal Input input_shape, @ByVal Input reduction_axes) { super((Pointer)null); allocate(scope, input_indices, input_values, input_shape, reduction_axes); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                        @ByVal Input input_shape, @ByVal Input reduction_axes);
  public SparseReduceMaxSparse(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                        @ByVal Input input_shape, @ByVal Input reduction_axes, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_indices, input_values, input_shape, reduction_axes, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                        @ByVal Input input_shape, @ByVal Input reduction_axes, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs KeepDims(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SparseReduceMaxSparse operation(Operation setter);
  public native @ByRef Output output_indices(); public native SparseReduceMaxSparse output_indices(Output setter);
  public native @ByRef Output output_values(); public native SparseReduceMaxSparse output_values(Output setter);
  public native @ByRef Output output_shape(); public native SparseReduceMaxSparse output_shape(Output setter);
}
