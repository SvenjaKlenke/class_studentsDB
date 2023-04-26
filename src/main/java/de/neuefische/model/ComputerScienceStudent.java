package de.neuefische.model;

import java.util.Objects;

public class ComputerScienceStudent extends Students implements Citzen {

    private boolean knowsWindows;


    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String name, int studentsID, String adress, int cardNumber, boolean knowsWindows) {
        super(name, studentsID, adress, cardNumber);
        this.knowsWindows = knowsWindows;
    }


    public boolean isKnowsWindows() {
        return knowsWindows;
    }

    public void setKnowsWindows(boolean knowsWindows) {
        this.knowsWindows = knowsWindows;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "knowsWindows=" + knowsWindows +
                "} " + super.toString();
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public int getIdentityCardNumber() {
        return super.getCardNumber();
    }
}
