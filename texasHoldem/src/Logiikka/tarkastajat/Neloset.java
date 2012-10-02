/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Poyta;

/**
 *
 * @author Tero
 */
public class Neloset implements Tarkistettava {

    public static final int ARVO = 8;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int neloset = Tarkastaja.tarkistaMaaralla(maarat, 4, 0);
        if (neloset != -1) {
            jarjesta(neloset, kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(int neloset, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(neloset);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(4);
    }
}
