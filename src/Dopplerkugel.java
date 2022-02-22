package src;

public class Dopplerkugel extends Kugel {

    public Dopplerkugel() {

    }

    public void copy() {
        super.setzeFarbe(super.getFarbe());
        super.setzeGroesse(super.getGroesse());
        super.setSpeed(super.getSpeed());
    }
}
