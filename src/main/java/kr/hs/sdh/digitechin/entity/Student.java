package kr.hs.sdh.digitechin.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private final UUID id;
    private final String name;
    private final String email;
    private final String studentMessage;
    private final String studentGrade;
    private final LocalDate createdAt;

    public Student(UUID id, String name, String email, String studentMessage, String studentGrade, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.studentMessage = studentMessage;
        this.studentGrade = studentGrade;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentMessage() {
        return studentMessage;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}
