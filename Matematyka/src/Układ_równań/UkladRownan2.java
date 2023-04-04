package Układ_równań;

public class UkladRownan2 extends UkladRownan {
    public UkladRownan2(double[][] wspolczynniki, double[] wyrazyWolne) {
        super(wspolczynniki, wyrazyWolne);
    }

    @Override
    public double ObliczWyznacznik(int nrKolumny) {
        double wyznacznik;
        if (nrKolumny == -1) {
            wyznacznik = wspolczynniki[0][0] * wspolczynniki[1][1] - wspolczynniki[0][1] * wspolczynniki[1][0];
        } else if (nrKolumny == 0) {
            wyznacznik = wyrazyWolne[0] * wspolczynniki[1][1] - wyrazyWolne[1] * wspolczynniki[1][0];
        } else {
            wyznacznik = wspolczynniki[0][0] * wyrazyWolne[1] - wspolczynniki[0][1] * wyrazyWolne[0];
        }
        return wyznacznik;
    }

    @Override
    public double ObliczNiewiadoma(int nrKolumny) {
        double niewiadoma;
        if (nrKolumny == 0) {
            niewiadoma = (wyrazyWolne[0] * wspolczynniki[1][1] - wyrazyWolne[1] * wspolczynniki[1][0]) / ObliczWyznacznik(-1);
        } else {
            niewiadoma = (wspolczynniki[0][0] * wyrazyWolne[1] - wspolczynniki[0][1] * wyrazyWolne[0]) / ObliczWyznacznik(-1);
        }
        return niewiadoma;
    }
}
