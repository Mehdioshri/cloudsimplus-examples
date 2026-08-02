package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;


import java.util.List;



public class ResultsAnalyzer {



    public static void analyze(

            List<Cloudlet> cloudlets){



        int finishedTasks = 0;


        double totalFinishTime = 0;


        double makespan = 0;



        for(Cloudlet cloudlet : cloudlets){



            if(cloudlet.isFinished()){


                finishedTasks++;


                double finishTime =

                        cloudlet.getFinishTime();



                totalFinishTime += finishTime;



                if(finishTime > makespan){

                    makespan = finishTime;

                }

            }

        }



        double averageFinishTime =

                totalFinishTime /

                finishedTasks;



        System.out.println(
                "=========================="
        );


        System.out.println(
                "Finished Tasks: "
                + finishedTasks
        );


        System.out.println(
                "Makespan: "
                + makespan
        );


        System.out.println(
                "Average Finish Time: "
                + averageFinishTime
        );


        System.out.println(
                "=========================="
        );

    }


}