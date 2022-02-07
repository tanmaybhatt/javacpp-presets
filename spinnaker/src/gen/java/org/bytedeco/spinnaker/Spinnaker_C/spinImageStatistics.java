// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Handle for image statistics functionality. Created by calling
 * spinImageStatisticsCreate(), which requires a call to
 * spinImageStatisticsDestroy() to destroy.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinImageStatistics extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinImageStatistics() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinImageStatistics(Pointer p) { super(p); }
}
