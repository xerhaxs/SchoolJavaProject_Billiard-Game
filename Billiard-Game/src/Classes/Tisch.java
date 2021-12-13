package Classes;
import sum.kern.Buntstift;
import sum.kern.Bildschirm;
import sum.kern.Zeichen;
import sum.kern.Muster;
import java.awt.Color;

public class Tisch {
    Buntstift Buntstift1Tisch;
    Bildschirm Bildschirm1;

    public Tisch() {
        Bildschirm1 = new Bildschirm();
        Buntstift1Tisch = new Buntstift();
    }

    // Tisch zeichen
    public void zeichneDich() {
        int xVonPosition = this.Bildschirm1.breite();
        int yVonPosition = this.Bildschirm1.hoehe();
        int xBisPosition = this.Bildschirm1.breite();
        int yBisPosition = this.Bildschirm1.hoehe();
        int xVonPositionChanged = xVonPosition;
        int yVonPositionChanged = yVonPosition;
        int xBisPositionChanged = xBisPosition;
        int yBisPositionChanged = yBisPosition;

        // String erzeugen
        String TischFarbe = null;
        TischFarbe = "#9f501c";

        xVonPositionChanged = xVonPosition * 1 / 11;
        yVonPositionChanged = yVonPosition * 1 / 11;
        xBisPositionChanged = xBisPosition * 9 / 11;
        yBisPositionChanged = yBisPosition * 9 / 11;

        Buntstift1Tisch.bewegeBis(xVonPositionChanged, yVonPositionChanged);
        Buntstift1Tisch.setzeFarbe(Color.GREEN);
        Buntstift1Tisch.setzeFuellMuster(Muster.GEFUELLT);
        Buntstift1Tisch.zeichneRechteck(xBisPositionChanged, yBisPositionChanged);
        Buntstift1Tisch.setzeFuellMuster(Muster.DURCHSICHTIG);
        Buntstift1Tisch.setzeFarbe(Color.decode(TischFarbe));
        Buntstift1Tisch.setzeLinienBreite(5);
        Buntstift1Tisch.zeichneRechteck(xBisPositionChanged, yBisPositionChanged);

        xBisPositionChanged = xBisPosition * 10 / 11;
        yBisPositionChanged = yBisPosition * 10 / 11;

        Buntstift1Tisch.setzeFarbe(Color.BLACK);
        Buntstift1Tisch.setzeFuellMuster(Muster.GEFUELLT);
        Buntstift1Tisch.bewegeBis(xVonPositionChanged, yVonPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);
        Buntstift1Tisch.bewegeBis(xBisPosition / 2, yVonPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);
        Buntstift1Tisch.bewegeBis(xBisPositionChanged, yVonPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);

        Buntstift1Tisch.bewegeBis(xVonPositionChanged, yBisPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);
        Buntstift1Tisch.bewegeBis(xBisPosition / 2, yBisPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);
        Buntstift1Tisch.bewegeBis(xBisPositionChanged, yBisPositionChanged);
        Buntstift1Tisch.zeichneKreis(30);
    }

    // Tisch Kante oben
    public double pXKanteOben() {
        double pXKanteOben = Bildschirm1.hoehe() * 1 / 11;
        return pXKanteOben;
    }
    // Tisch Kante unten
    public double pXKanteUnten() {
        double pXKanteUnten = Bildschirm1.hoehe() * 10 / 11;
        return pXKanteUnten;
    }
    // Tisch Kante links
    public double pYKanteLinks() {
        double pYKanteLinks = Bildschirm1.breite() * 1 / 11;
        return pYKanteLinks;
    }
    // Tisch Kante rechts
    public double pYKanteRechts() {
        double pYKanteRechts = Bildschirm1.breite() * 10 / 11;
        return pYKanteRechts;
    }

    // Tisch freigeben
    public void gibFrei() {
        Buntstift1Tisch.gibFrei();
        Bildschirm1.gibFrei();
    }
}
