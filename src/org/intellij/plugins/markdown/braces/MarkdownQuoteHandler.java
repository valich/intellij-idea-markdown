package org.intellij.plugins.markdown.braces;

import com.intellij.codeInsight.editorActions.QuoteHandler;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.tree.TokenSet;
import org.intellij.plugins.markdown.lang.MarkdownTokenTypes;
import org.jetbrains.annotations.NotNull;

public class MarkdownQuoteHandler implements QuoteHandler {
    private final static TokenSet QUOTE_TYPES = TokenSet.create(MarkdownTokenTypes.EMPH,
                                                                MarkdownTokenTypes.BACKTICK,
                                                                MarkdownTokenTypes.SINGLE_QUOTE,
                                                                MarkdownTokenTypes.DOUBLE_QUOTE,
                                                                MarkdownTokenTypes.CODE_FENCE_START);

    @Override public boolean isClosingQuote(HighlighterIterator iterator, int offset) {
        final CharSequence charsSequence = iterator.getDocument().getCharsSequence();
        final TextRange current = getRangeOfThisType(charsSequence, offset);

        final int prev = locateNextPosition(charsSequence, charsSequence.charAt(offset), current.getStartOffset() - 1, -1);
        return prev != -1 && getRangeOfThisType(charsSequence, prev).getLength() <= current.getLength();
    }

    @Override public boolean isOpeningQuote(HighlighterIterator iterator, int offset) {
        return QUOTE_TYPES.contains(iterator.getTokenType());
    }

    @Override public boolean hasNonClosedLiteral(Editor editor, HighlighterIterator iterator, int offset) {
        final CharSequence charsSequence = editor.getDocument().getCharsSequence();
        final TextRange current = getRangeOfThisType(charsSequence, offset);

        final int next = locateNextPosition(charsSequence, charsSequence.charAt(offset), current.getEndOffset(), +1);
        return next == -1 || getRangeOfThisType(charsSequence, next).getLength() < current.getLength();
    }

    @Override public boolean isInsideLiteral(HighlighterIterator iterator) {
        return false;
    }

    private TextRange getRangeOfThisType(@NotNull CharSequence charSequence, int offset) {
        final int length = charSequence.length();
        final char c = charSequence.charAt(offset);

        int l = offset, r = offset;
        while (l - 1 >= 0 && charSequence.charAt(l - 1) == c) {
            l--;
        }
        while (r + 1 < length && charSequence.charAt(r + 1) == c) {
            r++;
        }
        return TextRange.create(l, r + 1);
    }

    private int locateNextPosition(@NotNull CharSequence haystack, char needle, int from, int dx) {
        while (from >= 0 && from < haystack.length()) {
            final char currentChar = haystack.charAt(from);
            if (currentChar == needle) {
                return from;
            }
            else if (currentChar == '\n') {
                return -1;
            }

            from += dx;
        }
        return -1;
    }
}
