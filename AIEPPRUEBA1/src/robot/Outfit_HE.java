package robot;

public abstract class Outfit_HE {
    private String tipo_HE;

    public Outfit_HE(String tipo) {
        this.tipo_HE = tipo;
    }

    public String getTipo_HE() {
        return tipo_HE;
    }

    public abstract void aplicar(Robot1_HE robot);
}
