package org.example.service.search;

import org.example.domain.search.SdnSearch;
import org.example.domain.search.SdnSearchResult;

/**
 * Contract for search operations on {@code Sdn}s.
 */
public interface SdnSearchService
{
  /**
   * Finds {@code Sdn}s matching specific search terms.
   *
   * @param sdnSearch An {@link SdnSearch} containing the query
   *                  terms.
   * @return An {@link SdnSearchResult} containing {@code Sdn}s
   * matching the query terms.
   */
  SdnSearchResult find(SdnSearch sdnSearch);
}
