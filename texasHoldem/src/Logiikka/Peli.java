package Logiikka;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Kayttoliittyma.PelaajanToiminnot2;
import Kayttoliittyma.Pelipoyta;
import Logiikka.tarkastajat.Tarkastaja;
import Logiikka.tarkastajat.TarkastettavaKasi;
import java.util.ArrayList;

/**
 *
 * @author Teemu
 */
public class Peli {

    Pakka pakka;
    Poyta poyta;
    Pelipoyta pelipoyta;
    private ArrayList<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
    TodennakoisyysTarkistaja todTar;
    Kortti kortti;
    int valinta;
    int korotus;
    int potti;
    public Tarkastaja tarkistaja = new Tarkastaja();
    PelaajanToiminnot toiminto;
    int kierrosluku = 0;
    private final int Floppi = 3;
    private final int Turn = 1;
    private final int River = 1;
    TodennakoisyysTarkistaja tnTarkistaja = new TodennakoisyysTarkistaja();
    public int voittoLaskuriPelaaja;
    public int voittoLaskuriKone;
    private final int isoBlindi = 40;
    private final int pieniBlindi = 20;
    public int voittaja;
    Pelaaja[] vuoro = new Pelaaja[2];

    public Peli(Pelipoyta pelipöytä) {
        this.pelipoyta = pelipöytä;
        Pelaaja ihminen = new Pelaaja(1000, "Pelaaja");
        pelaajat.add(ihminen);
        Pelaaja kone = new Pelaaja(1000, "Kone");
        pelaajat.add(kone);
        vuoro[0] = ihminen;
        vuoro[1] = kone;
        pelaa();
    }

    public void pelaa() {
        voittoLaskuriKone = 0;
        voittoLaskuriPelaaja = 0;
        System.out.println("Tervetuloa pelaamaan Texas Holdem No limit heads uppia konetta vastaan! Iso blindi on 40 ja pieni 20.");
        System.out.println("");
        uusiKasi();
        peli:
        while (true) {
            pelipoyta.tulostaKasiPelaaja(pelaajat.get(0).getKasi(), pelaajat.get(0));
            System.out.println("");
            tulostaRahat();
            pelipoyta.tulostaPotti(potti);
            if (pelaajat.get(0).getRaha() > 0 && pelaajat.get(1).getRaha() > 0) {
                while (!pelaajat.get(0).getToimi() || !pelaajat.get(1).getToimi()) {

                    for (int i = 0; i < 2; i++) {
                        if (montaPelaajaa() == 1) {
                            jaaPotti(pelaajat);
                            nollaaPotti();
                            nollaaKorotus();

                            if (vuoro[0].getRaha() == 0 || vuoro[1].getRaha() == 0) {
                                if (pelaajat.get(1).getRaha() == 0) {
                                    System.out.println("Peli päättyi! VOITIT!");
                                }
                                if (pelaajat.get(0).getRaha() == 0) {
                                    System.out.println("Peli päättyi! valitettavasti hävisit tällä kertaa, mutta kokeile ihmeessä uudestaan!");
                                }
                                return;
                            } else {
                                if (vuoro[0].getLuovuta()) {
                                    if (vuoro[0] == pelaajat.get(0)) {
                                        voittoLaskuriKone++;
                                    } else {
                                        voittoLaskuriPelaaja++;
                                    }
                                }
                                if (vuoro[1].getLuovuta()) {
                                    if (vuoro[1] == pelaajat.get(0)) {
                                        voittoLaskuriKone++;
                                    } else {
                                        voittoLaskuriPelaaja++;
                                    }
                                }
                                tulostaRahat();
                                vuoronVaihto();
                                uusiKasi();
                                pelipoyta.tulostaTilanne(this);
                                System.out.println("");
                            }

                            continue peli;
                        }

                        if (!vuoro[i].getToimi()) {
                            if (vuoro[i] == pelaajat.get(0)) {
                                toimintoPelaaja(pelaajat.get(0));
                                System.out.println("");
                            } else {
                                toimintoKone(pelaajat.get(1));
                            }
                        }

                    }
                }
                nollaaKorotus();
            }
            System.out.println("");
            if (kierrosluku == 0) {
                jaaKortitPoydalle(Floppi);
                pelipoyta.tulostaPoytaKortit(3, poyta);
            }
            if (kierrosluku == 1) {
                jaaKortitPoydalle(Turn);
                pelipoyta.tulostaPoytaKortit(4, poyta);
            }
            if (kierrosluku == 2) {
                jaaKortitPoydalle(River);
                pelipoyta.tulostaPoytaKortit(5, poyta);
            }
            nollaaToiminnot(pelaajat.get(0));
            nollaaToiminnot(pelaajat.get(1));
            kierrosluku++;
            if (kierrosluku == 4) {
                pelipoyta.tulostaKierrosAnalyysi(pelaajat.get(0), pelaajat.get(1), poyta, this);
                System.out.println("");
                if (pelaajat.get(0).getRaha() == 0 || pelaajat.get(1).getRaha() == 0) {
                    if (pelaajat.get(1).getRaha() == 0) {
                        System.out.println("Peli päättyi! VOITIT!");
                    }
                    if (pelaajat.get(0).getRaha() == 0) {
                        System.out.println("Peli päättyi! valitettavasti hävisit tällä kertaa, mutta kokeile ihmeessä uudestaan!");
                    }
                    return;
                } else {
                    vuoronVaihto();
                    uusiKasi();
                    pelipoyta.tulostaTilanne(this);
                    System.out.println("");
                }
            }

        }



    }

