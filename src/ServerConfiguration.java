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

    public static class Builder {
       private String hostname;
       private String operatingSystem;
       private int cpuCores;
       private int ramGb;
       private boolean dockerEnabled;
       private boolean monitoringEnabled;

       public Builder hostname(String hostname) {
           this.hostname = hostname;
           return this;
       }

       public Builder operatingSystem(String operatingSystem){
           this.operatingSystem = operatingSystem;
           return this;
       }

       public Builder cpuCores(int cpuCores) {
           this.cpuCores = cpuCores;
           return this;
       }

       public Builder ramGb(int ramGb){
           this.ramGb = ramGb;
           return this;
       }

       public Builder enableDocker(){
           this.dockerEnabled = true;
           return this;
       }

       public Builder enableMonitoring(){
           this.monitoringEnabled = true;
           return this;
       }

       public ServerConfiguration build() {
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
           if (cpuCores <= 0 ) {
               throw new IllegalStateException("CPU cores must be greater than 0");
           }
           if (ramGb <= 0 ){
               throw new IllegalStateException("RAM must be grater than 0");
           }
       }
    }
}
