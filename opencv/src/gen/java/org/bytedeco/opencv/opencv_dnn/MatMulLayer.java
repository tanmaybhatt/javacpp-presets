// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class MatMulLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public MatMulLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public MatMulLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MatMulLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public MatMulLayer position(long position) {
            return (MatMulLayer)super.position(position);
        }
        @Override public MatMulLayer getPointer(long i) {
            return new MatMulLayer((Pointer)this).offsetAddress(i);
        }
    
        public static native @Ptr MatMulLayer create(@Const @ByRef LayerParams params);
    }