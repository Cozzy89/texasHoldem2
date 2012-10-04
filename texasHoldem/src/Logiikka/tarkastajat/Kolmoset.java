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
public class Kolmoset implements Tarkistettava {
    public static final int ARVO = 4;
    @Override
    public int[] tarkista(int[] maarat, TarkastettavaKasi kasi){
        int kolmoset = Tarkastaja.tarkistaMaaralla(maarat, 3, maarat.length-1);
        int[] arvot = new int[6];
        if( kolmoset != -1){
            jarjesta(kolmoset, kasi);
            arvot[0] = ARVO;
            arvot[1] = kasi.getKortti(0).getArvo();
            arvot[2] = kasi.getKortti(3).getArvo();
            arvot[3] = kasi.getKortti(4).getArvo();
            return arvot;
        }
        arvot[0] = 0;
        return arvot;
    }
    
    public static void jarjesta(int kolmoset, TarkastettavaKasi kasi){
        kasi.siirraArvollaAlkuun(kolmoset);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(3);
        if(kasi.getKortti(kasi.getMaara()-1).getArvo()==0){
            for(int i=kasi.getMaara()-1; i>3; i--){
                kasi.siirra(i, i-1);
            }
        }
    }
}
