// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

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
public class CosLayer extends ActivationLayer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CosLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CosLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CosLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CosLayer position(long position) {
            return (CosLayer)super.position(position);
        }
        @Override public CosLayer getPointer(long i) {
            return new CosLayer((Pointer)this).offsetAddress(i);
        }
    
        public static native @Ptr CosLayer create(@Const @ByRef LayerParams params);
    }
