// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::AllocatorAttributes,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AllocatorAttributesVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorAttributesVector(Pointer p) { super(p); }
    public AllocatorAttributesVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef AllocatorAttributesVector put(@ByRef AllocatorAttributesVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef AllocatorAttributes get(@Cast("size_t") long i);
    public native AllocatorAttributesVector put(@Cast("size_t") long i, AllocatorAttributes value);
}

