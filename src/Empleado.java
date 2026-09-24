public class Empleado {

    protected String nombre;
    protected String id;
    protected double salarioBase;

    // Este constructor guarda los datos que todos los empleados tienen
    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Por defecto, un empleado solamente recibe su salario base
    public double calcularSalario() {
        return salarioBase;
    }

    // Lo usamos para mostrar el nombre desde el Main
    public String getNombre() {
        return nombre;
    }
}