package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;


public class MinMinScheduler {


    public static void schedule(

            List<Cloudlet> cloudlets,

            List<Vm> vmList){



        for(Cloudlet cloudlet : cloudlets){


            Vm selectedVm = vmList.get(0);



            for(Vm vm : vmList){


                if(vm.getMips()
                        >
                    selectedVm.getMips()){


                    selectedVm = vm;

                }

            }



            cloudlet.setVm(selectedVm);

        }

    }

}