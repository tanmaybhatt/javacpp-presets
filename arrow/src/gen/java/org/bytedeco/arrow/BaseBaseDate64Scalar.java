// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TemporalScalar<arrow::Date64Type>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseBaseDate64Scalar extends Scalar {
    static { Loader.load(); }

  
  
    public BaseBaseDate64Scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseBaseDate64Scalar(Pointer p) { super(p); }


  public BaseBaseDate64Scalar(@Cast("arrow::TemporalScalar<arrow::Date64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@Cast("arrow::TemporalScalar<arrow::Date64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @Cast("arrow::TemporalScalar<arrow::Date64Type>::ValueType") long value(); public native BaseBaseDate64Scalar value(long setter);
}