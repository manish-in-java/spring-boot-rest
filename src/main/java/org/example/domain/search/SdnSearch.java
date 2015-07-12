package org.example.domain.search;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SdnSearch
{
  private String name;
  private String address;

  SdnSearch()
  {
  }

  public String getAddress()
  {
    return address;
  }

  public String getName()
  {
    return name;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
