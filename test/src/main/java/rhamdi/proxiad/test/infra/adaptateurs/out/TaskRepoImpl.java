package rhamdi.proxiad.test.infra.adaptateurs.out;

import org.springframework.stereotype.Repository;
import rhamdi.proxiad.test.app.ports.out.TaskRepo;
import rhamdi.proxiad.test.domain.models.Task;

import java.util.List;

@Repository
public class TaskRepoImpl implements TaskRepo {
    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }
}