    /**
     *
     * @param pelaaja
     */
    public Kortti annaTiettyKortti(int arvo, int maa) {
        Kortti kortti = new Kortti(arvo, maa);
        return kortti;
    }

    /**
     * Palauttaa pelaajan annetulta kohdalta.
     *
     * @param i
     * @return
     */
    public Pelaaja getPelaaja(int i) {
        return pelaajat.get(i);
    }

    /**
     * Alustaa potin, kadet ja tekee uuden pakan GUI:ta varten.
     */
    public void alustaTarvittavat() {
        nollaaPotti();
        nollaaKadet();
        uusiPakka();
    }

    /**
     * Jakaa kortit valitulle pelaajalle valittuun kohtaan GUI:ssa.
     *
     * @param i
     * @param kohta
     * @return
     */
    public String jaaKortti(int i, int kohta) {
        pelaajat.get(i).addKortti(pakka.Jaa());
        return pelaajat.get(i).getKortti(kohta).getArvo() + pelaajat.get(i).getKortti(kohta).getMaa(true);
    }

    /**
     * Luo uuden pakan ja sekoittaa sen.
     */
    public void toimintoPelaaja(Pelaaja pelaaja) {
        valinta = PelaajanToiminnot2.pelaajanToiminnot(pelaaja);
        if (valinta == 1) {
            PelaajanToiminnot2.korotus(pelaaja, this);
            nollaaToiminnot(pelaaja);
        }
        if (valinta == 2) {
            PelaajanToiminnot.checkMaksu(pelaaja, this);
            System.out.println("Pelaaja check.");
        }
        if (valinta == 3) {
            PelaajanToiminnot.luovuta(pelaaja);
            System.out.println("Pelaaja fold. Tilanne:");
        }

    }
    /*
     * Koneen toiminto.
     */

    public void toimintoKone(Pelaaja pelaaja) {
        valinta = PelaajanToiminnot2.koneenToiminnot(pelaaja);
        if (valinta == 1) {
            PelaajanToiminnot2.korotus(pelaaja, this);
            nollaaToiminnot(pelaaja);
        }
        if (valinta == 2) {
            PelaajanToiminnot.checkMaksu(pelaaja, this);
            System.out.println("KONE CHECK.");
        }
        if (valinta == 3) {
            PelaajanToiminnot.luovuta(pelaaja);
            System.out.println("");
            System.out.println("KONE FOLD. Tilanne: ");
        }
    }

    /**
     * Luo uuden pakan ja sekoittaa sen.
     */
    public void uusiPakka() {
        pakka = new Pakka();
        pakka.Sekoita();
    }

    /**
     * Jakaa yhdet kortit pelaajille.
     */
    public void jaaKortit() {    // korttien jako

        for (int i = 0; i < pelaajat.size(); i++) {
            pelaajat.get(i).addKortti(pakka.Jaa());
        }
    }

    public void jaaKortitPoydalle(int maara) {

        for (int i = 0; i < maara; i++) {
            poyta.lisaaKortti(pakka.Jaa());
        }
    }

    /**
     * Metodissa pelin kulku.
     */
    /**
     * Lisää pottiin korotus määrän ja palauttaa potin arvon.
     */
    public int lisaaPottiin(int korotus) {
        potti = potti + korotus;

        return potti;
    }

    /**
     * Asettaa potin arvoksi 0.
     */
    public void nollaaPotti() {
        potti = 0;
    }

    /**
     * Peli kierroksen alussa jakaa uudet kortit ja nollaa potin, kädet,
     * kierrosluvun ja luo uuden pakan.
     */
    public void uusiKasi() {
        kierrosluku = 0;
        nollaaPotti();
        nollaaKadet();
        uusiPakka();
        uusiPoyta();
        otaBlindit();
        jaaKortit();
        jaaKortit();

    }

    /**
     * Tulostaa pelaajien kortit, jotka heille on jaettu.
     */
    public void tulostaKadet() {

        for (Pelaaja p : pelaajat) {
            pelipoyta.tulostaKasiPelaaja(p.getKasi(), p);
        }
    }

    public void tulostaLopullinenKasi() {
        for (Pelaaja p : pelaajat) {
            pelipoyta.tulostaLopullinenKasiPelaaja(p.getKasi(), poyta, p, this);
        }
    }

