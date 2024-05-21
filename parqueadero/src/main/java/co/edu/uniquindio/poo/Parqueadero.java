package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private int n;
    private Puesto[][] puestos;
    private List<Registro> registros;
    private double totalRecaudadoDiario;
    private double totalRecaudadoMensual;

    public Parqueadero(int n) {
        this.n = n;
        this.puestos = new Puesto[n][n];
        this.registros = new ArrayList<>();
        this.totalRecaudadoDiario = 0;
        this.totalRecaudadoMensual = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                puestos[i][j] = new Puesto(i, j);
            }
        }
    }

    public boolean verificarDisponibilidad(int i, int j) {
        return !puestos[i][j].estaOcupado();
    }

    public void ubicarVehiculo(int i, int j, Vehiculo vehiculo) {
        if (verificarDisponibilidad(i, j)) {
            puestos[i][j].ocuparPuesto(vehiculo);
            registros.add(new Registro(vehiculo, puestos[i][j]));
        } else {
            System.out.println("El puesto ya está ocupado.");
        }
    }

    public Propietario identificarPropietario(int i, int j) {
        if (puestos[i][j].estaOcupado()) {
            return puestos[i][j].getVehiculo().getPropietario();
        }
        return null;
    }

    public void liberarPuesto(int i, int j) {
        if (puestos[i][j].estaOcupado()) {
            Registro registro = obtenerRegistro(puestos[i][j].getVehiculo());
            if (registro != null) {
                registro.setHoraSalida(LocalDateTime.now());
                double tarifa = registro.calcularCosto();
                actualizarRecaudaciones(tarifa);
                puestos[i][j].liberarPuesto();
            }
        }
    }

    private Registro obtenerRegistro(Vehiculo vehiculo) {
        for (Registro registro : registros) {
            if (registro.getVehiculo().equals(vehiculo) && registro.getHoraSalida() == null) {
                return registro;
            }
        }
        return null;
    }

    public void configurarTarifasPorHora(double tarifaCarro, double tarifaMotoClasica, double tarifaMotoHibrida) {
        Carro.setTarifaPorHora(tarifaCarro);
        Moto.setTarifaClasica(tarifaMotoClasica);
        Moto.setTarifaHibrida(tarifaMotoHibrida);
    }

    private void actualizarRecaudaciones(double tarifa) {
        totalRecaudadoDiario += tarifa;
        totalRecaudadoMensual += tarifa;
    }

    public void generarReporteDiario() {
        System.out.println("Reporte Diario:");
        System.out.println("Total recaudado: " + totalRecaudadoDiario);
        System.out.println("Desglosado por tipo de vehículo:");

        double totalCarros = 0;
        double totalMotosClasicas = 0;
        double totalMotosHibridas = 0;

        for (Registro registro : registros) {
            if (registro.getHoraSalida() != null) {
                if (registro.getVehiculo() instanceof Carro) {
                    totalCarros += registro.calcularCosto();
                } else if (registro.getVehiculo() instanceof Moto) {
                    Moto moto = (Moto) registro.getVehiculo();
                    if (moto.getTipoMoto() == TipoMoto.CLASICA) {
                        totalMotosClasicas += registro.calcularCosto();
                    } else if (moto.getTipoMoto() == TipoMoto.HIBRIDA) {
                        totalMotosHibridas += registro.calcularCosto();
                    }
                }
            }
        }

        System.out.println("Carros: " + totalCarros);
        System.out.println("Motos Clásicas: " + totalMotosClasicas);
        System.out.println("Motos Híbridas: " + totalMotosHibridas);

        totalRecaudadoDiario = 0; // Reset diario
    }

    public void generarReporteMensual() {
        System.out.println("Reporte Mensual:");
        System.out.println("Total recaudado: " + totalRecaudadoMensual);
        totalRecaudadoMensual = 0; // Reset mensual
    }
}


