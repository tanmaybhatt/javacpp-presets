// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SummaryMetadata_PluginData extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SummaryMetadata_PluginData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SummaryMetadata_PluginData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SummaryMetadata_PluginData position(long position) {
        return (SummaryMetadata_PluginData)super.position(position);
    }
    @Override public SummaryMetadata_PluginData getPointer(long i) {
        return new SummaryMetadata_PluginData((Pointer)this).offsetAddress(i);
    }

  public SummaryMetadata_PluginData() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SummaryMetadata_PluginData(@Const @ByRef SummaryMetadata_PluginData from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SummaryMetadata_PluginData from);

  public native @ByRef @Name("operator =") SummaryMetadata_PluginData put(@Const @ByRef SummaryMetadata_PluginData from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SummaryMetadata_PluginData default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SummaryMetadata_PluginData internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SummaryMetadata_PluginData other);
  public native void Swap(SummaryMetadata_PluginData other);
  

  // implements Message ----------------------------------------------

  public native SummaryMetadata_PluginData New();

  public native SummaryMetadata_PluginData New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SummaryMetadata_PluginData from);
  public native void MergeFrom(@Const @ByRef SummaryMetadata_PluginData from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string plugin_name = 1;
  public native void clear_plugin_name();
  @MemberGetter public static native int kPluginNameFieldNumber();
  public static final int kPluginNameFieldNumber = kPluginNameFieldNumber();
  public native @StdString BytePointer plugin_name();
  public native void set_plugin_name(@StdString BytePointer value);
  public native void set_plugin_name(@StdString String value);
  public native void set_plugin_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_plugin_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_plugin_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_plugin_name();
  public native void set_allocated_plugin_name(@StdString @Cast({"char*", "std::string*"}) BytePointer plugin_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_plugin_name();
  public native void unsafe_arena_set_allocated_plugin_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer plugin_name);

  // bytes content = 2;
  public native void clear_content();
  @MemberGetter public static native int kContentFieldNumber();
  public static final int kContentFieldNumber = kContentFieldNumber();
  public native @StdString BytePointer content();
  public native void set_content(@StdString BytePointer value);
  public native void set_content(@StdString String value);
  public native void set_content(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_content();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_content();
  public native void set_allocated_content(@StdString @Cast({"char*", "std::string*"}) BytePointer content);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_content();
  public native void unsafe_arena_set_allocated_content(
        @StdString @Cast({"char*", "std::string*"}) BytePointer content);
}
