package LowLevelDesigns.nRequestClient.thirdPartyClient;

import java.util.concurrent.atomic.AtomicInteger;

public class ThirdPartyClientController implements Runnable{

    static AtomicInteger currentRequest = new AtomicInteger(0);
    Client client;
    public ThirdPartyClientController() {
        client = new Client();
    }
    public void run() {
        currentRequest.getAndIncrement();

        if ( currentRequest.get() > ClientConstants.MAX_ALLOWED_REQUESTS_IN_PARALLEL) {
            System.out.println("Failed the client call");
        }   else {
            System.out.println("Third Party client operation performed.");
            client.processRequest();
        }

        currentRequest.getAndDecrement();
    }


}
