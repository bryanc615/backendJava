package practicaMona;

public class oktoberCat extends octoCat {
    public oktoberCat() {
        setNombre("Oktobercat");
        setHabilidad("Disfrutar su cerveza");
        setRopa("Lederhosen y gamsbart");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("GLU GLU GLU... gutes Bier!!!");
    }
}
