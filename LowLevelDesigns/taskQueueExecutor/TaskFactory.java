package LowLevelDesigns.taskQueueExecutor;

import LowLevelDesigns.taskQueueExecutor.model.Task;
import LowLevelDesigns.taskQueueExecutor.model.TaskPriority;
import LowLevelDesigns.taskQueueExecutor.queue.HighPriorityTaskQ;
import LowLevelDesigns.taskQueueExecutor.queue.MediumPriorityTaskQ;
import LowLevelDesigns.taskQueueExecutor.queue.TaskQueue;

public class TaskFactory {
    public static TaskQueue addTaskToQ(Task task) {
        if (TaskPriority.HIGH.equals(task.getTaskPriority())) {
            HighPriorityTaskQ.getInstance().addTask(task);
        } else if (TaskPriority.MEDIUM.equals(task.getTaskPriority())) {
            MediumPriorityTaskQ.getInstance().addTask(task);
        }
        return  null;
    }
}
