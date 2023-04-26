package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {

    @Test
    void getAdress_return_String() {
        //GIVEN
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("Alex", 1236,"Hauptstr. 12, 22043 Hamburg", 54321,true);
        String expected = "Hauptstr. 12, 22043 Hamburg";
        //WHEN
        String actual = computerScienceStudent.getAdress();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getIdentityCardNumber_return_ID() {
        //GIVEN
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("Alex", 1236,"Hauptstr. 12, 22043 Hamburg", 54321,true);
        int expected = 54321;
        //WHEN
        int actual = computerScienceStudent.getIdentityCardNumber();
        //THEN
        assertEquals(expected, actual);
    }
}