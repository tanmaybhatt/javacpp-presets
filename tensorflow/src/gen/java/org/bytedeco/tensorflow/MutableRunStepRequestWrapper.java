// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Abstract interface for a mutable RunStepRequest message.
//
// See `RunStepRequestWrapper` above for a description of the fields.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MutableRunStepRequestWrapper extends RunStepRequestWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MutableRunStepRequestWrapper(Pointer p) { super(p); }

  public native void set_session_handle(@StdString BytePointer handle);
  public native void set_session_handle(@StdString String handle);
  public native void set_partial_run_handle(@StdString BytePointer handle);
  public native void set_partial_run_handle(@StdString String handle);
  public native void add_feed(@StdString BytePointer name, @Const @ByRef Tensor value);
  public native void add_feed(@StdString String name, @Const @ByRef Tensor value);
  public native void add_fetch(@StdString BytePointer name);
  public native void add_fetch(@StdString String name);
  public native void add_target(@StdString BytePointer name);
  public native void add_target(@StdString String name);
  public native RunOptions mutable_options();
  public native void set_store_errors_in_response_body(@Cast("bool") boolean store_errors);
}
