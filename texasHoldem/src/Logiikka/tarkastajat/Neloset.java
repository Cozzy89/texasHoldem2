/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Poyta;

/**
 *
 * @author Teemu
 */
public class Neloset implements Tarkistettava {

    public static final int ARVO = 8;

    @Override
    public int[] tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int neloset = Tarkastaja.tarkistaMaaralla(maarat, 4, maarat.length-1);
        int[] arvot = new int[6];
        if (neloset != -1) {
            jarjesta(neloset, kasi);
            arvot[0] = ARVO;
            arvot[1] = kasi.getKortti(0).getArvo();
            arvot[2] = kasi.getKortti(4).getArvo();
            return arvot;
        }
        arvot[0] = 0;
        return arvot;
    }

    public static void jarjesta(int neloset, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(neloset);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(4);
        if(kasi.getKortti(kasi.getMaara()-1).getArvo()==0){
            for(int i=kasi.getMaara()-1; i>4; i--){
                kasi.siirra(i, i-1);
            }
        }
        
    }
}
