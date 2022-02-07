// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Point_<float>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point2f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point2f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point2f position(long position) {
        return (Point2f)super.position(position);
    }
    @Override public Point2f getPointer(long i) {
        return new Point2f((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Point2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point2f(float _x, float _y) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(float _x, float _y);
// #if (defined(__GNUC__) && __GNUC__ < 5) && !defined(__clang__)  // GCC 4.x bug. Details: https://github.com/opencv/opencv/pull/20837
    public Point2f(@Const @ByRef Point2f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2f pt);
// #elif OPENCV_ABI_COMPATIBILITY < 500
// #endif
    public Point2f(@Const @ByRef Size2f sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2f sz);

// #if (defined(__GNUC__) && __GNUC__ < 5) && !defined(__clang__)  // GCC 4.x bug. Details: https://github.com/opencv/opencv/pull/20837
    public native @ByRef @Name("operator =") Point2f put(@Const @ByRef Point2f pt);
// #elif OPENCV_ABI_COMPATIBILITY < 500
// #endif
    /** conversion to another data type */

    /** conversion to the old-style C structures */

    /** dot product */
    public native float dot(@Const @ByRef Point2f pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point2f pt);
    /** cross-product */
    public native double cross(@Const @ByRef Point2f pt);
    /** checks whether the point is inside the specified rectangle */
    public native @Cast("bool") boolean inside(@Const @ByRef Rect2f r);
    /** x coordinate of the point */
    public native float x(); public native Point2f x(float setter);
    /** y coordinate of the point */
    public native float y(); public native Point2f y(float setter);
}
