package com.xom.springauthen.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class UserController {
  
  @GetMapping(value="/user/status")
  public String getUserStatus() {
      return "Working user!!!";
  }
  
}
