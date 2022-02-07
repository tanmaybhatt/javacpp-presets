// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::variant<torch::enumtype::kNearest,torch::enumtype::kLinear,torch::enumtype::kBilinear,torch::enumtype::kBicubic,torch::enumtype::kTrilinear>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class upsample_mode_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public upsample_mode_t(Pointer p) { super(p); }
    public upsample_mode_t(kNearest value) { this(); put(value); }
    public upsample_mode_t(kLinear value) { this(); put(value); }
    public upsample_mode_t(kBilinear value) { this(); put(value); }
    public upsample_mode_t(kBicubic value) { this(); put(value); }
    public upsample_mode_t(kTrilinear value) { this(); put(value); }
    public upsample_mode_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef upsample_mode_t put(@ByRef upsample_mode_t x);

    public @ByRef kNearest get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kNearest get0(@ByRef upsample_mode_t container);
    @ValueSetter public native upsample_mode_t put(@ByRef kNearest value);
    public @ByRef kLinear get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kLinear get1(@ByRef upsample_mode_t container);
    @ValueSetter public native upsample_mode_t put(@ByRef kLinear value);
    public @ByRef kBilinear get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kBilinear get2(@ByRef upsample_mode_t container);
    @ValueSetter public native upsample_mode_t put(@ByRef kBilinear value);
    public @ByRef kBicubic get3() { return get3(this); }
    @Namespace @Name("c10::get<3>") public static native @ByRef kBicubic get3(@ByRef upsample_mode_t container);
    @ValueSetter public native upsample_mode_t put(@ByRef kBicubic value);
    public @ByRef kTrilinear get4() { return get4(this); }
    @Namespace @Name("c10::get<4>") public static native @ByRef kTrilinear get4(@ByRef upsample_mode_t container);
    @ValueSetter public native upsample_mode_t put(@ByRef kTrilinear value);
}

