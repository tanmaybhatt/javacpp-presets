// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * The core of depthai device for RAII, connects to device and maintains watchdog, timesync, ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DeviceBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceBase(Pointer p) { super(p); }

    // constants

    /** Default search time for constructors which discover devices */
    @MemberGetter public static native @ByRef @Cast("const std::chrono::seconds*") Pointer DEFAULT_SEARCH_TIME();
    /** Default rate at which system information is logged */
    @MemberGetter public static native float DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ();
    public static final float DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ = DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ();
    /** Default UsbSpeed for device connection */
    @MemberGetter public static native UsbSpeed DEFAULT_USB_SPEED();

    // Structures

    /**
     * Device specific configuration
     */
    public static class Config extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Config() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Config(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Config(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Config position(long position) {
            return (Config)super.position(position);
        }
        @Override public Config getPointer(long i) {
            return new Config((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("dai::OpenVINO::Version") int version(); public native Config version(int setter);
        public native @ByRef BoardConfig board(); public native Config board(BoardConfig setter);
    }

    // static API

    /**
     * \brief Get the Default Search Time for finding devices
     *
     * @return Default search time in milliseconds
     */
    public static native @ByVal @Cast("std::chrono::milliseconds*") Pointer getDefaultSearchTime();

    /**
     * Waits for any available device with a timeout
     *
     * @param timeout duration of time to wait for the any device
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */

    /**
     * Gets any available device
     *
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getAnyAvailableDevice();

    /**
     * Gets first available device. Device can be either in XLINK_UNBOOTED or XLINK_BOOTLOADER state
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice(@Cast("bool") boolean skipInvalidDevice/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice();

    /**
     * Finds a device by MX ID. Example: 14442C10D13EABCE00
     * @param mxId MyraidX ID which uniquely specifies a device
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString BytePointer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString ByteBuffer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString String mxId);

    /**
     * Returns all connected devices
     * @return Vector of connected devices
     */
    public static native @StdVector DeviceInfo getAllAvailableDevices();

    /**
     * Gets device firmware binary for a specific OpenVINO version
     * @param usb2Mode USB2 mode firmware
     * @param version Version of OpenVINO which firmware will support
     * @return Firmware binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@Cast("bool") boolean usb2Mode, @Cast("dai::OpenVINO::Version") int version/*=dai::OpenVINO::DEFAULT_VERSION*/);
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@Cast("bool") boolean usb2Mode);

    /**
     * Gets device firmware binary for a specific configuration
     * @param config FW with applied configuration
     * @return Firmware binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@ByVal Config config);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline) { super((Pointer)null); allocate(pipeline); }
    private native void allocate(@Const @ByRef Pipeline pipeline);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param usb2Mode Boot device using USB2 mode firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Cast("bool") boolean usb2Mode) { super((Pointer)null); allocate(pipeline, usb2Mode); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("bool") boolean usb2Mode);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Cast("const char*") BytePointer pathToCmd) { super((Pointer)null); allocate(pipeline, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("const char*") BytePointer pathToCmd);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Cast("const char*") ByteBuffer pathToCmd) { super((Pointer)null); allocate(pipeline, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("const char*") ByteBuffer pathToCmd);
    public DeviceBase(@Const @ByRef Pipeline pipeline, String pathToCmd) { super((Pointer)null); allocate(pipeline, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, String pathToCmd);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param pathToCmd Path to custom device firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(pipeline, devInfo); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode Boot device using USB2 mode firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean usb2Mode) { super((Pointer)null); allocate(pipeline, devInfo, usb2Mode); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean usb2Mode);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") BytePointer pathToCmd) { super((Pointer)null); allocate(pipeline, devInfo, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") BytePointer pathToCmd);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") ByteBuffer pathToCmd) { super((Pointer)null); allocate(pipeline, devInfo, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") ByteBuffer pathToCmd);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, String pathToCmd) { super((Pointer)null); allocate(pipeline, devInfo, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, String pathToCmd);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version Pipeline::DEFAULT_OPENVINO_VERSION
     */
    public DeviceBase() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with.
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version) { super((Pointer)null); allocate(version); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with
     * @param usb2Mode Boot device using USB2 mode firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Cast("bool") boolean usb2Mode) { super((Pointer)null); allocate(version, usb2Mode); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("bool") boolean usb2Mode);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Cast("const char*") BytePointer pathToCmd) { super((Pointer)null); allocate(version, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("const char*") BytePointer pathToCmd);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Cast("const char*") ByteBuffer pathToCmd) { super((Pointer)null); allocate(version, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("const char*") ByteBuffer pathToCmd);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, String pathToCmd) { super((Pointer)null); allocate(version, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, String pathToCmd);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with
     * @param pathToCmd Path to custom device firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(version, devInfo); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode Boot device using USB2 mode firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean usb2Mode) { super((Pointer)null); allocate(version, devInfo, usb2Mode); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean usb2Mode);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") BytePointer pathToCmd) { super((Pointer)null); allocate(version, devInfo, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") BytePointer pathToCmd);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") ByteBuffer pathToCmd) { super((Pointer)null); allocate(version, devInfo, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("const char*") ByteBuffer pathToCmd);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, String pathToCmd) { super((Pointer)null); allocate(version, devInfo, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, String pathToCmd);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode Path to custom device firmware
     */

    /**
     * Connects to any available device with custom config.
     * @param config Device custom configuration to boot with
     */
    public DeviceBase(@ByVal Config config) { super((Pointer)null); allocate(config); }
    private native void allocate(@ByVal Config config);

    /**
     * Connects to device 'devInfo' with custom config.
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param config Device custom configuration to boot with
     */
    public DeviceBase(@ByVal Config config, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(config, devInfo); }
    private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo);

    /**
     * Device destructor
     * \note In the destructor of the derived class, remember to call close()
     */

    /**
     * Checks if devices pipeline is already running
     *
     * @return True if running, false otherwise
     */
    public native @Cast("bool") boolean isPipelineRunning();

    /**
     * Starts the execution of the devices pipeline
     *
     * @return True if pipeline started, false otherwise
     */
    public native @Cast("bool") @Deprecated boolean startPipeline();

    /**
     * Starts the execution of a given pipeline
     * @param pipeline OpenVINO version of the pipeline must match the one which the device was booted with.
     *
     * @return True if pipeline started, false otherwise
     */
    public native @Cast("bool") boolean startPipeline(@Const @ByRef Pipeline pipeline);

    /**
     * Sets the devices logging severity level. This level affects which logs are transferred from device to host.
     *
     * @param level Logging severity
     */
    public native void setLogLevel(LogLevel level);
    public native void setLogLevel(@Cast("dai::LogLevel") int level);

    /**
     * Gets current logging severity level of the device.
     *
     * @return Logging severity level
     */
    public native LogLevel getLogLevel();

    /**
     * Sets the chunk size for splitting device-sent XLink packets. A larger value could
     * increase performance, and 0 disables chunking. A negative value is ignored.
     * Device defaults are configured per protocol, currently 64*1024 for both USB and Ethernet.
     *
     * @param sizeBytes XLink chunk size in bytes
     */
    public native void setXLinkChunkSize(int sizeBytes);

    /**
     * Gets current XLink chunk size.
     *
     * @return XLink chunk size in bytes
     */
    public native int getXLinkChunkSize();

    /**
     * Get the Device Info object o the device which is currently running
     *
     * @return DeviceInfo of the current device in execution
     */
    public native @ByVal DeviceInfo getDeviceInfo();

    /**
     * Get MxId of device
     *
     * @return MxId of connected device
     */
    public native @StdString BytePointer getMxId();

    /**
     * Sets logging level which decides printing level to standard output.
     * If lower than setLogLevel, no messages will be printed
     *
     * @param level Standard output printing severity
     */
    public native void setLogOutputLevel(LogLevel level);
    public native void setLogOutputLevel(@Cast("dai::LogLevel") int level);

    /**
     * Gets logging level which decides printing level to standard output.
     *
     * @return Standard output printing severity
     */
    public native LogLevel getLogOutputLevel();

    /**
     * Sets the brightness of the IR Laser Dot Projector. Limits: up to 765mA at 30% duty cycle, up to 1200mA at 6% duty cycle.
     * The duty cycle is controlled by {@code left} camera STROBE, aligned to start of exposure.
     * The emitter is turned off by default
     *
     * @param mA Current in mA that will determine brightness, 0 or negative to turn off
     * @param mask Optional mask to modify only Left (0x1) or Right (0x2) sides on OAK-D-Pro-W-DEV
     * @return True on success, false if not found or other failure
     */
    public native @Cast("bool") boolean setIrLaserDotProjectorBrightness(float mA, int mask/*=-1*/);
    public native @Cast("bool") boolean setIrLaserDotProjectorBrightness(float mA);

    /**
     * Sets the brightness of the IR Flood Light. Limits: up to 1500mA at 30% duty cycle.
     * The duty cycle is controlled by the {@code left} camera STROBE, aligned to start of exposure.
     * If the dot projector is also enabled, its lower duty cycle limits take precedence.
     * The emitter is turned off by default
     *
     * @param mA Current in mA that will determine brightness, 0 or negative to turn off
     * @param mask Optional mask to modify only Left (0x1) or Right (0x2) sides on OAK-D-Pro-W-DEV
     * @return True on success, false if not found or other failure
     */
    public native @Cast("bool") boolean setIrFloodLightBrightness(float mA, int mask/*=-1*/);
    public native @Cast("bool") boolean setIrFloodLightBrightness(float mA);

    /**
     * Retrieves detected IR laser/LED drivers.
     *
     * @return Vector of tuples containing: driver name, I2C bus, I2C address.
     * For OAK-D-Pro it should be {@code [{"LM3644", 2, 0x63}]}
     */
    public native @StdVector StringIntIntTuple getIrDrivers();

    /**
     * Add a callback for device logging. The callback will be called from a separate thread with the LogMessage being passed.
     *
     * @param callback Callback to call whenever a log message arrives
     * @return Id which can be used to later remove the callback
     */
    public native int addLogCallback(LogCallback callback);

    /**
     * Removes a callback
     *
     * @param callbackId Id of callback to be removed
     * @return True if callback was removed, false otherwise
     */
    public native @Cast("bool") boolean removeLogCallback(int callbackId);

    /**
     * Sets rate of system information logging ("info" severity). Default 1Hz
     * If parameter is less or equal to zero, then system information logging will be disabled
     *
     * @param rateHz Logging rate in Hz
     */
    public native void setSystemInformationLoggingRate(float rateHz);

    /**
     * Gets current rate of system information logging ("info" severity) in Hz.
     *
     * @return Logging rate in Hz
     */
    public native float getSystemInformationLoggingRate();

    /**
     * Get cameras that are connected to the device
     *
     * @return Vector of connected cameras
     */
    public native @StdVector @Cast("dai::CameraBoardSocket*") IntPointer getConnectedCameras();

    /**
     * Get sensor names for cameras that are connected to the device
     *
     * @return Map/dictionary with camera sensor names, indexed by socket
     */
    public native @ByVal CameraBoardSocketStringMap getCameraSensorNames();

    /**
     * Retrieves current DDR memory information from device
     *
     * @return Used, remaining and total ddr memory
     */
    public native @ByVal MemoryInfo getDdrMemoryUsage();

    /**
     * Retrieves current CMX memory information from device
     *
     * @return Used, remaining and total cmx memory
     */
    public native @ByVal MemoryInfo getCmxMemoryUsage();

    /**
     * Retrieves current CSS Leon CPU heap information from device
     *
     * @return Used, remaining and total heap memory
     */
    public native @ByVal MemoryInfo getLeonCssHeapUsage();

    /**
     * Retrieves current MSS Leon CPU heap information from device
     *
     * @return Used, remaining and total heap memory
     */
    public native @ByVal MemoryInfo getLeonMssHeapUsage();

    /**
     * Retrieves current chip temperature as measured by device
     *
     * @return Temperature of various onboard sensors
     */
    public native @ByVal ChipTemperature getChipTemperature();

    /**
     * Retrieves average CSS Leon CPU usage
     *
     * @return Average CPU usage and sampling duration
     */
    public native @ByVal CpuUsage getLeonCssCpuUsage();

    /**
     * Retrieves average MSS Leon CPU usage
     *
     * @return Average CPU usage and sampling duration
     */
    public native @ByVal CpuUsage getLeonMssCpuUsage();

    /**
     * Stores the Calibration and Device information to the Device EEPROM
     *
     * @param calibrationObj CalibrationHandler object which is loaded with calibration information.
     *
     * @return true on successful flash, false on failure
     */
    public native @Cast("bool") boolean flashCalibration(@ByVal CalibrationHandler calibrationDataHandler);

    /**
     * Fetches the EEPROM data from the device and loads it into CalibrationHandler object
     *
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM
     */
    public native @ByVal CalibrationHandler readCalibration();

    /**
     * Retrieves USB connection speed
     *
     * @return USB connection speed of connected device if applicable. Unknown otherwise.
     */
    public native UsbSpeed getUsbSpeed();

    /**
     * Explicitly closes connection to device.
     * \note This function does not need to be explicitly called
     * as destructor closes the device automatically
     */
    public native @Name("close") void _close();

    /**
     * Is the device already closed (or disconnected)
     */
    public native @Cast("bool") boolean isClosed();

    /**
     * Returns underlying XLinkConnection
     */
    public native @SharedPtr XLinkConnection getConnection();

    /**
     * Returns underlying XLinkConnection
     */
}
