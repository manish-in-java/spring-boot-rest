package org.example.service;

import org.example.domain.SdnSearch;
import org.example.domain.SdnSearchResult;

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
