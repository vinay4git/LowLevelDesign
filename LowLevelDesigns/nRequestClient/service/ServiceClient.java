package LowLevelDesigns.nRequestClient.service;

import LowLevelDesigns.nRequestClient.thirdPartyClient.ThirdPartyClientController;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static LowLevelDesigns.nRequestClient.thirdPartyClient.ClientConstants.MAX_ALLOWED_REQUESTS_IN_PARALLEL;

public class ServiceClient {
    private static  ServiceClient client = new ServiceClient();

    private ServiceClient() {
    }

    ThirdPartyClientController clientController = new ThirdPartyClientController();
    ThreadPoolExecutor fixedThreadPoll = new ThreadPoolExecutor(MAX_ALLOWED_REQUESTS_IN_PARALLEL, MAX_ALLOWED_REQUESTS_IN_PARALLEL, 2000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(MAX_ALLOWED_REQUESTS_IN_PARALLEL*3));

    public static ServiceClient getServiceClient() {
        return client;
    }

    public void performThirdPartyClient() {
        fixedThreadPoll.execute(clientController);

        //CompletableFuture.runAsync(clientController, fixedThreadPoll);
    }

    public void cleanThreadPool() {
        fixedThreadPoll.shutdown();
    }


}
