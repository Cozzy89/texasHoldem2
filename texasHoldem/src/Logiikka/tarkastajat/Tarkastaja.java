/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Kayttoliittyma.Pelipoyta;

import Logiikka.Kasi;
import Logiikka.Pakka;
import Logiikka.Pelaaja;
import Logiikka.Poyta;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Teemu
 */
public class Tarkastaja {

    private static Tarkistettava[] tarkistettavat = {new Varisuora(), new Neloset(), new Tayskasi(), new Vari(), new Suora(), new Kolmoset(), new Kaksiparia(), new Pari(), new Hai()};
    public static final String[] tekstiArvoille = {"", "Hai", "Pari", "Kaksi paria", "Kolmoset", "Suora", "Väri", "Täyskäsi", "Neloset", "Värisuora", "Kuningasvärisuora"};

    public void tarkistaKasi(TarkastettavaKasi kasi) {
        int[] maarat = new int[13];
        haeSamojenKorttienMaarat(maarat, kasi);
        for (int i = 0; i < tarkistettavat.length; i++) {
            kasi.setArvo(tarkistettavat[i].tarkista(maarat, kasi));
            if (kasi.getArvo() != 0) {
                break;
            }
        }
    }
//    public int[] tarkistaKasi2(TarkastettavaKasi kasi) {
//        int[] maarat = new int[13];
//        haeSamojenKorttienMaarat(maarat, kasi);
//        for (int i = 0; i < tarkistettavat.length; i++) {
//            kasi.setArvo(tarkistettavat[i].tarkista(maarat, kasi));
//            if (kasi.getArvo() != 0) {
//                return kasi.getArvot();
//            }
//        }
//        return kasi.getArvot();
//    }

    private void haeSamojenKorttienMaarat(int[] maarat, TarkastettavaKasi kasi) {
        for (int i = 0; i < kasi.getMaara(); i++) {
            maarat[kasi.getKortti(i).getArvo()]++;
        }
    }

    public static int tarkistaMaaralla(int[] maarat, int haluttuMaara, int alkaen) {
        for (int i = alkaen; i >= 0; i--) {
            if (maarat[i] == haluttuMaara) {
                return i;
            }
        }
        return -1;
    }
//    public int vertaaArvot(TarkastettavaKasi kasi1, TarkastettavaKasi kasi2) {
//            for(int i=0; i<6; i++){
//            if(tarkistaKasi2(kasi1)[i] > tarkistaKasi2(kasi2)[i]){
//                return 1;
//            }
//            else if(tarkistaKasi2(kasi1)[i] != tarkistaKasi2(kasi2)[i]){
//                return -1;
//            }
//        }
//        return 0;
//   
//}
}