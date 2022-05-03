package practicaMona;

public class octobiWanCatnobi extends octoCat {
    public octobiWanCatnobi() {
        setNombre("Octobi Wan Catnobi");
        setHabilidad("Desearte suerte");
        setRopa("Túnica café");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Que la fuerza te acompañe");
    }
}
