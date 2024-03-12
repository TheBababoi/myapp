package com.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // inject properties
    @Value("${workout.day}")
    private String workoutDay;
    @Value("${muscle.group}")
    private String muscleGroup;

    // expose new endpoint for workoutDay
    @GetMapping("/workoutDay")
    public String workoutDay(){
        return "Time for a " + workoutDay + " Workout! The muscle groups that are going to get trained today are: " + muscleGroup;
    }

    // expose "/" that returns "Hello World"

    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

   @GetMapping("/workout")
    public String getWorkout(){
        return "Begin Bench Pressing!";
    }

    @GetMapping("/finishWorkout")
    public String getFinishWorkout(){
        return "Drink Protein Shake";
    }

}
