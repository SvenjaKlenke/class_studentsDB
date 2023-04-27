package de.neuefische.model;

public class Students {

    private String name;
    private int studentsID;

    private String adress;

    private String cardNumber;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

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

    public Students() {

    }

    public Students(String name, int studentsID, String adress, String cardNumber) {
        this.name = name;
        this.studentsID = studentsID;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", studentsID=" + studentsID +
                ", adress='" + adress + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}

