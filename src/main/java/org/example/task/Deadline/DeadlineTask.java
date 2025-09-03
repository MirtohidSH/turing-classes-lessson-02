package org.example.task.Deadline;

import java.time.LocalDateTime;

public class DeadlineTask extends Task {

    private LocalDateTime deadline;

    public DeadlineTask(Integer id, String title, String description, LocalDateTime deadline) {
        super(id, title, description);
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String deadlineInfo = String.format(", Deadline= %s", deadline);

        if(deadline != null && deadline.isBefore(LocalDateTime.now())) {
            deadlineInfo += "Deadline kecib";
        }

        return baseInfo.replace("]", "") + deadlineInfo + "]";
    }
}
