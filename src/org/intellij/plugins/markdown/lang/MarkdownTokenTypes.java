package org.intellij.plugins.markdown.lang;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import static org.intellij.plugins.markdown.lang.MarkdownElementType.platformType;

public interface MarkdownTokenTypes extends TokenType {

  IElementType TEXT = platformType(org.intellij.markdown.MarkdownTokenTypes.TEXT);

  IElementType CODE = platformType(org.intellij.markdown.MarkdownTokenTypes.CODE);

  IElementType BLOCK_QUOTE = platformType(org.intellij.markdown.MarkdownTokenTypes.BLOCK_QUOTE);

  IElementType HTML_BLOCK = platformType(org.intellij.markdown.MarkdownTokenTypes.HTML_BLOCK);

  IElementType SINGLE_QUOTE = platformType(org.intellij.markdown.MarkdownTokenTypes.SINGLE_QUOTE);
  IElementType DOUBLE_QUOTE = platformType(org.intellij.markdown.MarkdownTokenTypes.DOUBLE_QUOTE);
  IElementType LPAREN = platformType(org.intellij.markdown.MarkdownTokenTypes.LPAREN);
  IElementType RPAREN = platformType(org.intellij.markdown.MarkdownTokenTypes.RPAREN);
  IElementType LBRACKET = platformType(org.intellij.markdown.MarkdownTokenTypes.LBRACKET);
  IElementType RBRACKET = platformType(org.intellij.markdown.MarkdownTokenTypes.RBRACKET);
  IElementType LT = platformType(org.intellij.markdown.MarkdownTokenTypes.LT);
  IElementType GT = platformType(org.intellij.markdown.MarkdownTokenTypes.GT);

  IElementType COLON = platformType(org.intellij.markdown.MarkdownTokenTypes.COLON);
  IElementType EXCLAMATION_MARK = platformType(org.intellij.markdown.MarkdownTokenTypes.EXCLAMATION_MARK);


  IElementType HARD_LINE_BREAK = platformType(org.intellij.markdown.MarkdownTokenTypes.HARD_LINE_BREAK);
  IElementType EOL = platformType(org.intellij.markdown.MarkdownTokenTypes.EOL);

  IElementType LINK_ID = platformType(org.intellij.markdown.MarkdownTokenTypes.LINK_ID);
  IElementType ATX_HEADER = platformType(org.intellij.markdown.MarkdownTokenTypes.ATX_HEADER);
  IElementType EMPH = platformType(org.intellij.markdown.MarkdownTokenTypes.EMPH);

  IElementType BACKTICK = platformType(org.intellij.markdown.MarkdownTokenTypes.BACKTICK);
  IElementType ESCAPED_BACKTICKS = platformType(org.intellij.markdown.MarkdownTokenTypes.ESCAPED_BACKTICKS);

  IElementType TAG_NAME = platformType(org.intellij.markdown.MarkdownTokenTypes.TAG_NAME);
  IElementType LIST_BULLET = platformType(org.intellij.markdown.MarkdownTokenTypes.LIST_BULLET);
  IElementType URL = platformType(org.intellij.markdown.MarkdownTokenTypes.URL);
  IElementType HORIZONTAL_RULE = platformType(org.intellij.markdown.MarkdownTokenTypes.HORIZONTAL_RULE);
  IElementType SETEXT_1 = platformType(org.intellij.markdown.MarkdownTokenTypes.SETEXT_1);
  IElementType SETEXT_2 = platformType(org.intellij.markdown.MarkdownTokenTypes.SETEXT_2);
  IElementType LIST_NUMBER = platformType(org.intellij.markdown.MarkdownTokenTypes.LIST_NUMBER);
  IElementType FENCE_LANG = platformType(org.intellij.markdown.MarkdownTokenTypes.FENCE_LANG);
  IElementType CODE_FENCE_START = platformType(org.intellij.markdown.MarkdownTokenTypes.CODE_FENCE_START);
  IElementType CODE_FENCE_END = platformType(org.intellij.markdown.MarkdownTokenTypes.CODE_FENCE_END);
  IElementType LINK_TITLE = platformType(org.intellij.markdown.MarkdownTokenTypes.LINK_TITLE);

  IElementType AUTOLINK = platformType(org.intellij.markdown.MarkdownTokenTypes.AUTOLINK);
  IElementType EMAIL_AUTOLINK = platformType(org.intellij.markdown.MarkdownTokenTypes.EMAIL_AUTOLINK);
  IElementType HTML_TAG = platformType(org.intellij.markdown.MarkdownTokenTypes.HTML_TAG);

  IElementType BAD_CHARACTER = platformType(org.intellij.markdown.MarkdownTokenTypes.BAD_CHARACTER);
  IElementType WHITE_SPACE = platformType(org.intellij.markdown.MarkdownTokenTypes.WHITE_SPACE);
}
