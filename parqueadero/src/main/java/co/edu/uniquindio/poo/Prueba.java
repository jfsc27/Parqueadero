package co.edu.uniquindio.poo;

public class Prueba {
    public static void main(String[] args) {
        // Crear un parqueadero con 5x5 puestos
        Parqueadero parqueadero = new Parqueadero(5);

        // Configurar tarifas por hora para carros y motos
        parqueadero.configurarTarifasPorHora(10.0, 5.0, 7.0);

        // Crear algunos vehículos
        Propietario propietario1 = new Propietario("John Doe", "1234567890");
        Carro carro1 = new Carro("ABC123", "Toyota", propietario1);

        Propietario propietario2 = new Propietario("Jane Doe", "0987654321");
        Moto moto1 = new Moto("XYZ987", "Honda", propietario2, TipoMoto.CLASICA, 100.0);

        // Ubicar vehículos en puestos específicos
        parqueadero.ubicarVehiculo(0, 0, carro1);
        parqueadero.ubicarVehiculo(1, 1, moto1);

        // Identificar propietario de un vehículo en un puesto dado
        Propietario propietarioEnPuesto11 = parqueadero.identificarPropietario(1, 1);
        System.out.println("Propietario del vehículo en el puesto (1, 1): " + propietarioEnPuesto11.getNombre());

        // Liberar puestos de vehículos
        parqueadero.liberarPuesto(0, 0);
        parqueadero.liberarPuesto(1, 1);

        // Generar reportes diario y mensual
        parqueadero.generarReporteDiario();
        parqueadero.generarReporteMensual();
    }
}

