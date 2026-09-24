public class Supervisor extends Empleado {

    private int equiposSupervisados;
    private static final double BONO_POR_EQUIPO = 500.0;

    public Supervisor(
            String nombre,
            String id,
            double salarioBase,
            int equiposSupervisados) {

        // Aprovecho el constructor de Empleado para no repetir código
        super(nombre, id, salarioBase);

        this.equiposSupervisados = equiposSupervisados;
    }

    @Override
    public double calcularSalario() {

        // El supervisor recibe Q500 extra por cada equipo que tiene a cargo
        return super.calcularSalario()
                + (equiposSupervisados * BONO_POR_EQUIPO);
    }
}