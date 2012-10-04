package Käyttöliittymä;

import Käyttöliittymä.Pelipöytä;
import Logiikka.Pelaaja;
import Logiikka.PelaajanToiminnot;
import Logiikka.Peli;
import Logiikka.TodennakoisyysTarkistaja;
import java.util.Scanner;
/**
 * Valitaan mitä pelaaja haluaa tehdä.
 * @author Teemu
 */
public class PelaajanToiminnot2 {

    private static Scanner lukija = new Scanner(System.in);

    /**
     * Kysyy mitä pelaaja haluaa tehdä.
     * @param pelaaja
     * @return int
     */
    public static int pelaajanToiminnot(Pelaaja pelaaja) {

        while (true) {
            
            int valinta = Pelipöytä.kysyInt(pelaaja.getNimi() + ": Mitä haluat tehdä? (1) korota (2) check/maksu (3) luovuta : ");
            if (valinta == 1) {
                return 1;
            } else if (valinta == 2) {
                return 2;
            } else if (valinta == 3) {
                return 3;
            } else {
                System.out.println("Valitse joko 1, 2 tai 3!");
            }
        }

    }
    public static int koneenToiminnot(Pelaaja pelaaja){
         int valinta = TodennakoisyysTarkistaja.milloinPeliinMukaan(pelaaja.getKasi()); 
         return valinta;
    }
/**
 * Pelaaja voi korottaa, palauttaa pelaajan korotuksen määrän.
 * @param pelaaja
 * @param peli
 * @return 
 */
    public static int korotus(Pelaaja pelaaja, Peli peli) {
        int maara;
        PelaajanToiminnot.checkMaksu(pelaaja, peli);
        while (true) {
            
            maara = Pelipöytä.kysyInt(pelaaja.getNimi() + ": Paljon haluat korottaa?");

            if (pelaaja.korotus(maara)) {
                peli.lisaaPottiin(maara);
                pelaaja.setKorotus(peli.getKorotus()+maara, peli);
                break;
            }
            Pelipöytä.kysyString("Rahamääräsi ei riitä tai korotit negatiivisellä arvolla tai korotit nollalla");
        }
        pelaaja.toimi();
        return maara;
    }
}
