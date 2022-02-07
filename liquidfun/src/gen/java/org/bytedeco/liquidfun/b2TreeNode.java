// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A node in the dynamic tree. The client does not interact with this directly. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2TreeNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2TreeNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2TreeNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2TreeNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2TreeNode position(long position) {
        return (b2TreeNode)super.position(position);
    }
    @Override public b2TreeNode getPointer(long i) {
        return new b2TreeNode((Pointer)this).offsetAddress(i);
    }

	public native @Cast("bool") boolean IsLeaf();

	/** Enlarged AABB */
	public native @ByRef b2AABB aabb(); public native b2TreeNode aabb(b2AABB setter);

	public native Pointer userData(); public native b2TreeNode userData(Pointer setter);
		public native @Cast("int32") int parent(); public native b2TreeNode parent(int setter);
		public native @Cast("int32") int next(); public native b2TreeNode next(int setter);

	public native @Cast("int32") int child1(); public native b2TreeNode child1(int setter);
	public native @Cast("int32") int child2(); public native b2TreeNode child2(int setter);

	// leaf = 0, free node = -1
	public native @Cast("int32") int height(); public native b2TreeNode height(int setter);
}
