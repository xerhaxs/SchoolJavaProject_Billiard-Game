import Classes.Kugel;
import Classes.Tisch;
import sum.kern.Maus;
import sum.kern.Tastatur;
import sum.kern.Zeichen;

public class BilliardV1 {
    public static void main(String[]  args) {
        Tisch Tisch1;
        Maus Maus1;
        Tastatur Tastatur1;
        Kugel Kugel1;
        Kugel Kugel2;

        Tisch1 = new Tisch();
        Maus1 = new Maus();
        Tastatur1 = new Tastatur();
        Kugel1 = new Kugel();
        Kugel2 = new Kugel();

        int i = 1;

        Tisch1.zeichneDich();
        Kugel1.bewegeBis(100, 600);
        Kugel2.bewegeBis(500, 500);

        Kugel1.setzeFarbe("#ababab");
        Kugel2.setzeFarbe("#ff0000");

        while (i == 1) {
            if (Maus1.istGedrueckt()) {
                Kugel1.dreheUm(1);
                Kugel1.rolleUm(1);
                Kugel2.rolleUm(1);
                Kugel1.setzeGroesse(50);
                Kugel2.setzeGroesse(20);
                // physics
                if (Kugel2.getXPosition() == Tisch1.pYKanteRechts()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.getXPosition() == Tisch1.pYKanteLinks()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.getYPosition() == Tisch1.pXKanteOben()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.getYPosition() == Tisch1.pXKanteUnten()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel1.getXPosition() == Kugel2.getXPosition() && Kugel1.getYPosition() == Kugel2.getYPosition()) {
                    Kugel1.dreheUm(180);
                    Kugel2.dreheUm(180);
                }
            }

            if (Tastatur1.wurdeGedrueckt()) {
                if (Tastatur1.zeichen() == Zeichen.ESCAPE) {
                    Tastatur1.gibFrei();
                    Maus1.gibFrei();
                    Tisch1.gibFrei();
                    Kugel1.gibFrei();
                }
                Tastatur1.weiter();
            }
        }
    }
}
