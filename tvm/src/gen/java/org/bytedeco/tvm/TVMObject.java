// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;
  // namespace TypeIndex

/**
 * \brief base class of all object containers.
 *
 * Sub-class of objects should declare the following static constexpr fields:
 *
 * - _type_index:
 *      Static type index of the object, if assigned to TypeIndex::kDynamic
 *      the type index will be assigned during runtime.
 *      Runtime type index can be accessed by ObjectType::TypeIndex();
 * - _type_key:
 *       The unique string identifier of the type.
 * - _type_final:
 *       Whether the type is terminal type(there is no subclass of the type in the object system).
 *       This field is automatically set by macro TVM_DECLARE_FINAL_OBJECT_INFO
 *       It is still OK to sub-class a terminal object type T and construct it using make_object.
 *       But IsInstance check will only show that the object type is T(instead of the sub-class).
 *
 * The following two fields are necessary for base classes that can be sub-classed.
 *
 * - _type_child_slots:
 *       Number of reserved type index slots for child classes.
 *       Used for runtime optimization for type checking in IsInstance.
 *       If an object's type_index is within range of [type_index, type_index + _type_child_slots]
 *       Then the object can be quickly decided as sub-class of the current object class.
 *       If not, a fallback mechanism is used to check the global type table.
 *       Recommendation: set to estimate number of children needed.
 * - _type_child_slots_can_overflow:
 *       Whether we can add additional child classes even if the number of child classes
 *       exceeds the _type_child_slots. A fallback mechanism to check global type table will be
 * used. Recommendation: set to false for optimal runtime speed if we know exact number of children.
 *
 * Two macros are used to declare helper functions in the object:
 * - Use TVM_DECLARE_BASE_OBJECT_INFO for object classes that can be sub-classed.
 * - Use TVM_DECLARE_FINAL_OBJECT_INFO for object classes that cannot be sub-classed.
 *
 * New objects can be created using make_object function.
 * Which will automatically populate the type_index and deleter of the object.
 *
 * @see make_object
 * @see ObjectPtr
 * @see ObjectRef
 *
 * <pre>{@code
 *
 *  // Create a base object
 *  class BaseObj : public Object {
 *   public:
 *    // object fields
 *    int field0;
 *
 *    // object properties
 *    static constexpr const uint32_t _type_index = TypeIndex::kDynamic;
 *    static constexpr const char* _type_key = "test.BaseObj";
 *    TVM_DECLARE_BASE_OBJECT_INFO(BaseObj, Object);
 *  };
 *
 *  class LeafObj : public BaseObj {
 *   public:
 *    // fields
 *    int child_field0;
 *    // object properties
 *    static constexpr const uint32_t _type_index = TypeIndex::kDynamic;
 *    static constexpr const char* _type_key = "test.LeafObj";
 *    TVM_DECLARE_BASE_OBJECT_INFO(LeafObj, Object);
 *  };
 *
 *  // The following code should be put into a cc file.
 *  TVM_REGISTER_OBJECT_TYPE(BaseObj);
 *  TVM_REGISTER_OBJECT_TYPE(LeafObj);
 *
 *  // Usage example.
 *  void TestObjects() {
 *    // create an object
 *    ObjectRef leaf_ref(make_object<LeafObj>());
 *    // cast to a specific instance
 *    const LeafObj* leaf_ptr = leaf_ref.as<LeafObj>();
 *    ICHECK(leaf_ptr != nullptr);
 *    // can also cast to the base class.
 *    ICHECK(leaf_ref.as<BaseObj>() != nullptr);
 *  }
 *
 * }</pre>
 */
@Name("tvm::runtime::Object") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TVMObject position(long position) {
        return (TVMObject)super.position(position);
    }
    @Override public TVMObject getPointer(long i) {
        return new TVMObject((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Object deleter
   * @param self pointer to the Object.
   */
  public static class FDeleter extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    FDeleter(Pointer p) { super(p); }
      protected FDeleter() { allocate(); }
      private native void allocate();
      public native void call(TVMObject self);
  }
  /** @return The internal runtime type index of the object. */
  public native @Cast("uint32_t") int type_index();
  /**
   * @return the type key of the object.
   * \note this operation is expensive, can be used for error reporting.
   */
  public native @StdString BytePointer GetTypeKey();
  /**
   * @return A hash value of the return of GetTypeKey.
   */
  public native @Cast("size_t") long GetTypeKeyHash();
  /**
   * Check if the object is an instance of TargetType.
   * \tparam TargetType The target type to be checked.
   * @return Whether the target type is true.
   */
  /**
   * @return Whether the cell has only one reference
   * \note We use stl style naming to be consistent with known API in shared_ptr.
   */
  public native @Cast("bool") boolean unique();
  /**
   * \brief Get the type key of the corresponding index from runtime.
   * @param tindex The type index.
   * @return the result.
   */
  public static native @StdString BytePointer TypeIndex2Key(@Cast("uint32_t") int tindex);
  /**
   * \brief Get the type key hash of the corresponding index from runtime.
   * @param tindex The type index.
   * @return the related key-hash.
   */
  public static native @Cast("size_t") long TypeIndex2KeyHash(@Cast("uint32_t") int tindex);
  /**
   * \brief Get the type index of the corresponding key from runtime.
   * @param key The type key.
   * @return the result.
   */
  public static native @Cast("uint32_t") int TypeKey2Index(@StdString BytePointer key);
  public static native @Cast("uint32_t") int TypeKey2Index(@StdString String key);

// #if TVM_OBJECT_ATOMIC_REF_COUNTER
// #else
// #endif

  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();

  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();

  // Default object type properties for sub-classes
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native @Cast("const uint32_t") int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  @MemberGetter public static native @Cast("const bool") boolean _type_child_slots_can_overflow();
  public static final boolean _type_child_slots_can_overflow = _type_child_slots_can_overflow();
  // member information
  @MemberGetter public static native @Cast("const bool") boolean _type_has_method_visit_attrs();
  public static final boolean _type_has_method_visit_attrs = _type_has_method_visit_attrs();
  @MemberGetter public static native @Cast("const bool") boolean _type_has_method_sequal_reduce();
  public static final boolean _type_has_method_sequal_reduce = _type_has_method_sequal_reduce();
  @MemberGetter public static native @Cast("const bool") boolean _type_has_method_shash_reduce();
  public static final boolean _type_has_method_shash_reduce = _type_has_method_shash_reduce();
  // NOTE: the following field is not type index of Object
  // but was intended to be used by sub-classes as default value.
  // The type index of Object is TypeIndex::kRoot
  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();

  // Default constructor and copy constructor
  public TVMObject() { super((Pointer)null); allocate(); }
  private native void allocate();
  // Override the copy and assign constructors to do nothing.
  // This is to make sure only contents, but not deleter and ref_counter
  // are copied when a child class copies itself.
  // This will enable us to use make_object<ObjectClass>(*obj_ptr)
  // to copy an existing object.
  public TVMObject(@Const @ByRef TVMObject other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef TVMObject other);
  public native @ByRef @Name("operator =") TVMObject put(@Const @ByRef TVMObject other);
}
