package Classes;
import sum.kern.Buntstift;

public class Kugel {
    Buntstift Buntstift1Kugel;

    public Kugel() {
        Buntstift1Kugel = new Buntstift();
    }

    public void zeichneDich() {
        Buntstift1Kugel.zeichneKreis(20);
    }

    public void loescheDich() {
        Buntstift1Kugel.radiere();
        Buntstift1Kugel.zeichneKreis(20);
        Buntstift1Kugel.normal();
    }

    public void rolle() {
        this.loescheDich();
        Buntstift1Kugel.bewegeUm(1);
        this.zeichneDich();
    }

    public void drehe(int rWinkel) {
        Buntstift1Kugel.dreheUm(rWinkel);
    }

    public void bewege(int xPostion, int yPostion) {
        this.loescheDich();
        Buntstift1Kugel.bewegeBis(xPostion, yPostion);
        this.zeichneDich();
    }

    public void gibFrei() {
        Buntstift1Kugel.gibFrei();
    }
}
