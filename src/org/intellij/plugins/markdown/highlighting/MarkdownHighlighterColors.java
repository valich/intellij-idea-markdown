package org.intellij.plugins.markdown.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MarkdownHighlighterColors {

  public static final TextAttributesKey REFERENCE_LINK_ATTR_KEY = createTextAttributesKey("MARKDOWN_REFERENCE_LINK", STRING);
  public static final TextAttributesKey AUTO_LINK_ATTR_KEY = createTextAttributesKey("MARKDOWN_AUTO_LINK", STRING);
  public static final TextAttributesKey BLOCK_QUOTE_MARKER_ATTR_KEY = createTextAttributesKey("MARKDOWN_BLOCK_QUOTE_MARKER", KEYWORD);
  public static final TextAttributesKey LIST_MARKER_ATTR_KEY = createTextAttributesKey("MARKDOWN_LIST_MARKER", KEYWORD);
  public static final TextAttributesKey HEADER_MARKER_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_MARKER", KEYWORD);
  public static final TextAttributesKey UNORDERED_LIST_ATTR_KEY = createTextAttributesKey("MARKDOWN_UNORDERED_LIST", IDENTIFIER);
  public static final TextAttributesKey ORDERED_LIST_ATTR_KEY = createTextAttributesKey("MARKDOWN_ORDERED_LIST", IDENTIFIER);
  public static final TextAttributesKey LIST_ITEM_ATTR_KEY = createTextAttributesKey("MARKDOWN_LIST_ITEM", IDENTIFIER);
  public static final TextAttributesKey LINK_DEFINITION_ATTR_KEY = createTextAttributesKey("MARKDOWN_LINK_DEFINITION", IDENTIFIER);
  public static final TextAttributesKey HTML_BLOCK_ATTR_KEY = createTextAttributesKey("MARKDOWN_HTML_BLOCK", IDENTIFIER);
  public static final TextAttributesKey INLINE_HTML_ATTR_KEY = createTextAttributesKey("MARKDOWN_INLINE_HTML", IDENTIFIER);
  public static final TextAttributesKey TEXT_ATTR_KEY = createTextAttributesKey("MARKDOWN_TEXT", IDENTIFIER);
  public static final TextAttributesKey BOLD_ATTR_KEY = createTextAttributesKey("MARKDOWN_BOLD", STRING);
  public static final TextAttributesKey ITALIC_ATTR_KEY = createTextAttributesKey("MARKDOWN_ITALIC", STRING);
  public static final TextAttributesKey HEADER_LEVEL_1_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_1", KEYWORD);
  public static final TextAttributesKey HEADER_LEVEL_2_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_2", KEYWORD);
  public static final TextAttributesKey HEADER_LEVEL_3_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_3", KEYWORD);
  public static final TextAttributesKey HEADER_LEVEL_4_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_4", KEYWORD);
  public static final TextAttributesKey HEADER_LEVEL_5_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_5", KEYWORD);
  public static final TextAttributesKey HEADER_LEVEL_6_ATTR_KEY = createTextAttributesKey("MARKDOWN_HEADER_LEVEL_6", KEYWORD);
  public static final TextAttributesKey BLOCK_QUOTE_ATTR_KEY = createTextAttributesKey("MARKDOWN_BLOCK_QUOTE", STRING);
  public static final TextAttributesKey HRULE_ATTR_KEY = createTextAttributesKey("MARKDOWN_HRULE", BLOCK_COMMENT);
  public static final TextAttributesKey EXPLICIT_LINK_ATTR_KEY = createTextAttributesKey("MARKDOWN_EXPLICIT_LINK", STRING);
  public static final TextAttributesKey CODE_SPAN_ATTR_KEY = createTextAttributesKey("MARKDOWN_CODE_SPAN", BLOCK_COMMENT);
  public static final TextAttributesKey CODE_BLOCK_ATTR_KEY = createTextAttributesKey("MARKDOWN_CODE_BLOCK", BLOCK_COMMENT);
  public static final TextAttributesKey CODE_FENCE_ATTR_KEY = createTextAttributesKey("MARKDOWN_CODE_FENCE", BLOCK_COMMENT);

}
