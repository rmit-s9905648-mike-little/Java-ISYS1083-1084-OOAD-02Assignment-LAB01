package task3;


public class CloudServer {
    private static final CloudServer INSTANCE = new CloudServer();

    private CloudServer() {}

    public static CloudServer getInstance() {
        return INSTANCE;
    }


}

