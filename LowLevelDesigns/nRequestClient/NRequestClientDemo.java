package LowLevelDesigns.nRequestClient;

import LowLevelDesigns.nRequestClient.service.ServiceClient;

public class NRequestClientDemo {

    public static void main(String[] args) throws InterruptedException {
        ServiceClient serviceClient = ServiceClient.getServiceClient();

        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();
        serviceClient.performThirdPartyClient();

        Thread.sleep(40000);

        System.out.println("program completed");

        serviceClient.cleanThreadPool();
    }
}
