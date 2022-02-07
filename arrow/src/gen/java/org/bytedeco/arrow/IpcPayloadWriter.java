// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// These internal APIs may change without warning or deprecation

@Namespace("arrow::ipc::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IpcPayloadWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IpcPayloadWriter(Pointer p) { super(p); }


  // Default implementation is a no-op
  public native @ByVal Status Start();

  public native @ByVal Status WritePayload(@Const @ByRef IpcPayload payload);

  public native @ByVal Status Close();
}
