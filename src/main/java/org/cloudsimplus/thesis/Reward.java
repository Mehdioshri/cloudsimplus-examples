package org.cloudsimplus.thesis;


public class Reward {



    private static final double W1 = 0.4;

    private static final double W2 = 0.3;

    private static final double W3 = 0.2;

    private static final double W4 = 0.1;




    public static double calculate(

            double executionTime,

            double waitingTime,

            int queueLength,

            double vmLoad) {



        double reward = 0;



        reward +=
                W1 *
                (1.0 / (executionTime + 0.001));



        reward +=
                W2 *
                (1.0 / (waitingTime + 0.001));



        reward +=
                W3 *
                (1.0 / (queueLength + 1));



        reward +=
                W4 *
                (1.0 / (vmLoad + 0.001));



        return reward;

    }

}