package Logiikka;

/**
 *
 * @author Teemu
 */
public class Poyta {

    private Kortti[] kortit;
/**
 * Konstruktori
 * @param tilaa 
 */
    public Poyta(int tilaa) {
        tyhjennaPoyta();
    }
/**
 * Tyhjentaa pöydän.
 */
    public void tyhjennaPoyta() {
        kortit = new Kortti[5];
    }
/**
 * Lisätään kortti pöydälle, jos ei ole jo täynnä.
 * @param kortti
 * @return 
 */
    public void lisaaKortti(Kortti kortti) {
        for(int i=0; i<5; i++){
            if(kortit[i]==null){
                kortit[i] = kortti;
                return;
            }
        }
        
    }
/**
 * Palautetaan kortti pöydältä halutusta kohdasta.
 * @param index
 * @return 
 */
    public Kortti getKortti(int index){
        if(index>=0 && index<5) {
            return kortit[index];
        }
        return null;
    }
}
