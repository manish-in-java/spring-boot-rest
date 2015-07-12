package org.example.api.search;

import org.example.api.ApiControllerTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class RemoteSearchControllerTest extends ApiControllerTest
{
  @Autowired
  private RemoteSearchController controller;

  @Test
  public void testSearchWithJSON() throws Exception
  {
    mock.perform(post("/remote/search")
                     .accept(MediaType.APPLICATION_JSON)
                     .contentType(MediaType.APPLICATION_JSON)
                     .content("{ \"name\":\"Some name\", \"address\":\"Some address\" }".getBytes()))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
  }

  @Test
  public void testSearchWithXML() throws Exception
  {
    mock.perform(post("/remote/search")
                     .accept(MediaType.APPLICATION_XML)
                     .contentType(MediaType.APPLICATION_XML)
                     .content("<sdnSearch><name>Some name</name><address>Some address</address></sdnSearch>".getBytes()))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML));
  }

  protected Object controller()
  {
    return controller;
  }
}
