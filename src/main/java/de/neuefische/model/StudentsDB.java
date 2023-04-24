package de.neuefische.model;

import java.util.Arrays;

public class StudentsDB {

    Students [] allStudents;



    public StudentsDB (Students [] allStudents) {
        this.allStudents = allStudents;
    }

    public Students[] getAllStudents() {
        return this.allStudents;
    }

    @Override
    public String toString() {
        return "StudentsDB{" +
                "allStudents=" + Arrays.toString(allStudents) +
                '}';
    }
}
