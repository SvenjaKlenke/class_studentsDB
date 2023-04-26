package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsDBTest {

    @Test
    void getAllStudents() {
        //GIVEN
        Students studentOne = new Students("Kristin", 1233,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentTwo = new Students("Werner", 1234,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentThree = new Students("Kristin", 1235, "Hauptstr. 12, 22043 Hamburg", 12345);

        StudentsDB allStudents = new StudentsDB(new Students[]{studentOne, studentTwo, studentThree});
        //WHEN
        Students[] actual = allStudents.getAllStudents();
        //THEN

    }
}