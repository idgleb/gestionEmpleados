public class Departamento {
    private String nombre;
    private double bonificaciones;
    private Empresa empresa;

    public Departamento(String nombre, double bonificaciones, Empresa empresa) {
        this.nombre = nombre;
        this.bonificaciones = bonificaciones;
        this.empresa = empresa;
    }

    public Empleado crearEmpleado(String nombre, double salarioBase, int horasTrabajo) {
        return new Empleado(nombre, salarioBase, horasTrabajo, this);
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }
    public void setBonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
