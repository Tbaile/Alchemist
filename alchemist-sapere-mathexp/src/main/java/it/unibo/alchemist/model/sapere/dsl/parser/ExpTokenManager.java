/*
 * Copyright (C) 2010-2023, Danilo Pianini and contributors
 * listed, for each module, in the respective subproject's build.gradle.kts file.
 *
 * This file is part of Alchemist, and is distributed under the terms of the
 * GNU General Public License, with a linking exception,
 * as described in the file LICENSE in the Alchemist distribution's top directory.
 */

/* Generated By:JavaCC: Do not edit this line. ExpTokenManager.java */
package it.unibo.alchemist.model.sapere.dsl.parser;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

//CHECKSTYLE:OFF

/**
 * Token Manager. This class was automatically generated by JavaCC, only few
 * manual fixes added.
 * 
 */
@SuppressFBWarnings
@SuppressWarnings({"PMD", "CPD-START"})
public class ExpTokenManager implements ExpConstants {

    /** Debug output. */
    public java.io.PrintStream debugStream = System.out;

    /** Set debug output. */
    public void setDebugStream(final java.io.PrintStream ds) {
        debugStream = ds;
    }

    private final int jjStopStringLiteralDfa_0(final int pos, final long active0) {
        switch (pos) {
        case 0:
            if ((active0 & 0xfc0L) != 0L) {
                jjmatchedKind = 17;
                return 22;
            }
            return -1;
        case 1:
            if ((active0 & 0xfc0L) != 0L) {
                jjmatchedKind = 17;
                jjmatchedPos = 1;
                return 22;
            }
            return -1;
        case 2:
            if ((active0 & 0xf80L) != 0L) {
                return 22;
            }
            if ((active0 & 0x40L) != 0L) {
                jjmatchedKind = 17;
                jjmatchedPos = 2;
                return 22;
            }
            return -1;
        case 3:
            if ((active0 & 0x40L) != 0L) {
                jjmatchedKind = 17;
                jjmatchedPos = 3;
                return 22;
            }
            return -1;
        case 4:
            if ((active0 & 0x40L) != 0L) {
                jjmatchedKind = 17;
                jjmatchedPos = 4;
                return 22;
            }
            return -1;
        default:
            return -1;
        }
    }

    private final int jjStartNfa_0(final int pos, final long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private int jjStopAtPos(final int pos, final int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
        case 40:
            return jjStopAtPos(0, 26);
        case 41:
            return jjStopAtPos(0, 27);
        case 42:
            return jjStopAtPos(0, 24);
        case 43:
            return jjStopAtPos(0, 22);
        case 45:
            return jjStopAtPos(0, 23);
        case 47:
            return jjStopAtPos(0, 25);
        case 58:
            return jjStopAtPos(0, 18);
        case 59:
            return jjStopAtPos(0, 21);
        case 91:
            return jjStopAtPos(0, 19);
        case 93:
            return jjStopAtPos(0, 20);
        case 97:
            return jjMoveStringLiteralDfa1_0(0x200L);
        case 100:
            return jjMoveStringLiteralDfa1_0(0xc00L);
        case 109:
            return jjMoveStringLiteralDfa1_0(0x180L);
        case 114:
            return jjMoveStringLiteralDfa1_0(0x40L);
        case 124:
            return jjStopAtPos(0, 28);
        default:
            return jjMoveNfa_0(0, 0);
        }
    }

