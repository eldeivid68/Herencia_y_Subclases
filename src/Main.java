public class Main {

    public static void main(String[] args) {

        // Aunque todos son empleados, cada uno calcula su salario diferente
        Empleado[] equipo = {
                new Piloto("Goku perez", "E-101", 4500.0, 60),
                new TecnicoMantenimiento("Fabio la cabra", "E-102", 3800.0, 3),
                new AgenteVentas("Alan", "E-103", 3200.0, 900.0),

                // Este es el supervisor nuevo que pide el ejercicio
                new Supervisor("Carlos Fabricio Andres", "E-104", 5000.0, 3)
        };

        // Recorro todo el equipo sin tener que separar cada tipo de empleado
        for (Empleado empleado : equipo) {
            System.out.printf(
                    "%s: Q%.2f%n",
                    empleado.getNombre(),
                    empleado.calcularSalario()
            );
        }
    }
}
