package Classes;
import sum.kern.Buntstift;
import sum.kern.Muster;
import java.awt.Color;

public class Kugel {
    Buntstift Buntstift1Kugel;

    public Kugel() {
        Buntstift1Kugel = new Buntstift();
    }

    // Kugel Farbe
    public void setzeFarbe(String KugelFarbe) {
        Buntstift1Kugel.setzeFarbe(Color.decode(KugelFarbe));
        Buntstift1Kugel.setzeFuellMuster(Muster.GEFUELLT);
        this.loescheDich();
        this.zeichneDich();
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
    public boolean xPosition() {
        double xPositionKugel;
        xPositionKugel = Buntstift1Kugel.hPosition();
    }

    // Kugel yPositionsabfrage
    public void yPosition() {
        double yPositionKugel;
        yPositionKugel = Buntstift1Kugel.vPosition();
    }

    // Kugel Gesamtpositionsabfrage
    public void Position(int Position) {
        Buntstift1Kugel.hPosition();
        Buntstift1Kugel.vPosition();
    }

    // Kugel freigeben
    public void gibFrei() {
        Buntstift1Kugel.gibFrei();
    }
}
