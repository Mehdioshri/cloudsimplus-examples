package org.cloudsimplus.thesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class QLearningAgent {


    // جدول Q
    private final Map<String, double[]> qTable;


    // تعداد VM ها
    private final int numberOfVMs;


    // پارامترهای Q-Learning
    private final double alpha;     // Learning Rate
    private final double gamma;     // Discount Factor
    private double epsilon;         // Exploration Rate


    private final Random random;



    public QLearningAgent(int numberOfVMs) {


        this.numberOfVMs = numberOfVMs;


        this.alpha = 0.1;

        this.gamma = 0.9;

        this.epsilon = 0.1;


        this.qTable = new HashMap<>();

        this.random = new Random();

    }



    /*
       تبدیل State به کلید برای Q-Table
    */
    private String getStateKey(State state) {


        return

        (int)state.getTaskLength()
                + "_"
                +
        (int)state.getVmLoad()
                + "_"
                +
        (int)state.getVmMips()
                + "_"
                +
        state.getQueueLength()
                + "_"
                +
        (int)state.getWaitingTime();

    }



    /*
       انتخاب VM
       ε-Greedy
    */
    public int chooseAction(State state) {


        String key = getStateKey(state);


        qTable.putIfAbsent(
                key,
                new double[numberOfVMs]
        );



        // Exploration
        if(random.nextDouble() < epsilon) {


            return random.nextInt(numberOfVMs);

        }



        // Exploitation

        double[] qValues =
                qTable.get(key);


        int bestAction = 0;



        for(int i=1; i<numberOfVMs; i++) {


            if(qValues[i] > qValues[bestAction]) {


                bestAction = i;

            }

        }


        return bestAction;

    }





    /*
       بروزرسانی Q Table

       Q(s,a)=Q(s,a)+α[r+γmaxQ(s',a')-Q(s,a)]
    */

    public void updateQTable(

            State currentState,

            int action,

            double reward,

            State nextState

    ) {



        String currentKey =
                getStateKey(currentState);



        String nextKey =
                getStateKey(nextState);



        qTable.putIfAbsent(
                currentKey,
                new double[numberOfVMs]
        );


        qTable.putIfAbsent(
                nextKey,
                new double[numberOfVMs]
        );



        double[] currentQ =
                qTable.get(currentKey);



        double[] nextQ =
                qTable.get(nextKey);



        double maxNextQ = nextQ[0];



        for(double value : nextQ) {


            if(value > maxNextQ) {

                maxNextQ = value;

            }

        }



        currentQ[action] =

                currentQ[action]

                +

                alpha *

                (

                reward

                +

                gamma * maxNextQ

                -

                currentQ[action]

                );


    }





    public void reduceExploration(){


        epsilon *= 0.99;


        if(epsilon < 0.01)

            epsilon = 0.01;

    }



    public double getEpsilon(){

        return epsilon;

    }


}