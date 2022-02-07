// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/** \} core_basic
<p>
///////////////////////// raster image moments //////////////////////////
 <p>
 *  \addtogroup imgproc_shape
 *  \{
<p>
/** \brief struct returned by cv::moments
<p>
The spatial moments {@code \texttt{Moments::m}_{ji}} are computed as:
<p>
<pre>{@code \[\texttt{m} _{ji}= \sum _{x,y}  \left ( \texttt{array} (x,y)  \cdot x^j  \cdot y^i \right )\]}</pre>
<p>
The central moments {@code \texttt{Moments::mu}_{ji}} are computed as:
<p>
<pre>{@code \[\texttt{mu} _{ji}= \sum _{x,y}  \left ( \texttt{array} (x,y)  \cdot (x -  \bar{x} )^j  \cdot (y -  \bar{y} )^i \right )\]}</pre>
<p>
where {@code (\bar{x}, \bar{y})} is the mass center:
<p>
<pre>{@code \[\bar{x} = \frac{\texttt{m}_{10}}{\texttt{m}_{00}} , \; \bar{y} = \frac{\texttt{m}_{01}}{\texttt{m}_{00}}\]}</pre>
<p>
The normalized central moments {@code \texttt{Moments::nu}_{ij}} are computed as:
<p>
<pre>{@code \[\texttt{nu} _{ji}= \frac{\texttt{mu}_{ji}}{\texttt{m}_{00}^{(i+j)/2+1}} .\]}</pre>
<p>
\note
{@code \texttt{mu}_{00}=\texttt{m}_{00}}, {@code \texttt{nu}_{00}=1}
{@code \texttt{nu}_{10}=\texttt{mu}_{10}=\texttt{mu}_{01}=\texttt{mu}_{10}=0} , hence the values are not
stored.
<p>
The moments of a contour are defined in the same way but computed using the Green's formula (see
<http://en.wikipedia.org/wiki/Green_theorem>). So, due to a limited raster resolution, the moments
computed for a contour are slightly different from the moments computed for the same rasterized
contour.
<p>
\note
Since the contour moments are computed using Green formula, you may get seemingly odd results for
contours with self-intersections, e.g. a zero area (m00) for butterfly-shaped contours.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Moments extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Moments(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Moments(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Moments position(long position) {
        return (Moments)super.position(position);
    }
    @Override public Moments getPointer(long i) {
        return new Moments((Pointer)this).offsetAddress(i);
    }

    /** the default constructor */
    public Moments() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor */
    public Moments(double m00, double m10, double m01, double m20, double m11,
                double m02, double m30, double m21, double m12, double m03 ) { super((Pointer)null); allocate(m00, m10, m01, m20, m11, m02, m30, m21, m12, m03); }
    private native void allocate(double m00, double m10, double m01, double m20, double m11,
                double m02, double m30, double m21, double m12, double m03 );
    ////! the conversion from CvMoments
    //Moments( const CvMoments& moments );
    ////! the conversion to CvMoments
    //operator CvMoments() const;

    /** \name spatial moments
     *  \{ */
    public native double m00(); public native Moments m00(double setter);
    public native double m10(); public native Moments m10(double setter);
    public native double m01(); public native Moments m01(double setter);
    public native double m20(); public native Moments m20(double setter);
    public native double m11(); public native Moments m11(double setter);
    public native double m02(); public native Moments m02(double setter);
    public native double m30(); public native Moments m30(double setter);
    public native double m21(); public native Moments m21(double setter);
    public native double m12(); public native Moments m12(double setter);
    public native double m03(); public native Moments m03(double setter);
    /** \}
     <p>
     *  \name central moments
     *  \{ */
    public native double mu20(); public native Moments mu20(double setter);
    public native double mu11(); public native Moments mu11(double setter);
    public native double mu02(); public native Moments mu02(double setter);
    public native double mu30(); public native Moments mu30(double setter);
    public native double mu21(); public native Moments mu21(double setter);
    public native double mu12(); public native Moments mu12(double setter);
    public native double mu03(); public native Moments mu03(double setter);
    /** \}
     <p>
     *  \name central normalized moments
     *  \{ */
    public native double nu20(); public native Moments nu20(double setter);
    public native double nu11(); public native Moments nu11(double setter);
    public native double nu02(); public native Moments nu02(double setter);
    public native double nu30(); public native Moments nu30(double setter);
    public native double nu21(); public native Moments nu21(double setter);
    public native double nu12(); public native Moments nu12(double setter);
    public native double nu03(); public native Moments nu03(double setter);
    /** \} */
}
