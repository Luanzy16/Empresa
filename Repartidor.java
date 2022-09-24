
public class Repartidor extends Empleados {
  private int zona;

  public Repartidor(int id, String nombre, int edad, int salarioFijo, int zona) {
    super(id, nombre, edad, salarioFijo);
    this.zona = zona;
  }

  @Override
  public String calcularPlus(int edad) {

    if (edad < 25 && zona == 5){
      return "Si tiene derecho al plus";
    }
    else return "No tiene acceso al plus";
    
  }

  public int getZona() {
    return zona;
  }

  public void setZona(int zona) {
    this.zona = zona;
  }

  @Override
  public String toString() {
    return super.toString()+ "Repartidor [zona=" + zona + "]";
  }

  
}
