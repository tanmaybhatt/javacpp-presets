// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/** Data structure to hold a number of Dewarp */
@Name("L_Dewarpa") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_DEWARPA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_DEWARPA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_DEWARPA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_DEWARPA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_DEWARPA position(long position) {
        return (L_DEWARPA)super.position(position);
    }
    @Override public L_DEWARPA getPointer(long i) {
        return new L_DEWARPA((Pointer)this).offsetAddress(i);
    }

    /** size of dewarp ptr array          */
    public native @Cast("l_int32") int nalloc(); public native L_DEWARPA nalloc(int setter);
    /** maximum page number in array      */
    public native @Cast("l_int32") int maxpage(); public native L_DEWARPA maxpage(int setter);
    /** array of ptrs to page dewarp      */
    public native L_DEWARP dewarp(int i); public native L_DEWARPA dewarp(int i, L_DEWARP setter);
    public native @Cast("L_Dewarp**") PointerPointer dewarp(); public native L_DEWARPA dewarp(PointerPointer setter);
    /** array of ptrs to cached dewarps   */
    public native L_DEWARP dewarpcache(int i); public native L_DEWARPA dewarpcache(int i, L_DEWARP setter);
    public native @Cast("L_Dewarp**") PointerPointer dewarpcache(); public native L_DEWARPA dewarpcache(PointerPointer setter);
    /** list of page numbers for pages    */
    /** with page models                  */
    public native NUMA namodels(); public native L_DEWARPA namodels(NUMA setter);
    /** list of page numbers with either  */
    /** page models or ref page models    */
    public native NUMA napages(); public native L_DEWARPA napages(NUMA setter);
    /** reduction factor of input: 1 or 2 */
    public native @Cast("l_int32") int redfactor(); public native L_DEWARPA redfactor(int setter);
    /** disparity arrays sampling factor  */
    public native @Cast("l_int32") int sampling(); public native L_DEWARPA sampling(int setter);
    /** min number of long lines required */
    public native @Cast("l_int32") int minlines(); public native L_DEWARPA minlines(int setter);
    /** max distance for getting ref page */
    public native @Cast("l_int32") int maxdist(); public native L_DEWARPA maxdist(int setter);
    /** maximum abs line curvature,       */
    /** in micro-units                    */
    public native @Cast("l_int32") int max_linecurv(); public native L_DEWARPA max_linecurv(int setter);
    /** minimum abs diff line         */
    /** curvature in micro-units      */
    public native @Cast("l_int32") int min_diff_linecurv(); public native L_DEWARPA min_diff_linecurv(int setter);
    /** maximum abs diff line         */
    /** curvature in micro-units      */
    public native @Cast("l_int32") int max_diff_linecurv(); public native L_DEWARPA max_diff_linecurv(int setter);
    /** maximum abs left or right edge    */
    /** slope, in milli-units             */
    public native @Cast("l_int32") int max_edgeslope(); public native L_DEWARPA max_edgeslope(int setter);
    /** maximum abs left or right edge    */
    /** curvature, in micro-units         */
    public native @Cast("l_int32") int max_edgecurv(); public native L_DEWARPA max_edgecurv(int setter);
    /** maximum abs diff left-right   */
    /** edge curvature, in micro-units    */
    public native @Cast("l_int32") int max_diff_edgecurv(); public native L_DEWARPA max_diff_edgecurv(int setter);
    /** use both disparity arrays if      */
    /** available; only vertical otherwise */
    public native @Cast("l_int32") int useboth(); public native L_DEWARPA useboth(int setter);
    /** if there are multiple columns,    */
    /** only use the vertical disparity   */
    /** array                             */
    public native @Cast("l_int32") int check_columns(); public native L_DEWARPA check_columns(int setter);
    /** invalid models have been removed  */
    /** and refs built against valid set  */
    public native @Cast("l_int32") int modelsready(); public native L_DEWARPA modelsready(int setter);
}
