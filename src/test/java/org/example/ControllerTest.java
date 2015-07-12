package org.example;

import org.junit.Before;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public abstract class ControllerTest
{
  protected MockMvc mock;

  @Before
  public void setup()
  {
    mock = MockMvcBuilders.standaloneSetup(controller())
        .setMessageConverters(new MappingJackson2HttpMessageConverter()
            , new Jaxb2RootElementHttpMessageConverter())
        .build();
  }

  protected abstract Object controller();
}
