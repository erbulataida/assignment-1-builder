public class ServerSummaryBuilder implements ServerBuilder {

    private String hostname;
    private String operatingSystem;
    private int cpuCores;
    private int ramGb;
    private boolean dockerEnabled;
    private boolean monitoringEnabled;

    @Override
    public ServerSummaryBuilder hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    @Override
    public ServerSummaryBuilder operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public ServerSummaryBuilder cpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    @Override
    public ServerSummaryBuilder ramGb(int ramGb) {
        this.ramGb = ramGb;
        return this;
    }

    @Override
    public ServerSummaryBuilder enableDocker() {
        this.dockerEnabled = true;
        return this;
    }

    @Override
    public ServerSummaryBuilder enableMonitoring() {
        this.monitoringEnabled = true;
        return this;
    }
    public String getResult() {
        validate();

        return """
            === Server Configuration ===
            Hostname: %s
            Operating System: %s
            CPU Cores: %d
            RAM: %d GB
            Docker: %s
            Monitoring: %s
            """.formatted(
                hostname,
                operatingSystem,
                cpuCores,
                ramGb,
                dockerEnabled ? "Enabled" : "Disabled",
                monitoringEnabled ? "Enabled" : "Disabled"
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