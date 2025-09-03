package org.example.task.Deadline;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

    private Integer id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean isCompleted;
    private TaskStatus status;

    public Task(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.isCompleted = false;
        this.status = TaskStatus.NEW;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isCompleted == task.isCompleted && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(createdAt, task.createdAt) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, createdAt, isCompleted, status);
    }

    @Override
    public String toString() {
        return String.format(
                "Task [ID=%d, Title='%s', Description='%s', CreatedAt=%s, Completed=%s, Status=%s]",
                id, title, description, createdAt, isCompleted, status
        );
    }
}
