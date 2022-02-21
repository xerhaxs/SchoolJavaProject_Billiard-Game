package Classes;
import sum.kern.Buntstift;
import java.awt.*;

public class Spieltisch {
    Buntstift Buntstift1Spieltisch;

    public Spieltisch() {
        Buntstift1Spieltisch = new Buntstift();
    }
    // Zustandsvariablen
    int zXKanteOben;
    int zXKanteUnten;
    int zYKanteLinks;
    int zYKanteRechts;

    // Tisch zeichen
    public void zeichneDich(int pXBreite, int pYHoehe, int pXPosition, int pYPosition) {
        zXKanteOben = pYPosition;
        zXKanteUnten = pYPosition + pYHoehe;
        zYKanteLinks = pXPosition;
        zYKanteRechts = pXPosition + pXBreite;
        Buntstift1Spieltisch.bewegeBis(pXPosition, pYPosition);
        Buntstift1Spieltisch.setzeFarbe(Color.decode("#9f501c"));
        Buntstift1Spieltisch.setzeLinienbreite(5);
        Buntstift1Spieltisch.zeichneRechteck(pXBreite, pYHoehe);
    }
    // Tisch Kante oben
    public double pXKanteOben() {
        double pXKanteOben = zXKanteOben;
        return pXKanteOben;
    }
    // Tisch Kante unten
    public double pXKanteUnten() {
        double pXKanteUnten = zXKanteUnten;
        return pXKanteUnten;
    }
    // Tisch Kante links
    public double pYKanteLinks() {
        double pYKanteLinks = zYKanteLinks;
        return pYKanteLinks;
    }
    // Tisch Kante rechts
    public double pYKanteRechts() {
        double pYKanteRechts = zYKanteRechts;
        return pYKanteRechts;
    }

    // Tisch freigeben
    public void gibFrei() {
        Buntstift1Spieltisch.gibFrei();
    }
}

