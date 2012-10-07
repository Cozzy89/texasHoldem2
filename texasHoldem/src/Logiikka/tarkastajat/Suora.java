package Logiikka.tarkastajat;

import Logiikka.Kasi;

public class Suora implements Tarkistettava {

    public static final int ARVO = 5;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int loytynyt = 0;
        int maara = 0;
        for (int i = maarat.length - 1; i >= 0; i--) {
            if (maarat[i] == 1) {
                maara++;
                loytynyt++;
                if (maara == 5) {
                    break;
                }
            } else if (loytynyt >= 3) {
                break;
            } else {
                maara = 0;
            }
        }
        if (maara == 4 && maarat[10] >= 1 && maarat[11] >= 1 && maarat[12] >= 1 && maarat[0] >= 1) {
            maara++;
        }
        if (maara == 5) {
            jarjesta(kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(TarkastettavaKasi kasi) {
        kasi.jarjestaArvollaSuurimmastaPienimpaan();
        if (kasi.getKortti(kasi.getMaara()-1).getArvo() == 0 && kasi.getKortti(0).getArvo() == 12 && kasi.getKortti(1).getArvo() == 11 && kasi.getKortti(2).getArvo() == 10 && kasi.getKortti(3).getArvo() == 9) {
            kasi.siirraAlkuun(kasi.getMaara()-1);
        }
        for (int i = 0; i < 2; i++) {
            if (kasi.getKortti(0).getArvo() - 1 != kasi.getKortti(1).getArvo() || kasi.getKortti(1).getArvo() -1 != kasi.getKortti(2).getArvo()) {
                kasi.siirraLoppuun(0);
            }
        }
    }
}
