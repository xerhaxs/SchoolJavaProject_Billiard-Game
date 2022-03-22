package src;

public class Reibungskugel extends Kugel {
    private double zReibung;

    public Reibungskugel() {

    }

    public void setReibung(double setpReibung) {
        zReibung = setpReibung;
    }

    public double getReibung() {
        return zReibung;
    }

    public void rolle() {
        super.rolle();
        if (super.getSpeed() > 0) {
            super.setSpeed(super.getSpeed() - this.zReibung);
        }
    }
}
