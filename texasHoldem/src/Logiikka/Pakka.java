package Logiikka;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Teemu
 */
public class Pakka {

    private ArrayList<Kortti> pakka = new ArrayList<Kortti>();
/**
 * Luo pakan.
 */
    public Pakka() {
        for(int i = 0; i < 52; i++) {
            pakka.add(new Kortti(i));
        }
    }
/**
 * Pakan sekoitus.
 */
    public void Sekoita() {         // sekoitus
        Collections.shuffle(pakka);
    }
/**
 * Jakaa kortin.
 * @return 
 */
    public Kortti Jaa() {
        return pakka.remove(0);
    }
}
