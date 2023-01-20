package com.xom.springauthen.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {
  
  @GetMapping(value="/admin/status")
  public String getAdminStatus() {
      return "Working admin!!!";
  }
}
