/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

/**
 *
 * @author Teemu
 */
public class TodennakoisyysTarkistaja {

    /*
     * Tarkistaa kannattaako lähteä pelaamaan ennen floppia tietyllä kädellä. Käy läpi kaikki käsivaihtoehdot.
     */
    public double TarkistaTodennakoisyysEnnenFloppia(Kasi kasi) {

        if (kasi.getKortti(0).getArvo() == 0) {         // Ensimmäinen kortti on ässä.
            if (kasi.getKortti(1).getArvo() == 0) {
                return 0.8494;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5551;
                }
                return 0.5295;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.563;
                }
                return 0.539;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.571;
                }
                return 0.547;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.581;
                }
                return 0.557;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.582;
                }
                return 0.559;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5939;
                }
                return 0.5718;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.605;
                }
                return 0.584;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.615;
                }
                return 0.595;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.635;
                }
                return 0.616;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.644;
                }
                return 0.625;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.653;
                }
                return 0.635;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.662;
                }
                return 0.645;
            }
        }
        if (kasi.getKortti(0).getArvo() == 1) {     // Ensimmäinen kortti on 2.
            if (kasi.getKortti(1).getArvo() == 1) {
                return 0.4938;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.555;
                }
                return 0.530;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.331;
                }
                return 0.292;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.339;
                }
                return 0.301;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.349;
                }
                return 0.312;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.348;
                }
                return 0.311;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.354;
                }
                return 0.317;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.377;
                }
                return 0.341;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.400;
                }
                return 0.365;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.425;
                }
                return 0.392;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.452;
                }
                return 0.421;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.481;
                }
                return 0.451;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.512;
                }
                return 0.484;
            }

        }
        if (kasi.getKortti(0).getArvo() == 2) {    // Ensimmäinen kortti on 3.
            if (kasi.getKortti(1).getArvo() == 2) {
                return 0.5284;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5631;
                }
                return 0.5386;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3310;
                }
                return 0.2923;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3572;
                }
                return 0.3206;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3675;
                }
                return 0.3317;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3670;
                }
                return 0.3308;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3732;
                }
                return 0.3370;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3829;
                }
                return 0.3475;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4084;
                }
                return 0.3742;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4334;
                }
                return 0.4015;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4603;
                }
                return 0.4295;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4896;
                }
                return 0.4602;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5207;
                }
                return 0.4933;
            }
        }
        if (kasi.getKortti(0).getArvo() == 3) {     // Ensimmäinen kortti on 4.
            if (kasi.getKortti(1).getArvo() == 3) {
                return 0.5627;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5716;
                }
                return 0.5475;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3392;
                }
                return 0.3009;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3572;
                }
                return 0.3206;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3852;
                }
                return 0.3509;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3846;
                }
                return 0.3499;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3908;
                }
                return 0.3568;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4011;
                }
                return 0.3672;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4142;
                }
                return 0.3808;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4419;
                }
                return 0.4104;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4686;
                }
                return 0.4387;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4973;
                }
                return 0.4693;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5290;
                }
                return 0.5021;
            }
        }
        if (kasi.getKortti(0).getArvo() == 4) {     // Ensimmäinen kortti on 5.
            if (kasi.getKortti(1).getArvo() == 4) {
                return 0.5964;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5806;
                }
                return 0.5572;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3494;
                }
                return 0.3120;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3675;
                }
                return 0.3317;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3852;
                }
                return 0.3509;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4033;
                }
                return 0.3701;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4097;
                }
                return 0.3768;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4197;
                }
                return 0.3872;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4330;
                }
                return 0.4011;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4490;
                }
                return 0.4187;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4782;
                }
                return 0.4491;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5072;
                }
                return 0.4794;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5382;
                }
                return 0.5124;
            }
        }
        if (kasi.getKortti(0).getArvo() == 5) {     // Ensimmäinen kortti on 6.
            if (kasi.getKortti(1).getArvo() == 5) {
                return 0.6270;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5817;
                }
                return 0.5586;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3486;
                }
                return 0.3105;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3670;
                }
                return 0.3308;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3846;
                }
                return 0.3499;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4033;
                }
                return 0.3701;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4279;
                }
                return 0.3965;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4382;
                }
                return 0.4070;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4518;
                }
                return 0.4210;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4679;
                }
                return 0.4385;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4859;
                }
                return 0.4574;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5168;
                }
                return 0.4898;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5478;
                }
                return 0.5229;
            }
        }
        if (kasi.getKortti(0).getArvo() == 6) {     // Ensimmäinen kortti on 7.
            if (kasi.getKortti(1).getArvo() == 6) {
                return 0.6576;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5939;
                }
                return 0.5718;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3545;
                }
                return 0.3172;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3732;
                }
                return 0.3370;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3908;
                }
                return 0.3568;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4097;
                }
                return 0.3768;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4279;
                }
                return 0.3965;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4569;
                }
                return 0.4269;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4700;
                }
                return 0.4407;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4867;
                }
                return 0.4582;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5042;
                }
                return 0.4773;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5251;
                }
                return 0.4993;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5586;
                }
                return 0.5344;
            }
        }
        if (kasi.getKortti(0).getArvo() == 7) {     // Ensimmäinen kortti on 8.
            if (kasi.getKortti(1).getArvo() == 7) {
                return 0.6870;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6150;
                }
                return 0.5836;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3769;
                }
                return 0.3409;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3829;
                }
                return 0.3475;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4041;
                }
                return 0.3672;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4197;
                }
                return 0.3872;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4382;
                }
                return 0.4070;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4569;
                }
                return 0.4269;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4889;
                }
                return 0.4606;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5052;
                }
                return 0.4783;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5233;
                }
                return 0.4971;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5441;
                }
                return 0.5193;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5677;
                }
                return 0.5441;
            }
        }
        if (kasi.getKortti(0).getArvo() == 8) {     // Ensimmäinen kortti on 9.
            if (kasi.getKortti(1).getArvo() == 8) {
                return 0.7164;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6150;
                }
                return 0.5945;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.3994;
                }
                return 0.3652;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4084;
                }
                return 0.3742;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4142;
                }
                return 0.3808;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4330;
                }
                return 0.4011;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4518;
                }
                return 0.4210;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4700;
                }
                return 0.4407;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4889;
                }
                return 0.4606;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5233;
                }
                return 0.4983;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5410;
                }
                return 0.5164;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5623;
                }
                return 0.5386;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5864;
                }
                return 0.5641;
            }
        }
        if (kasi.getKortti(0).getArvo() == 9) {     // Ensimmäinen kortti on 10.
            if (kasi.getKortti(1).getArvo() == 9) {
                return 0.7464;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6348;
                }
                return 0.6155;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4257;
                }
                return 0.3925;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4334;
                }
                return 0.4015;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4419;
                }
                return 0.4104;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4490;
                }
                return 0.4187;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4679;
                }
                return 0.4385;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4867;
                }
                return 0.4582;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5052;
                }
                return 0.4783;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5233;
                }
                return 0.4983;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5615;
                }
                return 0.5384;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5819;
                }
                return 0.5594;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6060;
                }
                return 0.5850;
            }
        }
        if (kasi.getKortti(0).getArvo() == 10) {     // Ensimmäinen kortti on 11.
            if (kasi.getKortti(1).getArvo() == 10) {
                return 0.7715;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6436;
                }
                return 0.6253;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4520;
                }
                return 0.4206;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4603;
                }
                return 0.4295;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4686;
                }
                return 0.4387;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4782;
                }
                return 0.4491;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4859;
                }
                return 0.4574;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5042;
                }
                return 0.4773;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5233;
                }
                return 0.4971;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5410;
                }
                return 0.5164;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5615;
                }
                return 0.5384;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5909;
                }
                return 0.5689;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6151;
                }
                return 0.5944;
            }
        }
        if (kasi.getKortti(0).getArvo() == 11) {     // Ensimmäinen kortti on 12.
            if (kasi.getKortti(1).getArvo() == 11) {
                return 0.7963;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6534;
                }
                return 0.6348;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4808;
                }
                return 0.4512;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4896;
                }
                return 0.4602;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.4973;
                }
                return 0.4693;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5072;
                }
                return 0.4794;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5168;
                }
                return 0.4898;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5251;
                }
                return 0.4993;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5441;
                }
                return 0.5193;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5623;
                }
                return 0.5386;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5819;
                }
                return 0.5594;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5909;
                }
                return 0.5689;
            } else if (kasi.getKortti(1).getArvo() == 12) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6240;
                }
                return 0.6041;
            }
        }
        if (kasi.getKortti(0).getArvo() == 12) {     // Ensimmäinen kortti on 13.
            if (kasi.getKortti(1).getArvo() == 12) {
                return 0.8211;
            } else if (kasi.getKortti(1).getArvo() == 0) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6623;
                }
                return 0.6451;
            } else if (kasi.getKortti(1).getArvo() == 1) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5126;
                }
                return 0.4842;
            } else if (kasi.getKortti(1).getArvo() == 2) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5207;
                }
                return 0.4933;
            } else if (kasi.getKortti(1).getArvo() == 3) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5290;
                }
                return 0.5021;
            } else if (kasi.getKortti(1).getArvo() == 4) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5382;
                }
                return 0.5124;
            } else if (kasi.getKortti(1).getArvo() == 5) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5478;
                }
                return 0.5229;
            } else if (kasi.getKortti(1).getArvo() == 6) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5586;
                }
                return 0.5344;
            } else if (kasi.getKortti(1).getArvo() == 7) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5677;
                }
                return 0.5441;
            } else if (kasi.getKortti(1).getArvo() == 8) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.5864;
                }
                return 0.5641;
            } else if (kasi.getKortti(1).getArvo() == 9) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6060;
                }
                return 0.5850;
            } else if (kasi.getKortti(1).getArvo() == 10) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6151;
                }
                return 0.5944;
            } else if (kasi.getKortti(1).getArvo() == 11) {
                if (kasi.getKortti(0).getMaa() == kasi.getKortti(1).getMaa()) {
                    return 0.6240;
                }
                return 0.6041;
            }
        }
      return 0.5;
    }
    /*
     * Kertoo millon kannattaa lähteä pelaamaan. Palauttaa true jos lähtee ja false jos ei.
     */
    public boolean milloinPeliinMukaan(Kasi kasi){
        double todennakoisyys = TarkistaTodennakoisyysEnnenFloppia(kasi);
        if(todennakoisyys > 0.5){
            return true;
        }
        else
            return false;
        
    }
    /*
     * Tarkistaa kannattaako lähteä pelaamaan flopin jälkeen tietyllä kädellä. 
     */

    public double TarkistaTodennäköisyysFlopinJälkeen(Kasi kasi, Poyta poyta) {
        //tarkistaja onko mitään valmista kättä
        // kuinka lähellä valmis käsi on
        // paljon potissa?
        return 0.0;
    }
    /*
     * Tarkistaa kannattaako lähteä pelaamaan turnin jälkeen tietyllä kädellä. 
     */

    public double TarkistaTodennäköisyysTurninJälkeen(Kasi kasi, Poyta poyta) {
        return 0.0;
    }
    /*
     * Tarkistaa kannattaako lähteä pelaamaan riverin jälkeen tietyllä kädellä. 
     */

    public double TarkistaTodennäköisyysRiverinJälkeen(Kasi kasi, Poyta poyta) {
        return 0.0;
    }
}
