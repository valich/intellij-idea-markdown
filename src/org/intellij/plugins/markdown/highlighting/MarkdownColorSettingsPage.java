package org.intellij.plugins.markdown.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.io.FileUtil;
import org.intellij.plugins.markdown.MarkdownBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MarkdownColorSettingsPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] ATTRIBUTE_DESCRIPTORS = AttributeDescriptorsHolder.INSTANCE.get();

  @Nullable
  public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    final Map<String, TextAttributesKey> result = new HashMap<String, TextAttributesKey>();

    result.put("hh1", MarkdownHighlighterColors.HEADER_LEVEL_1_ATTR_KEY);
    result.put("hh2", MarkdownHighlighterColors.HEADER_LEVEL_2_ATTR_KEY);
    result.put("hh3", MarkdownHighlighterColors.HEADER_LEVEL_3_ATTR_KEY);
    result.put("hh4", MarkdownHighlighterColors.HEADER_LEVEL_4_ATTR_KEY);
    result.put("hh5", MarkdownHighlighterColors.HEADER_LEVEL_5_ATTR_KEY);
    result.put("hh6", MarkdownHighlighterColors.HEADER_LEVEL_6_ATTR_KEY);

    result.put("bold", MarkdownHighlighterColors.BOLD_ATTR_KEY);
    result.put("italic", MarkdownHighlighterColors.ITALIC_ATTR_KEY);

    result.put("alink", MarkdownHighlighterColors.AUTO_LINK_ATTR_KEY);

    result.put("code_span", MarkdownHighlighterColors.CODE_SPAN_ATTR_KEY);
    result.put("code_block", MarkdownHighlighterColors.CODE_BLOCK_ATTR_KEY);
    result.put("code_fence", MarkdownHighlighterColors.CODE_FENCE_ATTR_KEY);
    result.put("quote", MarkdownHighlighterColors.BLOCK_QUOTE_ATTR_KEY);

    result.put("ul", MarkdownHighlighterColors.UNORDERED_LIST_ATTR_KEY);
    result.put("ol", MarkdownHighlighterColors.ORDERED_LIST_ATTR_KEY);

    return result;
  }

  @NotNull
  public AttributesDescriptor[] getAttributeDescriptors() {
    return ATTRIBUTE_DESCRIPTORS;
  }

  @NotNull
  public ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @NonNls
  @NotNull
  public String getDemoText() {
    final URL resourceUrl = getClass().getResource("SampleDocument.md");
    if (resourceUrl != null) {
      try {
        return FileUtil.loadFile(new File(resourceUrl.toURI()));
      } catch (IOException ignored) {
      } catch (URISyntaxException ignored) {
      }
    }

    return "*error loading text*";
  }

  @NotNull
  public String getDisplayName() {
    return MarkdownBundle.message("markdown.plugin.name");
  }

  @NotNull
  public SyntaxHighlighter getHighlighter() {
    return new MarkdownSyntaxHighlighter();
  }

  @Nullable
  public Icon getIcon() {
    return null;
  }

  private enum AttributeDescriptorsHolder {
    INSTANCE;

    private Map<String, TextAttributesKey> myMap = new HashMap<String, TextAttributesKey>();

    AttributeDescriptorsHolder() {
      put("markdown.editor.colors.text", MarkdownHighlighterColors.TEXT_ATTR_KEY);
      put("markdown.editor.colors.bold", MarkdownHighlighterColors.BOLD_ATTR_KEY);
      put("markdown.editor.colors.italic", MarkdownHighlighterColors.ITALIC_ATTR_KEY);
      put("markdown.editor.colors.header_level_1", MarkdownHighlighterColors.HEADER_LEVEL_1_ATTR_KEY);
      put("markdown.editor.colors.header_level_2", MarkdownHighlighterColors.HEADER_LEVEL_2_ATTR_KEY);
      put("markdown.editor.colors.header_level_3", MarkdownHighlighterColors.HEADER_LEVEL_3_ATTR_KEY);
      put("markdown.editor.colors.header_level_4", MarkdownHighlighterColors.HEADER_LEVEL_4_ATTR_KEY);
      put("markdown.editor.colors.header_level_5", MarkdownHighlighterColors.HEADER_LEVEL_5_ATTR_KEY);
      put("markdown.editor.colors.header_level_6", MarkdownHighlighterColors.HEADER_LEVEL_6_ATTR_KEY);

      put("markdown.editor.colors.blockquote", MarkdownHighlighterColors.BLOCK_QUOTE_ATTR_KEY);

      put("markdown.editor.colors.code_span", MarkdownHighlighterColors.CODE_SPAN_ATTR_KEY);
      put("markdown.editor.colors.code_block", MarkdownHighlighterColors.CODE_BLOCK_ATTR_KEY);
      put("markdown.editor.colors.code_fence", MarkdownHighlighterColors.CODE_FENCE_ATTR_KEY);

      put("markdown.editor.colors.hrule", MarkdownHighlighterColors.HRULE_ATTR_KEY);
      put("markdown.editor.colors.blockquote_marker", MarkdownHighlighterColors.BLOCK_QUOTE_MARKER_ATTR_KEY);
      put("markdown.editor.colors.list_marker", MarkdownHighlighterColors.LIST_MARKER_ATTR_KEY);
      put("markdown.editor.colors.header_marker", MarkdownHighlighterColors.HEADER_MARKER_ATTR_KEY);

      put("markdown.editor.colors.auto_link", MarkdownHighlighterColors.AUTO_LINK_ATTR_KEY);
      put("markdown.editor.colors.explicit_link", MarkdownHighlighterColors.EXPLICIT_LINK_ATTR_KEY);
      put("markdown.editor.colors.reference_link", MarkdownHighlighterColors.REFERENCE_LINK_ATTR_KEY);
      put("markdown.editor.colors.link_definition", MarkdownHighlighterColors.LINK_DEFINITION_ATTR_KEY);
      put("markdown.editor.colors.unordered_list", MarkdownHighlighterColors.UNORDERED_LIST_ATTR_KEY);
      put("markdown.editor.colors.ordered_list", MarkdownHighlighterColors.ORDERED_LIST_ATTR_KEY);
      put("markdown.editor.colors.list_item", MarkdownHighlighterColors.LIST_ITEM_ATTR_KEY);
      put("markdown.editor.colors.html_block", MarkdownHighlighterColors.HTML_BLOCK_ATTR_KEY);
      put("markdown.editor.colors.inline_html", MarkdownHighlighterColors.INLINE_HTML_ATTR_KEY);
    }

    @NotNull
    public AttributesDescriptor[] get() {
      final AttributesDescriptor[] result = new AttributesDescriptor[myMap.size()];
      int i = 0;

      for (Map.Entry<String, TextAttributesKey> entry : myMap.entrySet()) {
        result[i++] = new AttributesDescriptor(MarkdownBundle.message(entry.getKey()), entry.getValue());
      }

      return result;
    }

    private void put(@NotNull String bundleKey, @NotNull TextAttributesKey attributes) {
      if (myMap.put(bundleKey, attributes) != null) {
        throw new IllegalArgumentException("Duplicated key: " + bundleKey);
      }
    }
  }

}