    /**
     * Nollaa pelaajien kädet.
     */
    public void nollaaKadet() {
        for (Pelaaja p : pelaajat) {
            p.nollaaKasi();
        }
    }

    /**
     * Tarkistaa kenellä pelaajista on paras käsi.
     */
    public void tarkistaVoittaja() {
        TarkastettavaKasi kasi1 = new TarkastettavaKasi(pelaajat.get(0).getKasi(), poyta);
        tarkistaja.tarkistaKasi(kasi1);
        TarkastettavaKasi kasi2 = new TarkastettavaKasi(pelaajat.get(1).getKasi(), poyta);
        tarkistaja.tarkistaKasi(kasi2);
        int kumpiVoitti = kasi1.vertaa(kasi2);
        ArrayList<Pelaaja> voittajat = new ArrayList<Pelaaja>();
        if (kumpiVoitti == 1) {
            voittaja = 1;
            voittoLaskuriPelaaja++;
            voittajat.add(pelaajat.get(0));
        } else if (kumpiVoitti == -1) {
            voittaja = -1;
            voittoLaskuriKone++;
            voittajat.add(pelaajat.get(1));
        } else {
            voittaja = 0;
            voittajat.add(pelaajat.get(0));
            voittajat.add(pelaajat.get(1));
        }
        jaaPotti(voittajat);

    }

    /**
     * Tulostaa pelaajien rahamäärän.
     */
    public void tulostaRahat() {
        for (Pelaaja p : pelaajat) {
            pelipoyta.tulostaRaha(p);
        }
    }

    /**
     * Palauttaa halutun pelaajan rahamäärän.
     *
     * @param i
     * @return
     */
    public int getRaha(int i) {
        return pelaajat.get(i).getRaha();
    }

    /**
     * Asettaa korotuksen arvoksi annetun määrän.
     *
     * @param maara
     */
    public void setKorotus(int maara) {
        this.korotus = maara;
    }

    /**
     * palauttaa korotuksen määrän.
     *
     * @return int
     */
    public int getKorotus() {
        return korotus;
    }

    /**
     * Palauttaa potin.
     *
     * @return int
     */
    public int getPotti() {
        return potti;
    }

    /**
     * Asettaa pelaajien korotuksien arvoksi 0.
     */
    public void nollaaKorotus() {
        setKorotus(0);
        for (int i = 0; i < pelaajat.size(); i++) {
            pelaajat.get(i).nollaaKorotus();
        }
    }

    /**
     * Jakaa potin voittajien kesken.
     *
     * @param pelaajat
     */
    public void jaaPotti(ArrayList<Pelaaja> pelaajat) {
        int montako = 0;
        for (int i = 0; i < pelaajat.size(); i++) {
            if (!pelaajat.get(i).getLuovuta()) {
                montako++;
            }
        }
        int maara = potti / montako;
        for (int i = 0; i < pelaajat.size(); i++) {
            if (!pelaajat.get(i).getLuovuta()) {
                pelaajat.get(i).lisaaVoitto(maara);
            }
        }
        potti = potti % pelaajat.size();
    }

    public void jaaPotti(int i) {
        pelaajat.get(i).lisaaVoitto(potti);

    }

    /**
     * Nollaa pelaajien toiminnot.
     *
     * @param pelaaja
     */
    public void nollaaToiminnot(Pelaaja pelaaja) {
        for (int i = 0; i < pelaajat.size(); i++) {
            if (pelaajat.get(i) != pelaaja) {
                pelaajat.get(i).nollaaToiminto();
            }
        }
    }

    /**
     * Tarkistaa kuinka monta pelaajaa on vielä kierroksella mukana.
     *
     * @return
     */
    public int montaPelaajaa() {
        int mukana = 0;
        for (Pelaaja p : pelaajat) {
            if (!p.getLuovuta()) {
                mukana++;
            }
        }
        return mukana;
    }

    /**
     * Gui:ssa tarvittu korotus metodi.
     *
     * @param i
     * @param maara
     */
    public void korotus(int i, int maara) {
        PelaajanToiminnot.korotus(pelaajat.get(i), this, maara);

    }

    /**
     * Gui:ssa tarvittu maksu metodi.
     *
     * @param i
     */
    public void maksu(int i) {
        PelaajanToiminnot.checkMaksu(pelaajat.get(i), this);
    }

    /**
     * GUI:ssa tarvittu luovutus metodi.
     *
     * @param i
     */
    public void luovuta(int i) {
        PelaajanToiminnot.luovuta(pelaajat.get(i));
    }

    public void uusiPoyta() {
        poyta = new Poyta(5);
    }

    public void otaBlindit() {
        vuoro[0].vahennaRaha(pieniBlindi);
        vuoro[1].vahennaRaha(isoBlindi);
        potti = potti + pieniBlindi + isoBlindi;
    }

    public void vuoronVaihto() {
        Pelaaja pelaaja = vuoro[0];
        Pelaaja kone = vuoro[1];
        vuoro[0] = kone;
        vuoro[1] = pelaaja;
    }
}
