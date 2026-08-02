package org.cloudsimplus.thesis;


public class Action {


    private int selectedVmId;



    public Action(int selectedVmId) {


        this.selectedVmId = selectedVmId;

    }



    public int getSelectedVmId() {


        return selectedVmId;

    }



    @Override
    public String toString() {


        return "VM-" + selectedVmId;

    }

}