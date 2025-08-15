package LowLevelDesigns.taskQueueExecutor.worker;

import LowLevelDesigns.taskQueueExecutor.model.Worker;
import LowLevelDesigns.taskQueueExecutor.queue.HighPriorityTaskQ;
import lombok.SneakyThrows;

public class HighPriorityWorkerQ extends PriorityWorkerQ implements Runnable{

    HighPriorityTaskQ highPriorityTaskQ;

    public HighPriorityWorkerQ(int queueSize, HighPriorityTaskQ highPriorityTaskQ) throws InterruptedException {
        super(queueSize);
        this.highPriorityTaskQ = highPriorityTaskQ;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            if (!highPriorityTaskQ.tasks.isEmpty()) {
                Worker worker = workerList.take();
                worker.setTask(highPriorityTaskQ.tasks.take());
                new Thread(worker).start();
            }
        }


    }


}

