public class Main {

    public static void main(String[] args) {

        ServerDirector director = new ServerDirector();

        ServerConfigurationBuilder objectBuilder =
                new ServerConfigurationBuilder();

        director.makeProductionServer(objectBuilder);

        ServerConfiguration server = objectBuilder.getResult();

        ServerSummaryBuilder summaryBuilder =
                new ServerSummaryBuilder();

        director.makeProductionServer(summaryBuilder);

        String summary = summaryBuilder.getResult();

        System.out.println(server);
        System.out.println();
        System.out.println(summary);
    }
}