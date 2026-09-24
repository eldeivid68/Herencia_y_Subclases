public class AgenteVentas extends Empleado {

    private double comisionVentas;

    public AgenteVentas(
            String nombre,
            String id,
            double salarioBase,
            double comisionVentas) {

        // Primero inicializo la parte que pertenece a Empleado
        super(nombre, id, salarioBase);

        this.comisionVentas = comisionVentas;
    }

    @Override
    public double calcularSalario() {

        // La comisión se agrega directamente al salario base
        return super.calcularSalario() + comisionVentas;
    }
}