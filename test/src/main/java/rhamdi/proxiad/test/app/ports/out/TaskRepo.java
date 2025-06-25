package rhamdi.proxiad.test.app.ports.out;

import rhamdi.proxiad.test.domain.models.Task;

import java.util.List;

public interface TaskRepo {
    Task save(Task task);
    Boolean delete(Long id);
    Task findById(Long id);
    List<Task> findAll();
}
