package LowLevelDesigns.nRequestClient.thirdPartyClient;

public class Client {


    public void processRequest() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
