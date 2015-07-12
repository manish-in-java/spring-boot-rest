package org.example.web.controller.concurrent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

@Controller
public class CallableController
{
  @RequestMapping("call")
  public @ResponseBody Callable<String> call()
  {
    return new Callable<String>()
    {
      @Override public String call() throws Exception
      {
        return "called";
      }
    };
  }
}
