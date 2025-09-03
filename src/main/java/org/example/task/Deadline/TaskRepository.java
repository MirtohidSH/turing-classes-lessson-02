package org.example.task.Deadline;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository<T extends Task> {

    private final List<T> tasks = new ArrayList<>();

    public void save(T task) {
        tasks.add(task);
    }

    public void deleteById(Integer id) {
        Optional<T> task = findById(id);
        task.ifPresent(tasks::remove);
    }

    public Optional<T> findById(Integer id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
    }

    public List<T> findAll() {
        return new ArrayList<>(tasks);
    }

}
