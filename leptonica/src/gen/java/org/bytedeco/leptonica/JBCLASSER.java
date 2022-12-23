// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/**
 * \file jbclass.h
 *
 *       JbClasser
 *       JbData
 */


    /**
     * <pre>
     * The JbClasser struct holds all the data accumulated during the
     * classification process that can be used for a compressed
     * jbig2-type representation of a set of images.  This is created
     * in an initialization process and added to as the selected components
     * on each successive page are analyzed.
     * </pre>
     */
@Name("JbClasser") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class JBCLASSER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JBCLASSER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JBCLASSER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JBCLASSER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JBCLASSER position(long position) {
        return (JBCLASSER)super.position(position);
    }
    @Override public JBCLASSER getPointer(long i) {
        return new JBCLASSER((Pointer)this).offsetAddress(i);
    }

    /** input page image file names          */
    public native SARRAY safiles(); public native JBCLASSER safiles(SARRAY setter);
    /** JB_RANKHAUS, JB_CORRELATION          */
    public native @Cast("l_int32") int method(); public native JBCLASSER method(int setter);
    /** JB_CONN_COMPS, JB_CHARACTERS or      */
    /** JB_WORDS                             */
    public native @Cast("l_int32") int components(); public native JBCLASSER components(int setter);
    /** max component width allowed          */
    public native @Cast("l_int32") int maxwidth(); public native JBCLASSER maxwidth(int setter);
    /** max component height allowed         */
    public native @Cast("l_int32") int maxheight(); public native JBCLASSER maxheight(int setter);
    /** number of pages already processed    */
    public native @Cast("l_int32") int npages(); public native JBCLASSER npages(int setter);
    /** number components already processed  */
    /** on fully processed pages             */
    public native @Cast("l_int32") int baseindex(); public native JBCLASSER baseindex(int setter);
    /** number of components on each page    */
    public native NUMA nacomps(); public native JBCLASSER nacomps(NUMA setter);
    /** size of square struct elem for haus  */
    public native @Cast("l_int32") int sizehaus(); public native JBCLASSER sizehaus(int setter);
    /** rank val of haus match, each way     */
    public native @Cast("l_float32") float rankhaus(); public native JBCLASSER rankhaus(float setter);
    /** thresh value for correlation score   */
    public native @Cast("l_float32") float thresh(); public native JBCLASSER thresh(float setter);
    /** corrects thresh value for heaver     */
    /** components; use 0 for no correction  */
    public native @Cast("l_float32") float weightfactor(); public native JBCLASSER weightfactor(float setter);
    /** w * h of each template, without      */
    /** extra border pixels                  */
    public native NUMA naarea(); public native JBCLASSER naarea(NUMA setter);
    /** max width of original src images     */
    public native @Cast("l_int32") int w(); public native JBCLASSER w(int setter);
    /** max height of original src images    */
    public native @Cast("l_int32") int h(); public native JBCLASSER h(int setter);
    /** current number of classes            */
    public native @Cast("l_int32") int nclass(); public native JBCLASSER nclass(int setter);
    /** If zero, pixaa isn't filled          */
    public native @Cast("l_int32") int keep_pixaa(); public native JBCLASSER keep_pixaa(int setter);
    /** instances for each class; unbordered */
    public native PIXAA pixaa(); public native JBCLASSER pixaa(PIXAA setter);
    /** templates for each class; bordered   */
    /** and not dilated                      */
    public native PIXA pixat(); public native JBCLASSER pixat(PIXA setter);
    /** templates for each class; bordered   */
    /** and dilated                          */
    public native PIXA pixatd(); public native JBCLASSER pixatd(PIXA setter);
    /** Hash table to find templates by size */
    public native L_DNAHASH dahash(); public native JBCLASSER dahash(L_DNAHASH setter);
    /** fg areas of undilated templates;     */
    /** only used for rank < 1.0             */
    public native NUMA nafgt(); public native JBCLASSER nafgt(NUMA setter);
    /** centroids of all bordered cc         */
    public native PTA ptac(); public native JBCLASSER ptac(PTA setter);
    /** centroids of all bordered template cc */
    public native PTA ptact(); public native JBCLASSER ptact(PTA setter);
    /** array of class ids for each component */
    public native NUMA naclass(); public native JBCLASSER naclass(NUMA setter);
    /** array of page nums for each component */
    public native NUMA napage(); public native JBCLASSER napage(NUMA setter);
    /** array of UL corners at which the     */
    /** template is to be placed for each    */
    /** component                            */
    public native PTA ptaul(); public native JBCLASSER ptaul(PTA setter);
    /** similar to ptaul, but for LL corners */
    public native PTA ptall(); public native JBCLASSER ptall(PTA setter);
}
