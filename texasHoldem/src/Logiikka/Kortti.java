package Logiikka;


/**
 *
 * @author Teemu
 */
public class Kortti {
    
    public static final String[] korttiArvot = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    private String[] maat = {"Hertta", "Ruutu", "Risti", "Pata"};
    private String[] lyhmaat = {"H", "D", "C", "S"};
    private int maa;
    private int arvo;
    private int numero;

    /**
     *
     * @param numero
     */
    public Kortti(int numero) {
        this.numero = numero;
        maa = numero % 4;
        arvo = numero / 4 ;

    }
/**
 * Kortilla on arvo ja maa.
 * @param arvo
 * @param maa 
 */
    public Kortti(int arvo, int maa) {
        this.arvo = arvo;
        this.maa = maa;
    }
/**
 * Palauttaa kortin arvon.
 * @return arvo
 */
    public int getArvo() {
        return arvo;
    }
/**
 * Palauttaa kortin maan.
 * @return maa
 */
    public int getMaa() {
        return maa;
    }
    
    /**
     *
     * @param lyh
     * @return
     */
    public String getMaa(boolean lyh) { // maa
        if(lyh)
            return lyhmaat[maa];
        return maat[maa];
    }
}
