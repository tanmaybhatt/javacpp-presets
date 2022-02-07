// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.qt.global.Qt5Core.*;

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QMessageLogger extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QMessageLogger(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QMessageLogger(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QMessageLogger position(long position) {
        return (QMessageLogger)super.position(position);
    }
    @Override public QMessageLogger getPointer(long i) {
        return new QMessageLogger((Pointer)this).offsetAddress(i);
    }

     public QMessageLogger() { super((Pointer)null); allocate(); }
private native void allocate();
     public QMessageLogger(@Cast("const char*") BytePointer file, int line, @Cast("const char*") BytePointer function) { super((Pointer)null); allocate(file, line, function); }
private native void allocate(@Cast("const char*") BytePointer file, int line, @Cast("const char*") BytePointer function);
public QMessageLogger(String file, int line, String function) { super((Pointer)null); allocate(file, line, function); }
private native void allocate(String file, int line, String function);
     public QMessageLogger(@Cast("const char*") BytePointer file, int line, @Cast("const char*") BytePointer function, @Cast("const char*") BytePointer category) { super((Pointer)null); allocate(file, line, function, category); }
private native void allocate(@Cast("const char*") BytePointer file, int line, @Cast("const char*") BytePointer function, @Cast("const char*") BytePointer category);
public QMessageLogger(String file, int line, String function, String category) { super((Pointer)null); allocate(file, line, function, category); }
private native void allocate(String file, int line, String function, String category);

    public native void debug(@Cast("const char*") BytePointer msg);
    public native void debug(String msg);
    public native void noDebug(@Cast("const char*") BytePointer arg0);
    public native void noDebug(String arg0);
    public native void info(@Cast("const char*") BytePointer msg);
    public native void info(String msg);
    
    public native void warning(@Cast("const char*") BytePointer msg);
    public native void warning(String msg);
    
    public native void critical(@Cast("const char*") BytePointer msg);
    public native void critical(String msg);
    public native @NoException(true) void fatal(@Cast("const char*") BytePointer msg);
    public native @NoException(true) void fatal(String msg);
}
