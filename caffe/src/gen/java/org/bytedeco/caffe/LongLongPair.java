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

@NoOffset @Name("std::pair<google::protobuf::uint64,google::protobuf::uint64>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class LongLongPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongLongPair(Pointer p) { super(p); }
    public LongLongPair(long firstValue, long secondValue) { this(); put(firstValue, secondValue); }
    public LongLongPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef LongLongPair put(@ByRef LongLongPair x);


    @MemberGetter public native @Cast("google::protobuf::uint64") long first(); public native LongLongPair first(long first);
    @MemberGetter public native @Cast("google::protobuf::uint64") long second();  public native LongLongPair second(long second);

    public LongLongPair put(long firstValue, long secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

