package de.neuefische.model;

public class BiologyStudent extends Students implements Citzen{

    private boolean haveGarden;


    public BiologyStudent(String name, int studentsID, String adress, String cardNumber, boolean haveGarden) {
        super(name, studentsID, adress, cardNumber);
        this.haveGarden = haveGarden;
    }

    public BiologyStudent() {
    }

    public boolean isHaveGarden() {
        return haveGarden;
    }

    public void setHaveGarden(boolean haveGarden) {
        this.haveGarden = haveGarden;
    }



    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public String getIdentityCardNumber() {
        return super.getCardNumber();
    }
}
