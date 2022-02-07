// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class lconv extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public lconv() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lconv(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lconv(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public lconv position(long position) {
        return (lconv)super.position(position);
    }
    @Override public lconv getPointer(long i) {
        return new lconv((Pointer)this).offsetAddress(i);
    }

	public native @Cast("char*") BytePointer decimal_point(); public native lconv decimal_point(BytePointer setter);
	public native @Cast("char*") BytePointer thousands_sep(); public native lconv thousands_sep(BytePointer setter);
	public native @Cast("char*") BytePointer grouping(); public native lconv grouping(BytePointer setter);
	public native @Cast("char*") BytePointer int_curr_symbol(); public native lconv int_curr_symbol(BytePointer setter);
	public native @Cast("char*") BytePointer currency_symbol(); public native lconv currency_symbol(BytePointer setter);
	public native @Cast("char*") BytePointer mon_decimal_point(); public native lconv mon_decimal_point(BytePointer setter);
	public native @Cast("char*") BytePointer mon_thousands_sep(); public native lconv mon_thousands_sep(BytePointer setter);
	public native @Cast("char*") BytePointer mon_grouping(); public native lconv mon_grouping(BytePointer setter);
	public native @Cast("char*") BytePointer positive_sign(); public native lconv positive_sign(BytePointer setter);
	public native @Cast("char*") BytePointer negative_sign(); public native lconv negative_sign(BytePointer setter);
	public native @Cast("char") byte int_frac_digits(); public native lconv int_frac_digits(byte setter);
	public native @Cast("char") byte frac_digits(); public native lconv frac_digits(byte setter);
	public native @Cast("char") byte p_cs_precedes(); public native lconv p_cs_precedes(byte setter);
	public native @Cast("char") byte p_sep_by_space(); public native lconv p_sep_by_space(byte setter);
	public native @Cast("char") byte n_cs_precedes(); public native lconv n_cs_precedes(byte setter);
	public native @Cast("char") byte n_sep_by_space(); public native lconv n_sep_by_space(byte setter);
	public native @Cast("char") byte p_sign_posn(); public native lconv p_sign_posn(byte setter);
	public native @Cast("char") byte n_sign_posn(); public native lconv n_sign_posn(byte setter);
	public native @Cast("char") byte int_p_cs_precedes(); public native lconv int_p_cs_precedes(byte setter);
	public native @Cast("char") byte int_n_cs_precedes(); public native lconv int_n_cs_precedes(byte setter);
	public native @Cast("char") byte int_p_sep_by_space(); public native lconv int_p_sep_by_space(byte setter);
	public native @Cast("char") byte int_n_sep_by_space(); public native lconv int_n_sep_by_space(byte setter);
	public native @Cast("char") byte int_p_sign_posn(); public native lconv int_p_sign_posn(byte setter);
	public native @Cast("char") byte int_n_sign_posn(); public native lconv int_n_sign_posn(byte setter);
}
