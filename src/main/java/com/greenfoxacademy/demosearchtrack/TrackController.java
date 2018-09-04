package com.greenfoxacademy.demosearchtrack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrackController {

  @GetMapping("/egyik")
  public String showEgyik() {
    return "egyik";
  }

  @GetMapping("/masik")
  public  String showMasik() {
    return  "masik";
  }
}
