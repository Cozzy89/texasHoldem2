package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Poyta;

public class Pari implements Tarkistettava {

    public static final int ARVO = 2;

    @Override
    public int[] tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int pari = Tarkastaja.tarkistaMaaralla(maarat, 2, maarat.length-1);
        int[] arvot = new int[6];
        if (pari != -1) {
            jarjesta(pari, kasi);
            arvot[0] = ARVO;
            arvot[1] = kasi.getKortti(0).getArvo();
            arvot[2] = kasi.getKortti(2).getArvo();
            arvot[3] = kasi.getKortti(3).getArvo();
            arvot[4] = kasi.getKortti(4).getArvo();
            return arvot;
        }
        arvot[0] = 0;
        return arvot;
    }

    public static void jarjesta(int pari, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(pari);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(2);
        if(kasi.getKortti(kasi.getMaara()-1).getArvo()==0){
            for(int i=kasi.getMaara()-1; i>2; i--){
                kasi.siirra(i, i-1);
            }
        }
    }
}