import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Google");

        Departamento departamento = empresa.crearDepartamento("HHR", 20);

        Empleado empleado = departamento.crearEmpleado("Gleb", 100, 5);

        JOptionPane.showMessageDialog(null,
                "El sueldo total de empleado "
                        + empleado.getNombre()
                        + " es " + empresa.calcularSueldo(empleado));

    }
}