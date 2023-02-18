// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class FL_PacketTable extends PacketTable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FL_PacketTable(Pointer p) { super(p); }

    /* Constructor
     * Creates a packet table to store either fixed- or variable-length packets.
     * Takes the ID of the file the packet table will be created in, the ID of
     * the property list to specify compression, the name of the packet table,
     * the ID of the datatype, and the size of a memory chunk used in chunking.
     */
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize/*=0*/,
                       @Cast("hid_t") long plistID/*=H5P_DEFAULT*/) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize, plistID); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize/*=0*/,
                       @Cast("hid_t") long plistID/*=H5P_DEFAULT*/);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID) { super((Pointer)null); allocate(fileID, name, dtypeID); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID);
    public FL_PacketTable(@Cast("hid_t") long fileID, String name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize/*=0*/,
                       @Cast("hid_t") long plistID/*=H5P_DEFAULT*/) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize, plistID); }
    private native void allocate(@Cast("hid_t") long fileID, String name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize/*=0*/,
                       @Cast("hid_t") long plistID/*=H5P_DEFAULT*/);
    public FL_PacketTable(@Cast("hid_t") long fileID, String name, @Cast("hid_t") long dtypeID) { super((Pointer)null); allocate(fileID, name, dtypeID); }
    private native void allocate(@Cast("hid_t") long fileID, String name, @Cast("hid_t") long dtypeID);

    /* Constructors - deprecated
     * Creates a packet table in which to store fixed length packets.
     * Takes the ID of the file the packet table will be created in, the name of
     * the packet table, the ID of the datatype of the set, the size
     * of a memory chunk used in chunking, and the desired compression level
     * (0-9, or -1 for no compression).
     * Note: these overloaded constructors will be deprecated in favor of the
     * constructor above.
     */
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("hid_t") long plist_id, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize) { super((Pointer)null); allocate(fileID, plist_id, name, dtypeID, chunkSize); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("hid_t") long plist_id, @Cast("const char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("hid_t") long plist_id, String name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize) { super((Pointer)null); allocate(fileID, plist_id, name, dtypeID, chunkSize); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("hid_t") long plist_id, String name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize, compression); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") BytePointer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize, compression); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") byte[] name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize, compression); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") byte[] name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize, int compression/*=0*/);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") byte[] name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize) { super((Pointer)null); allocate(fileID, name, dtypeID, chunkSize); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") byte[] name, @Cast("hid_t") long dtypeID, @Cast("hsize_t") long chunkSize);

    /* "Open" Constructor
     * Opens an existing fixed-length packet table.
     * Fails if the packet table specified is variable-length.
     */
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name);
    public FL_PacketTable(@Cast("hid_t") long fileID, String name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, String name);

    /* "Open" Constructor - will be deprecated because of char* name */
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name);
    public FL_PacketTable(@Cast("hid_t") long fileID, @Cast("char*") byte[] name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") byte[] name);

    /* Destructor
     * Cleans up the packet table
     */

    /* AppendPacket
     * Adds a single packet to the packet table.  Takes a pointer
     * to the location of the data in memory.
     * Returns 0 on success, negative on failure
     */
    public native int AppendPacket(Pointer data);

    /* AppendPackets (multiple packets)
     * Adds multiple packets to the packet table.  Takes the number of packets
     * to be added and a pointer to their location in memory.
     * Returns 0 on success, -1 on failure.
     */
    public native int AppendPackets(@Cast("size_t") long numPackets, Pointer data);

    /* GetPacket (indexed)
     * Gets a single packet from the packet table.  Takes the index
     * of the packet (with 0 being the first packet) and a pointer
     * to memory where the data should be stored.
     * Returns 0 on success, negative on failure
     */
    public native int GetPacket(@Cast("hsize_t") long index, Pointer data);

    /* GetPackets (multiple packets)
     * Gets multiple packets at once, all packets between
     * startIndex and endIndex inclusive.  Also takes a pointer to
     * the memory where these packets should be stored.
     * Returns 0 on success, negative on failure.
     */
    public native int GetPackets(@Cast("hsize_t") long startIndex, @Cast("hsize_t") long endIndex, Pointer data);

    /* GetNextPacket (single packet)
     * Gets the next packet in the packet table.  Takes a pointer to
     * memory where the packet should be stored.
     * Returns 0 on success, negative on failure.  Index
     * is not advanced to the next packet on failure.
     */
    public native int GetNextPacket(Pointer data);

    /* GetNextPackets (multiple packets)
     * Gets the next numPackets packets in the packet table.  Takes a
     * pointer to memory where these packets should be stored.
     * Returns 0 on success, negative on failure.  Index
     * is not advanced on failure.
     */
    public native int GetNextPackets(@Cast("size_t") long numPackets, Pointer data);
}
