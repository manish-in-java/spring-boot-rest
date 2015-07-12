package org.example.web.controller;

import org.example.ControllerTest;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HomeControllerTest extends ControllerTest
{
  @Test
  public void testPage() throws Exception
  {
    mock.perform(get("/"))
        .andExpect(status().isOk());
  }

  protected Object controller()
  {
    return new HomeController();
  }
}
