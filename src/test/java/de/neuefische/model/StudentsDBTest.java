package de.neuefische.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentsDBTest {

    @Test
    void getAllStudents() {
        //GIVEN
        Students studentOne = new Students("Kristin", 1233,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentTwo = new Students("Werner", 1234,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentThree = new Students("Kristin", 1235, "Hauptstr. 12, 22043 Hamburg", 12345);

        Map<Integer,Students> allStudents =  new HashMap<>();
        allStudents.put(studentOne.getStudentsID(), studentOne);
        allStudents.put(studentTwo.getStudentsID(), studentTwo);
        allStudents.put(studentThree.getStudentsID(), studentThree);

        StudentsDB studentsDB = new StudentsDB(allStudents);


        //WHEN
        Map<Integer,Students> actual = studentsDB.getAllStudents();
        //THEN
        assertEquals(allStudents,actual);


    }
}