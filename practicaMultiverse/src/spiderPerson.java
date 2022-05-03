public class spiderPerson {
    private String nombre, alias, genero;
    private int universo;

    public spiderPerson() {
    }

    public spiderPerson(String nombre, String alias, String genero, int universo) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getUniverso() {
        return universo;
    }

    public void setUniverso(int universo) {
        this.universo = universo;
    }

    public String showDetalles(){
        return "Nombre: " + nombre + "\nAlias: " + alias +
                "\nGenero: " + genero + "\nUniverso: " +
                universo + "\n";
    }
}
