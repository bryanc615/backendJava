package practicaMona;

public class octoNaut extends octoCat {
    public octoNaut() {
        setNombre("Octonaut");
        setHabilidad("Viajar al espacio");
        setRopa("Traje de astronauta");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Al infinito y más allá...");
    }
}
