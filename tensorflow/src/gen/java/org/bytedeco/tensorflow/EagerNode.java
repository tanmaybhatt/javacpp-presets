// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A unit of execution for the EagerExecutor class below. Example subclasses
// encapsulate execution of a TFE_Op, or copying a TFE_TensorHandle from one
// device to another.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerNode(Pointer p) { super(p); }

  // Nodes should not do any work in their destructor. This is because if the
  // node is being destructed by the EagerExecutor, then the node queue lock may
  // be held. Instead opt for calling clean-up code as part of Run() or Abort(),
  // since one of those are guaranteed to be run.

  // Runs the computation corresponding to this node and blocks till the
  // execution is done.
  public native @ByVal Status Run();

  // Called when this node will not be run due to some error contained in
  // `status`. `status` must not be OK.
  // For example, if the node would have computed some tensors in the Run(),
  // it should poison the corresponding tensor handles in this method.
  public native void Abort(@ByVal Status status);
}
