/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Kasi;
import Logiikka.Kasi;
import Logiikka.Kortti;
import Logiikka.Kortti;
import Logiikka.Kortti;
import Logiikka.Poyta;
import Logiikka.Poyta;
import Logiikka.Poyta;

/**
 *
 * @author Teemu
 */
public class TarkastettavaKasi {

    private Kortti[] kortit;
    private int arvo;
    private int kortteja;

    public TarkastettavaKasi(Kasi kasi, Poyta poyta) {
        kortit = new Kortti[7];
        laitaKateenKaikkiKortit(kasi, poyta);
    }

    public void laitaKateenKaikkiKortit(Kasi kasi, Poyta poyta) {

        int i = 0;
        while (i < 5) {
            if (poyta.getKortti(i) == null) {
                break;
            }
            kortit[i] = poyta.getKortti(i);
            kortteja++;
            i++;
        }
        kortit[i++] = kasi.getKortti(0);
        kortit[i] = kasi.getKortti(1);
        kortteja += 2;
    }

    public Kortti getKortti(int i) {
        return kortit[i];
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

    public void jarjestaArvollaPienimmastaSuurimpaan() {
        jarjestaArvollaPienimmastaSuurimpaan(0);
    }

    public void jarjestaArvollaPienimmastaSuurimpaan(int alkaen) {
        for (int i = alkaen + 1; i < kortit.length; i++) {
            int j = i;
            while (j > alkaen && kortit[j - 1].getArvo() > kortit[i].getArvo()) {
                j--;
            }
            Kortti apu = kortit[i];
            for (int u = i; u > j; u--) {
                kortit[u] = kortit[u - 1];
            }
            kortit[j] = apu;
        }
    }

    public void jarjestaArvollaSuurimmastaPienimpaan() {
        jarjestaArvollaSuurimmastaPienimpaan(0);
    }

    public void jarjestaArvollaSuurimmastaPienimpaan(int alkaen) {
        for (int i = alkaen + 1; i < kortit.length; i++) {
            int j = i;
            while (j > alkaen && kortit[j - 1].getArvo() < kortit[i].getArvo()) {
                j--;
            }
            Kortti apu = kortit[i];
            for (int u = i; u > j; u--) {
                kortit[u] = kortit[u - 1];
            }
            kortit[j] = apu;
        }
    }

    public void vaihdaPaikat(int paikasta, int paikkaan) {
        Kortti apu = kortit[paikasta];
        kortit[paikasta] = kortit[paikkaan];
        kortit[paikkaan] = apu;
    }

    public void siirraAlkuun(int paikasta){
        Kortti apu = kortit[paikasta];
        for(int i=paikasta; i>0;i++){
            kortit[i] = kortit[i-1];
        }
        kortit[0] = apu;
    }
    
    public void siirraLoppuun(int paikasta) {
        Kortti apu = kortit[paikasta];
        int viimeinen = getMaara();
        for (int i = paikasta; i < viimeinen - 1; i++) {
            kortit[i] = kortit[i + 1];
        }
        kortit[viimeinen] = apu;
    }

    public void siirra(int paikasta, int paikkaan) {
        Kortti apu = kortit[paikasta];
        for (int i = paikkaan + 1; i <= paikasta; i++) {
            kortit[i] = kortit[i - 1];
        }
        kortit[paikkaan] = apu;
    }
    
    public void siirraArvollaAlkuun(int arvo){
        int paikka = 0;
        for (int i = 0; i < getMaara(); i++) {
            if (getKortti(i).getArvo() == arvo) {
                vaihdaPaikat(i, paikka);
                paikka++;
            }
        }
    }

    public int getMaara() {
        return kortteja;
    }
}