/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

/**
 *
 * @author Teemu
 */
public class Hai implements Tarkistettava {

    public static final int ARVO = 1;

    @Override
    public int[] tarkista(int[] maarat, TarkastettavaKasi kasi) {
        jarjesta(kasi);
        int[] arvot = new int[6];
        arvot[0] = ARVO;
        for(int i=1; i<6; i++){
            arvot[i] = kasi.getKortti(i-1).getArvo();
        }
        
        return arvot;
    }

    public static void jarjesta(TarkastettavaKasi kasi) {
        kasi.jarjestaArvollaSuurimmastaPienimpaan();
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.siirraAlkuun(kasi.getMaara()-1);
        }
    }
}

