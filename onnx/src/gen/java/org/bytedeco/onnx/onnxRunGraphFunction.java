// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxRunGraphFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxRunGraphFunction(Pointer p) { super(p); }
    protected onnxRunGraphFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxGraph graph,
    @Const onnxMemoryFenceV1 inputFence,
    onnxMemoryFenceV1 outputFence);
}
