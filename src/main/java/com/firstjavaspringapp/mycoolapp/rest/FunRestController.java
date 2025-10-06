package com.firstjavaspringapp.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FunRestController {


        // inject properties for coach name and team name
      @Value("${coach.name}")
      private String coachName;

      @Value("${team.name}")
      private String teamName;

      @GetMapping("/geniusinfo")
      public String getMethodName() {
          return "Coach: " + coachName + ", Team: " + teamName;
      }
      
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
