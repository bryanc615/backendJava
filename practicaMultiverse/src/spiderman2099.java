public class spiderman2099 extends spiderPerson implements spider2099Powers {
    public spiderman2099() {
    }

    public spiderman2099(String nombre, String alias, String genero, int universo) {
        super(nombre, alias, genero, universo);
    }

    @Override
    public void planeo(Screen s) {
        s.setVisible(true);
        s.out("Planeo\n");
        s.showImage("planeo.jpg");
        s.out("\n");
    }

    @Override
    public void garras(Screen s) {
        s.setVisible(true);
        s.out("Ataque de garras\n");
        s.showImage("garras.jpg");
        s.out("\n");
    }

    @Override
    public void mordida(Screen s) {
        s.setVisible(true);
        s.out("Mordida venenosa\n");
        s.showImage("colmillos.jpg");
        s.out("\n");
    }
}
