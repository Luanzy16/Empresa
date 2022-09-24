public class Comercial extends Empleados {
  private int comision;

  public Comercial(int id, String nombre, int edad, int salarioFijo, int comision) {
    super(id, nombre, edad, salarioFijo);
    this.comision = comision;
  }

  @Override
  public String calcularPlus(int edad) {
    if(edad > 30 && comision < 200000)
    return "Si tiene derecho al Plus";
    else return "no tiene derecho al Plus";
  }

  public int getComision() {
    return comision;
  }

  public void setComision(int comision) {
    this.comision = comision;
  }

  @Override
  public String toString() {
    return super.toString()+"Comercial [comision=" + comision + "]";
  }

  
}
