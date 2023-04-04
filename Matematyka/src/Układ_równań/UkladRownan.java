package Układ_równań;

public abstract class UkladRownan {
    protected double[][] wspolczynniki;
    protected double[] wyrazyWolne;

    public UkladRownan(double[][] wspolczynniki, double[] wyrazyWolne) {
        this.wspolczynniki = wspolczynniki;
        this.wyrazyWolne = wyrazyWolne;
    }

    public abstract double ObliczWyznacznik(int nrKolumny);

    public double ObliczNiewiadoma(int nrKolumny){
        return (ObliczWyznacznik(nrKolumny)/ObliczWyznacznik(-1));
    }

    public boolean CzyOznaczony() {
        double wyznacznik = ObliczWyznacznik(-1);
        if (wyznacznik == 0) {
            return false;
        } else {
            return true;
        }
    }
}
