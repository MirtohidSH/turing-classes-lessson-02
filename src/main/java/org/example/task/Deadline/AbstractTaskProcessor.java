package org.example.task.Deadline;

public abstract class AbstractTaskProcessor {

    public abstract void processTask(Task task);

    public void printProcessing(Task task) {
        System.out.println("Processing task: " + task.getTitle());
    }
}
