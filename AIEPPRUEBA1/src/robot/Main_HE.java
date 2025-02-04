package robot;

public class Main_HE {
    public static void main(String[] args) {
        Cabeza_HE cabezaRobot = new Cabeza_HE("abiertos", "cerrada", "metálicas");
        Manorobot_HE manoRobot = new Manorobot_HE(5, "extendida");
        Pierna_HE piernaRobot = new Pierna_HE("derecha", "flexionada", "suelda", 5);
        Torso_HE torsoRobot = new Torso_HE("delgado", "acero");

        Robot1_HE robot = new Robot1_HE(cabezaRobot, manoRobot, piernaRobot, torsoRobot);

        Urbano_HE urbanoOutfit = new Urbano_HE("Buzo Deportivo", "Zapatillas Blancas", "Polera Deportiva");
        Formal_HE formalOutfit = new Formal_HE("Traje Azul");

        System.out.println("Aplicando outfit Urbano:");
        urbanoOutfit.aplicar(robot);
        
        System.out.println("\nAplicando outfit Formal:");
        formalOutfit.aplicar(robot);

        System.out.println("\nDescripción del robot:");
        robot.describirRobot();
    }
}

