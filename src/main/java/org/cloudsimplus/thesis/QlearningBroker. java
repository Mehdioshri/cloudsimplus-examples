package org.cloudsimplus.thesis;

import org.cloudsimplus.brokers.DatacenterBrokerSimple;
import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.core.CloudSim;
import org.cloudsimplus.vms.Vm;

import java.util.List;


public class QLearningBroker extends DatacenterBrokerSimple {


    private final QLearningAgent agent;



    public QLearningBroker(
            CloudSim simulation,
            QLearningAgent agent) {


        super(simulation);

        this.agent = agent;

    }




    /*
     انتخاب VM با استفاده از Q-Learning
     */

    public Vm selectVm(

            Cloudlet cloudlet,

            List<Vm> vmList){



        double taskLength =
                cloudlet.getLength();



        // در اینجا State ساخته می‌شود
        // اطلاعات واقعی VM بعداً از CloudSim گرفته می‌شود


        State state = new State(

                taskLength,

                0,          // VM Load

                0,          // VM MIPS

                0,          // Queue Length

                0           // Waiting Time

        );



        int selectedVmId =

                agent.chooseAction(state);



        return vmList.get(selectedVmId);

    }




    /*
      اختصاص Cloudlet به VM انتخاب شده
    */

    public void submitCloudletWithQLearning(

            Cloudlet cloudlet,

            List<Vm> vmList){



        Vm selectedVm =

                selectVm(
                        cloudlet,
                        vmList
                );



        cloudlet.setVm(selectedVm);


        submitCloudletList(
                List.of(cloudlet)
        );


    }



}