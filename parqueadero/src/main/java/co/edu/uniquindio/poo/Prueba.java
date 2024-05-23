package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5);

        Vehiculo carro = new Carro("ABC123", "Mazda", new Propietario("Juan", "1928192"));

        Vehiculo moto = new Moto("ACD343", "Yamaha", new Propietario("Juana", "178162"), TipoMoto.CLASICA, 150);
        Vehiculo moto2 = new Moto("ACD343", "Yamaha", new Propietario("Juana", "178162"), TipoMoto.CLASICA, 150);

        parqueadero.configurarTarifasPorHora(300, 150, 200);

        parqueadero.ubicarVehiculo(0, 0, carro);

        parqueadero.ubicarVehiculo(1, 1, moto);
        parqueadero.ubicarVehiculo(2, 2, moto2);

        JOptionPane.showMessageDialog(null, "Por favor esperar");

        parqueadero.liberarPuesto(0, 0);

        parqueadero.liberarPuesto(1, 1);
        parqueadero.liberarPuesto(2, 2);

        parqueadero.generarReporteDiario();
        parqueadero.generarReporteMensual();

        


    }
}

