package practicaMona;

public class constructoCat extends octoCat {
    public constructoCat() {
        setNombre("Contructocat");
        setHabilidad("Construir casas para octogatos abandonados");
        setRopa("Casco amarillo y herramientas");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("PUUM! PUUM! TAAZ! TAAZ!");
    }
}
