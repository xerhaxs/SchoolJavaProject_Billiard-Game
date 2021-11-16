import Classes.Kugel;
import sum.kern.Bildschirm;
import sum.kern.Maus;

public class BilliardV1 {
    public static void main(String[]  args) {
        Bildschirm Bildschirm1;
        Maus Maus1;
        Kugel Kugel1;

        Bildschirm1 = new Bildschirm();
        Maus1 = new Maus();
        Kugel1 = new Kugel();


        int i = 1;
        Kugel1.zeichneDich();
        while (i == 1) {
            if (Maus1.istGedrueckt()) {
                Kugel1.rolle();
            }
        }
    }
}
