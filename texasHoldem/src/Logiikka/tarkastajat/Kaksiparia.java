/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

/**
 *
 * @author Teemu
 */
public class Kaksiparia implements Tarkistettava {

    public static final int ARVO = 3;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int[] parit = new int[2];
        parit[0] = Tarkastaja.tarkistaMaaralla(maarat, 2, maarat.length - 1);
        if (parit[0] != -1) {
            parit[1] = Tarkastaja.tarkistaMaaralla(maarat, 2, parit[0] - 1);
            if (parit[1] != -1) {
                jarjesta(parit, kasi);
                return ARVO;
            }
        }
        return 0;
    }

    public static void jarjesta(int[] parit, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(parit[1]);
        kasi.siirraArvollaAlkuun(parit[0]);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(4);
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.vaihdaPaikat(kasi.getMaara() - 1, 4);
        }
    }
}
