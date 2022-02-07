// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VNetworkDefinition extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VNetworkDefinition(Pointer p) { super(p); }

    public native @NoException(true) ITensor addInput(String name, DataType type, @ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);
    public native @NoException(true) ITensor addInput(@Cast("const char*") BytePointer name, @Cast("nvinfer1::DataType") int type, @ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);
    public native @NoException(true) void markOutput(@ByRef ITensor tensor);
    public native @NoException(true) IConvolutionLayer addConvolution(
            @ByRef ITensor input, int nbOutputMaps, @ByVal DimsHW kernelSize, @ByVal Weights kernelWeights, @ByVal Weights biasWeights);
    public native @NoException(true) IFullyConnectedLayer addFullyConnected(
            @ByRef ITensor input, int nbOutputs, @ByVal Weights kernelWeights, @ByVal Weights biasWeights);
    public native @NoException(true) IActivationLayer addActivation(@ByRef ITensor input, ActivationType type);
    public native @NoException(true) IActivationLayer addActivation(@ByRef ITensor input, @Cast("nvinfer1::ActivationType") int type);
    public native @NoException(true) IPoolingLayer addPooling(@ByRef ITensor input, PoolingType type, @ByVal DimsHW windowSize);
    public native @NoException(true) IPoolingLayer addPooling(@ByRef ITensor input, @Cast("nvinfer1::PoolingType") int type, @ByVal DimsHW windowSize);
    public native @NoException(true) ILRNLayer addLRN(@ByRef ITensor input, int window, float alpha, float beta, float k);
    public native @NoException(true) IScaleLayer addScale(@ByRef ITensor input, ScaleMode mode, @ByVal Weights shift, @ByVal Weights scale, @ByVal Weights power);
    public native @NoException(true) IScaleLayer addScale(@ByRef ITensor input, @Cast("nvinfer1::ScaleMode") int mode, @ByVal Weights shift, @ByVal Weights scale, @ByVal Weights power);
    public native @NoException(true) ISoftMaxLayer addSoftMax(@ByRef ITensor input);
    public native @NoException(true) IConcatenationLayer addConcatenation(@Cast("nvinfer1::ITensor*const*") PointerPointer inputs, int nbInputs);
    public native @NoException(true) IConcatenationLayer addConcatenation(@ByPtrPtr ITensor inputs, int nbInputs);
    public native @NoException(true) IDeconvolutionLayer addDeconvolution(
            @ByRef ITensor input, int nbOutputMaps, @ByVal DimsHW kernelSize, @ByVal Weights kernelWeights, @ByVal Weights biasWeights);
    public native @NoException(true) IElementWiseLayer addElementWise(@ByRef ITensor input1, @ByRef ITensor input2, ElementWiseOperation op);
    public native @NoException(true) IElementWiseLayer addElementWise(@ByRef ITensor input1, @ByRef ITensor input2, @Cast("nvinfer1::ElementWiseOperation") int op);
    public native @NoException(true) IUnaryLayer addUnary(@ByRef ITensor input, UnaryOperation operation);
    public native @NoException(true) IUnaryLayer addUnary(@ByRef ITensor input, @Cast("nvinfer1::UnaryOperation") int operation);
    public native @NoException(true) IPaddingLayer addPadding(@ByRef ITensor input, @ByVal DimsHW prePadding, @ByVal DimsHW postPadding);
    public native @NoException(true) IShuffleLayer addShuffle(@ByRef ITensor input);
    public native @NoException(true) int getNbLayers();
    public native @NoException(true) ILayer getLayer(int index);
    public native @NoException(true) int getNbInputs();
    public native @NoException(true) ITensor getInput(int index);
    public native @NoException(true) int getNbOutputs();
    public native @NoException(true) ITensor getOutput(int index);
    public native @NoException(true) IReduceLayer addReduce(
            @ByRef ITensor input, ReduceOperation operation, @Cast("uint32_t") int reduceAxes, @Cast("bool") boolean keepDimensions);
    public native @NoException(true) IReduceLayer addReduce(
            @ByRef ITensor input, @Cast("nvinfer1::ReduceOperation") int operation, @Cast("uint32_t") int reduceAxes, @Cast("bool") boolean keepDimensions);
    public native @NoException(true) ITopKLayer addTopK(@ByRef ITensor input, TopKOperation op, int k, @Cast("uint32_t") int reduceAxes);
    public native @NoException(true) ITopKLayer addTopK(@ByRef ITensor input, @Cast("nvinfer1::TopKOperation") int op, int k, @Cast("uint32_t") int reduceAxes);
    public native @NoException(true) IGatherLayer addGather(@ByRef ITensor data, @ByRef ITensor indices, int axis);
    public native @NoException(true) IRaggedSoftMaxLayer addRaggedSoftMax(@ByRef ITensor input, @ByRef ITensor bounds);
    public native @NoException(true) IMatrixMultiplyLayer addMatrixMultiply(
            @ByRef ITensor input0, MatrixOperation op0, @ByRef ITensor input1, MatrixOperation op1);
    public native @NoException(true) IMatrixMultiplyLayer addMatrixMultiply(
            @ByRef ITensor input0, @Cast("nvinfer1::MatrixOperation") int op0, @ByRef ITensor input1, @Cast("nvinfer1::MatrixOperation") int op1);
    public native @NoException(true) IConstantLayer addConstant(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions, @ByVal Weights weights);
    public native @NoException(true) IRNNv2Layer addRNNv2(
            @ByRef ITensor input, int layerCount, int hiddenSize, int maxSeqLen, RNNOperation op);
    public native @NoException(true) IRNNv2Layer addRNNv2(
            @ByRef ITensor input, int layerCount, int hiddenSize, int maxSeqLen, @Cast("nvinfer1::RNNOperation") int op);
    public native @NoException(true) IIdentityLayer addIdentity(@ByRef ITensor input);
    public native @NoException(true) void removeTensor(@ByRef ITensor tensor);
    public native @NoException(true) void unmarkOutput(@ByRef ITensor tensor);
    public native @NoException(true) IPluginV2Layer addPluginV2(@Cast("nvinfer1::ITensor*const*") PointerPointer inputs, int nbInputs, @ByRef IPluginV2 plugin);
    public native @NoException(true) IPluginV2Layer addPluginV2(@ByPtrPtr ITensor inputs, int nbInputs, @ByRef IPluginV2 plugin);
    public native @NoException(true) ISliceLayer addSlice(@ByRef ITensor input, @ByVal @Cast("nvinfer1::Dims*") Dims32 start, @ByVal @Cast("nvinfer1::Dims*") Dims32 size, @ByVal @Cast("nvinfer1::Dims*") Dims32 stride);
    public native @NoException(true) void setName(String name);
    public native @NoException(true) void setName(@Cast("const char*") BytePointer name);
    public native @NoException(true) String getName();
    public native @NoException(true) IShapeLayer addShape(@ByRef ITensor input);
    public native @Cast("bool") @NoException(true) boolean hasImplicitBatchDimension();
    public native @Cast("bool") @NoException(true) boolean markOutputForShapes(@ByRef ITensor tensor);
    public native @Cast("bool") @NoException(true) boolean unmarkOutputForShapes(@ByRef ITensor tensor);
    public native @NoException(true) IParametricReLULayer addParametricReLU(@ByRef ITensor input, @ByRef ITensor slope);
    public native @NoException(true) IConvolutionLayer addConvolutionNd(
            @ByRef ITensor input, int nbOutputMaps, @ByVal @Cast("nvinfer1::Dims*") Dims32 kernelSize, @ByVal Weights kernelWeights, @ByVal Weights biasWeights);
    public native @NoException(true) IPoolingLayer addPoolingNd(@ByRef ITensor input, PoolingType type, @ByVal @Cast("nvinfer1::Dims*") Dims32 windowSize);
    public native @NoException(true) IPoolingLayer addPoolingNd(@ByRef ITensor input, @Cast("nvinfer1::PoolingType") int type, @ByVal @Cast("nvinfer1::Dims*") Dims32 windowSize);
    public native @NoException(true) IDeconvolutionLayer addDeconvolutionNd(
            @ByRef ITensor input, int nbOutputMaps, @ByVal @Cast("nvinfer1::Dims*") Dims32 kernelSize, @ByVal Weights kernelWeights, @ByVal Weights biasWeights);
    public native @NoException(true) IScaleLayer addScaleNd(
            @ByRef ITensor input, ScaleMode mode, @ByVal Weights shift, @ByVal Weights scale, @ByVal Weights power, int channelAxis);
    public native @NoException(true) IScaleLayer addScaleNd(
            @ByRef ITensor input, @Cast("nvinfer1::ScaleMode") int mode, @ByVal Weights shift, @ByVal Weights scale, @ByVal Weights power, int channelAxis);
    public native @NoException(true) IResizeLayer addResize(@ByRef ITensor input);
    public native @Cast("bool") @NoException(true) boolean hasExplicitPrecision();
    public native @NoException(true) ILoop addLoop();
    public native @NoException(true) ISelectLayer addSelect(@ByRef ITensor condition, @ByRef ITensor thenInput, @ByRef ITensor elseInput);
    public native @NoException(true) IFillLayer addFill(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions, FillOperation op);
    public native @NoException(true) IFillLayer addFill(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions, @Cast("nvinfer1::FillOperation") int op);
    public native @NoException(true) IPaddingLayer addPaddingNd(@ByRef ITensor input, @ByVal @Cast("nvinfer1::Dims*") Dims32 prePadding, @ByVal @Cast("nvinfer1::Dims*") Dims32 postPadding);
    public native @Cast("bool") @NoException(true) boolean setWeightsName(@ByVal Weights weights, String name);
    public native @Cast("bool") @NoException(true) boolean setWeightsName(@ByVal Weights weights, @Cast("const char*") BytePointer name);
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);
    public native @NoException(true) IErrorRecorder getErrorRecorder();
    public native @NoException(true) IDequantizeLayer addDequantize(@ByRef ITensor input, @ByRef ITensor scale);
    public native @NoException(true) IQuantizeLayer addQuantize(@ByRef ITensor input, @ByRef ITensor scale);
    public native @NoException(true) IGatherLayer addGatherV2(@ByRef ITensor data, @ByRef ITensor indices, GatherMode mode);
    public native @NoException(true) IGatherLayer addGatherV2(@ByRef ITensor data, @ByRef ITensor indices, @Cast("nvinfer1::GatherMode") int mode);
    public native @NoException(true) IIfConditional addIfConditional();
    public native @NoException(true) IScatterLayer addScatter(@ByRef ITensor data, @ByRef ITensor indices, @ByRef ITensor updates, ScatterMode mode);
    public native @NoException(true) IScatterLayer addScatter(@ByRef ITensor data, @ByRef ITensor indices, @ByRef ITensor updates, @Cast("nvinfer1::ScatterMode") int mode);
    public native @NoException(true) IEinsumLayer addEinsum(@Cast("nvinfer1::ITensor*const*") PointerPointer inputs, int nbInputs, String equation);
    public native @NoException(true) IEinsumLayer addEinsum(@ByPtrPtr ITensor inputs, int nbInputs, String equation);
    public native @NoException(true) IEinsumLayer addEinsum(@ByPtrPtr ITensor inputs, int nbInputs, @Cast("const char*") BytePointer equation);
    public native @NoException(true) IAssertionLayer addAssertion(@ByRef ITensor condition, String message);
    public native @NoException(true) IAssertionLayer addAssertion(@ByRef ITensor condition, @Cast("const char*") BytePointer message);
}
