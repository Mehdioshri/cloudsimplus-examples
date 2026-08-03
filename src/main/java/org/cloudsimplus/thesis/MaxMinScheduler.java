package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;



public class MaxMinScheduler {



    public static void schedule(

            List<Cloudlet> cloudlets,

            List<Vm> vmList){



        for(Cloudlet cloudlet : cloudlets){



            Vm selectedVm =
                    vmList.get(0);



            double maxTime =
                    estimateTime(
                            cloudlet,
                            selectedVm
                    );



            for(Vm vm : vmList){



                double time =
                        estimateTime(
                                cloudlet,
                                vm
                        );



                if(time > maxTime){


                    maxTime = time;

                    selectedVm = vm;


                }


            }



            cloudlet.setVm(selectedVm);


        }


    }




    private static double estimateTime(

            Cloudlet cloudlet,

            Vm vm){


        return cloudlet.getLength()
                /
                vm.getMips();


    }


}