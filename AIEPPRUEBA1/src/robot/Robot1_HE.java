package robot;

public class Robot1_HE {
    private Cabeza_HE cabeza1_HE;
    private Manorobot_HE mano1_HE;
    private Pierna_HE pierna1_HE;
    private Torso_HE torso1_HE;

    public Robot1_HE(Cabeza_HE cabeza, Manorobot_HE mano, Pierna_HE pierna, Torso_HE torso) {
        this.cabeza1_HE = cabeza;
        this.mano1_HE = mano;
        this.pierna1_HE = pierna;
        this.torso1_HE = torso;
    }

    public Cabeza_HE getCabeza_HE() {
        return cabeza1_HE;
    }

    public Manorobot_HE getMano_HE() {
        return mano1_HE;
    }

    public Pierna_HE getPierna_HE() {
        return pierna1_HE;
    }

    public Torso_HE getTorso_HE() {
        return torso1_HE;
    }

    public void describirRobot() {
        System.out.println("Descripción del Robot:");
        cabeza1_HE.describirCabeza();
        mano1_HE.describirMano();
        pierna1_HE.describirPierna();
        torso1_HE.describirTorso();
    }
}
