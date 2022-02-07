// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.lz4;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.lz4.global.lz4.*;



/*-*********************************************
*  Streaming Compression Functions
***********************************************/
@Name("LZ4_stream_t") @Opaque @Properties(inherit = org.bytedeco.lz4.presets.lz4.class)
public class LZ4Stream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LZ4Stream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LZ4Stream(Pointer p) { super(p); }
}
