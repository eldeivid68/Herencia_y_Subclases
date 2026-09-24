public class Piloto extends Empleado {

    private int horasVuelo;
    private static final double BONO_POR_HORA = 25.0;

    public Piloto(String nombre, String id, double salarioBase, int horasVuelo) {

        // Mando los datos comunes al constructor de Empleado
        super(nombre, id, salarioBase);

        this.horasVuelo = horasVuelo;
    }

    @Override
    public double calcularSalario() {

        // Al salario base le agrego Q25 por cada hora de vuelo
        return super.calcularSalario()
                + (horasVuelo * BONO_POR_HORA);
    }
}