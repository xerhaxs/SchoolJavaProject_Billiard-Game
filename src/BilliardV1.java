import Classes.Doppelkugel;
import Classes.Kugel;
import Classes.Spieltisch;
import sum.kern.Bildschirm;
import sum.kern.Maus;
import sum.kern.Tastatur;
import sum.kern.Zeichen;

public class BilliardV1 {
    public static void main(String[]  args) {
        Bildschirm Bildschirm1;
        Maus Maus1;
        Tastatur Tastatur1;
        Spieltisch Spieltisch1;
        Spieltisch Spieltisch2;
        Kugel Kugel1_1;
        Kugel Kugel1_2;
        Kugel Kugel2_3;
        Kugel Kugel2_4;
        Doppelkugel Doppelkugel1_1;

        Bildschirm1 = new Bildschirm();
        Spieltisch1 = new Spieltisch();
        Maus1 = new Maus();
        Tastatur1 = new Tastatur();
        Spieltisch1 = new Spieltisch();
        Spieltisch2 = new Spieltisch();
        Kugel1_1 = new Kugel();
        Kugel1_2 = new Kugel();
        Kugel2_3 = new Kugel();
        Kugel2_4 = new Kugel();
        Doppelkugel1_1 = new Doppelkugel();

        int i = 1;

        Spieltisch1.zeichneDich(500, 500, 20, 20);
        Spieltisch2.zeichneDich(450,200,520,600);

        Kugel1_1.kenntSpieltisch(Spieltisch1);
        Kugel1_2.kenntSpieltisch(Spieltisch1);
        Kugel2_3.kenntSpieltisch(Spieltisch2);
        Kugel2_4.kenntSpieltisch(Spieltisch2);
        Doppelkugel1_1.kenntSpieltisch(Spieltisch1);

        Kugel1_1.bewegeBis(200, 200);
        Kugel1_2.bewegeBis(220, 220);
        Kugel2_3.bewegeBis(600, 620);
        Kugel2_4.bewegeBis(620, 620);
        Doppelkugel1_1.bewegeBis(200, 200);

        //Kugel1_1.setzeFarbe("#ababab");
        Kugel1_2.setzeFarbe("#ff0000");
        Kugel2_3.setzeFarbe("#ffff00");
        Kugel2_4.setzeFarbe("#ff00ff");
        //Doppelkugel1_1.setzeFarbe("#ff0000");

        Kugel1_1.setzeGroesse(30);
        Kugel1_2.setzeGroesse(20);
        Kugel2_3.setzeGroesse(6);
        Kugel2_4.setzeGroesse(8);
        Doppelkugel1_1.setzeInnereGroesse(10);

        Kugel1_1.speed(1);
        Kugel1_2.speed(1);
        Kugel2_3.speed(1);
        Kugel2_4.speed(1);
        Doppelkugel1_1.speed(1);

        Kugel1_1.dreheUm(20);
        Kugel1_2.dreheUm(100);

        Kugel2_3.dreheUm(5);
        Kugel2_4.dreheUm(10);
        Doppelkugel1_1.dreheUm(20);

        while (i == 1) {
            if (Maus1.istGedrueckt()) {
                Kugel1_1.rolle();
                Kugel1_2.rolle();
                Kugel2_3.rolle();
                Kugel2_4.rolle();
                Doppelkugel1_1.rolle();

                // physics kugel abprallen
                if (Math.sqrt(Kugel1_2.getXPosition() - Kugel1_1.getXPosition()) + Math.sqrt(Kugel1_2.getYPosition() - Kugel1_1.getYPosition()) <= Math.sqrt(Kugel1_1.getGroesse() + Kugel1_2.getGroesse())) {
                    Kugel1_1.dreheUm(180);
                    Kugel1_2.dreheUm(180);
                }
                if (Math.sqrt(Kugel2_4.getXPosition() - Kugel2_3.getXPosition()) + Math.sqrt(Kugel2_4.getYPosition() - Kugel2_3.getYPosition()) <= Math.sqrt(Kugel2_3.getGroesse() + Kugel2_4.getGroesse())) {
                    Kugel2_3.dreheUm(180);
                    Kugel2_4.dreheUm(180);
                }
            }

            if (Tastatur1.wurdeGedrueckt()) {
                if (Tastatur1.zeichen() == Zeichen.ESCAPE) {
                    i = 0;
                    Tastatur1.gibFrei();
                    Maus1.gibFrei();
                    Bildschirm1.gibFrei();
                    Kugel1_1.gibFrei();
                }
                Tastatur1.weiter();
            }
        }
    }
}
