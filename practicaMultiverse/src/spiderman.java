public class spiderman extends  spiderPerson implements spidermanPowers {
    public spiderman() {
    }

    public spiderman(String nombre, String alias, String genero, int universo) {
        super(nombre, alias, genero, universo);
    }

    @Override
    public void telarañasNormales(Screen s) {
        s.setVisible(true);
        s.out("Lanzar telarañas\n");
        s.showImage("telnormal.jpg");
        s.out("\n");
    }

    @Override
    public void trepar(Screen s) {
        s.setVisible(true);
        s.out("Trepar\n");
        s.showImage("trepar.jpg");
        s.out("\n");
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.setVisible(true);
        s.out("Sentido aracnido\n");
        s.showImage("sentido.png");
        s.out("\n");
    }
}
