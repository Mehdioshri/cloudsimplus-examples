package org.cloudsimplus.thesis;

import org.cloudsimplus.core.CloudSim;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.datacenters.DatacenterSimple;
import org.cloudsimplus.hosts.Host;

import java.util.List;

public class DatacenterCreator {

    public static Datacenter createDatacenter(

            CloudSim simulation,

            List<Host> hostList){

        Datacenter datacenter =

                new DatacenterSimple(

                        simulation,

                        hostList

                );

        return datacenter;

    }

}