// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Takes a list of files with ApiDefs text protos, and allows you to
// look up the specific ApiDef for any given op.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApiDefMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApiDefMap(Pointer p) { super(p); }

  // OpList must be a superset of ops of any subsequently loaded
  // ApiDef.
  public ApiDefMap(@Const @ByRef OpList op_list) { super((Pointer)null); allocate(op_list); }
  private native void allocate(@Const @ByRef OpList op_list);

  // You can call this method multiple times to load multiple
  // sets of files. Api definitions are merged if the same
  // op definition is loaded multiple times. Later-loaded
  // definitions take precedence.
  // ApiDefs loaded from files must contain a subset of ops defined
  // in the OpList passed to the constructor.
  public native @ByVal Status LoadFileList(Env env, @Const @ByRef StringVector filenames);

  // Load a single file. Api definitions are merged if the same
  // op definition is loaded multiple times. Later-loaded
  // definitions take precedence.
  // ApiDefs loaded from file must contain a subset of ops defined
  // in the OpList passed to the constructor.
  public native @ByVal Status LoadFile(Env env, @StdString BytePointer filename);
  public native @ByVal Status LoadFile(Env env, @StdString String filename);

  // Load ApiDefs from string containing ApiDefs text proto.
  // api_def_file_contents is expected to be in "multiline format".
  // ApiDefs must contain a subset of ops defined in OpsList
  // passed to the constructor.
  public native @ByVal Status LoadApiDef(@StdString BytePointer api_def_file_contents);
  public native @ByVal Status LoadApiDef(@StdString String api_def_file_contents);

  // Updates ApiDef docs. For example, if ApiDef renames an argument
  // or attribute, applies these renames to descriptions as well.
  // UpdateDocs should only be called once after all ApiDefs are loaded
  // since it replaces original op names.
  public native void UpdateDocs();

  // Look up ApiDef proto based on the given graph op name.
  // If graph op name is not in this ApiDefMap, returns nullptr.
  //
  // Note: Returned ApiDef pointer should stay valid even after calling
  // Load* functions defined above. Subsequent calls to Load* might modify
  // returned ApiDef contents, but should never remove the ApiDef itself.
  public native @Const ApiDef GetApiDef(@StdString BytePointer name);
  public native @Const ApiDef GetApiDef(@StdString String name);
}
