/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import Logiikka.Kasi;
import Logiikka.Kortti;
import Logiikka.Pelaaja;
import Logiikka.Peli;
import Logiikka.Poyta;
import Logiikka.tarkastajat.Tarkastaja;
import Logiikka.tarkastajat.TarkastettavaKasi;
import java.util.Scanner;

/**
 *
 * @author Teemu
 */
public class Pelipoyta {

    Peli peli;
    private static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        Pelipoyta pelipöytä = new Pelipoyta();

    }

    public Pelipoyta() {
        peli = new Peli(this);
    }

    /**
     * Kysyy kysymyksen ja pyytää siihen vastaukseski int.
     *
     * @param kysymys
     * @return int
     */
    public static int kysyInt(String kysymys) {
        while (true) {
            System.out.println(kysymys);
            try {
                return Integer.parseInt(lukija.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Ei kelpaa!");
            }
        }

    }

    /**
     * Kysyy kysymyksen ja pyytää siihen vastaukseksi String.
     *
     * @param kysymys
     * @return String
     */
    public static String kysyString(String kysymys) {

        System.out.println(kysymys);

        return lukija.nextLine();


    }

    /**
     * Tulostaa pelaajan rahamäärän.
     *
     * @param pelaaja
     */
    public void tulostaRaha(Pelaaja pelaaja) {
        System.out.println(pelaaja.getNimi() + ": " + pelaaja.getRaha());
    }

    public void tulostaPotti(int maara) {
        System.out.println("Potissa on: " + maara);

    }

    public void tulostaPoytaKortit(int montako, Poyta poyta) {
        System.out.print("Pöytä: ");
        for (int i = 0; i < montako; i++) {
            Kortti kortti = poyta.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }
        System.out.println("");


    }

    public void tulostaKierrosAnalyysi(Pelaaja pelaaja, Pelaaja kone, Poyta poyta, Peli peli) {
        System.out.println("Kierroksen tulokset:");
        peli.tarkistaVoittaja();
        peli.tulostaKadet();
        tulostaPoytaKortit(5, poyta);
        peli.tulostaLopullinenKasi();
        if (peli.voittaja == 1) {
            System.out.println("Pelaaja voitti.");
        }
        if (peli.voittaja == -1) {
            System.out.println("Kone voitti.");
        }
        if (peli.voittaja == 0) {
            System.out.println("Tasapeli.");
        }
    }

    public void tulostaTilanne(Peli peli) {
        System.out.println("Pelaajan voitot: " + peli.voittoLaskuriPelaaja + ", Koneen voitot: " + peli.voittoLaskuriKone +"\n"+
                "Seuraava kierros alkaa:");
    }

    public void tulostaLopullinenKasiPelaaja(Kasi kasi, Poyta poyta, Pelaaja pelaaja, Peli peli) {
        System.out.print(pelaaja.getNimi() + ": ");
        TarkastettavaKasi tarKasi = new TarkastettavaKasi(kasi, poyta);
        peli.tarkistaja.tarkistaKasi(tarKasi);
        System.out.print(Tarkastaja.tekstiArvoille[tarKasi.getArvo()]);
        System.out.println(", korkein kortti " + Kortti.korttiArvot[tarKasi.getKortti(0).getArvo()]);
    }

    public void tulostaKasiPelaaja(Kasi kasi, Pelaaja pelaaja) {
        System.out.print(pelaaja.getNimi() + ": ");
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }
        System.out.println();
    }

    public void tulostaKasi(TarkastettavaKasi kasi, Pelaaja pelaaja) {

        System.out.print(pelaaja.getNimi() + ": ");
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }


    }
}
