// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Apply enu(opaque, &elem) to all the elements in the tree in a given range.
 *
 * @param cmp a comparison function that returns < 0 for an element below the
 *            range, > 0 for an element above the range and == 0 for an
 *            element inside the range
 *
 * \note The cmp function should use the same ordering used to construct the
 *       tree.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Cmp_Pointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cmp_Pointer_Pointer(Pointer p) { super(p); }
    protected Cmp_Pointer_Pointer() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, Pointer elem);
}
