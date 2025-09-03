package org.example.task.Deadline;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTask(Task task) {
        repository.save(task);
    }

    @Override
    public void removeTask(Integer id) {
        Optional<Task> task = repository.findById(id);
        if(task.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new TaskNotFoundException(id);
        }
    }

    @Override
    public Optional<Task> findTaskById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Task> listAllTasks() {
        return repository.findAll();
    }
}
