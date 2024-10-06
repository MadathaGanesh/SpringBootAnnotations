package com.SpringCore.ConstructionInjection.ServiceLogic;

import com.SpringCore.ConstructionInjection.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {



    //Here in this FootBallCoach service logic , we have to implement the interface methods and logic here
    @Override
    public String getworkout() {
        return "Run 45 km daily to improve your performance in the FootBall ! ";
    }
}
