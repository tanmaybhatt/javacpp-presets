// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Camera information. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2CameraInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2CameraInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2CameraInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2CameraInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2CameraInfo position(long position) {
            return (fc2CameraInfo)super.position(position);
        }
        @Override public fc2CameraInfo getPointer(long i) {
            return new fc2CameraInfo((Pointer)this).offsetAddress(i);
        }
    
        /** Device serial number. */
        public native @Cast("unsigned int") int serialNumber(); public native fc2CameraInfo serialNumber(int setter);
        /** Interface type. */
        public native @Cast("fc2InterfaceType") int interfaceType(); public native fc2CameraInfo interfaceType(int setter);
        /** Driver type. */
        public native @Cast("fc2DriverType") int driverType(); public native fc2CameraInfo driverType(int setter);
        /** Flag indicating if this is a color camera. */
        public native @Cast("BOOL") int isColorCamera(); public native fc2CameraInfo isColorCamera(int setter);
        /** Device model name. */
        public native @Cast("char") byte modelName(int i); public native fc2CameraInfo modelName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer modelName();
        /** Device vendor name. */
        public native @Cast("char") byte vendorName(int i); public native fc2CameraInfo vendorName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer vendorName();
        /** String detailing the sensor information. */
        public native @Cast("char") byte sensorInfo(int i); public native fc2CameraInfo sensorInfo(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer sensorInfo();
        /** String providing the sensor resolution. */
        public native @Cast("char") byte sensorResolution(int i); public native fc2CameraInfo sensorResolution(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer sensorResolution();
        /** Driver name of driver being used. */
        public native @Cast("char") byte driverName(int i); public native fc2CameraInfo driverName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer driverName();
        /** Firmware version of camera. */
        public native @Cast("char") byte firmwareVersion(int i); public native fc2CameraInfo firmwareVersion(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer firmwareVersion();
        /** Firmware build time. */
        public native @Cast("char") byte firmwareBuildTime(int i); public native fc2CameraInfo firmwareBuildTime(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer firmwareBuildTime();
        /** Maximum bus speed. */
        public native @Cast("fc2BusSpeed") int maximumBusSpeed(); public native fc2CameraInfo maximumBusSpeed(int setter);
        /** Bayer tile format. */
        public native @Cast("fc2BayerTileFormat") int bayerTileFormat(); public native fc2CameraInfo bayerTileFormat(int setter);
        /** Bus number, set to 0 for GigE and USB cameras **/
        public native @Cast("fc2PCIeBusSpeed") int pcieBusSpeed(); public native fc2CameraInfo pcieBusSpeed(int setter);
        /** ieee1394 Node number, set to 0 for GigE and USB cameras **/
        public native @Cast("unsigned short") short nodeNumber(); public native fc2CameraInfo nodeNumber(short setter);
        /** PCIe Bus Speed, set to PCIE_BUSSPEED_UNKNOWN for unsupported drivers **/
        public native @Cast("unsigned short") short busNumber(); public native fc2CameraInfo busNumber(short setter);

        /** \name IIDC specific information */
        /*@{*/
        /** DCAM version. */
        public native @Cast("unsigned int") int iidcVer(); public native fc2CameraInfo iidcVer(int setter);
        /** Configuration ROM data. */
        public native @ByRef fc2ConfigROM configROM(); public native fc2CameraInfo configROM(fc2ConfigROM setter);
        /*@}*/

        /** \name GigE specific information */
        /*@{*/
        /** GigE Vision version. */
        public native @Cast("unsigned int") int gigEMajorVersion(); public native fc2CameraInfo gigEMajorVersion(int setter);
        /** GigE Vision minor version. */
        public native @Cast("unsigned int") int gigEMinorVersion(); public native fc2CameraInfo gigEMinorVersion(int setter);
        /** User defined name. */
        public native @Cast("char") byte userDefinedName(int i); public native fc2CameraInfo userDefinedName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer userDefinedName();
        /** XML URL 1. */
        public native @Cast("char") byte xmlURL1(int i); public native fc2CameraInfo xmlURL1(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL1();
        /** XML URL 2. */
        public native @Cast("char") byte xmlURL2(int i); public native fc2CameraInfo xmlURL2(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL2();
        /** MAC address */
        public native @ByRef fc2MACAddress macAddress(); public native fc2CameraInfo macAddress(fc2MACAddress setter);
        /** IP address. */
        public native @ByRef fc2IPAddress ipAddress(); public native fc2CameraInfo ipAddress(fc2IPAddress setter);
        /** Subnet mask. */
        public native @ByRef fc2IPAddress subnetMask(); public native fc2CameraInfo subnetMask(fc2IPAddress setter);
        /** Default gateway. */
        public native @ByRef fc2IPAddress defaultGateway(); public native fc2CameraInfo defaultGateway(fc2IPAddress setter);
        /** Status/Content of CCP register */
        public native @Cast("unsigned int") int ccpStatus(); public native fc2CameraInfo ccpStatus(int setter);
        /** Local Application IP Address. */
        public native @Cast("unsigned int") int applicationIPAddress(); public native fc2CameraInfo applicationIPAddress(int setter);
        /** Local Application port. */
        public native @Cast("unsigned int") int applicationPort(); public native fc2CameraInfo applicationPort(int setter);
        /*@}*/

        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2CameraInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
