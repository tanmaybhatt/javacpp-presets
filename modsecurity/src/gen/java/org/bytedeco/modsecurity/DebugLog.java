// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;



/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity::debug_log") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class DebugLog extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DebugLog(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DebugLog(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DebugLog position(long position) {
        return (DebugLog)super.position(position);
    }
    @Override public DebugLog getPointer(long i) {
        return new DebugLog((Pointer)this).offsetAddress(i);
    }

    public DebugLog() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void write(int level, @StdString BytePointer msg);
    public native void write(int level, @StdString String msg);
    public native void write(int level, @StdString BytePointer id,
            @StdString BytePointer uri, @StdString BytePointer msg);
    public native void write(int level, @StdString String id,
            @StdString String uri, @StdString String msg);
    public native @Cast("bool") boolean isLogFileSet();
    public native @Cast("bool") boolean isLogLevelSet();
    public native void setDebugLogLevel(int level);
    public native void setDebugLogFile(@StdString BytePointer fileName, @StdString @Cast({"char*", "std::string*"}) BytePointer error);
    public native void setDebugLogFile(@StdString String fileName, @StdString @Cast({"char*", "std::string*"}) BytePointer error);
    public native @StdString BytePointer getDebugLogFile();
    public native int getDebugLogLevel();

    public native int m_debugLevel(); public native DebugLog m_debugLevel(int setter);
}
