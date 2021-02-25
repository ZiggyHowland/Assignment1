package InternalTesting;

public class LineItem {

    private int pris;
    private int antall;
    private int bruttoPris;

    public LineItem(int pris, int antall, int bruttoPris) {
        this.pris = pris;
        this.antall = antall;
        this.bruttoPris = bruttoPris;
    }

    public int getPris() {
        return pris;
    }
}
