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
                // physics
                if (Kugel2.xPosition() == Tisch1.xGroesse()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.yPosition() == Tisch1.yGroesse()) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.xPosition() == Tisch1.xGroesse() * 1 / 11) {
                    Kugel2.dreheUm(180);
                }
                if (Kugel2.yPosition() == Tisch1.yGroesse() * 1 / 11) {
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
