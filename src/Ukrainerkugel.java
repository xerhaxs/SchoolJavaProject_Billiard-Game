package src;

import sum.werkzeuge.Uhr;

public class Ukrainerkugel extends Kugel {
    private double colorwait;
    Uhr Uhr1;

    public Ukrainerkugel() {

        Uhr1 = new Uhr();
    }

    public void rolle() {
        super.rolle();
        this.flagge();
    }

    public void flagge() {
        if (Uhr1.verstricheneZeit() < 2000 && Uhr1.verstricheneZeit() > 1000) {
            super.setzeFarbe("#0000ff");
        } else if (Uhr1.verstricheneZeit() < 1000 && Uhr1.verstricheneZeit() > 0){
            super.setzeFarbe("#ffff00");
        } else if (Uhr1.verstricheneZeit() > 2000) {
            Uhr1.stoppe();
            Uhr1.starte();
        }
    }
}
