// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_nonsymmv_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_nonsymmv_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_nonsymmv_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_nonsymmv_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_nonsymmv_workspace position(long position) {
        return (gsl_eigen_nonsymmv_workspace)super.position(position);
    }
    @Override public gsl_eigen_nonsymmv_workspace getPointer(long i) {
        return new gsl_eigen_nonsymmv_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_nonsymmv_workspace size(long setter);                 /* size of matrices */
  public native gsl_vector work(); public native gsl_eigen_nonsymmv_workspace work(gsl_vector setter);            /* scratch workspace */
  public native gsl_vector work2(); public native gsl_eigen_nonsymmv_workspace work2(gsl_vector setter);           /* scratch workspace */
  public native gsl_vector work3(); public native gsl_eigen_nonsymmv_workspace work3(gsl_vector setter);           /* scratch workspace */

  public native gsl_matrix Z(); public native gsl_eigen_nonsymmv_workspace Z(gsl_matrix setter);               /* pointer to Schur vectors */

  public native gsl_eigen_nonsymm_workspace nonsymm_workspace_p(); public native gsl_eigen_nonsymmv_workspace nonsymm_workspace_p(gsl_eigen_nonsymm_workspace setter);
}
