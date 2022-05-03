package practicaMona;

public class octoCat {
    private String nombre = "Octocat", habilidad = "Saludar", ropa = "Ninguna";

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public boolean setHabilidad(String habilidad) {
        if(!habilidad.isEmpty()){
            this.habilidad = habilidad;
            return true;
        } else
            return false;
    }

    public String getRopa() {
        return ropa;
    }

    public boolean setRopa(String ropa) {
        if(!ropa.isEmpty()){
            this.ropa = ropa;
            return true;
        } else
            return false;
    }

    public String detalles() {
        return "Nombre: " + nombre + "\nHabilidad: " + habilidad + "\nVestimenta: " + ropa;
    }

    public void mostrarHabilidad() {
        System.out.println("Hola Explorers!!!");
    }
}
