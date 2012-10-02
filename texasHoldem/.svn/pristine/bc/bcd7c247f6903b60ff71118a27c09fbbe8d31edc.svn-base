/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

/**
 *
 * @author Tero
 */
public class Hai implements Tarkistettava {

    public static final int ARVO = 1;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        jarjesta(kasi);
        return ARVO;
    }

    public static void jarjesta(TarkastettavaKasi kasi) {
        kasi.jarjestaArvollaSuurimmastaPienimpaan();
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.siirraAlkuun(kasi.getMaara()-1);
        }
    }
}

