// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::vector<torch::nn::Module>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModuleVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleVector(Pointer p) { super(p); }
    public ModuleVector(Module value) { this(1); put(0, value); }
    public ModuleVector(Module ... array) { this(array.length); put(array); }
    public ModuleVector()       { allocate();  }
    public ModuleVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ModuleVector put(@ByRef ModuleVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Module get(@Cast("size_t") long i);
    public native ModuleVector put(@Cast("size_t") long i, Module value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Module value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Module get();
    }

    public Module[] get() {
        Module[] array = new Module[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Module pop_back() {
        long size = size();
        Module value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ModuleVector push_back(Module value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ModuleVector put(Module value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ModuleVector put(Module ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

