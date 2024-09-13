package robot;

public class Pierna_HE {
		private String lado_HE;
		private String rodilla_HE;
		private String pie_HE;
		private int Dedos_HE;
		
	public Pierna_HE(String lado, String rodilla, String pie, int dedos){
		this.lado_HE = lado;
		this.rodilla_HE = rodilla;
	    this.pie_HE = pie;
	    this.Dedos_HE = 5;
		    }
	public String getLado_HE(){
		return lado_HE;
	}
	
	public String getrodilla_HE() {
		return rodilla_HE;
	}
	
	public String getpie_HE() {
		return pie_HE;
	}
	
	public int getDedos_HE() {
		return Dedos_HE;
		
	}
	
	 public void moverPierna() {
	        System.out.println("Moviendo la pierna " + lado_HE + " con la rodilla " + rodilla_HE + " y el pie " + pie_HE + ".");
	    }
	 
	 public void describirPierna() {
	        System.out.println("Pierna " + lado_HE + ": rodilla está " + rodilla_HE + ", pie está " + pie_HE + " con " + Dedos_HE + " dedos.");
	    }
}
	