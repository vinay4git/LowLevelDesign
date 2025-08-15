package LowLevelDesigns.taskQueueExecutor.queue;

import LowLevelDesigns.taskQueueExecutor.model.Task;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public abstract class TaskQueue {
    public BlockingQueue<Task> tasks;

    public void addTask(Task t) {
        tasks.add(t);
    }

}
