package Classes;
import sum.kern.Buntstift;

public class Kugel {
    Buntstift Buntstift1Kugel;

    public Kugel() {
        Buntstift1Kugel = new Buntstift();
        Buntstift1Kugel.bewegeBis(100, 100);
    }

    public void zeichneDich() {
        Buntstift1Kugel.zeichneKreis(20);
    }

    public void rolle() {
        Buntstift1Kugel.radiere();
        Buntstift1Kugel.zeichneKreis(20);
        Buntstift1Kugel.normal();
        Buntstift1Kugel.bewegeUm(2);
        Buntstift1Kugel.zeichneKreis(20);
    }

    public void drehe(int rWinkel) {
        Buntstift1Kugel.dreheUm(rWinkel);
    }
}
