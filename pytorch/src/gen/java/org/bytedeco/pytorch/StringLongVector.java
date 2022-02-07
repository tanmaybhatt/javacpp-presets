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

@Name("std::vector<std::pair<std::string,int64_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringLongVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringLongVector(Pointer p) { super(p); }
    public StringLongVector(BytePointer[] firstValue, long[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringLongVector(String[] firstValue, long[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringLongVector()       { allocate();  }
    public StringLongVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringLongVector put(@ByRef StringLongVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdString BytePointer first(@Cast("size_t") long i); public native StringLongVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @Cast("int64_t") long second(@Cast("size_t") long i);  public native StringLongVector second(@Cast("size_t") long i, long second);
    @MemberSetter @Index(function = "at") public native StringLongVector first(@Cast("size_t") long i, @StdString String first);

    public StringLongVector put(BytePointer[] firstValue, long[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public StringLongVector put(String[] firstValue, long[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

