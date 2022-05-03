public class pruebaSpiderverse {
    public static void main(String[] args) {
        Peter();
        Miguel();
        Miles();
    }
    static void Peter () {
        Screen s = new Screen();
        spiderman peter =  new spiderman("Peter Parker","Spiderman","Masculino",616);
        s.setVisible(true);
        s.out(peter.showDetalles());
        peter.sentidoAracnido(s);
        peter.trepar(s);
        peter.telarañasNormales(s);
    }
    static void Miguel () {
        Screen s = new Screen();
        spiderman2099 miguel =  new spiderman2099("Miguel O’Hara","Spiderman 2099","Masculino",928);
        s.setVisible(true);
        s.out(miguel.showDetalles());
        miguel.garras(s);
        miguel.mordida(s);
        miguel.planeo(s);
    }

    static void Miles () {
        Screen s = new Screen();
        spiderMiles miles =  new spiderMiles("Miles Morales","Spiderman","Masculino",616);
        s.setVisible(true);
        s.out(miles.showDetalles());
        miles.rayoVenenoso(s);
        miles.explosionEnergia(s);
        miles.invisibilidad(s);
    }
}
