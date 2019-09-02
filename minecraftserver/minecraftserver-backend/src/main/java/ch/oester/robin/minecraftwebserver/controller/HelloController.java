package ch.oester.robin.minecraftwebserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/api/test")
  public MessageDto home() {
    return new MessageDto("Testing the api");
  }
}
