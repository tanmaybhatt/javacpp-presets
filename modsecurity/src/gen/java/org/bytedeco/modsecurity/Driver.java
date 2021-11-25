// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;

@Namespace("modsecurity::Parser") @Opaque @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class Driver extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Driver() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Driver(Pointer p) { super(p); }
}
