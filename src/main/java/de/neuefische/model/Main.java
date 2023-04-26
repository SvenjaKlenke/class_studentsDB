package de.neuefische.model;


import de.neuefische.model.Students;
import de.neuefische.model.StudentsDB;



public class Main {
    public static void main(String[] args) {

        Students studentOne = new Students("Kristin", 1233,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentTwo = new Students("Werner", 1234,"Hauptstr. 12, 22043 Hamburg", 12345);
        Students studentThree = new Students("Kristin", 1235,"Hauptstr. 12, 22043 Hamburg", 12345);


        Students [] allStudents = {studentOne, studentTwo, studentThree};

        StudentsDB studentsDB = new StudentsDB(allStudents);

        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("Alex", 1236,"Hauptstr. 12, 22043 Hamburg", 12345,true);
        BiologyStudent biologyStudent = new BiologyStudent("AlexF", 1237,"Hauptstr. 12, 22043 Hamburg", 12345, false);

        System.out.println(computerScienceStudent.getCardNumber());
        System.out.println(biologyStudent.getAdress());


    }


}