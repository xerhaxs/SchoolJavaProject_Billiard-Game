package Classes;

public class Doppelkugel extends Kugel {
    private int zInnereGroesse;
    public Doppelkugel() {

    }

    public int getInnereGroesse() {
        return zInnereGroesse;
    }

    public void bewegeBis(int pXPosition, int pYPosition) {
        super.bewegeBis(pXPosition, pYPosition);
    }

    public void setzeInnereGroesse(int pInnereGroesse) {
        zInnereGroesse = pInnereGroesse;
    }

    public void zeichneDich() {
        super.zeichneDich();
        Buntstift1Kugel.normal();
        Buntstift1Kugel.zeichneKreis(zInnereGroesse);
    }

    public void loescheDich() {
        super.loescheDich();
        Buntstift1Kugel.radiere();
        Buntstift1Kugel.zeichneKreis(zInnereGroesse);
    }

    public void rolllespezial() {
        this.loescheDich();
        Buntstift1Kugel.bewegeUm(zSpeed);
        this.zeichneDich();
    }
}
