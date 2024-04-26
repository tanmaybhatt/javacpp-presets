// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::vector<onnx::OpSchema>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSchemaVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSchemaVector(Pointer p) { super(p); }
    public OpSchemaVector(OpSchema value) { this(1); put(0, value); }
    public OpSchemaVector(OpSchema ... array) { this(array.length); put(array); }
    public OpSchemaVector()       { allocate();  }
    public OpSchemaVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef OpSchemaVector put(@ByRef OpSchemaVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public OpSchema front() { return get(0); }
    public OpSchema back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef OpSchema get(@Cast("size_t") long i);
    public native OpSchemaVector put(@Cast("size_t") long i, OpSchema value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef OpSchema value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const OpSchema get();
    }

    public OpSchema[] get() {
        OpSchema[] array = new OpSchema[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public OpSchema pop_back() {
        long size = size();
        OpSchema value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public OpSchemaVector push_back(OpSchema value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public OpSchemaVector put(OpSchema value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public OpSchemaVector put(OpSchema ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

