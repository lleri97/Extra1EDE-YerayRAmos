package extra1ede.yerayramos;

/**
 *
 * @author Yeray
 * @version Extra 2020
 * @since 06/02/2020
 * <h2>La clase Empleado, se utiliza para crear y leer empleados de una base de
 * datos</h2>
 */
public class Empleado {

    /**
     *Atributo nombre de tipo String
     */
    private String nombre;
    /**
     * Atributo apellido de tipo String
     */
    private String apellido;
    /**
     * Atributo salario de tipo Double
     */
    private double salario;
    /**
     * Contructor con los aprametros nombre, apellido y salario
     * @param nombre de tipo String
     * @param apellido de tipo String
     * @param salario  de tipo Double
     */
    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    /**
     * Metodo para sumar el salario actual con la subida
     * @param subida de tipo Double
     */
    public void subirsalario(double subida) {
        salario = salario + subida;
    }
    /**
     * Metodo para comprobar si el nombre esta vacio o no
     * @return  Boleano ,si el nombre esta vacio devuelve alse y si esta informado devuelve true
     */
    private boolean comprobar() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
}
