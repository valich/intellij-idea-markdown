package org.intellij.plugins.markdown.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.util.containers.ContainerUtil;
import org.intellij.markdown.parser.TokensCache;
import org.intellij.plugins.markdown.lang.MarkdownElementType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PsiBuilderTokensCache extends TokensCache {
  @NotNull
  private final List<TokenInfo> cachedTokens;
  @NotNull
  private final List<TokenInfo> filteredTokens;
  @NotNull
  private final PsiBuilder builder;

  public PsiBuilderTokensCache(@NotNull PsiBuilder builder) {
    this.builder = builder;
    cachedTokens = ContainerUtil.newArrayList();
    filteredTokens = ContainerUtil.newArrayList();

    cacheTokens();
    verify();
  }

  private void cacheTokens() {
    PsiBuilder.Marker startMarker = builder.mark();

    for (int i = 0; builder.rawLookup(i) != null; ++i) {
      cachedTokens.add(new TokenInfo(MarkdownElementType.markdownType(builder.rawLookup(i)),
              builder.rawTokenTypeStart(i),
              builder.rawTokenTypeStart(i + 1),
              i,
              -1));
    }

    int listIndex = 0;
    int builderIndex = 0;
    while (builder.getTokenType() != null) {
      while (builder.getCurrentOffset() > cachedTokens.get(listIndex).getTokenStart()) {
        listIndex++;
      }
      assert builder.getCurrentOffset() == cachedTokens.get(listIndex).getTokenStart();
      cachedTokens.get(listIndex).setNormIndex(builderIndex);
      filteredTokens.add(cachedTokens.get(listIndex));

      builder.advanceLexer();
      builderIndex++;
    }

    startMarker.rollbackTo();
  }

  @NotNull
  @Override
  public List<TokenInfo> getCachedTokens() {
    return cachedTokens;
  }

  @NotNull
  @Override
  public List<TokenInfo> getFilteredTokens() {
    return filteredTokens;
  }

  @NotNull
  @Override
  public CharSequence getOriginalText() {
    return builder.getOriginalText();
  }
}
