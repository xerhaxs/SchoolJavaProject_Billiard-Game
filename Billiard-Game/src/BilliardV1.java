import Classes.Kugel;
import Classes.Tisch;
import sum.kern.Bildschirm;
import sum.kern.Maus;

public class BilliardV1 {
    public static void main(String[]  args) {
        Bildschirm Bildschirm1;
        Maus Maus1;
        Kugel Kugel1;
        Tisch Tisch1;

        Bildschirm1 = new Bildschirm();
        Maus1 = new Maus();
        Kugel1 = new Kugel();
        Tisch1 = new Tisch();


        Tisch1.zeichneDich(Bildschirm1.breite(), Bildschirm1.hoehe(), Bildschirm1.breite(), Bildschirm1.hoehe());
        int i = 1;
        Kugel1.zeichneDich();
        while (i == 1) {
            if (Maus1.spezialKlick()) {
                Kugel1.bewege(100, 500);
            }
            if (Maus1.istGedrueckt()) {
                Kugel1.drehe(1);
                Kugel1.rolle();
            }
        }
    }
}
