package de.neuefische.model;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsDB {

    private ArrayList <Students> allStudents;

    public StudentsDB(ArrayList<Students> allStudents) {
        this.allStudents = allStudents;
    }

    public StudentsDB() {
    }

    public ArrayList<Students> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return "StudentsDB{" +
                "allStudents=" + allStudents +
                '}';
    }
}
