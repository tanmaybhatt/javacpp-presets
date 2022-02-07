// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;



/** \endcond
<p>
<p>
/** \} */ /* END ENCODE_FUNC */

/**
 * \ingroup ENCODER_STRUCTURE
 * NV_ENCODE_API_FUNCTION_LIST
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENCODE_API_FUNCTION_LIST extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENCODE_API_FUNCTION_LIST() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENCODE_API_FUNCTION_LIST(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENCODE_API_FUNCTION_LIST(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENCODE_API_FUNCTION_LIST position(long position) {
        return (NV_ENCODE_API_FUNCTION_LIST)super.position(position);
    }
    @Override public NV_ENCODE_API_FUNCTION_LIST getPointer(long i) {
        return new NV_ENCODE_API_FUNCTION_LIST((Pointer)this).offsetAddress(i);
    }

    /** [in]: Client should pass NV_ENCODE_API_FUNCTION_LIST_VER.                               */
    public native @Cast("uint32_t") int version(); public native NV_ENCODE_API_FUNCTION_LIST version(int setter);
    /** [in]: Reserved and should be set to 0.                                                  */
    public native @Cast("uint32_t") int reserved(); public native NV_ENCODE_API_FUNCTION_LIST reserved(int setter);
    /** [out]: Client should access ::NvEncOpenEncodeSession() API through this pointer.        */
    public native PNVENCOPENENCODESESSION nvEncOpenEncodeSession(); public native NV_ENCODE_API_FUNCTION_LIST nvEncOpenEncodeSession(PNVENCOPENENCODESESSION setter);
    /** [out]: Client should access ::NvEncGetEncodeGUIDCount() API through this pointer.       */
    public native PNVENCGETENCODEGUIDCOUNT nvEncGetEncodeGUIDCount(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeGUIDCount(PNVENCGETENCODEGUIDCOUNT setter);
    /** [out]: Client should access ::NvEncGetEncodeProfileGUIDCount() API through this pointer.*/
    public native PNVENCGETENCODEPRESETCOUNT nvEncGetEncodeProfileGUIDCount(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeProfileGUIDCount(PNVENCGETENCODEPRESETCOUNT setter);
    /** [out]: Client should access ::NvEncGetEncodeProfileGUIDs() API through this pointer.    */
    public native PNVENCGETENCODEPRESETGUIDS nvEncGetEncodeProfileGUIDs(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeProfileGUIDs(PNVENCGETENCODEPRESETGUIDS setter);
    /** [out]: Client should access ::NvEncGetEncodeGUIDs() API through this pointer.           */
    public native PNVENCGETENCODEGUIDS nvEncGetEncodeGUIDs(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeGUIDs(PNVENCGETENCODEGUIDS setter);
    /** [out]: Client should access ::NvEncGetInputFormatCount() API through this pointer.      */
    public native PNVENCGETINPUTFORMATCOUNT nvEncGetInputFormatCount(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetInputFormatCount(PNVENCGETINPUTFORMATCOUNT setter);
    /** [out]: Client should access ::NvEncGetInputFormats() API through this pointer.          */
    public native PNVENCGETINPUTFORMATS nvEncGetInputFormats(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetInputFormats(PNVENCGETINPUTFORMATS setter);
    /** [out]: Client should access ::NvEncGetEncodeCaps() API through this pointer.            */
    public native PNVENCGETENCODECAPS nvEncGetEncodeCaps(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeCaps(PNVENCGETENCODECAPS setter);
    /** [out]: Client should access ::NvEncGetEncodePresetCount() API through this pointer.     */
    public native PNVENCGETENCODEPRESETCOUNT nvEncGetEncodePresetCount(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodePresetCount(PNVENCGETENCODEPRESETCOUNT setter);
    /** [out]: Client should access ::NvEncGetEncodePresetGUIDs() API through this pointer.     */
    public native PNVENCGETENCODEPRESETGUIDS nvEncGetEncodePresetGUIDs(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodePresetGUIDs(PNVENCGETENCODEPRESETGUIDS setter);
    /** [out]: Client should access ::NvEncGetEncodePresetConfig() API through this pointer.    */
    public native PNVENCGETENCODEPRESETCONFIG nvEncGetEncodePresetConfig(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodePresetConfig(PNVENCGETENCODEPRESETCONFIG setter);
    /** [out]: Client should access ::NvEncInitializeEncoder() API through this pointer.        */
    public native PNVENCINITIALIZEENCODER nvEncInitializeEncoder(); public native NV_ENCODE_API_FUNCTION_LIST nvEncInitializeEncoder(PNVENCINITIALIZEENCODER setter);
    /** [out]: Client should access ::NvEncCreateInputBuffer() API through this pointer.        */
    public native PNVENCCREATEINPUTBUFFER nvEncCreateInputBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncCreateInputBuffer(PNVENCCREATEINPUTBUFFER setter);
    /** [out]: Client should access ::NvEncDestroyInputBuffer() API through this pointer.       */
    public native PNVENCDESTROYINPUTBUFFER nvEncDestroyInputBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncDestroyInputBuffer(PNVENCDESTROYINPUTBUFFER setter);
    /** [out]: Client should access ::NvEncCreateBitstreamBuffer() API through this pointer.    */
    public native PNVENCCREATEBITSTREAMBUFFER nvEncCreateBitstreamBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncCreateBitstreamBuffer(PNVENCCREATEBITSTREAMBUFFER setter);
    /** [out]: Client should access ::NvEncDestroyBitstreamBuffer() API through this pointer.   */
    public native PNVENCDESTROYBITSTREAMBUFFER nvEncDestroyBitstreamBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncDestroyBitstreamBuffer(PNVENCDESTROYBITSTREAMBUFFER setter);
    /** [out]: Client should access ::NvEncEncodePicture() API through this pointer.            */
    public native PNVENCENCODEPICTURE nvEncEncodePicture(); public native NV_ENCODE_API_FUNCTION_LIST nvEncEncodePicture(PNVENCENCODEPICTURE setter);
    /** [out]: Client should access ::NvEncLockBitstream() API through this pointer.            */
    public native PNVENCLOCKBITSTREAM nvEncLockBitstream(); public native NV_ENCODE_API_FUNCTION_LIST nvEncLockBitstream(PNVENCLOCKBITSTREAM setter);
    /** [out]: Client should access ::NvEncUnlockBitstream() API through this pointer.          */
    public native PNVENCUNLOCKBITSTREAM nvEncUnlockBitstream(); public native NV_ENCODE_API_FUNCTION_LIST nvEncUnlockBitstream(PNVENCUNLOCKBITSTREAM setter);
    /** [out]: Client should access ::NvEncLockInputBuffer() API through this pointer.          */
    public native PNVENCLOCKINPUTBUFFER nvEncLockInputBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncLockInputBuffer(PNVENCLOCKINPUTBUFFER setter);
    /** [out]: Client should access ::NvEncUnlockInputBuffer() API through this pointer.        */
    public native PNVENCUNLOCKINPUTBUFFER nvEncUnlockInputBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncUnlockInputBuffer(PNVENCUNLOCKINPUTBUFFER setter);
    /** [out]: Client should access ::NvEncGetEncodeStats() API through this pointer.           */
    public native PNVENCGETENCODESTATS nvEncGetEncodeStats(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodeStats(PNVENCGETENCODESTATS setter);
    /** [out]: Client should access ::NvEncGetSequenceParams() API through this pointer.        */
    public native PNVENCGETSEQUENCEPARAMS nvEncGetSequenceParams(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetSequenceParams(PNVENCGETSEQUENCEPARAMS setter);
    /** [out]: Client should access ::NvEncRegisterAsyncEvent() API through this pointer.       */
    public native PNVENCREGISTERASYNCEVENT nvEncRegisterAsyncEvent(); public native NV_ENCODE_API_FUNCTION_LIST nvEncRegisterAsyncEvent(PNVENCREGISTERASYNCEVENT setter);
    /** [out]: Client should access ::NvEncUnregisterAsyncEvent() API through this pointer.     */
    public native PNVENCUNREGISTERASYNCEVENT nvEncUnregisterAsyncEvent(); public native NV_ENCODE_API_FUNCTION_LIST nvEncUnregisterAsyncEvent(PNVENCUNREGISTERASYNCEVENT setter);
    /** [out]: Client should access ::NvEncMapInputResource() API through this pointer.         */
    public native PNVENCMAPINPUTRESOURCE nvEncMapInputResource(); public native NV_ENCODE_API_FUNCTION_LIST nvEncMapInputResource(PNVENCMAPINPUTRESOURCE setter);
    /** [out]: Client should access ::NvEncUnmapInputResource() API through this pointer.       */
    public native PNVENCUNMAPINPUTRESOURCE nvEncUnmapInputResource(); public native NV_ENCODE_API_FUNCTION_LIST nvEncUnmapInputResource(PNVENCUNMAPINPUTRESOURCE setter);
    /** [out]: Client should access ::NvEncDestroyEncoder() API through this pointer.           */
    public native PNVENCDESTROYENCODER nvEncDestroyEncoder(); public native NV_ENCODE_API_FUNCTION_LIST nvEncDestroyEncoder(PNVENCDESTROYENCODER setter);
    /** [out]: Client should access ::NvEncInvalidateRefFrames() API through this pointer.      */
    public native PNVENCINVALIDATEREFFRAMES nvEncInvalidateRefFrames(); public native NV_ENCODE_API_FUNCTION_LIST nvEncInvalidateRefFrames(PNVENCINVALIDATEREFFRAMES setter);
    /** [out]: Client should access ::NvEncOpenEncodeSession() API through this pointer.        */
    public native PNVENCOPENENCODESESSIONEX nvEncOpenEncodeSessionEx(); public native NV_ENCODE_API_FUNCTION_LIST nvEncOpenEncodeSessionEx(PNVENCOPENENCODESESSIONEX setter);
    /** [out]: Client should access ::NvEncRegisterResource() API through this pointer.         */
    public native PNVENCREGISTERRESOURCE nvEncRegisterResource(); public native NV_ENCODE_API_FUNCTION_LIST nvEncRegisterResource(PNVENCREGISTERRESOURCE setter);
    /** [out]: Client should access ::NvEncUnregisterResource() API through this pointer.       */
    public native PNVENCUNREGISTERRESOURCE nvEncUnregisterResource(); public native NV_ENCODE_API_FUNCTION_LIST nvEncUnregisterResource(PNVENCUNREGISTERRESOURCE setter);
    /** [out]: Client should access ::NvEncReconfigureEncoder() API through this pointer.       */
    public native PNVENCRECONFIGUREENCODER nvEncReconfigureEncoder(); public native NV_ENCODE_API_FUNCTION_LIST nvEncReconfigureEncoder(PNVENCRECONFIGUREENCODER setter);
    public native Pointer reserved1(); public native NV_ENCODE_API_FUNCTION_LIST reserved1(Pointer setter);
    /** [out]: Client should access ::NvEncCreateMVBuffer API through this pointer.             */
    public native PNVENCCREATEMVBUFFER nvEncCreateMVBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncCreateMVBuffer(PNVENCCREATEMVBUFFER setter);
    /** [out]: Client should access ::NvEncDestroyMVBuffer API through this pointer.            */
    public native PNVENCDESTROYMVBUFFER nvEncDestroyMVBuffer(); public native NV_ENCODE_API_FUNCTION_LIST nvEncDestroyMVBuffer(PNVENCDESTROYMVBUFFER setter);
    /** [out]: Client should access ::NvEncRunMotionEstimationOnly API through this pointer.    */
    public native PNVENCRUNMOTIONESTIMATIONONLY nvEncRunMotionEstimationOnly(); public native NV_ENCODE_API_FUNCTION_LIST nvEncRunMotionEstimationOnly(PNVENCRUNMOTIONESTIMATIONONLY setter);
    /** [out]: Client should access ::nvEncGetLastErrorString API through this pointer.         */
    public native PNVENCGETLASTERROR nvEncGetLastErrorString(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetLastErrorString(PNVENCGETLASTERROR setter);
    /** [out]: Client should access ::nvEncSetIOCudaStreams API through this pointer.           */
    public native PNVENCSETIOCUDASTREAMS nvEncSetIOCudaStreams(); public native NV_ENCODE_API_FUNCTION_LIST nvEncSetIOCudaStreams(PNVENCSETIOCUDASTREAMS setter);
    /** [out]: Client should access ::NvEncGetEncodePresetConfigEx() API through this pointer.  */
    public native PNVENCGETENCODEPRESETCONFIGEX nvEncGetEncodePresetConfigEx(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetEncodePresetConfigEx(PNVENCGETENCODEPRESETCONFIGEX setter);
    /** [out]: Client should access ::NvEncGetSequenceParamEx() API through this pointer.       */
    public native PNVENCGETSEQUENCEPARAMEX nvEncGetSequenceParamEx(); public native NV_ENCODE_API_FUNCTION_LIST nvEncGetSequenceParamEx(PNVENCGETSEQUENCEPARAMEX setter);
    /** [in]:  Reserved and must be set to NULL                                                 */
    public native Pointer reserved2(int i); public native NV_ENCODE_API_FUNCTION_LIST reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
