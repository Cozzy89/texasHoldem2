/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

/**
 *
 * @author Teemu
 */
public class Neloset implements Tarkistettava {

    public static final int ARVO = 8;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int neloset = Tarkastaja.tarkistaMaaralla(maarat, 4, maarat.length - 1);
        if (neloset != -1) {
            jarjesta(neloset, kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(int neloset, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(neloset);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(4);
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.vaihdaPaikat(kasi.getMaara() - 1, 4);
        }
    }
}
