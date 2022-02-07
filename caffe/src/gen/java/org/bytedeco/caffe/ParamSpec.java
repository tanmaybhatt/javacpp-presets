// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ParamSpec extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParamSpec(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParamSpec(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParamSpec position(long position) {
        return (ParamSpec)super.position(position);
    }
    @Override public ParamSpec getPointer(long i) {
        return new ParamSpec((Pointer)this).offsetAddress(i);
    }

  public ParamSpec() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ParamSpec(@Const @ByRef ParamSpec from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ParamSpec from);

  public native @ByRef @Name("operator =") ParamSpec put(@Const @ByRef ParamSpec from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ParamSpec default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ParamSpec internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ParamSpec other);
  

  // implements Message ----------------------------------------------

  public native final ParamSpec New();

  public native final ParamSpec New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ParamSpec from);
  public native void MergeFrom(@Const @ByRef ParamSpec from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::ParamSpec::DimCheckMode") int STRICT();
  public static final int STRICT = STRICT();
  @MemberGetter public static native @Cast("const caffe::ParamSpec::DimCheckMode") int PERMISSIVE();
  public static final int PERMISSIVE = PERMISSIVE();
  public static native @Cast("bool") boolean DimCheckMode_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::ParamSpec::DimCheckMode") int DimCheckMode_MIN();
  public static final int DimCheckMode_MIN = DimCheckMode_MIN();
  @MemberGetter public static native @Cast("const caffe::ParamSpec::DimCheckMode") int DimCheckMode_MAX();
  public static final int DimCheckMode_MAX = DimCheckMode_MAX();
  @MemberGetter public static native int DimCheckMode_ARRAYSIZE();
  public static final int DimCheckMode_ARRAYSIZE = DimCheckMode_ARRAYSIZE();
  public static native @Const EnumDescriptor DimCheckMode_descriptor();
  public static native @StdString BytePointer DimCheckMode_Name(@Cast("caffe::ParamSpec::DimCheckMode") int value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString BytePointer name,
        @Cast("caffe::ParamSpec::DimCheckMode*") IntPointer value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString String name,
        @Cast("caffe::ParamSpec::DimCheckMode*") IntBuffer value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString BytePointer name,
        @Cast("caffe::ParamSpec::DimCheckMode*") int[] value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString String name,
        @Cast("caffe::ParamSpec::DimCheckMode*") IntPointer value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString BytePointer name,
        @Cast("caffe::ParamSpec::DimCheckMode*") IntBuffer value);
  public static native @Cast("bool") boolean DimCheckMode_Parse(@StdString String name,
        @Cast("caffe::ParamSpec::DimCheckMode*") int[] value);

  // accessors -------------------------------------------------------

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional .caffe.ParamSpec.DimCheckMode share_mode = 2;
  public native @Cast("bool") boolean has_share_mode();
  public native void clear_share_mode();
  @MemberGetter public static native int kShareModeFieldNumber();
  public static final int kShareModeFieldNumber = kShareModeFieldNumber();
  public native @Cast("caffe::ParamSpec_DimCheckMode") int share_mode();
  public native void set_share_mode(@Cast("caffe::ParamSpec_DimCheckMode") int value);

  // optional float lr_mult = 3 [default = 1];
  public native @Cast("bool") boolean has_lr_mult();
  public native void clear_lr_mult();
  @MemberGetter public static native int kLrMultFieldNumber();
  public static final int kLrMultFieldNumber = kLrMultFieldNumber();
  public native float lr_mult();
  public native void set_lr_mult(float value);

  // optional float decay_mult = 4 [default = 1];
  public native @Cast("bool") boolean has_decay_mult();
  public native void clear_decay_mult();
  @MemberGetter public static native int kDecayMultFieldNumber();
  public static final int kDecayMultFieldNumber = kDecayMultFieldNumber();
  public native float decay_mult();
  public native void set_decay_mult(float value);
}
