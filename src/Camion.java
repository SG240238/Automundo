import javax.swing.JOptionPane;

public class Camion extends Vehiculo {

    private double capacidadCarga;
    private int cantidadEjes;

    public Camion() {
        super();
    }

    public Camion(String codigo, String marca, String modelo, String anio, double precio,
            double capacidadCarga, int cantidadEjes) {
        super(codigo, marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public void ingresarDatos() {
        super.ingresarDatos();
        String cargaTexto = JOptionPane.showInputDialog("Ingrese la capacidad de carga (toneladas):");
        capacidadCarga = Double.parseDouble(cargaTexto);
        String ejesTexto = JOptionPane.showInputDialog("Ingrese la cantidad de ejes:");
        cantidadEjes = Integer.parseInt(ejesTexto);
    }

    @Override
    public String mostrarDatos() {
        return "===== CAMIÓN =====\n"
                + super.mostrarDatos() + "\n"
                + "Capacidad de carga: " + capacidadCarga + " toneladas\n"
                + "Cantidad de ejes: " + cantidadEjes;
    }
}