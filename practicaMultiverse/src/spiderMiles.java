public class spiderMiles extends spiderPerson implements spiderMilesPowers {
    public spiderMiles() {
    }

    public spiderMiles(String nombre, String alias, String genero, int universo) {
        super(nombre, alias, genero, universo);
    }

    @Override
    public void rayoVenenoso(Screen s) {
        s.setVisible(true);
        s.out("Rayo venenoso\n");
        s.showImage("rayo.jpg");
        s.out("\n");
    }

    @Override
    public void invisibilidad(Screen s) {
        s.setVisible(true);
        s.out("Invisibilidad\n");
        s.showImage("invisible.jpg");
        s.out("\n");
    }

    @Override
    public void explosionEnergia(Screen s) {
        s.setVisible(true);
        s.out("Explosion de energia\n");
        s.showImage("explosion.jpg");
        s.out("\n");
    }
}
