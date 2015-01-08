package org.example.api;

import org.example.domain.SdnSearch;
import org.example.domain.SdnSearchResult;
import org.example.service.SdnSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposes a REST-style API for external consumers to perform
 * searches on the application.
 */
@RestController
public class RemoteSearchController
{
  @Autowired
  private SdnSearchService sdnSearchService;

  /**
   * Takes a search query and returns results matching the query
   * terms.
   *
   * @param sdnSearch An {@link SdnSearch} containing the query
   *                  terms.
   * @return An {@link SdnSearchResult} containing the search
   * results.
   */
  @RequestMapping(method = RequestMethod.POST, value = "/remote/search")
  public SdnSearchResult search(@RequestBody SdnSearch sdnSearch)
  {
    return sdnSearchService.find(sdnSearch);
  }
}
