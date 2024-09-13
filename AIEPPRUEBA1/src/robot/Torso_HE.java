package robot;

public class Torso_HE {
	private String contextura_HE;
	private String pecho_HE;
	
	public Torso_HE( String contextura, String pecho) {
	this.contextura_HE = contextura;
	this.pecho_HE = pecho;
	}
	
	public String getContextura_HE() {
        return contextura_HE;
    }

    public String getPecho_HE() {
        return pecho_HE;
    }
    
    public void describirTorso() {
        System.out.println("Torso con contextura " + contextura_HE + " y pecho de " + pecho_HE + ".");
    }
    
}
