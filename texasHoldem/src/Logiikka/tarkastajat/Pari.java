package Logiikka.tarkastajat;

public class Pari implements Tarkistettava {

    public static final int ARVO = 2;

    @Override
    public int tarkista(int[] maarat, TarkastettavaKasi kasi) {
        int pari = Tarkastaja.tarkistaMaaralla(maarat, 2, maarat.length - 1);
        if (pari != -1) {
            jarjesta(pari, kasi);
            return ARVO;
        }
        return 0;
    }

    public static void jarjesta(int pari, TarkastettavaKasi kasi) {
        kasi.siirraArvollaAlkuun(pari);
        kasi.jarjestaArvollaSuurimmastaPienimpaan(2);
        if (kasi.getKortti(kasi.getMaara() - 1).getArvo() == 0) {
            kasi.siirra(kasi.getMaara() - 1, 2);
        }
    }
}