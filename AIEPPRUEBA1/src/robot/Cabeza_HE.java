package robot;

public class Cabeza_HE {

    private String ojos_HE;
    private String boca_HE;    
    private String orejas_HE;


    public Cabeza_HE(String ojos, String boca, String orejas) {
        this.ojos_HE = ojos;
        this.boca_HE = boca;
        this.orejas_HE = orejas;
    }
    
    public String getojos_HE() {
        return ojos_HE;
    }
    
    public String getboca_HE() {
        return boca_HE;
    }
    
    public String getoreja_HE() {
        return orejas_HE;
    }
    
    public void describirCabeza() {
        System.out.println("Cabeza con ojos " + ojos_HE + ", boca " + boca_HE + ", y orejas " + orejas_HE + ".");
    }
}
