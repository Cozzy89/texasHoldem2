package Logiikka.tarkastajat;

public class Tayskasi implements Tarkistettava {
    public static final int ARVO = 7;
    @Override
    public int[] tarkista(int[] maarat, TarkastettavaKasi kasi){
        int kolmoset = Tarkastaja.tarkistaMaaralla(maarat, 3, maarat.length-1);
        int[] arvot = new int[6];
        if(kolmoset != -1){
            int pari = Tarkastaja.tarkistaMaaralla(maarat, 2, maarat.length-1);
            if(pari != -1){
                jarjesta(kolmoset, pari, kasi);
                arvot[0] = ARVO;
                arvot[1] = kasi.getKortti(0).getArvo();
                arvot[2] = kasi.getKortti(3).getArvo();
                return arvot;
            }
        }
        arvot[0] = 0;
        return arvot;
    }
    
    public static void jarjesta(int kolmoset, int pari, TarkastettavaKasi kasi){
        kasi.siirraArvollaAlkuun(pari);
        kasi.siirraArvollaAlkuun(kolmoset);
    }
}
