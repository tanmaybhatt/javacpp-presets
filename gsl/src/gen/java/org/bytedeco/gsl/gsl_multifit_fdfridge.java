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
public class gsl_multifit_fdfridge extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multifit_fdfridge() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multifit_fdfridge(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multifit_fdfridge(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multifit_fdfridge position(long position) {
        return (gsl_multifit_fdfridge)super.position(position);
    }
    @Override public gsl_multifit_fdfridge getPointer(long i) {
        return new gsl_multifit_fdfridge((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long n(); public native gsl_multifit_fdfridge n(long setter);                         /* number of (original) residuals */
  public native @Cast("size_t") long p(); public native gsl_multifit_fdfridge p(long setter);                         /* number of model parameters */
  public native double lambda(); public native gsl_multifit_fdfridge lambda(double setter);                    /* damping parameter */
  public native @Const gsl_vector L_diag(); public native gsl_multifit_fdfridge L_diag(gsl_vector setter);         /* diagonal damping matrix or NULL */
  public native @Const gsl_matrix L(); public native gsl_multifit_fdfridge L(gsl_matrix setter);              /* general damping matrix or NULL */
  public native gsl_vector f(); public native gsl_multifit_fdfridge f(gsl_vector setter);                    /* function values for finite diff J */
  public native gsl_vector wts(); public native gsl_multifit_fdfridge wts(gsl_vector setter);                  /* weight vector for augmented system */
  public native gsl_multifit_fdfsolver s(); public native gsl_multifit_fdfridge s(gsl_multifit_fdfsolver setter);
  public native gsl_multifit_function_fdf fdf(); public native gsl_multifit_fdfridge fdf(gsl_multifit_function_fdf setter);   /* user defined fdf */
  public native @ByRef gsl_multifit_function_fdf fdftik(); public native gsl_multifit_fdfridge fdftik(gsl_multifit_function_fdf setter); /* Tikhonov modified fdf */
}
