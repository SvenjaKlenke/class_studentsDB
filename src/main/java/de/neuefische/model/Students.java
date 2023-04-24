package de.neuefische.model;

public class Students {

    private String name;
    private int studentsID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(int studentsID) {
        this.studentsID = studentsID;
    }

    public Students (){

    }

    public Students (String name, int studentsID){
        this.name =name;
        this.studentsID = studentsID;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", studentsID=" + studentsID +
                '}';
    }
}
