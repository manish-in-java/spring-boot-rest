package org.example.service;

import org.example.domain.Sdn;
import org.example.domain.SdnSearch;
import org.example.domain.SdnSearchResult;
import org.springframework.stereotype.Service;

/**
 * Provides search operations on {@link Sdn}s.
 */
@Service
public class SdnSearchServiceImpl implements SdnSearchService
{
  /**
   * {@inheritDoc}
   */
  public SdnSearchResult find(SdnSearch search)
  {
    return new SdnSearchResult(new Sdn(search.getName(), search.getAddress()));
  }
}
