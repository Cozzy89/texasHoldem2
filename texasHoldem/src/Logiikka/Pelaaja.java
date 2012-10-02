package Logiikka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pelin pelaajat.
 *
 * @author Teemu
 */
public class Pelaaja {

    private int raha;
    private String nimi;
    private Kasi kasi;
    private Kasi kasi1;
    private int korotus;
    private boolean toiminut;
    private boolean luovuttanut;

    /**
     * Luo pelaaajan parametsinä annetaan alkuraha määrä ja pelaajan nimi.
     * Pelaajalle luodaan myös uusi käsi mihin hänelle sitten jaetaan kortteja.
     *
     * @param raha
     * @param nimi
     */
    public Pelaaja(int raha, String nimi) {
        this.raha = raha;
        this.nimi = nimi;
    }

    /**
     * Lisää kortin käteen.
     *
     * @param kortti
     */
    public void addKortti(Kortti kortti) {
        kasi.lisaaKortti(kortti);
    }
    

    /**
     * Palauttaa kortin käden kohdsta i.
     *
     * @param i
     * @return kortti(i)
     */
    public Kortti getKortti(int i) {
        return kasi.getKortti(i);
    }

    /**
     * Pelaajalla on mahdollisuus korottaa.
     *
     * @param maara
     * @return raha
     */
    public int vahennaRaha(int maara) {  // korotus
        if (maara >= raha) {
            maara = raha;
            raha = 0;
        } else {
            raha = raha - maara;
        }

        return maara;

    }
/**
 * Korotuksen määrä, palauttaa true jos onnistuu.
 * @param maara
 * @return 
 */
    public boolean korotus(int maara) {
        if (raha >= maara && maara > 0) {
            vahennaRaha(maara);
            return true;

        }
        return false;
    }

    /**
     * Palauttaa pelaajan rahamäärän.
     *
     * @return raha
     */
    public int getRaha() {
        return raha;
    }

    /**
     * Palauttaa pelaajan käden.
     *
     * @return kasi
     */
    public Kasi getKasi() {
        return kasi;
    }

    /**
     * Pelaajan rahamäärään lisätään voitto-määrä.
     *
     * @param maara
     * @return maara;
     */
    public int voitto(int maara) {
        raha = raha + maara;
        return maara;
    }

/**
 * Asettaa luovutuksen arvoksi totuusarvon.
 * @param arvo 
 */
    public void setLuovuta(boolean arvo) {
        luovuttanut = arvo;
    }
/**
 * Palauttaa onko pelaaja luovuttanut vai ei.
 * @return boolean
 */
    public boolean getLuovuta() {
        return luovuttanut;
    }
/**
 * Palauttaa pelaajan nimen.
 * @return nimi
 */
    public String getNimi() {
        return nimi;
    }
/**
 * Nollaa pelaajan käden ja asettaa luovutuksen ja toiminisen arvoksi false, sekä luo uuden käden pelaajalle.
 */
    public void nollaaKasi() {
        korotus=0;
        luovuttanut = false;
        toiminut = false;
        kasi = new Kasi();
    }

/**
 * Lisää pelaajan rahamäärään voittosumman.
 * @param maara 
 */
    public void lisaaVoitto(int maara) {
        raha = raha + maara;
    }
/**
 * Asettaa pelaajan korotuksen määrän.
 * @param maara
 * @param peli 
 */

/**
 * Palauttaa pelaajan korotuksen määrän.
 * @return 
 */
    public int getKorotus() {
        return korotus;
    }
/**
 * Asettaa korotuksen arvoksi 0.
 */
    public void nollaaKorotus() {
        korotus = 0;
    }
/**
 * Asettaa toiminnon arvoksi false.
 */
    public void nollaaToiminto() {
        toiminut = false;
    }
/**
 * Asettaa toiminnon arvoksi true.
 */
    public void toimi() {
        toiminut = true;
    }
/**
 * Palauttaa onko pelaaja toiminut.
 * @return boolean
 */
    public boolean getToimi() {
        return toiminut;
    }


}