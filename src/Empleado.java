
public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajo;
    private Departamento departamento;

    public Empleado(String nombre, double salarioBase, int horasTrabajo, Departamento departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajo = horasTrabajo;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }
    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
