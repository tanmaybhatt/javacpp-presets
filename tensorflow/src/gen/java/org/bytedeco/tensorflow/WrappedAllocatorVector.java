// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::OpKernelContext::WrappedAllocator,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WrappedAllocatorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WrappedAllocatorVector(Pointer p) { super(p); }
    public WrappedAllocatorVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef WrappedAllocatorVector put(@ByRef WrappedAllocatorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef WrappedAllocator get(@Cast("size_t") long i);
    public native WrappedAllocatorVector put(@Cast("size_t") long i, WrappedAllocator value);
}

