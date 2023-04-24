package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsDBTest {

    @Test
    void getAllStudents() {
        //GIVEN
        Students a = new Students("Erna", 2001);
        Students b = new Students("Erna", 2001);
        //WHEN
        boolean actual = a.equals(b);
        //THEN
        assertTrue(actual);
    }
}