package org.example.domain;

import javax.xml.bind.annotation.XmlElement;

public class Sdn
{
  @XmlElement
  private String name;
  @XmlElement
  private String address;

  public Sdn(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getAddress()
  {
    return address;
  }

  public String getName()
  {
    return name;
  }
}
