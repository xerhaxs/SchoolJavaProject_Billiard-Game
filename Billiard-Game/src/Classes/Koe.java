package Classes;
import sum.kern.Buntstift;

public class Koe {
    Buntstift Buntstift1Koe;

    public Koe() {
        Buntstift1Koe = new Buntstift();
    }

    // Koe zeichen
    public void zeichneDich() {
        Buntstift1Koe.zeichneKreis(5);
    }

    // Koe löschen
    public void loescheDich() {
        Buntstift1Koe.radiere();
        this.zeichneDich();
        Buntstift1Koe.normal();
    }
}
