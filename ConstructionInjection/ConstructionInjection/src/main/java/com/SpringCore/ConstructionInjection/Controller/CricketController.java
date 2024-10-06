package com.SpringCore.ConstructionInjection.Controller;

import com.SpringCore.ConstructionInjection.ServiceLogic.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketController {

    @Autowired
    private CricketCoach cricketCoach;  // Creating a reference for CricketCoach class  by defining a private field .


    //Defining a constructor for Dependency Injection
    public CricketController(CricketCoach cricket){  //Constructor Injection
        this.cricketCoach=cricket;
    }

    @GetMapping("/getCricketWorkout")    //getApi URL mapping
    public String getCricketWorkout(){
        return cricketCoach.getworkout();
    }

    @GetMapping("/getthanks")
    public String getThanks(){
        return "Thanks for visiting dude!!!!!!!!!";
    }

    @GetMapping("/welcome")
    public String getWelcome(){
        return  "Welcome Dudee!";
    }



}
