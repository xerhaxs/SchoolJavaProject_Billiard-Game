package Classes;
import sum.kern.Buntstift;
import sum.kern.Zeichen;
import sum.kern.Muster;
import java.awt.Color;


public class Tisch {
    Buntstift Buntstift1Tisch;

    public Tisch() {
        Buntstift1Tisch = new Buntstift();
    }

    public void zeichneDich(int xVonPosition, int yVonPosition, int xBisPosition, int yBisPosition) {
        System.out.println("xVonPos " + xVonPosition);
        System.out.println("yVonPos " + yVonPosition);
        System.out.println("xBisPos " + xBisPosition);
        System.out.println("yBisPos " + yBisPosition);

        int xVonPositionChanged = xVonPosition;
        int yVonPositionChanged = yVonPosition;
        int xBisPositionChanged = xBisPosition;
        int yBisPositionChanged = yBisPosition;

        // String erzeugen
        String farbe = null;
        farbe = "#9f501c";

        xVonPositionChanged = xVonPosition * 1 / 11;
        yVonPositionChanged = yVonPosition * 1 / 11;
        xBisPositionChanged = xBisPosition * 9 / 11;
        yBisPositionChanged = yBisPosition * 9 / 11;

        Buntstift1Tisch.bewegeBis(xVonPositionChanged, yVonPositionChanged);
        Buntstift1Tisch.setzeFarbe(Color.GREEN);
        Buntstift1Tisch.setzeFuellMuster(Muster.GEFUELLT);
        Buntstift1Tisch.zeichneRechteck(xBisPositionChanged, yBisPositionChanged);
        Buntstift1Tisch.setzeFuellMuster(Muster.DURCHSICHTIG);
        Buntstift1Tisch.setzeFarbe(Color.decode(farbe));
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

    public void gibFrei() {
        Buntstift1Tisch.gibFrei();
    }
}
