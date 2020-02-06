package extra1ede.yerayramos;

public class Empleado {

    private String nombre;

    private String apellido;

    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void subirsalario(double subida) {
        salario = salario + subida;
    }

    private boolean comprobar() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
}
