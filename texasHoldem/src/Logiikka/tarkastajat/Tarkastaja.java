/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Käyttöliittymä.Pelipöytä;

import Logiikka.Kasi;
import Logiikka.Pakka;
import Logiikka.Pelaaja;
import Logiikka.Poyta;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tero
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

    public static int vertaaArvot(int arvo1, int arvo2) {
        if (arvo1 == 0) {
            arvo1 = 13;
        }
        if (arvo2 == 0) {
            arvo2 = 13;
        }
        if (arvo1 > arvo2) {
            return 1;
        } else if (arvo1 < arvo2) {
            return -1;
        }
        return 0;
    }
}