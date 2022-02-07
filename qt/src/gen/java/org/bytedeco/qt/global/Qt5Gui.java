// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.global;

import org.bytedeco.qt.Qt5Gui.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;

public class Qt5Gui extends org.bytedeco.qt.helper.Qt5Gui {
    static { Loader.load(); }

// Targeting ../Qt5Gui/QCloseEvent.java




// Parsed from QtGui/qtextdocument.h

/****************************************************************************
**
** Copyright (C) 2019 The Qt Company Ltd.
** Contact: https://www.qt.io/licensing/
**
** This file is part of the QtGui module of the Qt Toolkit.
**
** $QT_BEGIN_LICENSE:LGPL$
** Commercial License Usage
** Licensees holding valid commercial Qt licenses may use this file in
** accordance with the commercial license agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and The Qt Company. For licensing terms
** and conditions see https://www.qt.io/terms-conditions. For further
** information use the contact form at https://www.qt.io/contact-us.
**
** GNU Lesser General Public License Usage
** Alternatively, this file may be used under the terms of the GNU Lesser
** General Public License version 3 as published by the Free Software
** Foundation and appearing in the file LICENSE.LGPL3 included in the
** packaging of this file. Please review the following information to
** ensure the GNU Lesser General Public License version 3 requirements
** will be met: https://www.gnu.org/licenses/lgpl-3.0.html.
**
** GNU General Public License Usage
** Alternatively, this file may be used under the terms of the GNU
** General Public License version 2.0 or (at your option) the GNU General
** Public license version 3 or any later version approved by the KDE Free
** Qt Foundation. The licenses are as published by the Free Software
** Foundation and appearing in the file LICENSE.GPL2 and LICENSE.GPL3
** included in the packaging of this file. Please review the following
** information to ensure the GNU General Public License requirements will
** be met: https://www.gnu.org/licenses/gpl-2.0.html and
** https://www.gnu.org/licenses/gpl-3.0.html.
**
** $QT_END_LICENSE$
**
****************************************************************************/

// #ifndef QTEXTDOCUMENT_H
// #define QTEXTDOCUMENT_H

// #include <QtGui/qtguiglobal.h>
// #include <QtCore/qobject.h>
// #include <QtCore/qsize.h>
// #include <QtCore/qrect.h>
// #include <QtCore/qvariant.h>
// #include <QtGui/qfont.h>
// #include <QtCore/qurl.h>
// Targeting ../Qt5Gui/QTextFormatCollection.java


// Targeting ../Qt5Gui/QTextListFormat.java


// Targeting ../Qt5Gui/QAbstractTextDocumentLayout.java


// Targeting ../Qt5Gui/QTextObject.java


// Targeting ../Qt5Gui/QTextFormat.java


// Targeting ../Qt5Gui/QTextFrame.java


// Targeting ../Qt5Gui/QTextBlock.java


// Targeting ../Qt5Gui/QTextCodec.java


// Targeting ../Qt5Gui/QTextOption.java


    @Namespace("Qt") public static native @Cast("bool") boolean mightBeRichText(@Const @ByRef QString arg0);
    @Namespace("Qt") public static native @ByVal QString convertFromPlainText(@Const @ByRef QString plain, @Cast("Qt::WhiteSpaceMode") int mode/*=Qt::WhiteSpacePre*/);
    @Namespace("Qt") public static native @ByVal QString convertFromPlainText(@Const @ByRef QString plain);

// #if QT_CONFIG(textcodec) || defined(Q_CLANG_QDOC)
    @Namespace("Qt") public static native QTextCodec codecForHtml(@Const @ByRef QByteArray ba);
// #endif

// Targeting ../Qt5Gui/QAbstractUndoItem.java




// Targeting ../Qt5Gui/QTextDocumentPrivate.java





// #endif // QTEXTDOCUMENT_H



// Targeting ../Qt5Gui/QFont.java




// Targeting ../Qt5Gui/QIcon.java




// Targeting ../Qt5Gui/QGuiApplication.java




}
