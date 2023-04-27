package de.neuefische.model;

import java.util.*;

public class StudentsDB {

    private Map <Integer,Students> allStudents = new HashMap<>();

    public  Students addStudent (Students students){
        allStudents.put(students.getStudentsID(),students);
        return students;
    }

    public StudentsDB(Map<Integer, Students> allStudents) {
        this.allStudents = allStudents;
    }

    public StudentsDB() {
    }

    public Map<Integer, Students> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return "StudentsDB{" +
                "allStudents=" + allStudents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsDB that = (StudentsDB) o;
        return Objects.equals(getAllStudents(), that.getAllStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAllStudents());
    }
}
