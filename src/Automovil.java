import javax.swing.JOptionPane;

public class Automovil extends Vehiculo {

    private int cantidadPuertas;
    private String tipoCombustible;

    public Automovil() {
        super();
    }

    public Automovil(String codigo, String marca, String modelo, String anio, double precio,
            int cantidadPuertas, String tipoCombustible) {
        super(codigo, marca, modelo, anio, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void ingresarDatos() {
        super.ingresarDatos(); // reutiliza el ingreso de datos comunes del padre
        String puertasTexto = JOptionPane.showInputDialog("Ingrese la cantidad de puertas:");
        cantidadPuertas = Integer.parseInt(puertasTexto);
        tipoCombustible = JOptionPane
                .showInputDialog("Ingrese el tipo de combustible (Gasolina, Diesel, Eléctrico, Híbrido):");
    }

    @Override
    public String mostrarDatos() {
        return "===== AUTOMÓVIL =====\n"
                + super.mostrarDatos() + "\n"
                + "Cantidad de puertas: " + cantidadPuertas + "\n"
                + "Tipo de combustible: " + tipoCombustible;
    }
}