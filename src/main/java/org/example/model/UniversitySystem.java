package org.example.model;
import org.example.model.Exam;
import org.example.stakeholders.Administrator;
import org.example.stakeholders.Teacher;
import org.example.stakeholders.User;

import java.util.HashMap;
import java.util.Map;

public class UniversitySystem {
    private Map<String, Exam> exams;

    public UniversitySystem() {
        exams = new HashMap<>();
    }

    public void createExam(String examName, User creator) {
        if (!exams.containsKey(examName)) {
            exams.put(examName, new Exam(examName, creator));
            System.out.println("Exam " + examName + " created by " + creator.getName());
        } else {
            System.out.println("Exam " + examName + " already exists.");
        }
    }

    public void deleteExam(String examName, User deleter) {
        Exam exam = exams.get(examName);
        if (exam != null && (deleter instanceof Teacher || deleter instanceof Administrator)) {
            exams.remove(examName);
            System.out.println("Exam " + examName + " deleted by " + deleter.getName());
        } else {
            System.out.println("Exam " + examName + " not found or unauthorized.");
        }
    }

    public Exam getExam(String examName) {
        return exams.get(examName);
    }
}
