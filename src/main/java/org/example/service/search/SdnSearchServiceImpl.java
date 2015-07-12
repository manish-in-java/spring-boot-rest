package org.example.service.search;

import org.example.domain.search.Sdn;
import org.example.domain.search.SdnSearch;
import org.example.domain.search.SdnSearchResult;
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
