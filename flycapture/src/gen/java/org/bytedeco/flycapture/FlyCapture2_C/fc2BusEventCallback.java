// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;

    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2BusEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    fc2BusEventCallback(Pointer p) { super(p); }
        protected fc2BusEventCallback() { allocate(); }
        private native void allocate();
        public native void call( Pointer pParameter, @Cast("unsigned int") int serialNumber );
    }
