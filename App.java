public class App {
  public static void main(String[] args) {
    Comercial empleado1 = new Comercial(7896, "Luis", 18, 800000, 70000);
    Comercial empleado2 = new Comercial(1236, "pedro", 25, 1200000, 220000);

    System.out.println(empleado1.toString()+"\n"+empleado1.calcularPlus(empleado1.edad));
    System.out.println(empleado2.toString()+"\n"+empleado2.calcularPlus(empleado2.edad));

    Repartidor empleado3 = new Repartidor(4563, "juan", 40, 789600, 5);
    Repartidor empleado4 = new Repartidor(1567, "David",32, 700000, 6);

    System.out.println(empleado3.toString()+"\n"+empleado3.calcularPlus(empleado3.edad));
    System.out.println(empleado4.toString()+"\n"+empleado2.calcularPlus(empleado4.edad));
  }
}
