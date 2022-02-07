// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;



/*-------------------------------------------------------------------------*
 *                        PixComp: compressed pix                          *
 *-------------------------------------------------------------------------*/
/** Compressed Pix */
@Name("PixComp") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXC position(long position) {
        return (PIXC)super.position(position);
    }
    @Override public PIXC getPointer(long i) {
        return new PIXC((Pointer)this).offsetAddress(i);
    }

    /** width in pixels                   */
    public native @Cast("l_int32") int w(); public native PIXC w(int setter);
    /** height in pixels                  */
    public native @Cast("l_int32") int h(); public native PIXC h(int setter);
    /** depth in bits                     */
    public native @Cast("l_int32") int d(); public native PIXC d(int setter);
    /** image res (ppi) in x direction    */
    /**   (use 0 if unknown)              */
    public native @Cast("l_int32") int xres(); public native PIXC xres(int setter);
    /** image res (ppi) in y direction    */
    /**   (use 0 if unknown)              */
    public native @Cast("l_int32") int yres(); public native PIXC yres(int setter);
    /** compressed format (IFF_TIFF_G4,   */
    /**   IFF_PNG, IFF_JFIF_JPEG)         */
    public native @Cast("l_int32") int comptype(); public native PIXC comptype(int setter);
    /** text string associated with pix   */
    public native @Cast("char*") BytePointer text(); public native PIXC text(BytePointer setter);
    /** flag (1 for cmap, 0 otherwise)    */
    public native @Cast("l_int32") int cmapflag(); public native PIXC cmapflag(int setter);
    /** the compressed image data         */
    public native @Cast("l_uint8*") BytePointer data(); public native PIXC data(BytePointer setter);
    /** size of the data array            */
    public native @Cast("size_t") long size(); public native PIXC size(long setter);
}
