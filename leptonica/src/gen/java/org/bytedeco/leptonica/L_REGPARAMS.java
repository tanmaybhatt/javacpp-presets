// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/**
 * \file regutils.h
 *
 * <pre>
 *   Contains this regression test parameter packaging struct
 *       struct L_RegParams
 *
 *   The regression test utility allows you to write regression tests
 *   that compare results with existing "golden files" and with
 *   compiled in data.
 *
 *   Regression tests can be called in three ways.
 *   For example, for distance_reg:
 *
 *       Case 1: distance_reg [compare]
 *           This runs the test against the set of golden files.  It
 *           appends to 'outfile.txt' either "SUCCESS" or "FAILURE",
 *           as well as the details of any parts of the test that failed.
 *           It writes to a temporary file stream (fp).
 *           Using 'compare' on the command line is optional.
 *
 *       Case 2: distance_reg generate
 *           This generates golden files in /tmp for the reg test.
 *
 *       Case 3: distance_reg display
 *           This runs the test but makes no comparison of the output
 *           against the set of golden files.  In addition, this displays
 *           images and plots that are specified in the test under
 *           control of the display variable.  Display is enabled only
 *           for this case.
 *
 *   Regression tests follow the pattern given below.  Tests are
 *   automatically numbered sequentially, and it is convenient to
 *   comment each with a number to keep track (for comparison tests
 *   and for debugging).  In an actual case, comparisons of pix and
 *   of files can occur in any order.  We give a specific order here
 *   for clarity.
 *
 *       L_REGPARAMS  *rp;  // holds data required by the test functions
 *
 *       // Setup variables; optionally open stream
 *       if (regTestSetup(argc, argv, &rp))
 *           return 1;
 *
 *       // Test pairs of generated pix for identity.  This compares
 *       // two pix; no golden file is generated.
 *       regTestComparePix(rp, pix1, pix2);  // 0
 *
 *       // Test pairs of generated pix for similarity.  This compares
 *       // two pix; no golden file is generated.  The last arg determines
 *       // if stats are to be written to stderr.
 *       regTestCompareSimilarPix(rp, pix1, pix2, 15, 0.001, 0);  // 1
 *
 *       // Generation of <newfile*> outputs and testing for identity
 *       // These files can be anything, of course.
 *       regTestCheckFile(rp, <newfile0>);  // 2
 *       regTestCheckFile(rp, <newfile1>);  // 3
 *
 *       // Test pairs of output golden files for identity.  Here we
 *       // are comparing golden files 2 and 3.
 *       regTestCompareFiles(rp, 2, 3);  // 4
 *
 *       // "Write and check".  This writes a pix using a canonical
 *       // formulation for the local filename and either:
 *       //     case 1: generates a golden file
 *       //     case 2: compares the local file with a golden file
 *       //     case 3: generates local files and displays
 *       // Here we write the pix compressed with png and jpeg, respectively;
 *       // Then check against the golden file.  The internal %index
 *       // is incremented; it is embedded in the local filename and,
 *       // if generating, in the golden file as well.
 *       regTestWritePixAndCheck(rp, pix1, IFF_PNG);  // 5
 *       regTestWritePixAndCheck(rp, pix2, IFF_JFIF_JPEG);  // 6
 *
 *       // Display if reg test was called in 'display' mode
 *       pixDisplayWithTitle(pix1, 100, 100, NULL, rp->display);
 *
 *       // Clean up and output result
 *       regTestCleanup(rp);
 * </pre>
 */

/*----------------------------------------------------------------------------*
 *                      Regression test parameter packer                      *
 *----------------------------------------------------------------------------*/

/** Regression test parameter packer */
@Name("L_RegParams") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_REGPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_REGPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_REGPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_REGPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_REGPARAMS position(long position) {
        return (L_REGPARAMS)super.position(position);
    }
    @Override public L_REGPARAMS getPointer(long i) {
        return new L_REGPARAMS((Pointer)this).offsetAddress(i);
    }

    /** stream to temporary output file for compare mode */
    public native @Cast("FILE*") Pointer fp(); public native L_REGPARAMS fp(Pointer setter);
    /** name of test, without '_reg'                     */
    public native @Cast("char*") BytePointer testname(); public native L_REGPARAMS testname(BytePointer setter);
    /** name of temp file for compare mode output        */
    public native @Cast("char*") BytePointer tempfile(); public native L_REGPARAMS tempfile(BytePointer setter);
    /** generate, compare or display                     */
    public native @Cast("l_int32") int mode(); public native L_REGPARAMS mode(int setter);
    /** index into saved files for this test; 0-based    */
    public native @Cast("l_int32") int index(); public native L_REGPARAMS index(int setter);
    /** overall result of the test                       */
    public native @Cast("l_int32") int success(); public native L_REGPARAMS success(int setter);
    /** 1 if in display mode; 0 otherwise                */
    public native @Cast("l_int32") int display(); public native L_REGPARAMS display(int setter);
    /** marks beginning of the reg test                  */
    public native L_TIMER tstart(); public native L_REGPARAMS tstart(L_TIMER setter);
}
