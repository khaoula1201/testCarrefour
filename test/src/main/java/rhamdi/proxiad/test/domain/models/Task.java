package rhamdi.proxiad.test.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import rhamdi.proxiad.test.domain.enums.TaskStatus;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Task {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private TaskStatus status;
}
