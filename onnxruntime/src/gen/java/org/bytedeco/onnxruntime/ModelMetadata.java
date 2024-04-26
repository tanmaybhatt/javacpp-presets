// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief Wrapper around ::OrtModelMetadata
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ModelMetadata extends BaseModelMetadata {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModelMetadata(Pointer p) { super(p); }

  /** Used for interop with the C API */
  public ModelMetadata(OrtModelMetadata p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtModelMetadata p);

  /** \brief Returns a copy of the producer name.
   *
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataGetProducerName */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetProducerNameAllocated(OrtAllocator allocator);

  /** \brief Returns a copy of the graph name.
   *
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataGetGraphName */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetGraphNameAllocated(OrtAllocator allocator);

  /** \brief Returns a copy of the domain name.
   *
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataGetDomain */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetDomainAllocated(OrtAllocator allocator);

  /** \brief Returns a copy of the description.
   *
   * @param allocator to allocate memory for the copy of the string returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataGetDescription */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetDescriptionAllocated(OrtAllocator allocator);

  /** \brief Returns a copy of the graph description.
   *
   * @param allocator to allocate memory for the copy of the string returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataGetGraphDescription */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetGraphDescriptionAllocated(OrtAllocator allocator);

  /** \brief Returns a vector of copies of the custom metadata keys.
   *
   * @param allocator to allocate memory for the copy of the string returned
   * @return a instance std::vector of smart pointers that would deallocate the buffers when out of scope.
   *  The OrtAllocator instance must be valid at the point of memory release.
   */

  /** \brief Looks up a value by a key in the Custom Metadata map
   *
   * @param key zero terminated string key to lookup
   * @param allocator to allocate memory for the copy of the string returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  maybe nullptr if key is not found.
   *
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::ModelMetadataLookupCustomMetadataMap */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer LookupCustomMetadataMapAllocated(@Cast("const char*") BytePointer key, OrtAllocator allocator);
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer LookupCustomMetadataMapAllocated(String key, OrtAllocator allocator);

  /** Wraps OrtApi::ModelMetadataGetVersion */
  public native @Cast("int64_t") long GetVersion();
}
