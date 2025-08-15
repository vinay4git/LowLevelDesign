package LowLevelDesigns.taskQueueExecutor.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class MediumPriorityTaskQ extends TaskQueue {
    private static final MediumPriorityTaskQ mediumPriorityTaskQ = new MediumPriorityTaskQ();
    public MediumPriorityTaskQ() {
        tasks = new LinkedBlockingQueue<>();
    }
    public static MediumPriorityTaskQ getInstance() {
        return mediumPriorityTaskQ;
    }

}
