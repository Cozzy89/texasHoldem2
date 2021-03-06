package Logiikka;

import Kayttoliittyma.Pelipoyta;
import Logiikka.Pelaaja;
import Logiikka.Peli;
import java.util.Scanner;
/**
 * Pelaaja voi korottaa, checkata, maksaa tai luovuttaa.
 * @author Teemu
 */
public class PelaajanToiminnot {



/**
 * GUI:ssa käytettävä korotus metodi.
 * @param pelaaja
 * @param peli
 * @param maara 
 */    
    public static void korotus(Pelaaja pelaaja, Peli peli, int maara){
        checkMaksu(pelaaja, peli);

        if (pelaaja.korotus(maara)) {
            peli.lisaaPottiin(maara);
            pelaaja.setKorotus(peli.getKorotus()+maara, peli);
            
        }
   
        pelaaja.toimi();
        
    }
/**
 * Pelaaja voi checkata tai maksaa.
 * @param pelaaja
 * @param peli
 * @return 
 */    
    public static int checkMaksu(Pelaaja pelaaja, Peli peli){
        
        int maara = peli.getKorotus()-pelaaja.getKorotus()*2;
        if(maara<0){
            maara = -maara;
        }
        int maksu = pelaaja.vahennaRaha(maara);
        peli.lisaaPottiin(maksu);
        pelaaja.toimi();
        return maksu;
        
    }
/**
 * Pelaaja voi luovuttaa, asettaa pelaajan luovutus arvoksi true.
 * @param pelaaja 
 */
    public static void luovuta(Pelaaja pelaaja){
        pelaaja.setLuovuta(true);
        
    }
    
}