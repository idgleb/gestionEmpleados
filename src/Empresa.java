public class Empresa {
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Departamento crearDepartamento(String nombre, double bonificaciones) {
        return new Departamento(nombre, bonificaciones, this);
    }

    public double calcularSueldo(Empleado empleado){
        double totalSueldo = 0;
        totalSueldo += empleado.getHorasTrabajo()*
                (empleado.getSalarioBase()
                        +empleado.getDepartamento().getBonificaciones());
        return totalSueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
