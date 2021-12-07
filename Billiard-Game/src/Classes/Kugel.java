package Classes;
import sum.kern.Buntstift;
import sum.kern.Muster;
import java.awt.Color;

public class Kugel {
    Buntstift Buntstift1Kugel;

    public Kugel() {
        Buntstift1Kugel = new Buntstift();
    }

    int zGroesse = 0;

    // Kugel zeichen
    public void zeichneDich() {
        Buntstift1Kugel.zeichneKreis(zGroesse);
    }

    // Kugel löschen
    public void loescheDich() {
        Buntstift1Kugel.radiere();
        this.zeichneDich();
        Buntstift1Kugel.normal();
    }

    // Kugel Farbe
    public void setzeFarbe(String pKugelFarbe) {
        this.loescheDich();
        Buntstift1Kugel.setzeFarbe(Color.decode(pKugelFarbe));
        Buntstift1Kugel.setzeFuellMuster(Muster.GEFUELLT);
        this.zeichneDich();
    }

    // Kugel Größe
    public void setzeGroesse(int pGroesse) {
        this.loescheDich();
        zGroesse = pGroesse;
        this.zeichneDich();
    }

    // Kugel rollen
    public void rolleUm(int pStrecke) {
        this.loescheDich();
        Buntstift1Kugel.bewegeUm(pStrecke);
        this.zeichneDich();
    }

    // Kugel drehen
    public void dreheUm(int pRWinkel) {
        Buntstift1Kugel.dreheUm(pRWinkel);
    }

    // Kugel bewegen bis
    public void bewegeBis(int pXPostion, int pYPostion) {
        this.loescheDich();
        Buntstift1Kugel.bewegeBis(pXPostion, pYPostion);
        this.zeichneDich();
    }

    // Kugel Größe
    public int getGroesse() {
        return zGroesse;
    }

    // Kugel xPositionsabfrage
    public double getXPosition() {
        return Buntstift1Kugel.hPosition();
    }

    // Kugel yPositionsabfrage
    public double getYPosition() {
        return Buntstift1Kugel.vPosition();
    }

    // Kugel freigeben
    public void gibFrei() {
        Buntstift1Kugel.gibFrei();
    }
}
