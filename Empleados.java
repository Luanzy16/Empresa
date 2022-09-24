public abstract class Empleados {
  protected int id;
  protected String nombre;
  protected int edad;
  protected int salarioFijo;
  
  public Empleados(int id, String nombre, int edad, int salarioFijo) {
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
    this.salarioFijo = salarioFijo;
  }

  public abstract String calcularPlus(int edad);

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getSalarioFijo() {
    return salarioFijo;
  }

  public void setSalarioFijo(int salarioFijo) {
    this.salarioFijo = salarioFijo;
  }

  @Override
  public String toString() {
    return "Empleados [edad=" + edad + ", id=" + id + ", nombre=" + nombre + ", salarioFijo=" + salarioFijo + "]";
  }

  

  
}
