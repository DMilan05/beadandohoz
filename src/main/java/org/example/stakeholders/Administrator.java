package org.example.stakeholders;
import org.example.model.UniversitySystem;

public class Administrator extends User {
    public Administrator(String name) {
        super(name);
    }

    public void createExam(UniversitySystem system, String examName) {
        system.createExam(examName, this);
    }

    public void deleteExam(UniversitySystem system, String examName) {
        system.deleteExam(examName, this);
    }
}