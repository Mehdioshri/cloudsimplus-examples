package org.cloudsimplus.thesis;

import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.cloudlets.CloudletSimple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CloudletGenerator {

    public static List<Cloudlet> createCloudlets(

            int numberOfTasks){

        List<Cloudlet> cloudletList =
                new ArrayList<>();

        Random random = new Random();

        for(int i=0;i<numberOfTasks;i++){

            long length =

                    SimulationConfig.MIN_TASK_LENGTH

                    +

                    random.nextInt(

                            (int)(SimulationConfig.MAX_TASK_LENGTH

                            -

                            SimulationConfig.MIN_TASK_LENGTH)

                    );

            Cloudlet cloudlet =

                    new CloudletSimple(

                            length,

                            SimulationConfig.CLOUDLET_PES

                    );

            cloudletList.add(cloudlet);

        }

        return cloudletList;

    }

}