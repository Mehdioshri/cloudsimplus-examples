package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;

import java.util.List;


public class MakespanCalculator {


    public static double calculate(
            List<Cloudlet> cloudlets){


        double makespan = 0;


        for(Cloudlet cloudlet : cloudlets){


            if(cloudlet.isFinished()){


                double finishTime =
                        cloudlet.getFinishTime();



                if(finishTime > makespan){

                    makespan = finishTime;

                }

            }

        }


        return makespan;

    }


}