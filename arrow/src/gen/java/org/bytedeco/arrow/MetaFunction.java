// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A function that dispatches to other functions. Must implement
 *  MetaFunction::ExecuteImpl.
 * 
 *  For Array, ChunkedArray, and Scalar Datum kinds, may rely on the execution
 *  of concrete Function types, but must handle other Datum kinds on its own. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MetaFunction extends Function {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MetaFunction(Pointer p) { super(p); }

  public native int num_kernels();

  public native @ByVal DatumResult Execute(@Const @ByRef DatumVector args, @Const FunctionOptions options,
                          ExecContext ctx);
}
