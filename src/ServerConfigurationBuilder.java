public class ServerConfigurationBuilder implements ServerBuilder {

    private String hostname;
    private String operatingSystem;
    private int cpuCores;
    private int ramGb;
    private boolean dockerEnabled;
    private boolean monitoringEnabled;

    @Override
    public ServerConfigurationBuilder hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    @Override
    public ServerConfigurationBuilder operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public ServerConfigurationBuilder cpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    @Override
    public ServerConfigurationBuilder ramGb(int ramGb) {
        this.ramGb = ramGb;
        return this;
    }

    @Override
    public ServerConfigurationBuilder enableDocker() {
        this.dockerEnabled = true;
        return this;
    }

    @Override
    public ServerConfigurationBuilder enableMonitoring() {
        this.monitoringEnabled = true;
        return this;
    }

    public ServerConfiguration getResult() {
        validate();

        return new ServerConfiguration(
                hostname,
                operatingSystem,
                cpuCores,
                ramGb,
                dockerEnabled,
                monitoringEnabled
        );
    }
    private void validate() {
        if (hostname == null || hostname.isBlank()) {
            throw new IllegalStateException("Hostname is required");
        }

        if (operatingSystem == null || operatingSystem.isBlank()) {
            throw new IllegalStateException("Operating system is required");
        }

        if (cpuCores <= 0) {
            throw new IllegalStateException("CPU cores must be greater than 0");
        }

        if (ramGb <= 0) {
            throw new IllegalStateException("RAM must be greater than 0");
        }
    }
}