package com.SpringCore.ConstructionInjection.Controller;

import com.SpringCore.ConstructionInjection.ServiceLogic.FootBallCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootBallController {

    @Autowired
    private FootBallCoach footballcoach;   // Creating a reference for FootBallCoach class  by defining a private field .

    //Defining a constructor for Dependency Injection
    public FootBallController(FootBallCoach coach){       //Constructor Injection
        this.footballcoach=coach;
    }


    @GetMapping("/getFootballWorkout")   //getapi URL mapping
    public String getFootBallWorkout(){
        return footballcoach.getworkout();
    }
}
