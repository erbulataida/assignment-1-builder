public interface ServerBuilder {

    ServerBuilder hostname(String hostname);

    ServerBuilder operatingSystem(String operatingSystem);

    ServerBuilder cpuCores(int cpuCores);

    ServerBuilder ramGb(int ramGb);

    ServerBuilder enableDocker();

    ServerBuilder enableMonitoring();
}