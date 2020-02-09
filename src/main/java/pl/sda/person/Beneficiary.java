package pl.sda.person;

public class Beneficiary extends Person {

    private int share;

    Beneficiary(String firstName, String lastName, int age, int share) {
        super(firstName, lastName, age);
        this.share = share;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
