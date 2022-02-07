// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qeventloop.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QEventLoop extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QEventLoop(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QEventLoop(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QEventLoop position(long position) {
        return (QEventLoop)super.position(position);
    }
    @Override public QEventLoop getPointer(long i) {
        return new QEventLoop((Pointer)this).offsetAddress(i);
    }

    public QEventLoop(QObject parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QObject parent/*=nullptr*/);
    public QEventLoop() { super((Pointer)null); allocate(); }
    private native void allocate();

    public enum ProcessEventsFlag {
        AllEvents(0x00),
        ExcludeUserInputEvents(0x01),
        ExcludeSocketNotifiers(0x02),
        WaitForMoreEvents(0x04),
        X11ExcludeTimers(0x08),
        EventLoopExec(0x20),
        DialogExec(0x40);

        public final int value;
        private ProcessEventsFlag(int v) { this.value = v; }
        private ProcessEventsFlag(ProcessEventsFlag e) { this.value = e.value; }
        public ProcessEventsFlag intern() { for (ProcessEventsFlag e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    

    public native @Cast("bool") boolean processEvents();

    public native int exec();
    public native void exit(int returnCode/*=0*/);
    public native void exit();
    public native @Cast("bool") boolean isRunning();

    public native void wakeUp();

    @Virtual public native @Cast("bool") boolean event(QEvent event);
    public native void quit();
}
