package LowLevelDesigns.taskQueueExecutor.worker;

import LowLevelDesigns.taskQueueExecutor.model.Worker;
import LowLevelDesigns.taskQueueExecutor.queue.HighPriorityTaskQ;
import LowLevelDesigns.taskQueueExecutor.queue.MediumPriorityTaskQ;
import lombok.SneakyThrows;

public class MediumPriorityWorkerQ extends PriorityWorkerQ implements Runnable{

    MediumPriorityTaskQ mediumPriorityTaskQ;

    public MediumPriorityWorkerQ(int queueSize, MediumPriorityTaskQ mediumPriorityTaskQ) throws InterruptedException {
        super(queueSize);
        this.mediumPriorityTaskQ = mediumPriorityTaskQ;
    }


    @SneakyThrows
    @Override
    public void run()  {
        while (true) {
            if (!mediumPriorityTaskQ.tasks.isEmpty()) {
                Worker worker = workerList.take();
                worker.setTask(mediumPriorityTaskQ.tasks.take());
                new Thread(worker).start();
            }
        }


    }


}

