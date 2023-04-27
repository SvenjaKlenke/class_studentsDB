package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiologyStudentTest {

    @Test
    void getAdress_return_String() {
        //GIVEN
        BiologyStudent biologyStudent = new BiologyStudent("AlexF", 1237,"Hauptstr. 12, 22043 Hamburg", "12345", false);
        String expected = "Hauptstr. 12, 22043 Hamburg";
        //WHEN
        String actual = biologyStudent.getAdress();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getIdentityCardNumber_return_ID() {
        //GIVEN
        BiologyStudent biologyStudent = new BiologyStudent("AlexF", 1237,"Hauptstr. 12, 22043 Hamburg", "12345", false);
        String expected = "12345";
        //WHEN
        String actual = biologyStudent.getIdentityCardNumber();
        //THEN
        assertEquals(expected, actual);
    }
}