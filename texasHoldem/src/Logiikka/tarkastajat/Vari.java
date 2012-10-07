/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kortti;

/**
 *
 * @author Teemu
 */
public class Vari implements Tarkistettava {

    public static final int ARVO = 6;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int[] maat = new int[4];
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            if (kortti == null) {
                return 0;
            }
            maat[kortti.getMaa()]++;
        }
        for (int i = 0; i < maat.length; i++) {
            if (maat[i] >= 5) {
                jarjesta(i, kasi);
                return ARVO;
            }
        }
        return 0;
    }

    public static void jarjesta(int maa, TarkastettavaKasi kasi) {
        kasi.jarjestaArvollaSuurimmastaPienimpaan();
        for(int i=0;i<kasi.getMaara();i++) {
            if (kasi.getKortti(i).getArvo() == 0 && kasi.getKortti(i).getMaa() == maa) {
                kasi.siirraAlkuun(i);
                break;
            }
        }

        for(int i=0;i<5;i++){
            if(kasi.getKortti(i).getMaa() != maa){
                kasi.siirraLoppuun(i);
                i--;
            }
        }
    }
}
