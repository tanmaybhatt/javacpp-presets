// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libffi.global;

import org.bytedeco.libffi.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

public class ffi extends org.bytedeco.libffi.presets.ffi {
    static { Loader.load(); }

// Parsed from ffitarget.h

/* -----------------------------------------------------------------*-C-*-
   ffitarget.h - Copyright (c) 2012, 2014, 2018  Anthony Green
                 Copyright (c) 1996-2003, 2010  Red Hat, Inc.
                 Copyright (C) 2008  Free Software Foundation, Inc.

   Target configuration macros for x86 and x86-64.

   Permission is hereby granted, free of charge, to any person obtaining
   a copy of this software and associated documentation files (the
   ``Software''), to deal in the Software without restriction, including
   without limitation the rights to use, copy, modify, merge, publish,
   distribute, sublicense, and/or sell copies of the Software, and to
   permit persons to whom the Software is furnished to do so, subject to
   the following conditions:

   The above copyright notice and this permission notice shall be included
   in all copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED ``AS IS'', WITHOUT WARRANTY OF ANY KIND,
   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
   NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
   HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
   WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
   DEALINGS IN THE SOFTWARE.

   ----------------------------------------------------------------------- */

// #ifndef LIBFFI_TARGET_H
// #define LIBFFI_TARGET_H

// #ifndef LIBFFI_H
// #error "Please do not include ffitarget.h directly into your source.  Use ffi.h instead."
// #endif

/* ---- System specific configurations ----------------------------------- */

/* For code common to all platforms on x86 and x86_64. */
// #define X86_ANY

// #if defined (X86_64) && defined (__i386__)
// #undef X86_64
// #define X86
// #endif

// #ifdef X86_WIN64
// #endif

// #define FFI_TARGET_SPECIFIC_STACK_SPACE_ALLOCATION
// #ifndef _MSC_VER
// #define FFI_TARGET_HAS_COMPLEX_TYPE
// #endif

/* ---- Generic type definitions ----------------------------------------- */

// #ifndef LIBFFI_ASM
// #ifdef X86_WIN64
// #else
// #if defined __x86_64__ && defined __ILP32__
// #else
// #endif
// #endif

/** enum ffi_abi */
public static final int
// #if defined(X86_WIN64)  

// #elif defined(X86_64) || (defined (__x86_64__) && defined (X86_DARWIN))

// #elif defined(X86_WIN32)
// #else
  FFI_FIRST_ABI = 0,
  FFI_SYSV      = 1,
  FFI_THISCALL  = 3,
  FFI_FASTCALL  = 4,
  FFI_STDCALL   = 5,
  FFI_PASCAL    = 6,
  FFI_REGISTER  = 7,
  FFI_MS_CDECL  = 8,
  FFI_LAST_ABI = 9,
  FFI_DEFAULT_ABI = FFI_SYSV;
// #endif
// #endif

/* ---- Definitions for closures ----------------------------------------- */

public static final int FFI_CLOSURES = 1;
public static final int FFI_GO_CLOSURES = 1;

public static native @MemberGetter int FFI_TYPE_SMALL_STRUCT_1B();
public static final int FFI_TYPE_SMALL_STRUCT_1B = FFI_TYPE_SMALL_STRUCT_1B();
public static native @MemberGetter int FFI_TYPE_SMALL_STRUCT_2B();
public static final int FFI_TYPE_SMALL_STRUCT_2B = FFI_TYPE_SMALL_STRUCT_2B();
public static native @MemberGetter int FFI_TYPE_SMALL_STRUCT_4B();
public static final int FFI_TYPE_SMALL_STRUCT_4B = FFI_TYPE_SMALL_STRUCT_4B();
public static native @MemberGetter int FFI_TYPE_MS_STRUCT();
public static final int FFI_TYPE_MS_STRUCT = FFI_TYPE_MS_STRUCT();

// #if defined (X86_64) || defined(X86_WIN64)
//     || (defined (__x86_64__) && defined (X86_DARWIN))
/* 4 bytes of ENDBR64 + 7 bytes of LEA + 6 bytes of JMP + 7 bytes of NOP
   + 8 bytes of pointer.  */
public static native @MemberGetter int FFI_TRAMPOLINE_SIZE();
public static final int FFI_TRAMPOLINE_SIZE = FFI_TRAMPOLINE_SIZE();
// # define FFI_NATIVE_RAW_API 0
// #else
/* 4 bytes of ENDBR32 + 5 bytes of MOV + 5 bytes of JMP + 2 unused
   bytes.  */
// # define FFI_NATIVE_RAW_API 1  /* x86 has native raw api support */
// #endif

// #if !defined(GENERATE_LIBFFI_MAP) && defined(__CET__)
// # include <cet.h>
// # if (__CET__ & 1) != 0
// #   define ENDBR_PRESENT
// # endif
// # define _CET_NOTRACK notrack
// #else
// # define _CET_ENDBR
// # define _CET_NOTRACK
// #endif

// #endif



// Parsed from ffi.h

/* -----------------------------------------------------------------*-C-*-
   libffi 3.4.2
     - Copyright (c) 2011, 2014, 2019, 2021 Anthony Green
     - Copyright (c) 1996-2003, 2007, 2008 Red Hat, Inc.

   Permission is hereby granted, free of charge, to any person
   obtaining a copy of this software and associated documentation
   files (the ``Software''), to deal in the Software without
   restriction, including without limitation the rights to use, copy,
   modify, merge, publish, distribute, sublicense, and/or sell copies
   of the Software, and to permit persons to whom the Software is
   furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be
   included in all copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED ``AS IS'', WITHOUT WARRANTY OF ANY KIND,
   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
   NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
   HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
   WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
   DEALINGS IN THE SOFTWARE.

   ----------------------------------------------------------------------- */

/* -------------------------------------------------------------------
   Most of the API is documented in doc/libffi.texi.

   The raw API is designed to bypass some of the argument packing and
   unpacking on architectures for which it can be avoided.  Routines
   are provided to emulate the raw API if the underlying platform
   doesn't allow faster implementation.

   More details on the raw API can be found in:

   http://gcc.gnu.org/ml/java/1999-q3/msg00138.html

   and

   http://gcc.gnu.org/ml/java/1999-q3/msg00174.html
   -------------------------------------------------------------------- */

// #ifndef LIBFFI_H
// #define LIBFFI_H

// #ifdef __cplusplus
// #endif

/* Specify which architecture libffi is configured for. */
// #ifndef X86_64
// #define X86_64
// #endif

/* ---- System configuration information --------------------------------- */

// #include <ffitarget.h>

// #ifndef LIBFFI_ASM

// #if defined(_MSC_VER) && !defined(__clang__)
// #define __attribute__(X)
// #endif

// #include <stddef.h>
// #include <limits.h>

/* LONG_LONG_MAX is not always defined (not if STRICT_ANSI, for example).
   But we can find it either under the correct ANSI name, or under GNU
   C's internal name.  */

public static final long FFI_64_BIT_MAX = 9223372036854775807L;

// #ifdef LONG_LONG_MAX
// # define FFI_LONG_LONG_MAX LONG_LONG_MAX
// Targeting ../ffi_type.java



/* Need minimal decorations for DLLs to work on Windows.  GCC has
   autoimport and autoexport.  Always mark externally visible symbols
   as dllimport for MSVC clients, even if it means an extra indirection
   when using the static version of the library.
   Besides, as a workaround, they can define FFI_BUILDING if they
   *know* they are going to link with the static library.  */
// #if defined _MSC_VER
// # if defined FFI_BUILDING_DLL /* Building libffi.DLL with msvcc.sh */
// #  define FFI_API __declspec(dllexport)
// # elif !defined FFI_BUILDING  /* Importing libffi.DLL */
// #  define FFI_API __declspec(dllimport)
// # else                        /* Building/linking static library */
// #  define FFI_API
// # endif
// #else
// # define FFI_API
// #endif

/* The externally visible type declarations also need the MSVC DLL
   decorations, or they will not be exported from the object file.  */
// #if defined LIBFFI_HIDE_BASIC_TYPES
// # define FFI_EXTERN FFI_API
// #else
// # define FFI_EXTERN extern FFI_API
// #endif

// #ifndef LIBFFI_HIDE_BASIC_TYPES
// #if SCHAR_MAX == 127
public static native @MemberGetter @ByVal ffi_type ffi_type_uchar();
public static final ffi_type ffi_type_uchar = ffi_type_uchar();
public static native @MemberGetter @ByVal ffi_type ffi_type_schar();
public static final ffi_type ffi_type_schar = ffi_type_schar();
// #else
//  #error "char size not supported"
// #endif

// #if SHRT_MAX == 32767
public static native @MemberGetter @ByVal ffi_type ffi_type_ushort();
public static final ffi_type ffi_type_ushort = ffi_type_ushort();
public static native @MemberGetter @ByVal ffi_type ffi_type_sshort();
public static final ffi_type ffi_type_sshort = ffi_type_sshort();
// #elif SHRT_MAX == 2147483647
// #else
//  #error "short size not supported"
// #endif

// #if INT_MAX == 32767
public static native @MemberGetter @ByVal ffi_type ffi_type_uint();
public static final ffi_type ffi_type_uint = ffi_type_uint();
public static native @MemberGetter @ByVal ffi_type ffi_type_sint();
public static final ffi_type ffi_type_sint = ffi_type_sint();
// #elif INT_MAX == 2147483647
// #elif INT_MAX == 9223372036854775807L
// #else
//  #error "int size not supported"
// #endif

// #if LONG_MAX == 2147483647
// # if FFI_LONG_LONG_MAX != FFI_64_BIT_MAX
//  #error "no 64-bit data type supported"
// # endif
// #elif LONG_MAX != FFI_64_BIT_MAX
//  #error "long size not supported"
// #endif

// #if LONG_MAX == 2147483647
public static native @MemberGetter @ByVal ffi_type ffi_type_ulong();
public static final ffi_type ffi_type_ulong = ffi_type_ulong();
public static native @MemberGetter @ByVal ffi_type ffi_type_slong();
public static final ffi_type ffi_type_slong = ffi_type_slong();
// #elif LONG_MAX == FFI_64_BIT_MAX
// #else
//  #error "long size not supported"
// #endif

/* These are defined in types.c.  */
public static native @ByRef ffi_type ffi_type_void(); public static native void ffi_type_void(ffi_type setter);
public static native @ByRef ffi_type ffi_type_uint8(); public static native void ffi_type_uint8(ffi_type setter);
public static native @ByRef ffi_type ffi_type_sint8(); public static native void ffi_type_sint8(ffi_type setter);
public static native @ByRef ffi_type ffi_type_uint16(); public static native void ffi_type_uint16(ffi_type setter);
public static native @ByRef ffi_type ffi_type_sint16(); public static native void ffi_type_sint16(ffi_type setter);
public static native @ByRef ffi_type ffi_type_uint32(); public static native void ffi_type_uint32(ffi_type setter);
public static native @ByRef ffi_type ffi_type_sint32(); public static native void ffi_type_sint32(ffi_type setter);
public static native @ByRef ffi_type ffi_type_uint64(); public static native void ffi_type_uint64(ffi_type setter);
public static native @ByRef ffi_type ffi_type_sint64(); public static native void ffi_type_sint64(ffi_type setter);
public static native @ByRef ffi_type ffi_type_float(); public static native void ffi_type_float(ffi_type setter);
public static native @ByRef ffi_type ffi_type_double(); public static native void ffi_type_double(ffi_type setter);
public static native @ByRef ffi_type ffi_type_pointer(); public static native void ffi_type_pointer(ffi_type setter);

// #if 1
public static native @ByRef ffi_type ffi_type_longdouble(); public static native void ffi_type_longdouble(ffi_type setter);
// #else
// #endif

// #ifdef FFI_TARGET_HAS_COMPLEX_TYPE
// #endif
// #endif /* LIBFFI_HIDE_BASIC_TYPES */

/** enum ffi_status */
public static final int
  FFI_OK = 0,
  FFI_BAD_TYPEDEF = 1,
  FFI_BAD_ABI = 2,
  FFI_BAD_ARGTYPE = 3;
// Targeting ../ffi_cif.java



/* ---- Definitions for the raw API -------------------------------------- */

// #ifndef FFI_SIZEOF_ARG
// # if LONG_MAX == 2147483647
public static native @MemberGetter int FFI_SIZEOF_ARG();
public static final int FFI_SIZEOF_ARG = FFI_SIZEOF_ARG();
// # elif LONG_MAX == FFI_64_BIT_MAX
// # endif
// #endif

// #ifndef FFI_SIZEOF_JAVA_RAW
public static native @MemberGetter int FFI_SIZEOF_JAVA_RAW();
public static final int FFI_SIZEOF_JAVA_RAW = FFI_SIZEOF_JAVA_RAW();
// Targeting ../ffi_raw.java


// Targeting ../ffi_java_raw.java


// #else
// #endif


public static native void ffi_raw_call(ffi_cif cif,
		   @Cast("void (*)(void)") Pointer fn,
		   Pointer rvalue,
		   ffi_raw avalue);

public static native void ffi_ptrarray_to_raw(ffi_cif cif, @Cast("void**") PointerPointer args, ffi_raw raw);
public static native void ffi_ptrarray_to_raw(ffi_cif cif, @Cast("void**") @ByPtrPtr Pointer args, ffi_raw raw);
public static native void ffi_raw_to_ptrarray(ffi_cif cif, ffi_raw raw, @Cast("void**") PointerPointer args);
public static native void ffi_raw_to_ptrarray(ffi_cif cif, ffi_raw raw, @Cast("void**") @ByPtrPtr Pointer args);
public static native @Cast("size_t") long ffi_raw_size(ffi_cif cif);

/* This is analogous to the raw API, except it uses Java parameter
   packing, even on 64-bit machines.  I.e. on 64-bit machines longs
   and doubles are followed by an empty 64-bit word.  */

// #if !FFI_NATIVE_RAW_API
// #endif

public static native @Deprecated void ffi_java_ptrarray_to_raw(ffi_cif cif, @Cast("void**") PointerPointer args, ffi_java_raw raw);
public static native @Deprecated void ffi_java_ptrarray_to_raw(ffi_cif cif, @Cast("void**") @ByPtrPtr Pointer args, ffi_java_raw raw);
public static native @Deprecated void ffi_java_raw_to_ptrarray(ffi_cif cif, ffi_java_raw raw, @Cast("void**") PointerPointer args);
public static native @Deprecated void ffi_java_raw_to_ptrarray(ffi_cif cif, ffi_java_raw raw, @Cast("void**") @ByPtrPtr Pointer args);
public static native @Cast("size_t") @Deprecated long ffi_java_raw_size(ffi_cif cif);

/* ---- Definitions for closures ----------------------------------------- */

// #if FFI_CLOSURES

// #ifdef _MSC_VER
// Targeting ../ffi_closure.java



// #ifndef __GNUC__
// # ifdef __sgi
// #  pragma pack 0
// # endif
// #endif

public static native Pointer ffi_closure_alloc(@Cast("size_t") long size, @Cast("void**") PointerPointer code);
public static native Pointer ffi_closure_alloc(@Cast("size_t") long size, @Cast("void**") @ByPtrPtr Pointer code);
public static native void ffi_closure_free(Pointer arg0);

// #if defined(PA_LINUX) || defined(PA_HPUX)
// #define FFI_CLOSURE_PTR(X) ((void *)((unsigned int)(X) | 2))
// #define FFI_RESTORE_PTR(X) ((void *)((unsigned int)(X) & ~3))
// #else
// #define FFI_CLOSURE_PTR(X) (X)
// #define FFI_RESTORE_PTR(X) (X)
// Targeting ../Fun_ffi_cif_Pointer_PointerPointer_Pointer.java


public static native @Cast("ffi_status") @Deprecated int ffi_prep_closure(ffi_closure arg0,
		  ffi_cif arg1,
		  Fun_ffi_cif_Pointer_PointerPointer_Pointer fun,
		  Pointer user_data);
// Targeting ../Fun_ffi_cif_Pointer_Pointer_Pointer.java


public static native @Cast("ffi_status") @Deprecated int ffi_prep_closure(ffi_closure arg0,
		  ffi_cif arg1,
		  Fun_ffi_cif_Pointer_Pointer_Pointer fun,
		  Pointer user_data);

public static native @Cast("ffi_status") int ffi_prep_closure_loc(ffi_closure arg0,
		      ffi_cif arg1,
		      Fun_ffi_cif_Pointer_PointerPointer_Pointer fun,
		      Pointer user_data,
		      Pointer codeloc);
public static native @Cast("ffi_status") int ffi_prep_closure_loc(ffi_closure arg0,
		      ffi_cif arg1,
		      Fun_ffi_cif_Pointer_Pointer_Pointer fun,
		      Pointer user_data,
		      Pointer codeloc);

// #ifdef __sgi
// # pragma pack 8
// Targeting ../ffi_raw_closure.java


// Targeting ../ffi_java_raw_closure.java


// Targeting ../Fun_ffi_cif_Pointer_ffi_raw_Pointer.java


public static native @Cast("ffi_status") int ffi_prep_raw_closure(ffi_raw_closure arg0,
		      ffi_cif cif,
		      Fun_ffi_cif_Pointer_ffi_raw_Pointer fun,
		      Pointer user_data);

public static native @Cast("ffi_status") int ffi_prep_raw_closure_loc(ffi_raw_closure arg0,
			  ffi_cif cif,
			  Fun_ffi_cif_Pointer_ffi_raw_Pointer fun,
			  Pointer user_data,
			  Pointer codeloc);
// Targeting ../ffi_go_closure.java



public static native @Cast("ffi_status") int ffi_prep_go_closure(ffi_go_closure arg0, ffi_cif arg1,
				Fun_ffi_cif_Pointer_PointerPointer_Pointer fun);
public static native @Cast("ffi_status") int ffi_prep_go_closure(ffi_go_closure arg0, ffi_cif arg1,
				Fun_ffi_cif_Pointer_Pointer_Pointer fun);

public static native void ffi_call_go(ffi_cif cif, @Cast("void (*)(void)") Pointer fn, Pointer rvalue,
		  @Cast("void**") PointerPointer avalue, Pointer closure);
public static native void ffi_call_go(ffi_cif cif, @Cast("void (*)(void)") Pointer fn, Pointer rvalue,
		  @Cast("void**") @ByPtrPtr Pointer avalue, Pointer closure);

// #endif /* FFI_GO_CLOSURES */

/* ---- Public interface definition -------------------------------------- */

public static native @Cast("ffi_status") int ffi_prep_cif(ffi_cif cif,
			@Cast("ffi_abi") int abi,
			@Cast("unsigned int") int nargs,
			ffi_type rtype,
			@Cast("ffi_type**") PointerPointer atypes);
public static native @Cast("ffi_status") int ffi_prep_cif(ffi_cif cif,
			@Cast("ffi_abi") int abi,
			@Cast("unsigned int") int nargs,
			ffi_type rtype,
			@ByPtrPtr ffi_type atypes);

public static native @Cast("ffi_status") int ffi_prep_cif_var(ffi_cif cif,
			    @Cast("ffi_abi") int abi,
			    @Cast("unsigned int") int nfixedargs,
			    @Cast("unsigned int") int ntotalargs,
			    ffi_type rtype,
			    @Cast("ffi_type**") PointerPointer atypes);
public static native @Cast("ffi_status") int ffi_prep_cif_var(ffi_cif cif,
			    @Cast("ffi_abi") int abi,
			    @Cast("unsigned int") int nfixedargs,
			    @Cast("unsigned int") int ntotalargs,
			    ffi_type rtype,
			    @ByPtrPtr ffi_type atypes);

public static native void ffi_call(ffi_cif cif,
	      @Cast("void (*)(void)") Pointer fn,
	      Pointer rvalue,
	      @Cast("void**") PointerPointer avalue);
public static native void ffi_call(ffi_cif cif,
	      @Cast("void (*)(void)") Pointer fn,
	      Pointer rvalue,
	      @Cast("void**") @ByPtrPtr Pointer avalue);

public static native @Cast("ffi_status") int ffi_get_struct_offsets(@Cast("ffi_abi") int abi, ffi_type struct_type,
				   @Cast("size_t*") SizeTPointer offsets);

/* Useful for eliminating compiler warnings.  */
// #define FFI_FN(f) ((void (*)(void))f)

/* ---- Definitions shared with assembly code ---------------------------- */

// #endif

/* If these change, update src/mips/ffitarget.h. */
public static final int FFI_TYPE_VOID =       0;
public static final int FFI_TYPE_INT =        1;
public static final int FFI_TYPE_FLOAT =      2;
public static final int FFI_TYPE_DOUBLE =     3;
// #if 1
public static final int FFI_TYPE_LONGDOUBLE = 4;
// #else
// #endif
public static final int FFI_TYPE_UINT8 =      5;
public static final int FFI_TYPE_SINT8 =      6;
public static final int FFI_TYPE_UINT16 =     7;
public static final int FFI_TYPE_SINT16 =     8;
public static final int FFI_TYPE_UINT32 =     9;
public static final int FFI_TYPE_SINT32 =     10;
public static final int FFI_TYPE_UINT64 =     11;
public static final int FFI_TYPE_SINT64 =     12;
public static final int FFI_TYPE_STRUCT =     13;
public static final int FFI_TYPE_POINTER =    14;
public static final int FFI_TYPE_COMPLEX =    15;

/* This should always refer to the last type code (for sanity checks).  */
public static final int FFI_TYPE_LAST =       FFI_TYPE_COMPLEX;

// #ifdef __cplusplus
// #endif

// #endif


}
