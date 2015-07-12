package org.example.domain.search;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.List;

@XmlRootElement
public class SdnSearchResult
{
  @XmlElement(name = "sdn")
  @XmlElementWrapper(name = "sdns")
  private List<Sdn> sdns;

  SdnSearchResult()
  {
    super();
  }

  public SdnSearchResult(Sdn... sdns)
  {
    this(Arrays.asList(sdns));
  }

  public SdnSearchResult(List<Sdn> sdns)
  {
    this();

    this.sdns = sdns;
  }

  public List<Sdn> getSdns()
  {
    return sdns;
  }
}
