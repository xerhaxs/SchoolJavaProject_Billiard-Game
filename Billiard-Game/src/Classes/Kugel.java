package Classes;
import Classes.Tisch;
import sum.kern.Buntstift;
import sum.kern.Muster;
import java.awt.Color;

public class Kugel {
    Buntstift Buntstift1Kugel;

    public Kugel() {
        Buntstift1Kugel = new Buntstift();
    }

    // Kugel zeichen
    public void zeichneDich() {
        Buntstift1Kugel.zeichneKreis(20);
    }

    // Kugel löschen
    public void loescheDich() {
        Buntstift1Kugel.radiere();
        this.zeichneDich();
        Buntstift1Kugel.normal();
    }

    // Kugel Farbe
    public void setzeFarbe(String KugelFarbe) {
        this.loescheDich();
        Buntstift1Kugel.setzeFarbe(Color.decode(KugelFarbe));
        Buntstift1Kugel.setzeFuellMuster(Muster.GEFUELLT);
        this.zeichneDich();
    }

    // Kugel rollen
    public void rolleUm(int strecke) {
        this.loescheDich();
        Buntstift1Kugel.bewegeUm(strecke);
        this.zeichneDich();
    }

    // Kugel drehen
    public void dreheUm(int rWinkel) {
        Buntstift1Kugel.dreheUm(rWinkel);
    }

    // Kugel bewegen bis
    public void bewegeBis(int xPostion, int yPostion) {
        this.loescheDich();
        Buntstift1Kugel.bewegeBis(xPostion, yPostion);
        this.zeichneDich();
    }

    // Kugel xPositionsabfrage
    public double xPosition() {
        double xPositionKugel;
        xPositionKugel = Buntstift1Kugel.hPosition();
        return xPositionKugel;
    }

    // Kugel yPositionsabfrage
    public double yPosition() {
        double yPositionKugel;
        yPositionKugel = Buntstift1Kugel.vPosition();
        return yPositionKugel;
    }

    // Kugel freigeben
    public void gibFrei() {
        Buntstift1Kugel.gibFrei();
    }
}
