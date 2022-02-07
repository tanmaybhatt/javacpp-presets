// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@NoOffset @Name("std::pair<TfLiteNode,TfLiteRegistration>") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class RegistrationNodePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegistrationNodePair(Pointer p) { super(p); }
    public RegistrationNodePair(TfLiteNode firstValue, TfLiteRegistration secondValue) { this(); put(firstValue, secondValue); }
    public RegistrationNodePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef RegistrationNodePair put(@ByRef RegistrationNodePair x);


    @MemberGetter public native @ByRef TfLiteNode first(); public native RegistrationNodePair first(TfLiteNode first);
    @MemberGetter public native @ByRef TfLiteRegistration second();  public native RegistrationNodePair second(TfLiteRegistration second);

    public RegistrationNodePair put(TfLiteNode firstValue, TfLiteRegistration secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

