import javax.swing.JOptionPane;

/**
 * Clase base (padre) que representa los datos y comportamientos
 * comunes a cualquier vehículo de la agencia AutoMundo S.A. de C.V.
 */
public class Vehiculo {

    // Atributos privados (encapsulamiento)
    private String codigo;
    private String marca;
    private String modelo;
    private String anio;
    private double precio;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String codigo, String marca, String modelo, String anio, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Solicita los datos comunes al usuario mediante ventanas JOptionPane
    public void ingresarDatos() {
        codigo = JOptionPane.showInputDialog("Ingrese el código del vehículo:");
        marca = JOptionPane.showInputDialog("Ingrese la marca:");
        modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        anio = JOptionPane.showInputDialog("Ingrese el año:");
        String precioTexto = JOptionPane.showInputDialog("Ingrese el precio:");
        precio = Double.parseDouble(precioTexto);
    }

    // Devuelve un texto con los datos comunes.
    // Las subclases lo sobrescriben (polimorfismo) para agregar sus propios datos.
    public String mostrarDatos() {
        return "Código: " + codigo + "\n"
             + "Marca: " + marca + "\n"
             + "Modelo: " + modelo + "\n"
             + "Año: " + anio + "\n"
             + "Precio: $" + precio;
    }
}