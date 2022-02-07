// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


// Delegate of b2World.
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactManager extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactManager(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactManager(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2ContactManager position(long position) {
        return (b2ContactManager)super.position(position);
    }
    @Override public b2ContactManager getPointer(long i) {
        return new b2ContactManager((Pointer)this).offsetAddress(i);
    }


	public b2ContactManager() { super((Pointer)null); allocate(); }
	private native void allocate();

	// Broad-phase callback.
	public native void AddPair(Pointer proxyUserDataA, Pointer proxyUserDataB);

	public native void FindNewContacts();

	public native void Destroy(b2Contact c);

	public native void Collide();
            
	public native @ByRef b2BroadPhase m_broadPhase(); public native b2ContactManager m_broadPhase(b2BroadPhase setter);
	public native b2Contact m_contactList(); public native b2ContactManager m_contactList(b2Contact setter);
	public native @Cast("int32") int m_contactCount(); public native b2ContactManager m_contactCount(int setter);
	public native b2ContactFilter m_contactFilter(); public native b2ContactManager m_contactFilter(b2ContactFilter setter);
	public native b2ContactListener m_contactListener(); public native b2ContactManager m_contactListener(b2ContactListener setter);
	public native b2BlockAllocator m_allocator(); public native b2ContactManager m_allocator(b2BlockAllocator setter);
}
