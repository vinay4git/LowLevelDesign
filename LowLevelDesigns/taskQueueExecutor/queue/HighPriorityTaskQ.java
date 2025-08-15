package LowLevelDesigns.taskQueueExecutor.queue;

import LowLevelDesigns.taskQueueExecutor.model.Task;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class HighPriorityTaskQ extends TaskQueue {
    private static final HighPriorityTaskQ highPriorityTaskQ = new HighPriorityTaskQ();
    private HighPriorityTaskQ() {
        tasks = new LinkedBlockingQueue<>();
    }

    public static HighPriorityTaskQ getInstance() {
        return highPriorityTaskQ;
    }
}
