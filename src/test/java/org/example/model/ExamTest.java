package org.example.model;
import org.example.model.Exam;
import org.example.stakeholders.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamTest {

    private Exam exam;
    private User creator;

    @BeforeEach
    void setUp() {
        // given - egy új User objektumot hozunk létre, aki a vizsga létrehozója
        creator = new User("Dr. Smith");

        // given - létrehozzuk a vizsgát a névvel és a készítővel
        exam = new Exam("Mathematics Exam", creator);
    }

    @Test
    void testGetName() {
        // when - lekérdezzük a vizsga nevét
        String examName = exam.getName();

        // then - ellenőrizzük, hogy a vizsga neve megegyezik az elvárt értékkel
        assertEquals("Mathematics Exam", examName, "The exam name should be 'Mathematics Exam'");
    }

    @Test
    void testGetCreator() {
        // when - lekérdezzük a vizsga létrehozóját
        User examCreator = exam.getCreator();

        // then - ellenőrizzük, hogy a vizsga létrehozója az elvárt User objektum
        assertEquals(creator, examCreator, "The exam creator should be the same as the initialized user");
    }

    @Test
    void testCreatorName() {
        // when - lekérdezzük a vizsga létrehozójának nevét
        String creatorName = exam.getCreator().getName();

        // then - ellenőrizzük, hogy a létrehozó neve 'Dr. Smith'
        assertEquals("Dr. Smith", creatorName, "The creator's name should be 'Dr. Smith'");
    }
}
