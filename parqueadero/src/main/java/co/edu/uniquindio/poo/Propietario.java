package co.edu.uniquindio.poo;

/**
 * La clase Propietario representa a una persona propietaria de un vehículo.
 * Contiene información básica del propietario como su nombre y documento de identidad.
 */
public class Propietario {
    // Nombre del propietario.
    private final String nombre;
    // Documento de identidad del propietario.
    private final String documentoIdentidad;

    /**
     * Constructor de la clase Propietario.
     *
     * @param nombre Nombre del propietario.
     * @param documentoIdentidad Documento de identidad del propietario.
     */
    public Propietario(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    /**
     * Obtiene el nombre del propietario.
     *
     * @return El nombre del propietario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el documento de identidad del propietario.
     *
     * @return El documento de identidad del propietario.
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}

