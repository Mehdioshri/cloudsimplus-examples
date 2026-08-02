package org.cloudsimplus.thesis;

public final class SimulationConfig {

    private SimulationConfig() { }

    /* Datacenter */
    public static final int NUMBER_OF_HOSTS = 5;

    /* Virtual Machines */
    public static final int NUMBER_OF_VMS = 20;

    public static final int VM_MIPS = 1000;
    public static final int VM_PES = 1;
    public static final int VM_RAM = 2048;
    public static final long VM_BW = 1000;
    public static final long VM_SIZE = 10000;

    /* Host */
    public static final int HOST_PES = 4;
    public static final int HOST_MIPS = 1000;
    public static final long HOST_RAM = 8192;
    public static final long HOST_BW = 10000;
    public static final long HOST_STORAGE = 1000000;

    /* Cloudlets */
    public static final int NUMBER_OF_TASKS = 1000;

    public static final int CLOUDLET_PES = 1;

    public static final long MIN_TASK_LENGTH = 5000;
    public static final long MAX_TASK_LENGTH = 15000;

    /* Poisson Arrival */
    public static final double[] LAMBDAS = {5,10,20};

    /* Q-Learning */
    public static final double ALPHA = 0.1;
    public static final double GAMMA = 0.9;
    public static final double EPSILON = 0.1;

}