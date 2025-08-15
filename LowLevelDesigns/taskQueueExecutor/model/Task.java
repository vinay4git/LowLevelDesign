package LowLevelDesigns.taskQueueExecutor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.SneakyThrows;

@Getter
@Builder
@AllArgsConstructor
public class Task implements Runnable{

    private TaskPriority taskPriority;
    private Integer taskId;

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Started performing task " + taskId);
        Thread.sleep(10000);
        System.out.println("Ended performing task " + taskId);
    }

}
