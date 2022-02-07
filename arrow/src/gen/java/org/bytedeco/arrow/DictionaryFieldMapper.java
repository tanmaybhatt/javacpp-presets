// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace internal

/** \brief Map fields in a schema to dictionary ids
 * 
 *  The mapping is structural, i.e. the field path (as a vector of indices)
 *  is associated to the dictionary id.  A dictionary id may be associated
 *  to multiple fields. */
@Namespace("arrow::ipc") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DictionaryFieldMapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryFieldMapper(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DictionaryFieldMapper(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DictionaryFieldMapper position(long position) {
        return (DictionaryFieldMapper)super.position(position);
    }
    @Override public DictionaryFieldMapper getPointer(long i) {
        return new DictionaryFieldMapper((Pointer)this).offsetAddress(i);
    }

  public DictionaryFieldMapper() { super((Pointer)null); allocate(); }
  private native void allocate();
  public DictionaryFieldMapper(@Const @ByRef Schema schema) { super((Pointer)null); allocate(schema); }
  private native void allocate(@Const @ByRef Schema schema);

  public native @ByVal Status AddSchemaFields(@Const @ByRef Schema schema);
  public native @ByVal Status AddField(@Cast("int64_t") long id, @StdVector IntPointer field_path);
  public native @ByVal Status AddField(@Cast("int64_t") long id, @StdVector IntBuffer field_path);
  public native @ByVal Status AddField(@Cast("int64_t") long id, @StdVector int[] field_path);

  public native @ByVal LongResult GetFieldId(@StdVector IntPointer field_path);
  public native @ByVal LongResult GetFieldId(@StdVector IntBuffer field_path);
  public native @ByVal LongResult GetFieldId(@StdVector int[] field_path);

  public native int num_fields();

  /** \brief Returns number of unique dictionaries, taking into
   *  account that different fields can share the same dictionary. */
  public native int num_dicts();
}
