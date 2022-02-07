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



// TensorName and TensorNames are wrappers around Dimname and DimnameList
// that contain helper functions to make writing name inference rules easier.
//
// A TensorName represents a Dimname associated with some DimnameList (from a Tensor).
// This encapsulates all the information that is needed to check if names *match*
// and to *unify* names.
//
// Definition: Two names in two tensors *match* if they are equal, or if at
// least one of them is a wildcard that can be *refined* to the other name.
//
// Definition: unify(name, other) fails if the names do not match. Otherwise,
// it returns the most refined of name and other.
//
// Here is an example of checking if two names match.
// tensor: Tensor[A, None]
// other: Tensor[A]
//
// Let's say we wish to check if tensor.names[-1] matches other.names[-1].
// None (in tensor) cannot match A (in other) because if the None were refined
// to A, `tensor` would have duplicate names [A, A]. Therefore we need to check
// tensor.names [A, None] for the existence of A.
@Namespace("at::namedinference") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorName extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorName(Pointer p) { super(p); }

  public TensorName(@ByVal DimnameArrayRef origin, int origin_idx) { super((Pointer)null); allocate(origin, origin_idx); }
  private native void allocate(@ByVal DimnameArrayRef origin, int origin_idx);

  // op_name is only used for error reporting.
  public native @Cast({"", "at::namedinference::TensorName&&"}) @StdMove TensorName unify(@Cast({"", "at::namedinference::TensorName&&"}) @StdMove TensorName other, @Cast("const char*") BytePointer op_name);
  public native @Cast({"", "at::namedinference::TensorName&&"}) @StdMove TensorName unify(@Cast({"", "at::namedinference::TensorName&&"}) @StdMove TensorName other, String op_name);
  public native @ByVal Dimname toDimname();
}
