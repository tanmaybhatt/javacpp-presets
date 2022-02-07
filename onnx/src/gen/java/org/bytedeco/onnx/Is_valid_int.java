// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Is_valid_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Is_valid_int(Pointer p) { super(p); }
    protected Is_valid_int() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(int arg0);
}
