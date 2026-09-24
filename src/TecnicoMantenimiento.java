public class TecnicoMantenimiento extends Empleado {

    private int certificaciones;
    private static final double BONO_POR_CERTIFICACION = 150.0;

    public TecnicoMantenimiento(
            String nombre,
            String id,
            double salarioBase,
            int certificaciones) {

        // Empleado se encarga de guardar los datos que se heredaron
        super(nombre, id, salarioBase);

        this.certificaciones = certificaciones;
    }

    @Override
    public double calcularSalario() {

        // Cada certificación le suma Q150 al salario del técnico
        return super.calcularSalario()
                + (certificaciones * BONO_POR_CERTIFICACION);
    }
}