package org.cloudsimplus.thesis;


import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.core.CloudSim;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.hosts.Host;
import org.cloudsimplus.vms.Vm;

import java.util.List;


public class MainSimulation {


    public static void main(String[] args) {


        // 1- ایجاد محیط CloudSim
        CloudSim simulation = new CloudSim();



        // 2- ساخت Host ها
        List<Host> hostList =
                HostCreator.createHosts(
                        SimulationConfig.NUMBER_OF_HOSTS
                );



        // 3- ساخت Datacenter

        Datacenter datacenter =
                DatacenterCreator.createDatacenter(
                        simulation,
                        hostList
                );



        // 4- ساخت VM ها

        List<Vm> vmList =
                VmCreator.createVMs(
                        SimulationConfig.NUMBER_OF_VMS
                );



        // 5- تولید Task ها

        List<Cloudlet> cloudletList =
                CloudletGenerator.createCloudlets(
                        SimulationConfig.NUMBER_OF_TASKS
                );



        // 6- ساخت Q-Learning Agent

        QLearningAgent agent =
                new QLearningAgent(
                        SimulationConfig.NUMBER_OF_VMS
                );



        /*
          در این قسمت QLearningBroker
          Task را بررسی می‌کند،
          State می‌سازد،
          VM انتخاب می‌کند
        */



        QLearningBroker broker =
                new QLearningBroker(
                        simulation,
                        agent
                );



        // ارسال VM ها به Broker

        broker.submitVmList(vmList);



        // ارسال Task ها

        broker.submitCloudletList(
                cloudletList
        );



        // 7- اجرای شبیه سازی

        simulation.start();



        // 8- دریافت نتایج

        List<Cloudlet> finishedCloudlets =
                broker.getCloudletFinishedList();



        // 9- محاسبه Makespan

        double makespan =
                MakespanCalculator.calculate(
                        finishedCloudlets
                );



        System.out.println(
                "Makespan = "
                + makespan
        );



        // 10- تحلیل نتایج

        ResultsAnalyzer.analyze(
                finishedCloudlets
        );


    }

}