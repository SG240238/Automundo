import javax.swing.JOptionPane;

/**
 * Clase hija que representa una Motocicleta.
 * Hereda de Vehiculo y agrega cilindraje y tipo de motocicleta.
 */
public class Motocicleta extends Vehiculo {

    private int cilindraje;
    private String tipoMotocicleta;

    public Motocicleta() {
        super();
    }

    public Motocicleta(String codigo, String marca, String modelo, String anio, double precio,
                        int cilindraje, String tipoMotocicleta) {
        super(codigo, marca, modelo, anio, precio);
        this.cilindraje = cilindraje;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public void ingresarDatos() {
        super.ingresarDatos();
        String cilindrajeTexto = JOptionPane.showInputDialog("Ingrese el cilindraje (cc):");
        cilindraje = Integer.parseInt(cilindrajeTexto);
        tipoMotocicleta = JOptionPane.showInputDialog("Ingrese el tipo de motocicleta (Deportiva, Urbana, Trabajo, etc.):");
    }

    @Override
    public String mostrarDatos() {
        return "===== MOTOCICLETA =====\n"
             + super.mostrarDatos() + "\n"
             + "Cilindraje: " + cilindraje + " cc\n"
             + "Tipo de motocicleta: " + tipoMotocicleta;
    }
}