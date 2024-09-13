package robot;

public class Manorobot_HE {
    private int numeroDedos_HE;   
    private String muñeca_HE;     
    
    
    public Manorobot_HE(int numeroDedos, String muñeca) {
        this.numeroDedos_HE = numeroDedos;
        this.muñeca_HE = muñeca;
    }

    public Manorobot_HE() {
        this.numeroDedos_HE = 5;  
        this.muñeca_HE = "extendida";  
}

    public int getNumeroDedos_HE() {
        return numeroDedos_HE;
    }

    public String getMuñeca_HE() {
        return muñeca_HE;
    }

    public void moverDedos() {
        System.out.println("Moviendo los " + numeroDedos_HE + " dedos.");
    }

    public void describirMano() {
        System.out.println("Mano con " + numeroDedos_HE + " dedos y muñeca " + muñeca_HE + ".");
    }

}