    private int jjMoveStringLiteralDfa1_0(final long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
        case 97:
            return jjMoveStringLiteralDfa2_0(active0, 0x100L);
        case 100:
            return jjMoveStringLiteralDfa2_0(active0, 0x200L);
        case 101:
            return jjMoveStringLiteralDfa2_0(active0, 0xc40L);
        case 105:
            return jjMoveStringLiteralDfa2_0(active0, 0x80L);
        default:
            break;
        }
        return jjStartNfa_0(0, active0);
    }

    private int jjMoveStringLiteralDfa2_0(final long old0, long active0) {
        if (((active0 &= old0)) == 0L) { // NOPMD by danysk on 8/20/13 12:38 PM
            return jjStartNfa_0(0, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
        case 100:
            if ((active0 & 0x200L) != 0L) {
                return jjStartNfaWithStates_0(2, 9, 22);
            }
            break;
        case 102:
            if ((active0 & 0x800L) != 0L) {
                return jjStartNfaWithStates_0(2, 11, 22);
            }
            break;
        case 108:
            if ((active0 & 0x400L) != 0L) {
                return jjStartNfaWithStates_0(2, 10, 22);
            }
            break;
        case 110:
            if ((active0 & 0x80L) != 0L) {
                return jjStartNfaWithStates_0(2, 7, 22);
            }
            break;
        case 116:
            return jjMoveStringLiteralDfa3_0(active0, 0x40L);
        case 120:
            if ((active0 & 0x100L) != 0L) {
                return jjStartNfaWithStates_0(2, 8, 22);
            }
            break;
        default:
            break;
        }
        return jjStartNfa_0(1, active0);
    }

    private int jjMoveStringLiteralDfa3_0(final long old0, long active0) {
        if (((active0 &= old0)) == 0L) { // NOPMD by danysk on 8/20/13 12:38 PM
            return jjStartNfa_0(1, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) { // NOPMD by danysk on 8/20/13 12:36 PM
        case 117:
            return jjMoveStringLiteralDfa4_0(active0, 0x40L);
        default:
            break;
        }
        return jjStartNfa_0(2, active0);
    }

    private int jjMoveStringLiteralDfa4_0(final long old0, long active0) {
        if (((active0 &= old0)) == 0L) { // NOPMD by danysk on 8/20/13 12:38 PM
            return jjStartNfa_0(2, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) { // NOPMD by danysk on 8/20/13 12:36 PM
        case 114:
            return jjMoveStringLiteralDfa5_0(active0, 0x40L);
        default:
            break;
        }
        return jjStartNfa_0(3, active0);
    }

    private int jjMoveStringLiteralDfa5_0(final long old0, long active0) {
        if (((active0 &= old0)) == 0L) { // NOPMD by danysk on 8/20/13 12:38 PM
            return jjStartNfa_0(3, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) { // NOPMD by danysk on 8/20/13 12:36 PM
        case 110:
            if ((active0 & 0x40L) != 0L) {
                return jjStartNfaWithStates_0(5, 6, 22);
            }
            break;
        default:
            break;
        }
        return jjStartNfa_0(4, active0);
    }

    private int jjStartNfaWithStates_0(final int pos, final int kind, final int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }

    private int jjMoveNfa_0(final int startState, int curPos) { // NOPMD by danysk on 8/20/13 12:38 PM
        int startsAt = 0;
        jjnewStateCnt = 36;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) { // NOPMD by danysk on 8/20/13 12:38 PM
                ReInitRounds();
            }
            if (curChar < 64) {
                final long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((0x3ff000000000000L & l) != 0L) {
                            if (kind > 15) {
                                kind = 15;
                            }
                            jjCheckNAddStates(0, 2);
                        } else if ((0x7000000000000000L & l) != 0L) {
                            if (kind > 12) {
                                kind = 12;
                            }
                        } else if (curChar == 35) {
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(20);
                        } else if (curChar == 33) {
                            jjCheckNAdd(1);
                        }
                        if (curChar == 60) {
                            jjCheckNAdd(1);
                        } else if (curChar == 62) {
                            jjCheckNAdd(1);
                        }
                        break;
                    case 1:
                        if (curChar == 61 && kind > 12) {
                            kind = 12;
                        }
                        break;
                    case 2:
                        if (curChar == 62) {
                            jjCheckNAdd(1);
                        }
                        break;
                    case 3:
                        if (curChar == 60) {
                            jjCheckNAdd(1);
                        }
                        break;
                    case 4:
                        if (curChar == 33) {
                            jjCheckNAdd(1);
                        }
                        break;
                    case 19:
                        if (curChar != 35) {
                            break;
                        }
                        kind = 16;
                        jjCheckNAdd(20);
                        break;
                    case 20:
                        if ((0x3ff000000000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 16) {
                            kind = 16;
                        }
                        jjCheckNAdd(20);
                        break;
                    case 22:
                        if ((0x3ff000000000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 17) {
                            kind = 17;
                        }
                        jjstateSet[jjnewStateCnt++] = 22;
                        break;
                    case 23:
                        if ((0x3ff000000000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 15) {
                            kind = 15;
                        }
                        jjCheckNAddStates(0, 2);
                        break;
                    case 24:
                        if ((0x3ff000000000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 15) {
                            kind = 15;
                        }
                        jjCheckNAdd(24);
                        break;
                    case 25:
                        if ((0x3ff000000000000L & l) != 0L) {
                            jjCheckNAddTwoStates(25, 26);
                        }
                        break;
                    case 26:
                        if (curChar == 46) {
                            jjCheckNAdd(27);
                        }
                        break;
                    case 27:
                        if ((0x3ff000000000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 15) {
                            kind = 15;
                        }
                        jjCheckNAdd(27);
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                final long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((0x7fffffe00000000L & l) != 0L) {
                            if (kind > 17) {
                                kind = 17;
                            }
                            jjCheckNAdd(22);
                        } else if ((0x7fffffeL & l) != 0L) {
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(20);
                        }
                        if (curChar == 104) {
                            jjAddStates(3, 4);
                        } else if (curChar == 110) {
                            jjstateSet[jjnewStateCnt++] = 17;
                        } else if (curChar == 105) {
                            jjstateSet[jjnewStateCnt++] = 10;
                        }
                        break;
                    case 5:
                        if (curChar == 121 && kind > 14) {
                            kind = 14;
                        }
                        break;
                    case 6:
                    case 12:
                        if (curChar == 116) {
                            jjCheckNAdd(5);
                        }
                        break;
                    case 7:
                        if (curChar == 112) {
                            jjstateSet[jjnewStateCnt++] = 6;
                        }
                        break;
                    case 8:
                        if (curChar == 109) {
                            jjstateSet[jjnewStateCnt++] = 7;
                        }
                        break;
                    case 9:
                        if (curChar == 101) {
                            jjstateSet[jjnewStateCnt++] = 8;
                        }
                        break;
                    case 10:
                        if (curChar == 115) {
                            jjstateSet[jjnewStateCnt++] = 9;
                        }
                        break;
                    case 11:
                        if (curChar == 105) {
                            jjstateSet[jjnewStateCnt++] = 10;
                        }
                        break;
                    case 13:
                        if (curChar == 112) {
                            jjstateSet[jjnewStateCnt++] = 12;
                        }
                        break;
                    case 14:
                        if (curChar == 109) {
                            jjstateSet[jjnewStateCnt++] = 13;
                        }
                        break;
                    case 15:
                        if (curChar == 101) {
                            jjstateSet[jjnewStateCnt++] = 14;
                        }
                        break;
                    case 16:
                        if (curChar == 116) {
                            jjstateSet[jjnewStateCnt++] = 15;
                        }
                        break;
                    case 17:
                        if (curChar == 111) {
                            jjstateSet[jjnewStateCnt++] = 16;
                        }
                        break;
                    case 18:
                        if (curChar == 110) {
                            jjstateSet[jjnewStateCnt++] = 17;
                        }
                        break;
                    case 19:
                        if ((0x7fffffeL & l) == 0L) {
                            break;
                        }
                        if (kind > 16) {
                            kind = 16;
                        }
                        jjCheckNAdd(20);
                        break;
                    case 20:
                        if ((0x7fffffe07fffffeL & l) == 0L) {
                            break;
                        }
                        if (kind > 16) {
                            kind = 16;
                        }
                        jjCheckNAdd(20);
                        break;
                    case 21:
                        if ((0x7fffffe00000000L & l) == 0L) {
                            break;
                        }
                        if (kind > 17) {
                            kind = 17;
                        }
                        jjCheckNAdd(22);
                        break;
                    case 22:
                        if ((0x7fffffe07fffffeL & l) == 0L) {
                            break;
                        }
                        if (kind > 17) {
                            kind = 17;
                        }
                        jjCheckNAdd(22);
                        break;
                    case 28:
                        if (curChar == 104) {
                            jjAddStates(3, 4);
                        }
                        break;
                    case 29:
                        if (curChar == 115 && kind > 13) {
                            kind = 13;
                        }
                        break;
                    case 30:
                        if (curChar == 97) {
                            jjstateSet[jjnewStateCnt++] = 29;
                        }
                        break;
                    case 31:
                        if (curChar == 116 && kind > 13) {
                            kind = 13;
                        }
                        break;
                    case 32:
                        if (curChar == 111) {
                            jjstateSet[jjnewStateCnt++] = 31;
                        }
                        break;
                    case 33:
                        if (curChar == 110) {
                            jjstateSet[jjnewStateCnt++] = 32;
                        }
                        break;
                    case 34:
                        if (curChar == 115) {
                            jjstateSet[jjnewStateCnt++] = 33;
                        }
                        break;
                    case 35:
                        if (curChar == 97) {
                            jjstateSet[jjnewStateCnt++] = 34;
                        }
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else {
                do {
                    switch (jjstateSet[--i]) { // NOPMD by danysk on 8/20/13 12:36 PM
                    default:
                        break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 36 - (jjnewStateCnt = startsAt))) { // NOPMD by danysk on 8/20/13 12:38 PM
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    static final int[] jjnextStates = { 24, 25, 26, 30, 35, }; // NOPMD by danysk on 8/20/13 12:38 PM

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, "\162\145\164\165\162\156", "\155\151\156", "\155\141\170", "\141\144\144", "\144\145\154", "\144\145\146", null, null, null, null, null, null, "\72", "\133", "\135", "\73", "\53", "\55", "\52", "\57", "\50", "\51", "\174", };

    /** Lexer state names. */
    public static final String[] lexStateNames = { "DEFAULT", };
    static final long[] jjtoToken = { 0x1fffffc1L, }; // NOPMD by danysk on 8/20/13 12:38 PM
    static final long[] jjtoSkip = { 0x3eL, }; // NOPMD by danysk on 8/20/13 12:36 PM
    protected SimpleCharStream input_stream;
    private final int[] jjrounds = new int[36];
    private final int[] jjstateSet = new int[72];
    protected char curChar;

    /** Constructor. */
    public ExpTokenManager(final SimpleCharStream stream) {
        if (SimpleCharStream.staticFlag) {
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        }
        input_stream = stream;
    }

    /** Constructor. */
    public ExpTokenManager(final SimpleCharStream stream, final int lexState) {
        this(stream);
        SwitchTo(lexState);
    }

    /** Reinitialise parser. */
    public void ReInit(final SimpleCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 36; i-- > 0;) { // NOPMD by danysk on 8/20/13 12:38 PM
            jjrounds[i] = 0x80000000;
        }
    }

    /** Reinitialise parser. */
    public void ReInit(final SimpleCharStream stream, final int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Switch to specified lex state. */
    public void SwitchTo(final int lexState) {
        if (lexState >= 1 || lexState < 0) {
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        } else {
            curLexState = lexState;
        }
    }

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        final String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    int curLexState = 0; // NOPMD by danysk on 8/20/13 12:38 PM
    int defaultLexState = 0; // NOPMD by danysk on 8/20/13 12:38 PM
    int jjnewStateCnt; // NOPMD by danysk on 8/20/13 12:38 PM
    int jjround; // NOPMD by danysk on 8/20/13 12:38 PM
    int jjmatchedPos; // NOPMD by danysk on 8/20/13 12:38 PM
    int jjmatchedKind; // NOPMD by danysk on 8/20/13 12:36 PM

    /** Get the next Token. */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop: for (;;) {
            try {
                curChar = input_stream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try {
                input_stream.backup(0);
                while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L) {
                    curChar = input_stream.BeginToken();
                }
            } catch (java.io.IOException e1) {
                continue EOFLoop;
            }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos) {
                    input_stream.backup(curPos - jjmatchedPos - 1);
                }
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    return matchedToken;
                } else {
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else {
                    error_column++;
                }
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    private void jjCheckNAdd(final int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int start, final int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(final int state1, final int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    private void jjCheckNAddStates(int start, final int end) {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }

}
