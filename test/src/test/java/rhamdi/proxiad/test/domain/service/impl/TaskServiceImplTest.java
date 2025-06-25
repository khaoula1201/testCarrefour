package rhamdi.proxiad.test.domain.service.impl;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import rhamdi.proxiad.test.app.ports.out.TaskRepo;
import rhamdi.proxiad.test.domain.enums.TaskStatus;
import rhamdi.proxiad.test.domain.models.Task;
import rhamdi.proxiad.test.domain.service.TaskService;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceImplTest {
    TaskService taskService;
    TaskRepo taskRepo;
    @Before
    public void setup() {
        taskRepo=Mockito.mock(TaskRepo.class);
        taskService = new TaskServiceImpl(taskRepo);
    }

    @Test
    public void shouldCreateTask() {
        //before
        Task task = new Task(null,"task1","des1", LocalDateTime.now(), TaskStatus.PENDING);
        Task taskCreated = new Task(1L,"task1","des1", LocalDateTime.now(), TaskStatus.PENDING);
        //when
        Mockito.when(taskRepo.save(task)).thenReturn(taskCreated);
        //then
        Task result = taskService.create(task);
        assertNotNull(result);
        assertEquals(taskCreated, result);

    }
}