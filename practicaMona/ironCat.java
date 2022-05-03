package practicaMona;

public class ironCat extends octoCat {
    public ironCat() {
        setNombre("Ironcat");
        setHabilidad("Salvar al mundo");
        setRopa("Mark III");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Yo soy Ironcat...");
    }
}
