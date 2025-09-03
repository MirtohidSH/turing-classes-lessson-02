package org.example.task.Deadline;

public class EmailTaskProcessor extends AbstractTaskProcessor{

    @Override
    public void processTask(Task task) {
        System.out.println("Email sent for task [" + task.getTitle() +"]");
    }
}
