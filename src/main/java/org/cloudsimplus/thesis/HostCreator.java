package org.cloudsimplus.thesis;

import org.cloudsimplus.hosts.Host;
import org.cloudsimplus.hosts.HostSimple;
import org.cloudsimplus.resources.Pe;
import org.cloudsimplus.resources.PeSimple;

import java.util.ArrayList;
import java.util.List;

public class HostCreator {

    public static List<Host> createHosts(int numberOfHosts){

        List<Host> hostList = new ArrayList<>();

        for(int i=0;i<numberOfHosts;i++){

            List<Pe> peList = new ArrayList<>();

            for(int j=0;
                j<SimulationConfig.HOST_PES;
                j++){

                peList.add(
                        new PeSimple(
                                SimulationConfig.HOST_MIPS
                        )
                );

            }

            Host host = new HostSimple(

                    SimulationConfig.HOST_RAM,

                    SimulationConfig.HOST_BW,

                    SimulationConfig.HOST_STORAGE,

                    peList

            );

            hostList.add(host);

        }

        return hostList;

    }

}