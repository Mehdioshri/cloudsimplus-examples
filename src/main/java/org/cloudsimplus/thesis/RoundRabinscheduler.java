package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;


public class RoundRobinScheduler {



    public static void schedule(

            List<Cloudlet> cloudlets,

            List<Vm> vmList){



        int index = 0;



        for(Cloudlet cloudlet : cloudlets){



            Vm vm =
                    vmList.get(index);



            cloudlet.setVm(vm);



            index++;



            if(index == vmList.size()){

                index = 0;

            }

        }

    }

}