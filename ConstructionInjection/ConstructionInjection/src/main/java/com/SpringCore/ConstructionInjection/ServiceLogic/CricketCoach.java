package com.SpringCore.ConstructionInjection.ServiceLogic;

import com.SpringCore.ConstructionInjection.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    //Here in this CricketCoach service logic , we have to implement the interface methods and logic here
    @Override
    public String getworkout() {
        return "Practice Bowling and Batting for 45 minutes daily! ";
    }


}
