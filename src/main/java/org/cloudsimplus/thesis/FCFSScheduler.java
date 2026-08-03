package org.cloudsimplus.thesis;

import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;

public class FCFSScheduler {

    public void schedule(List<Cloudlet> cloudlets,
                         List<Vm> vmList){

        int vmIndex = 0;

        for(Cloudlet cloudlet : cloudlets){

            cloudlet.setVm(vmList.get(vmIndex));

            vmIndex++;

            if(vmIndex >= vmList.size()){
                vmIndex = 0;
            }
        }
    }

}