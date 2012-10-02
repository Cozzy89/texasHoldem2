/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kortti;

/**
 *
 * @author Tero
 */
public class Vari implements Tarkistettava {
    public static final int ARVO = 6;
    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int[] maat = new int[4];
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            if(kortti == null){
                return 0;
            }
            maat[kortti.getMaa()]++;
        }
        for (int i = 0; i < maat.length; i++) {
            if (maat[i] == 5) {
                jarjesta(kasi);
                return ARVO;
            }
        }
        return 0;
    }
    
    public static void jarjesta(TarkastettavaKasi kasi){
        kasi.jarjestaArvollaPienimmastaSuurimpaan();
         if (kasi.getKortti(0).getArvo() == 0
                 && kasi.getKortti(5).getMaa() == kasi.getKortti(6).getMaa() 
                 && kasi.getKortti(4).getMaa() == kasi.getKortti(5).getMaa()
                 && kasi.getKortti(3).getMaa() == kasi.getKortti(4).getMaa()
                 && kasi.getKortti(6).getArvo() == kasi.getKortti(0).getMaa()) {
            kasi.siirraLoppuun(0);
        }
        for (int i = 0; i < 2; i++) {
            if (kasi.getKortti(0).getMaa() != kasi.getKortti(3).getMaa()) {
                kasi.siirraLoppuun(0);
            }
        }
    }
}
