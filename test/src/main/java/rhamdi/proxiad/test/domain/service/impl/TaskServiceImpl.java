package rhamdi.proxiad.test.domain.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rhamdi.proxiad.test.app.ports.out.TaskRepo;
import rhamdi.proxiad.test.domain.models.Task;
import rhamdi.proxiad.test.domain.service.TaskService;

import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;
    @Override
    public Task create(Task task) {
        return this.taskRepo.save(task);
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Task find(Long id) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }
}
