// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // namespace profiler

@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProfilerFactory extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ProfilerFactory(Pointer p) { super(p); }
    protected ProfilerFactory() { allocate(); }
    private native void allocate();
    public native @MoveUniquePtr ProfilerInterface call();
}
