package org.cloudsimplus.thesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoissonTaskGenerator {

    private static final Random random =
            new Random();

    public static List<Double> generateArrivalTimes(

            int numberOfTasks,

            double lambda){

        List<Double> arrivalTimes =
                new ArrayList<>();

        double currentTime = 0;

        for(int i=0;i<numberOfTasks;i++){

            double u = random.nextDouble();

            double interval =
                    -Math.log(1-u)/lambda;

            currentTime += interval;

            arrivalTimes.add(currentTime);

        }

        return arrivalTimes;

    }

}