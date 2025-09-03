package org.example.task.Deadline;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Integer id) {
        super("Task with id [" + id + "] not found");
    }
}
