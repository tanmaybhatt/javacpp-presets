// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_map<int,int>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class IntIntMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntMap(Pointer p) { super(p); }
    public IntIntMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntIntMap put(@ByRef IntIntMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native int get(int i);
    public native IntIntMap put(int i, int value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter int first();
        public native @Name("operator *().second") @MemberGetter int second();
    }
}

