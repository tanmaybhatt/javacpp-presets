// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** A camera strobe. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2StrobeControl extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2StrobeControl() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2StrobeControl(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2StrobeControl(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2StrobeControl position(long position) {
            return (fc2StrobeControl)super.position(position);
        }
        @Override public fc2StrobeControl getPointer(long i) {
            return new fc2StrobeControl((Pointer)this).offsetAddress(i);
        }
    
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native fc2StrobeControl source(int setter);
        /** Flag controlling on/off. */
        public native @Cast("BOOL") int onOff(); public native fc2StrobeControl onOff(int setter);
        /** Signal polarity. */
        public native @Cast("unsigned int") int polarity(); public native fc2StrobeControl polarity(int setter);
        /** Signal delay (in ms). */
        public native float delay(); public native fc2StrobeControl delay(float setter);
        /** Signal duration (in ms). */
        public native float duration(); public native fc2StrobeControl duration(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2StrobeControl reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
