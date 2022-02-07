// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class FieldMap
 * 
 *  \brief An array of field params used as a layer parameter for plugin layers.
 * 
 *  The node fields are passed by the parser to the API through the plugin
 *  constructor. The implementation of the plugin should parse the contents of
 *  the fieldMap as part of the plugin constructor
 *  */
@Namespace("nvuffparser") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class FieldMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldMap(Pointer p) { super(p); }

    public native String name(); public native FieldMap name(String setter);
    public native @Const Pointer data(); public native FieldMap data(Pointer setter);
    public native FieldType type(); public native FieldMap type(FieldType setter);
    public native int length(); public native FieldMap length(int setter);

    public FieldMap(String name, @Const Pointer data, FieldType type, int length/*=1*/) { super((Pointer)null); allocate(name, data, type, length); }
    private native void allocate(String name, @Const Pointer data, FieldType type, int length/*=1*/);
    public FieldMap(String name, @Const Pointer data, FieldType type) { super((Pointer)null); allocate(name, data, type); }
    private native void allocate(String name, @Const Pointer data, FieldType type);
    public FieldMap(@Cast("const char*") BytePointer name, @Const Pointer data, @Cast("nvuffparser::FieldType") int type, int length/*=1*/) { super((Pointer)null); allocate(name, data, type, length); }
    private native void allocate(@Cast("const char*") BytePointer name, @Const Pointer data, @Cast("nvuffparser::FieldType") int type, int length/*=1*/);
    public FieldMap(@Cast("const char*") BytePointer name, @Const Pointer data, @Cast("nvuffparser::FieldType") int type) { super((Pointer)null); allocate(name, data, type); }
    private native void allocate(@Cast("const char*") BytePointer name, @Const Pointer data, @Cast("nvuffparser::FieldType") int type);
}
