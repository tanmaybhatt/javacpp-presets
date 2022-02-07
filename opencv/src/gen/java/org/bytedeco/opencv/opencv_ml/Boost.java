// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/****************************************************************************************\
*                                   Boosted tree classifier                              *
\****************************************************************************************/

/** \brief Boosted tree classifier derived from DTrees
<p>
@see \ref ml_intro_boost
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class Boost extends DTrees {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Boost(Pointer p) { super(p); }

    /** Type of the boosting algorithm.
    See Boost::Types. Default value is Boost::REAL. */
    /** @see setBoostType */
    public native int getBoostType();
    /** \copybrief getBoostType @see getBoostType */
    public native void setBoostType(int val);

    /** The number of weak classifiers.
    Default value is 100. */
    /** @see setWeakCount */
    public native int getWeakCount();
    /** \copybrief getWeakCount @see getWeakCount */
    public native void setWeakCount(int val);

    /** A threshold between 0 and 1 used to save computational time.
    Samples with summary weight {@code \leq 1 - weight_trim_rate} do not participate in the *next*
    iteration of training. Set this parameter to 0 to turn off this functionality. Default value is 0.95.*/
    /** @see setWeightTrimRate */
    public native double getWeightTrimRate();
    /** \copybrief getWeightTrimRate @see getWeightTrimRate */
    public native void setWeightTrimRate(double val);

    /** Boosting type.
    Gentle AdaBoost and Real AdaBoost are often the preferable choices. */
    /** enum cv::ml::Boost::Types */
    public static final int
        /** Discrete AdaBoost. */
        DISCRETE = 0,
        /** Real AdaBoost. It is a technique that utilizes confidence-rated predictions
 *  and works well with categorical data. */
        REAL = 1,
        /** LogitBoost. It can produce good regression fits. */
        LOGIT = 2,
        /** Gentle AdaBoost. It puts less weight on outlier data points and for that
 * reason is often good with regression data. */
        GENTLE = 3;

    /** Creates the empty model.
    Use StatModel::train to train the model, Algorithm::load\<Boost\>(filename) to load the pre-trained model. */
    public static native @Ptr Boost create();

    /** \brief Loads and creates a serialized Boost from a file
     *
     * Use Boost::save to serialize and store an RTree to disk.
     * Load the Boost from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized Boost
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr Boost load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr Boost load(@Str BytePointer filepath);
    public static native @Ptr Boost load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr Boost load(@Str String filepath);
}
