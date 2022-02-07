// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
             /* longest possible addresses */

/*
 * Structure used by kernel to pass protocol
 * information in raw sockets.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sockproto extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sockproto() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sockproto(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sockproto(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sockproto position(long position) {
        return (sockproto)super.position(position);
    }
    @Override public sockproto getPointer(long i) {
        return new sockproto((Pointer)this).offsetAddress(i);
    }

	public native @Cast("__uint16_t") short sp_family(); public native sockproto sp_family(short setter);              /* address family */
	public native @Cast("__uint16_t") short sp_protocol(); public native sockproto sp_protocol(short setter);            /* protocol */
}
