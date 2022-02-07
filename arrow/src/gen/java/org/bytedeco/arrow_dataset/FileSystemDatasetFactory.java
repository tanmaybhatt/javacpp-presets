// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief FileSystemDatasetFactory creates a Dataset from a vector of
 *  fs::FileInfo or a fs::FileSelector.
 *  \ingroup dataset-filesystem */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSystemDatasetFactory extends DatasetFactory {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemDatasetFactory(Pointer p) { super(p); }

  /** \brief Build a FileSystemDatasetFactory from an explicit list of
   *  paths.
   * 
   *  @param filesystem [in] passed to FileSystemDataset
   *  @param paths [in] passed to FileSystemDataset
   *  @param format [in] passed to FileSystemDataset
   *  @param options [in] see FileSystemFactoryOptions for more information. */
  
  ///
  ///
  public static native @ByVal DatasetFactoryResult Make(
        @SharedPtr FileSystem filesystem, @Const @ByRef StringVector paths,
        @SharedPtr FileFormat format, @ByVal FileSystemFactoryOptions options);

  /** \brief Build a FileSystemDatasetFactory from a fs::FileSelector.
   * 
   *  The selector will expand to a vector of FileInfo. The expansion/crawling
   *  is performed in this function call. Thus, the finalized Dataset is
   *  working with a snapshot of the filesystem. */
  //
  /** If options.partition_base_dir is not provided, it will be overwritten
  /** with selector.base_dir.
  /**
  /** @param filesystem [in] passed to FileSystemDataset
  /** @param selector [in] used to crawl and search files
  /** @param format [in] passed to FileSystemDataset
  /** @param options [in] see FileSystemFactoryOptions for more information. */
  
  ///
  public static native @ByVal DatasetFactoryResult Make(
        @SharedPtr FileSystem filesystem, @ByVal FileSelector selector,
        @SharedPtr FileFormat format, @ByVal FileSystemFactoryOptions options);

  /** \brief Build a FileSystemDatasetFactory from an uri including filesystem
   *  information.
   * 
   *  @param uri [in] passed to FileSystemDataset
   *  @param format [in] passed to FileSystemDataset
   *  @param options [in] see FileSystemFactoryOptions for more information. */
  
  ///
  public static native @ByVal DatasetFactoryResult Make(@StdString String uri,
                                                        @SharedPtr FileFormat format,
                                                        @ByVal FileSystemFactoryOptions options);
  public static native @ByVal DatasetFactoryResult Make(@StdString BytePointer uri,
                                                        @SharedPtr FileFormat format,
                                                        @ByVal FileSystemFactoryOptions options);

  /** \brief Build a FileSystemDatasetFactory from an explicit list of
   *  file information.
   * 
   *  @param filesystem [in] passed to FileSystemDataset
   *  @param files [in] passed to FileSystemDataset
   *  @param format [in] passed to FileSystemDataset
   *  @param options [in] see FileSystemFactoryOptions for more information. */
  public static native @ByVal DatasetFactoryResult Make(
        @SharedPtr FileSystem filesystem, @Const @ByRef FileInfoVector files,
        @SharedPtr FileFormat format, @ByVal FileSystemFactoryOptions options);

  public native @ByVal SchemaVectorResult InspectSchemas(
        @ByVal InspectOptions options);

  public native @ByVal DatasetResult Finish(@ByVal FinishOptions options);
}
