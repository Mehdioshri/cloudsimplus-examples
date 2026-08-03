package org.cloudsimplus.thesis;


public class State {


    // طول Task (MI)
    private double taskLength;


    // بار فعلی VM
    private double vmLoad;


    // توان پردازشی VM
    private double vmMips;


    // تعداد Taskهای داخل صف VM
    private int queueLength;


    // زمان انتظار Task
    private double waitingTime;



    public State(
            double taskLength,
            double vmLoad,
            double vmMips,
            int queueLength,
            double waitingTime) {


        this.taskLength = taskLength;
        this.vmLoad = vmLoad;
        this.vmMips = vmMips;
        this.queueLength = queueLength;
        this.waitingTime = waitingTime;

    }



    public double getTaskLength() {

        return taskLength;

    }


    public double getVmLoad() {

        return vmLoad;

    }


    public double getVmMips() {

        return vmMips;

    }


    public int getQueueLength() {

        return queueLength;

    }


    public double getWaitingTime() {

        return waitingTime;

    }



    @Override
    public String toString() {

        return taskLength + "_"
                + vmLoad + "_"
                + vmMips + "_"
                + queueLength + "_"
                + waitingTime;

    }

}