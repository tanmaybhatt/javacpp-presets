// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \addtogroup compute-concrete-options
 *  \{ */

@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FilterOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FilterOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FilterOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FilterOptions position(long position) {
        return (FilterOptions)super.position(position);
    }
    @Override public FilterOptions getPointer(long i) {
        return new FilterOptions((Pointer)this).offsetAddress(i);
    }

  /** Configure the action taken when a slot of the selection mask is null */
  public enum NullSelectionBehavior {
    /** The corresponding filtered value will be removed in the output. */
    DROP(0),
    /** The corresponding filtered value will be null in the output. */
    EMIT_NULL(1);

      public final int value;
      private NullSelectionBehavior(int v) { this.value = v; }
      private NullSelectionBehavior(NullSelectionBehavior e) { this.value = e.value; }
      public NullSelectionBehavior intern() { for (NullSelectionBehavior e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  public FilterOptions(NullSelectionBehavior null_selection/*=arrow::compute::FilterOptions::DROP*/) { super((Pointer)null); allocate(null_selection); }
  private native void allocate(NullSelectionBehavior null_selection/*=arrow::compute::FilterOptions::DROP*/);
  public FilterOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public FilterOptions(@Cast("arrow::compute::FilterOptions::NullSelectionBehavior") int null_selection/*=arrow::compute::FilterOptions::DROP*/) { super((Pointer)null); allocate(null_selection); }
  private native void allocate(@Cast("arrow::compute::FilterOptions::NullSelectionBehavior") int null_selection/*=arrow::compute::FilterOptions::DROP*/);
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal FilterOptions Defaults();

  public native NullSelectionBehavior null_selection_behavior(); public native FilterOptions null_selection_behavior(NullSelectionBehavior setter);
}
