// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs a {@code Summary} protocol buffer with a tensor and per-plugin data.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tag: A string attached to this summary. Used for organization in TensorBoard.
 *  * tensor: A tensor to serialize.
 *  * serialized_summary_metadata: A serialized SummaryMetadata proto. Contains plugin
 *  data.
 * 
 *  Returns:
 *  * {@code Output}: The summary tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSummaryV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSummaryV2(Pointer p) { super(p); }

  public TensorSummaryV2(@Const @ByRef Scope scope, @ByVal Input tag,
                  @ByVal Input tensor, @ByVal Input serialized_summary_metadata) { super((Pointer)null); allocate(scope, tag, tensor, serialized_summary_metadata); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tag,
                  @ByVal Input tensor, @ByVal Input serialized_summary_metadata);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorSummaryV2 operation(Operation setter);
  public native @ByRef Output summary(); public native TensorSummaryV2 summary(Output setter);
}
