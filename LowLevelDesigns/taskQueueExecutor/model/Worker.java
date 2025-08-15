package LowLevelDesigns.taskQueueExecutor.model;

import LowLevelDesigns.taskQueueExecutor.worker.PriorityWorkerQ;
import lombok.Setter;

@Setter
public class Worker implements Runnable {
    PriorityWorkerQ priorityWorkerQ;
    Task task;
    public Worker(PriorityWorkerQ priorityWorkerQ) {
        this.priorityWorkerQ = priorityWorkerQ;
    }

    @Override
    public void run() {
        task.run();
        priorityWorkerQ.workerList.add(this);
    }
}
