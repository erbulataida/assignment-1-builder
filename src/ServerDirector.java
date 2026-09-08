public class ServerDirector {

    private static final String OPERATING_SYSTEM = "Ubuntu";

    private static final String DEVELOPMENT_HOSTNAME = "dev-server";
    private static final int DEVELOPMENT_CPU_CORES = 2;
    private static final int DEVELOPMENT_RAM_GB = 4;

    private static final String PRODUCTION_HOSTNAME = "prod-server";
    private static final int PRODUCTION_CPU_CORES = 8;
    private static final int PRODUCTION_RAM_GB = 32;

    public void makeDevelopmentServer(ServerBuilder builder) {
        builder
                .hostname(DEVELOPMENT_HOSTNAME)
                .operatingSystem(OPERATING_SYSTEM)
                .cpuCores(DEVELOPMENT_CPU_CORES)
                .ramGb(DEVELOPMENT_RAM_GB)
                .enableDocker();
    }

    public void makeProductionServer(ServerBuilder builder) {
        builder
                .hostname(PRODUCTION_HOSTNAME)
                .operatingSystem(OPERATING_SYSTEM)
                .cpuCores(PRODUCTION_CPU_CORES)
                .ramGb(PRODUCTION_RAM_GB)
                .enableDocker()
                .enableMonitoring();
    }
}