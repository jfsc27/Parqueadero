package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    @Test
    public void testVerificarDisponibilidad() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        assertTrue(parqueadero.verificarDisponibilidad(0, 0)); // Comprobar disponibilidad de un puesto vacío
        parqueadero.ubicarVehiculo(0, 0, new Carro("ABC123", "Toyota", new Propietario("John Doe", "1234567890")));
        assertFalse(parqueadero.verificarDisponibilidad(0, 0)); // Comprobar disponibilidad de un puesto ocupado

        LOG.info("Finalizando Test");
    }

    @Test
    public void testUbicarVehiculo() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        Vehiculo vehiculo = new Carro("ABC123", "Toyota", new Propietario("Juan", "12345"));
        parqueadero.ubicarVehiculo(0, 0, vehiculo);
        assertFalse(parqueadero.verificarDisponibilidad(0, 0)); // Verificar que el vehículo se ubica correctamente en el puesto

        LOG.info("Finalizando Test");
    }

    @Test
    public void testIdentificarPropietario() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        Propietario propietario = new Propietario("John Doe", "1234567890");
        Carro carro = new Carro("ABC123", "Toyota", propietario);
        parqueadero.ubicarVehiculo(0, 0, carro);
        assertEquals(propietario, parqueadero.identificarPropietario(0, 0)); // Verificar identificación del propietario

        LOG.info("Finalizando Test");
    }

    @Test
    public void testLiberarPuesto() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        Carro carro = new Carro("ABC123", "Toyota", new Propietario("John Doe", "1234567890"));
        parqueadero.ubicarVehiculo(0, 0, carro);
        parqueadero.liberarPuesto(0, 0); // Liberar un puesto ocupado
        assertTrue(parqueadero.verificarDisponibilidad(0, 0)); // Verificar que el puesto se libere

        LOG.info("Finalizando Test");
    }

    @Test
    public void testGenerarReporteDiario() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        Vehiculo carro = new Carro("ABC123", "Toyota", new Propietario("Juan", "12345"));
        Vehiculo moto = new Moto("XYZ987", "Honda", new Propietario("Ana", "67890"), TipoMoto.CLASICA, 100.0);
        parqueadero.ubicarVehiculo(0, 0, carro);
        parqueadero.ubicarVehiculo(1, 1, moto);
        parqueadero.liberarPuesto(0, 0);
        parqueadero.liberarPuesto(1, 1);
        parqueadero.generarReporteDiario();
        assertEquals(0, parqueadero.getTotalRecaudadoDiario(), 0.001); // Verificar que el total recaudado se reinicia después de generar el reporte diario

        LOG.info("Finalizando Test");
    }

    @Test
    public void testGenerarReporteMensual() {
        LOG.info("Iniciando Test");

        Parqueadero parqueadero = new Parqueadero(3);
        Vehiculo carro = new Carro("ABC123", "Toyota", new Propietario("Juan", "12345"));
        parqueadero.ubicarVehiculo(0, 0, carro);
        parqueadero.liberarPuesto(0, 0);
        parqueadero.generarReporteMensual();
        assertEquals(0, parqueadero.getTotalRecaudadoMensual(), 0.001); // Verificar que el total recaudado se reinicia después de generar el reporte mensual

        LOG.info("Finalizando Test");
    }
    
}
