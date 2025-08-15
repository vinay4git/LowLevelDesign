package LowLevelDesigns.taskQueueExecutor;

import LowLevelDesigns.taskQueueExecutor.model.Task;
import LowLevelDesigns.taskQueueExecutor.model.TaskPriority;
import LowLevelDesigns.taskQueueExecutor.queue.HighPriorityTaskQ;
import LowLevelDesigns.taskQueueExecutor.queue.MediumPriorityTaskQ;
import LowLevelDesigns.taskQueueExecutor.worker.HighPriorityWorkerQ;
import LowLevelDesigns.taskQueueExecutor.worker.MediumPriorityWorkerQ;

public class DistributedTaskQDemo {
    public static void main(String[] args) throws InterruptedException {
        HighPriorityTaskQ highPriorityTaskQ = HighPriorityTaskQ.getInstance();
        MediumPriorityTaskQ mediumPriorityTaskQ = MediumPriorityTaskQ.getInstance();

        HighPriorityWorkerQ highPriorityWorkerQ = new HighPriorityWorkerQ(2, highPriorityTaskQ);
        MediumPriorityWorkerQ mediumPriorityWorkerQ = new MediumPriorityWorkerQ(1, mediumPriorityTaskQ);

        Thread highPriorityAssiginingThread = new Thread(highPriorityWorkerQ);
        Thread lowPriorityAssiginingThread = new Thread(mediumPriorityWorkerQ);

        highPriorityAssiginingThread.start();
        lowPriorityAssiginingThread.start();

        highPriorityAssiginingThread.isDaemon();
        lowPriorityAssiginingThread.isDaemon();

        Task task1 = new Task(TaskPriority.HIGH, 1);
        Task task2 = new Task(TaskPriority.HIGH, 2);
        Task task3 = new Task(TaskPriority.HIGH, 3);
        Task task4 = new Task(TaskPriority.MEDIUM, 4);
        Task task5 = new Task(TaskPriority.MEDIUM, 5);

        TaskFactory.addTaskToQ(task1);
        TaskFactory.addTaskToQ(task2);
        TaskFactory.addTaskToQ(task3);
        TaskFactory.addTaskToQ(task4);
        TaskFactory.addTaskToQ(task5);


/*        lowPriorityAssiginingThread.interrupt();
        highPriorityAssiginingThread.interrupt();*/


    }

}
