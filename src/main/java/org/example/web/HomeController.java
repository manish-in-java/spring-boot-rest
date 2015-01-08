package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
  @RequestMapping("/")
  @ResponseBody
  public String home()
  {
    return "<!DOCTYPE html>"
        + "<html>"
        + "<head>"
        + "<title>JSON and XML REST services with Spring Boot</title>"
        + "<style>"
        + "body, html { background: #EEE; color: #333; font-family: Arial, sans-serif; font-size: 12px; height: 100%; margin: 0; padding: 0; width: 100%; }"
        + "code { background: #EEE; font-family: 'Courier New'; }"
        + "#container { background: #FFF; margin: 0 auto; max-width: 420px; min-height: 100%; padding: 20px 40px; }"
        + "</style>"
        + "</head>"
        + "<body>"
        + "<div id='container'>"
        + "<h1>Spring Boot :: JSON and XML REST Services</h1>"
        + "<p>"
        + "This application demonstrates a simple way to develop REST services with "
        + "<a href='projects.spring.io/spring-boot'>Spring Boot</a>, a rapid application "
        + "development framework based on the Java application language.  It allows "
        + "accepting and serving JSON and XML content using the same code base. "
        + "To try out this application, install the excellent "
        + "<a href='http://www.getpostman.com/'>Postman Extension</a> for Google "
        + "Chrome.  Then, follow the steps below to work with the application."
        + "</p>"
        + "<br />"
        + "<h3>JSON exchange</h3>"
        + "<p>"
        + "Using Postman, create a <code>POST</code> request to the URL "
        + "<code>/remote/search</code> on this server.  Set the HTTP "
        + "request headers <code>Accept</code> and "
        + "<code>Content-Type</code> to <code>application/json</code>. "
        + "Put the JSON string <code>{ 'name' : 'Some name', "
        + "'address' : 'Some address' }</code> in the request body "
        + "and submit the request.  You should get the submitted values "
        + "played back as a JSON response."
        + "</p>"
        + "<br />"
        + "<h3>XML exchange</h3>"
        + "<p>"
        + "Repeat the steps above, substituting <code>text/xml</code> for "
        + "<code>application/json</code> and using "
        + "<code>&lt;sdnSearch&gt;&lt;name&gt;Some name&lt;/name&gt;&lt;address&gt;Some address&lt;/address&gt;&lt;/sdnSearch&gt;</code> "
        + "as the request body.  The submitted values will be played back as "
        + "an XML response this time."
        + "</p>"
        + "</div>"
        + "</body>"
        + "</html>";
  }
}
