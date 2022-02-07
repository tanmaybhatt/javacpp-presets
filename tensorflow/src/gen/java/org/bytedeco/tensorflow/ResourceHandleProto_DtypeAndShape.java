// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceHandleProto_DtypeAndShape extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceHandleProto_DtypeAndShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ResourceHandleProto_DtypeAndShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ResourceHandleProto_DtypeAndShape position(long position) {
        return (ResourceHandleProto_DtypeAndShape)super.position(position);
    }
    @Override public ResourceHandleProto_DtypeAndShape getPointer(long i) {
        return new ResourceHandleProto_DtypeAndShape((Pointer)this).offsetAddress(i);
    }

  public ResourceHandleProto_DtypeAndShape() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ResourceHandleProto_DtypeAndShape(@Const @ByRef ResourceHandleProto_DtypeAndShape from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ResourceHandleProto_DtypeAndShape from);

  public native @ByRef @Name("operator =") ResourceHandleProto_DtypeAndShape put(@Const @ByRef ResourceHandleProto_DtypeAndShape from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef ResourceHandleProto_DtypeAndShape default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ResourceHandleProto_DtypeAndShape internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ResourceHandleProto_DtypeAndShape other);
  public native void Swap(ResourceHandleProto_DtypeAndShape other);
  

  // implements Message ----------------------------------------------

  public native ResourceHandleProto_DtypeAndShape New();

  public native ResourceHandleProto_DtypeAndShape New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ResourceHandleProto_DtypeAndShape from);
  public native void MergeFrom(@Const @ByRef ResourceHandleProto_DtypeAndShape from);
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

  // .tensorflow.TensorShapeProto shape = 2;
  public native @Cast("bool") boolean has_shape();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto shape();
  public native TensorShapeProto release_shape();
  public native TensorShapeProto mutable_shape();
  public native void set_allocated_shape(TensorShapeProto shape);
  public native void unsafe_arena_set_allocated_shape(
        TensorShapeProto shape);
  public native TensorShapeProto unsafe_arena_release_shape();

  // .tensorflow.DataType dtype = 1;
  public native void clear_dtype();
  @MemberGetter public static native int kDtypeFieldNumber();
  public static final int kDtypeFieldNumber = kDtypeFieldNumber();
  public native @Cast("tensorflow::DataType") int dtype();
  public native void set_dtype(@Cast("tensorflow::DataType") int value);
}
