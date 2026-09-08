public class Main {
    public static void main(String[] args) {

        ServerConfiguration server = new ServerConfiguration.Builder()
                .hostname("web-server")
                .operatingSystem("Ubuntu")
                .cpuCores(4)
                .ramGb(8)
                .enableDocker()
                .enableMonitoring()
                .build();
        System.out.println(server);
    }
}
