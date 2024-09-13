package robot;

public class Formal_HE extends Outfit_HE {
    private String traje_HE;

    public Formal_HE(String traje) {
        super("Formal");
        this.traje_HE = traje;
    }

    public String getTraje_HE() {
        return traje_HE;
    }

    @Override
    public void aplicar(Robot1_HE robot) {
        System.out.println("Aplicando outfit Formal:");
        System.out.println("Traje: " + traje_HE);
    }
}
