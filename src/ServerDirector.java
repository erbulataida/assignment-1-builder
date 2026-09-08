public class ServerDirector {

    public void makeDevelopmentServer(ServerBuilder builder) {
        builder
                .hostname("dev-server")
                .operatingSystem("Ubuntu")
                .cpuCores(2)
                .ramGb(4)
                .enableDocker();
    }

    public void makeProductionServer(ServerBuilder builder) {
        builder
                .hostname("prod-server")
                .operatingSystem("Ubuntu")
                .cpuCores(8)
                .ramGb(32)
                .enableDocker()
                .enableMonitoring();
    }
}