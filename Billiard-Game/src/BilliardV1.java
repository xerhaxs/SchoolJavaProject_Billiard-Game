import Classes.Kugel;
import Classes.Tisch;
import sum.kern.Maus;
import sum.kern.Tastatur;
import sum.kern.Zeichen;
import java.math.*;

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

        Kugel1.kenntTisch(Tisch1);
        Kugel2.kenntTisch(Tisch1);

        Tisch1.zeichneDich();

        Kugel1.bewegeBis(700, 800);
        Kugel2.bewegeBis(500, 500);

        Kugel1.setzeFarbe("#ababab");
        Kugel2.setzeFarbe("#ff0000");

        Kugel1.setzeGroesse(100);
        Kugel2.setzeGroesse(60);

        Kugel1.speed(1);
        Kugel2.speed(1);

        Kugel1.dreheUm(20);
        Kugel2.dreheUm(100);

        while (i == 1) {
            if (Maus1.istGedrueckt()) {
                Kugel1.rolle();
                Kugel2.rolle();
                // physics kugel abprallen
                if (Math.sqrt(Kugel2.getXPosition() - Kugel1.getXPosition()) + Math.sqrt(Kugel2.getYPosition() - Kugel1.getYPosition()) <= Math.sqrt(Kugel1.getGroesse() + Kugel2.getGroesse())) {
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
