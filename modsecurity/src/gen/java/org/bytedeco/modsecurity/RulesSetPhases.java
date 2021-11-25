// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity") @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class RulesSetPhases extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RulesSetPhases() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RulesSetPhases(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RulesSetPhases(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RulesSetPhases position(long position) {
        return (RulesSetPhases)super.position(position);
    }
    @Override public RulesSetPhases getPointer(long i) {
        return new RulesSetPhases((Pointer)this).offsetAddress(i);
    }

    public native void dump();

}
