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
    Pelipoyta pelipöytä;
    private ArrayList<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
    TodennakoisyysTarkistaja todTar;
    Kortti kortti;
    int valinta;
    int korotus;
    int potti;
    Tarkastaja tarkistaja;
    PelaajanToiminnot toiminto;
    int kierrosluku = 0;
    final int Floppi = 3;
    final int Turn = 1;
    final int River = 1;
    TodennakoisyysTarkistaja tnTarkistaja = new TodennakoisyysTarkistaja();
    int voittoLaskuriPelaaja;
    int voittoLaskuriKone;
    final int isoBlindi = 20;
    final int pieniBlindi = 40;
    int voittaja;
    
    
    public Peli(Pelipoyta pelipöytä) {
        this.pelipöytä = pelipöytä;
        Pelaaja ihminen = new Pelaaja(1000, "Pelaaja");
        pelaajat.add(ihminen);
        Pelaaja kone = new Pelaaja(1000, "Kone");
        pelaajat.add(kone);
        pelaa();
    }

    public void pelaa() {
        voittoLaskuriKone = 0;
        voittoLaskuriPelaaja = 0;
        System.out.println("Tervetuloa pelaamaan Texas Holdem No limit heads uppia konetta vastaan!");
        uusiKasi();
        peli:
        while (true) {
            System.out.println("");
            tulostaKasiPelaaja(pelaajat.get(0).getKasi(), pelaajat.get(0));
            System.out.println("");
            tulostaRahat();
            
            if (pelaajat.get(0).getRaha() > 0 && pelaajat.get(1).getRaha() > 0) {
                while (!pelaajat.get(0).getToimi() || !pelaajat.get(1).getToimi()) {
                    
                    for (int i = 0; i < 2; i++) {
                       if (montaPelaajaa() == 1) {
                            jaaPotti(pelaajat);
                            nollaaPotti();
                            nollaaKorotus();

                            if (pelaajat.get(0).getRaha() == 0 || pelaajat.get(1).getRaha() == 0) {
                                if (pelaajat.get(1).getRaha() == 0) {
                                    System.out.println("Peli päättyi! VOITIT!");
                                }
                                if (pelaajat.get(0).getRaha() == 0) {
                                    System.out.println("Peli päättyi! valitettavasti hävisit tällä kertaa, mutta kokeile ihmeessä uudestaan!");
                                }
                                return;
                            } else {
                                if (pelaajat.get(0).getLuovuta()) {
                                    voittoLaskuriKone++;

                                } else {
                                    voittoLaskuriPelaaja++;
                                }
                                //      tulostaRahat(); 
                                uusiKasi();
                                tulostaTilanne();
                            }
                            continue peli;
                        }
                        if (pelaajat.get(0).getLuovuta()) {
                            voittoLaskuriKone++;
                            uusiKasi();
                            tulostaTilanne();
                            continue peli;
                        }
                        if (pelaajat.get(1).getLuovuta()) {
                            voittoLaskuriPelaaja++;
                            uusiKasi();
                            tulostaTilanne();
                            continue peli;
                        }
                        if (!pelaajat.get(i).getToimi()){
                            if (!pelaajat.get(0).getToimi()) {
                                toimintoPelaaja(pelaajat.get(0));
                                System.out.println("");
                            }  
                            if (!pelaajat.get(1).getToimi()) {
                                toimintoKone(pelaajat.get(1));
                            }
                        }

                    }
                }
                System.out.println("");
                tulostaPotti(potti);
                nollaaKorotus();
            }
            System.out.println("");
            if (kierrosluku == 0) {
                jaaKortitPoydalle(Floppi);
                tulostaPoytaKortit(3);
            }
            if (kierrosluku == 1) {
                jaaKortitPoydalle(Turn);
                tulostaPoytaKortit(4);
            }
            if (kierrosluku == 2) {
                jaaKortitPoydalle(River);
                tulostaPoytaKortit(5);
            }
            nollaaToiminnot(pelaajat.get(0));
            nollaaToiminnot(pelaajat.get(1));
            kierrosluku++;
            if (kierrosluku == 4) {
                tulostaKierrosAnalyysi(pelaajat.get(0), pelaajat.get(1));
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
                    uusiKasi();
                    tulostaTilanne();
                }
            }

        }



    }

    public void tulostaPotti(int maara) {
        System.out.println("Potissa on: " + maara);

    }

    /**
     *
     * @param pelaaja
     */
    public void tulostaKasi(TarkastettavaKasi kasi, Pelaaja pelaaja) {

        System.out.print(pelaaja.getNimi() + ": ");
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }


    }

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
        }
        if (valinta == 3) {
            PelaajanToiminnot.luovuta(pelaaja);
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
        }
        if (valinta == 3) {
            PelaajanToiminnot.luovuta(pelaaja);
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
        jaaKortit();
        jaaKortit();
    }

    /**
     * Tulostaa pelaajien kortit, jotka heille on jaettu.
     */
    public void tulostaKadet() {

        for (Pelaaja p : pelaajat) {
            tulostaKasiPelaaja(p.getKasi(), p);
        }
    }
    public void tulostaLopullinenKasi(){
        for(Pelaaja p : pelaajat){
            tulostaLopullinenKasiPelaaja(p.getKasi(), poyta, p);
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
        TarkastettavaKasi kasi2 = new TarkastettavaKasi(pelaajat.get(1).getKasi(), poyta);
        tarkistaja = new Tarkastaja();
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
            pelipöytä.tulostaRaha(p);
        }
        System.out.println("");
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

    public void tulostaPoytaKortit(int montako) {
        System.out.print("Pöytä: ");
        for (int i = 0; i < montako; i++) {
            Kortti kortti = poyta.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }
        System.out.println("");


    }

    public void tulostaKasiPelaaja(Kasi kasi, Pelaaja pelaaja) {
        System.out.print(pelaaja.getNimi() + ": ");
        for (int i = 0; i < kasi.getMaara(); i++) {
            Kortti kortti = kasi.getKortti(i);
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }
        System.out.println();
    }
    public void tulostaLopullinenKasiPelaaja(Kasi kasi, Poyta poyta, Pelaaja pelaaja){
        System.out.print(pelaaja.getNimi()+ ": ");
        TarkastettavaKasi tarKasi = new TarkastettavaKasi(kasi, poyta);
        tarkistaja.tarkistaKasi(tarKasi);
        System.out.print(Tarkastaja.tekstiArvoille[tarKasi.getArvo()]);
        System.out.println(", korkein kortti "+ Kortti.korttiArvot[tarKasi.getKortti(0).getArvo()]);
    }
    
    public void tulostaTilanne(){
        System.out.println("Pelaajan voitot: " + voittoLaskuriPelaaja + ", Koneen voitot: " + voittoLaskuriKone);
    }
    
    public void tulostaKierrosAnalyysi(Pelaaja pelaaja, Pelaaja kone){
        System.out.println("Kierroksen tulokset:");
        tarkistaVoittaja();
        tulostaKadet();
        tulostaPoytaKortit(5);
        tulostaLopullinenKasi();
        if(voittaja == 1){
            System.out.println("Pelaaja voitti.");
        }
        if(voittaja == -1){
            System.out.println("Kone voitti.");
        }
        if(voittaja == 0){
            System.out.println("Tasapeli.");
        }
    }

}
