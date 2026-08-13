package org.example.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Student\"")
@Data

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Integer age;
    private String course;

    @Column(name = "createdat")
    private LocalDateTime createdAt = LocalDateTime.now();
}
