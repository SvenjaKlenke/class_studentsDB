package de.neuefische;


import de.neuefische.model.Students;
import de.neuefische.model.StudentsDB;



public class Main {
    public static void main(String[] args) {

        Students studentOne = new Students("Kristin", 1233);
        Students studentTwo = new Students("Werner", 1234);
        Students studentThree = new Students("Kristin", 1235);


        Students [] allStudents = {studentOne, studentTwo, studentThree};

        StudentsDB studentsDB = new StudentsDB(allStudents);
        StudentsDB studentsDB1 = new StudentsDB(studentsDB.getAllStudents());

        System.out.println(studentsDB);
        System.out.println(studentsDB1);



    }


}