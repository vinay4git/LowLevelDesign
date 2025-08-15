package LowLevelDesigns.taskQueueExecutor.worker;

import LowLevelDesigns.taskQueueExecutor.model.Worker;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class PriorityWorkerQ {
    public BlockingQueue<Worker> workerList;

    public PriorityWorkerQ(int queueSize) throws InterruptedException {
        workerList =  new LinkedBlockingQueue<>(queueSize);

        for (int i = 0; i < queueSize; i++) {
            workerList.put(new Worker(this));
        }
    }
}
