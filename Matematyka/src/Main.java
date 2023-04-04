import Układ_równań.UkladRownan;
import Układ_równań.UkladRownan2;

public class Main {
    public static void main(String[] args) {
        double[][] wspolczynniki = {{2, 1}, {1, -3}};
        double[] wyrazyWolne = {4, -1};

        UkladRownan2 uklad2 = new UkladRownan2(wspolczynniki, wyrazyWolne);
        System.out.println("Rozwiązanie dla układu 2x2:");
        System.out.println("x = " + uklad2.ObliczNiewiadoma(0));
        System.out.println("y = " + uklad2.ObliczNiewiadoma(1));

        double[][] wspolczynniki2 = {{1, -2, 3}, {2, 1, -1}, {3, 1, 1}};
        double[] wyrazyWolne2 = {-1, 0, 4};

    }
}