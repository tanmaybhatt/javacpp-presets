// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;


// usb backend specific section
/** Holds libusb-1.0 context */
@Opaque @Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_usb_context extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public freenect_usb_context() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_usb_context(Pointer p) { super(p); }
}
