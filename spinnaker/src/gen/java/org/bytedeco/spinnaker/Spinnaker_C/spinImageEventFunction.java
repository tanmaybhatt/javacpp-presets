// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinImageEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    spinImageEventFunction(Pointer p) { super(p); }
    protected spinImageEventFunction() { allocate(); }
    private native void allocate();
    public native void call(spinImage hImage, Pointer pUserData);
}
