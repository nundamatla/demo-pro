package com.example;
import org.springframework.web.bind.annotation.*;
import com.fis.logging.core.LoggingService;

@RestController
public class HelloController{
 private final LoggingService log;
 public HelloController(LoggingService log){this.log=log;}

 @GetMapping("/hello")
 public String hello(){
  log.debug("debug");
  log.info("info");
  log.warn("warn");
  return "ok";
 }
}