// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/////////////////////////////// Parallel Primitives //////////////////////////////////

/** \brief Base class for parallel data processors
<p>
\ingroup core_parallel
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ParallelLoopBody extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParallelLoopBody(Pointer p) { super(p); }

    public native @Name("operator ()") void apply(@Const @ByRef Range range);
}
