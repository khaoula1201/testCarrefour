package rhamdi.proxiad.test.domain.service;

import rhamdi.proxiad.test.domain.models.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task);
    Boolean delete(Long id);
    Task find(Long id);
    List<Task> findAll();
}
