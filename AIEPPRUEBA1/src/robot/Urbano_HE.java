package robot;

public class Urbano_HE extends Outfit_HE {
    private String buzo_HE;
    private String zapatillas_HE;
    private String poleraDeportiva_HE;

    public Urbano_HE(String buzo, String zapatillas, String poleraDeportiva) {
        super("Urbano");
        this.buzo_HE = buzo;
        this.zapatillas_HE = zapatillas;
        this.poleraDeportiva_HE = poleraDeportiva;
    }

    public String getBuzo_HE() {
        return buzo_HE;
    }

    public String getZapatillas_HE() {
        return zapatillas_HE;
    }

    public String getPoleraDeportiva_HE() {
        return poleraDeportiva_HE;
    }

    @Override
    public void aplicar(Robot1_HE robot) {
        System.out.println("Aplicando outfit Urbano:");
        System.out.println("Buzo: " + buzo_HE);
        System.out.println("Zapatillas: " + zapatillas_HE);
        System.out.println("Polera Deportiva: " + poleraDeportiva_HE);
    }
}
