package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> listarTodos() {
        return taskRepository.findAll();
    }

    public Task salvar(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> listarPorStatus(Task.Status status) {
        return taskRepository.findByStatus(status);
    }
 }
