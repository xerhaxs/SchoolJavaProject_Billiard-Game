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
        Kugel1.bewege(100, 600);
        Kugel2.bewege(500, 500);

        Kugel1.zeichneDich();
        Kugel2.zeichneDich();

        while (i == 1) {
            if (Maus1.istGedrueckt()) {
                Kugel1.drehe(1);
                Kugel1.rolle();
                Kugel2.rolle();
            }
            if (Tastatur1.wurdeGedrueckt()) {
                if (Tastatur1.zeichen() == Zeichen.ESCAPE) {
                    Kugel1.gibFrei();
                }
            }
        }
    }
}
