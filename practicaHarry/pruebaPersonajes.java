package practicaHarry;

public class pruebaPersonajes {
    public static void main(String[] args) {
        personaje harry = new personaje("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
        System.out.println(harry.mensaje());
        personaje hermione = new personaje("Hermione Granger", "Femenino", "Gryffindor", "Fracaso", "Nutria");
        System.out.println(hermione.mensaje());
        personaje alastor = new personaje("Alastor Moody", "Masculino", "Desconocido", "Voldemort", "Ave Rapaz");
        System.out.println(alastor.mensaje());
        personaje severus = new personaje();
        severus.setNombre("Severus Snape");
        severus.setGenero("Masculino");
        severus.setCasa("Slytherin");
        severus.setBoggart("Voldemort");
        severus.setPatronus("Cierva");
        System.out.println(severus.mensaje());
        personaje minerva = new personaje();
        severus.setNombre("Minerva McGonagall");
        severus.setGenero("Femenino");
        severus.setCasa("Gryffindor");
        severus.setBoggart("Voldemort");
        severus.setPatronus("Gato");
        System.out.println(minerva.mensaje());

    }

}
