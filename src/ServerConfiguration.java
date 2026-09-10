public class ServerConfiguration {

    private final String hostname;
    private final String operatingSystem;
    private final int cpuCores;
    private final int ramGb;
    private final boolean dockerEnabled;
    private final boolean monitoringEnabled;

     ServerConfiguration(
            String hostname,
            String operatingSystem,
            int cpuCores,
            int ramGb,
            boolean dockerEnabled,
            boolean monitoringEnabled
    )  {
        this.hostname = hostname;
        this.operatingSystem = operatingSystem;
        this.cpuCores = cpuCores;
        this.ramGb = ramGb;
        this.dockerEnabled = dockerEnabled;
        this.monitoringEnabled = monitoringEnabled;
    }

    @Override
    public String toString(){
        return "ServerConfiguration{" +
                "hostname='" + hostname + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", cpuCores=" + cpuCores +
                ", ramGb=" + ramGb +
                ", dockerEnabled=" + dockerEnabled +
                ", monitoringEnabled=" + monitoringEnabled +
                '}';
    }


    }
