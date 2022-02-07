// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

// #endif  // TF_LITE_STATIC_MEMORY

// WARNING: This is an experimental interface that is subject to change.
//
// Currently, TfLiteDelegateParams has to be allocated in a way that it's
// trivially destructable. It will be stored as `builtin_data` field in
// `TfLiteNode` of the delegate node.
//
// See also the `CreateDelegateParams` function in `interpreter.cc` details.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteDelegateParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteDelegateParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteDelegateParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteDelegateParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteDelegateParams position(long position) {
        return (TfLiteDelegateParams)super.position(position);
    }
    @Override public TfLiteDelegateParams getPointer(long i) {
        return new TfLiteDelegateParams((Pointer)this).offsetAddress(i);
    }

  public native TfLiteDelegate delegate(); public native TfLiteDelegateParams delegate(TfLiteDelegate setter);
  public native TfLiteIntArray nodes_to_replace(); public native TfLiteDelegateParams nodes_to_replace(TfLiteIntArray setter);
  public native TfLiteIntArray input_tensors(); public native TfLiteDelegateParams input_tensors(TfLiteIntArray setter);
  public native TfLiteIntArray output_tensors(); public native TfLiteDelegateParams output_tensors(TfLiteIntArray setter);
}
