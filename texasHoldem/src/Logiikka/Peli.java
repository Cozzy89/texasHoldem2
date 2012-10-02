package Logiikka;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Käyttöliittymä.Pelipöytä;
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
    Pelipöytä pelipöytä;
    private ArrayList<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
    TodennakoisyysTarkistaja todTar;
    

    
    public Peli(Pelipöytä pelipöytä) {
        this.pelipöytä = pelipöytä;
        pelaa();
    }
    /**
     *
     */
    public void pelaa(){
        Pelaaja pelaaja1 = new Pelaaja(100, "Teemu");
        Pelaaja pelaaja2 = new Pelaaja(100, "Pekka");
        Pelaaja pelaaja3 = new Pelaaja(100, "Pekka1");
        Pelaaja pelaaja4 = new Pelaaja(100, "Pekka2");
        Pelaaja pelaaja5 = new Pelaaja(100, "Pekka3");
        Pelaaja pelaaja6 = new Pelaaja(100, "Pekka4");
        Poyta poyta = new Poyta(5);
        pelaajat.add(pelaaja1);
        pelaajat.add(pelaaja2);
        pelaajat.add(pelaaja3);
        pelaajat.add(pelaaja4);
        pelaajat.add(pelaaja5);
        pelaajat.add(pelaaja6);
        pelaaja1.nollaaKasi();
        pelaaja2.nollaaKasi();
        pelaaja3.nollaaKasi();
        pelaaja4.nollaaKasi();
        pelaaja5.nollaaKasi();
        pelaaja6.nollaaKasi();
        uusiPakka();
        pelaajat.get(0).addKortti(pakka.Jaa());
        pelaajat.get(0).addKortti(pakka.Jaa());
       pelaajat.get(1).addKortti(pakka.Jaa());
        pelaajat.get(1).addKortti(pakka.Jaa());
        pelaajat.get(2).addKortti(pakka.Jaa());
        pelaajat.get(2).addKortti(pakka.Jaa());
        pelaajat.get(3).addKortti(pakka.Jaa());
        pelaajat.get(3).addKortti(pakka.Jaa());
        pelaajat.get(4).addKortti(pakka.Jaa());
        pelaajat.get(4).addKortti(pakka.Jaa());
        pelaajat.get(5).addKortti(pakka.Jaa());
        pelaajat.get(5).addKortti(pakka.Jaa());
        
        poyta.lisaaKortti(pakka.Jaa());
        poyta.lisaaKortti(pakka.Jaa());
        poyta.lisaaKortti(pakka.Jaa());
        poyta.lisaaKortti(pakka.Jaa());
        poyta.lisaaKortti(pakka.Jaa());
        
        TarkastettavaKasi[] tarkastettavatKadet = new TarkastettavaKasi[pelaajat.size()];
        for(int i=0;i<pelaajat.size();i++){
            tarkastettavatKadet[i] = new TarkastettavaKasi(pelaajat.get(i).getKasi(), poyta);
        }

        for(int i=0; i<5; i++){
            System.out.print(poyta.getKortti(i).getMaa(true)+poyta.getKortti(i).getArvo()+", ");
        }
        
        Tarkastaja tarkastaja = new Tarkastaja();
        for(int i=0;i<pelaajat.size();i++){
            tarkastaja.tarkistaKasi(tarkastettavatKadet[i]);
        }
        System.out.println("");
        for(int i=0;i<tarkastettavatKadet.length;i++){
            tulostaKasi(tarkastettavatKadet[i]);
        }

        

    }
    
    /**
     *
     * @param pelaaja
     */
    public void tulostaKasi(TarkastettavaKasi kasi) {
        System.out.println("Kaden arvo: "+Tarkastaja.tekstiArvoille[kasi.getArvo()]);
        System.out.print("Kortit: ");
        for (int i = 0; i < 7; i++) {
            Kortti kortti = kasi.getKortti(i);
            if (kortti == null) {
                break;
            }
            System.out.print((i != 0 ? "," : "") + Kortti.korttiArvot[kortti.getArvo()] + kortti.getMaa(true));
        }
        System.out.println("");


    }
    /**
     *
     */
    public void uusiPakka() {
        pakka = new Pakka();
        pakka.Sekoita();
    }

    
}
