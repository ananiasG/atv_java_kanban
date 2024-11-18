package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> listarTodos() {
        return taskService.listarTodos();
    }

    @PostMapping
    public Task salvar(@RequestBody Task task) {
        return taskService.salvar(task);
    }

    @GetMapping("/status/{status}")
    public List<Task> listarPorStatus(@PathVariable Task.Status status) {
        return taskService.listarPorStatus(status);
    }
}
