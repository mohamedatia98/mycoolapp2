package com.firstjavaspringapp.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

      // expose "/" that return "Hello World"

      @GetMapping("/")
      public String sayHelloWorld()
      {
        return "Hello World!";
      }

    @GetMapping("/workout")
      public String sayWorkout()
      {
        return "Going to the gym man!";
      }
    @GetMapping("/luckyday")
      public String sayLuckyday()
      {
        return "Today is your lucky day man!";
      }

      
}
