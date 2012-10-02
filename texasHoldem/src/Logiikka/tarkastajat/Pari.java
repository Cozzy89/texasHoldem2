package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Poyta;

public class Pari implements Tarkistettava {

    public static final int ARVO = 2;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int pari = Tarkastaja.tarkistaMaaralla(maarat, 2, maarat.length-1);
        if (pari != -1) {
            jarjesta(pari, kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(int pari, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(pari);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(2);
    }
}