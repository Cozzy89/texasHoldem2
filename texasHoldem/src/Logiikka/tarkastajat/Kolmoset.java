/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

/**
 *
 * @author Teemu
 */
public class Kolmoset implements Tarkistettava {

    public static final int ARVO = 4;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int kolmoset = Tarkastaja.tarkistaMaaralla(maarat, 3, maarat.length - 1);
        if (kolmoset != -1) {
            jarjesta(kolmoset, kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(int kolmoset, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(kolmoset);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(3);
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.siirra(kasi.getMaara() - 1, 3);
        }
    }
}
