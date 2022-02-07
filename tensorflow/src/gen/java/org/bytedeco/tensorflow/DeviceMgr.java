// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceMgr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceMgr(Pointer p) { super(p); }

  // Constructs a DeviceMgr from a list of devices.
  // TODO(zhifengc): Other initialization information.

  // Constructs a DeviceMgr managing a single device.
  public DeviceMgr(@MoveUniquePtr Device device) { super((Pointer)null); allocate(device); }
  private native void allocate(@MoveUniquePtr Device device);

  // Returns attributes of all devices.
  public native void ListDeviceAttributes(@StdVector DeviceAttributes devices);

  // Returns raw pointers to the underlying devices.
  public native @ByVal DeviceVector ListDevices();

  // Returns a string listing all devices.
  public native @StdString BytePointer DebugString();

  // Returns a string of all the device mapping.
  public native @StdString BytePointer DeviceMappingString();

  // Assigns *device with pointer to Device of the given name.
  // Accepts either a full device name, or just the replica-local suffix.
  public native @ByVal Status LookupDevice(@StringPiece BytePointer name, @Cast("tensorflow::Device**") PointerPointer device);
  public native @ByVal Status LookupDevice(@StringPiece BytePointer name, @ByPtrPtr Device device);
  public native @ByVal Status LookupDevice(@StringPiece String name, @ByPtrPtr Device device);

  // Clears given containers of all devices if 'container' is
  // non-empty. Otherwise, clears default containers of all devices.
  public native void ClearContainers(@ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::string>*") StringVector containers);

  public native int NumDeviceType(@StdString BytePointer type);
  public native int NumDeviceType(@StdString String type);
}
