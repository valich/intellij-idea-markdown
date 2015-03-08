package org.intellij.plugins.markdown.lang;

import com.intellij.psi.tree.TokenSet;

public interface MarkdownTokenTypeSets extends MarkdownElementTypes {
  TokenSet TEXT_SET = TokenSet.create(MarkdownTokenTypes.TEXT);
  TokenSet BOLD_SET = TokenSet.create(STRONG);
  TokenSet ITALIC_SET = TokenSet.create(EMPH);
  TokenSet HEADER_LEVEL_1_SET = TokenSet.create(ATX_1, SETEXT_1, MarkdownTokenTypes.SETEXT_1);
  TokenSet HEADER_LEVEL_2_SET = TokenSet.create(ATX_2, SETEXT_2, MarkdownTokenTypes.SETEXT_2);
  TokenSet HEADER_LEVEL_3_SET = TokenSet.create(ATX_3);
  TokenSet HEADER_LEVEL_4_SET = TokenSet.create(ATX_4);
  TokenSet HEADER_LEVEL_5_SET = TokenSet.create(ATX_5);
  TokenSet HEADER_LEVEL_6_SET = TokenSet.create(ATX_6);
  TokenSet CODE_SET = TokenSet.create(CODE_SPAN, CODE_FENCE, MarkdownTokenTypes.CODE);
  TokenSet HRULE_SET = TokenSet.create(MarkdownTokenTypes.HORIZONTAL_RULE);
  TokenSet EXPLICIT_LINK_SET = TokenSet.create(INLINE_LINK);
  TokenSet REFERENCE_LINK_SET = TokenSet.create(FULL_REFERENCE_LINK, SHORT_REFERENCE_LINK);
  TokenSet AUTO_LINK_SET = TokenSet.create(AUTOLINK);
  TokenSet VERBATIM_SET = TokenSet.create(CODE_BLOCK);
  TokenSet BLOCK_QUOTE_SET = TokenSet.create(BLOCK_QUOTE, MarkdownTokenTypes.BLOCK_QUOTE);
  TokenSet BULLET_LIST_SET = TokenSet.create(UNORDERED_LIST, MarkdownTokenTypes.LIST_BULLET);
  TokenSet ORDERED_LIST_SET = TokenSet.create(ORDERED_LIST, MarkdownTokenTypes.LIST_NUMBER);
  TokenSet LIST_ITEM_SET = TokenSet.create(LIST_ITEM);
  TokenSet DEFINITION_SET = TokenSet.create(LINK_DEFINITION);
  TokenSet HTML_BLOCK_SET = TokenSet.create(MarkdownTokenTypes.HTML_BLOCK);
  TokenSet INLINE_HTML_SET = TokenSet.create(MarkdownTokenTypes.HTML_TAG);
}
