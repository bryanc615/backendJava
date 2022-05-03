package practicaMona;

public class pruebaOctocats {
    public static void main(String[] args) {
        octoCat octo1 = new octoCat();
        System.out.println(octo1.detalles());
        octo1.mostrarHabilidad();
        octoCat octo2 = new constructoCat();
        System.out.println(octo2.detalles());
        octo2.mostrarHabilidad();
        octoCat octo3 = new ironCat();
        System.out.println(octo3.detalles());
        octo3.mostrarHabilidad();
        octoCat octo4 = new octobiWanCatnobi();
        System.out.println(octo4.detalles());
        octo4.mostrarHabilidad();
        octoCat octo5 = new octoNaut();
        System.out.println(octo5.detalles());
        octo5.mostrarHabilidad();
        octoCat octo6 = new oktoberCat();
        System.out.println(octo6.detalles());
        octo6.mostrarHabilidad();
    }
}
