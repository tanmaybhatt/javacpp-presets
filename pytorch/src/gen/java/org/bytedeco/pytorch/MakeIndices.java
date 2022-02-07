// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// Partial specialization that forms our base case. When N is zero, we stop
// and define a typedef that will be visible to earlier classes due to
// inheritance. The typedef we define is an index list containing the numbers
// 0 through N-1.
@Name("torch::MakeIndices<0>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MakeIndices extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MakeIndices() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MakeIndices(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MakeIndices(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MakeIndices position(long position) {
        return (MakeIndices)super.position(position);
    }
    @Override public MakeIndices getPointer(long i) {
        return new MakeIndices((Pointer)this).offsetAddress(i);
    }

}
