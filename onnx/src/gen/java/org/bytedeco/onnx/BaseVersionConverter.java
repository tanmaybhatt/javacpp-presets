// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// TODO: Consider creating interface for this class.
@Namespace("onnx::version_conversion") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class BaseVersionConverter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseVersionConverter(Pointer p) { super(p); }


  // adapter_lookup should be called in convert_version when the user would
  // like to identify the proper registered adapter in the adapters map for
  // a given Node from a certain version to another. It should only be called
  // when the user knows that an adapter should exist for the given context.
  public native @Const @ByRef Adapter adapter_lookup(@Const Node op, @Const @ByRef OpSetID initial_version, @Const @ByRef OpSetID target_version);

  public native @ByVal ModelProto convert_version(@Const @ByRef ModelProto mp_in, @Const @ByRef OpSetID initial_version, @Const @ByRef OpSetID target_version);

  

  
}
