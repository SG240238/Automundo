import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Clase principal: muestra el menú, crea los objetos
 * y administra la lista de vehículos mediante un ArrayList.
 */
public class Main {

    // ArrayList que almacena TODOS los vehículos, sin importar su tipo,
    // gracias al polimorfismo (todos son "un" Vehiculo).
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            String menu = "===== AUTOMUNDO S.A. DE C.V. =====\n"
                        + "1. Registrar vehículo\n"
                        + "2. Consultar vehículo\n"
                        + "3. Eliminar vehículo\n"
                        + "4. Mostrar todos los vehículos\n"
                        + "5. Salir";
            String opcionTexto = JOptionPane.showInputDialog(menu);

            if (opcionTexto == null) {
                break; // el usuario presionó "Cancelar"
            }

            try {
                opcion = Integer.parseInt(opcionTexto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida, ingrese un número.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    consultarVehiculo();
                    break;
                case 3:
                    eliminarVehiculo();
                    break;
                case 4:
                    mostrarTodos();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void registrarVehiculo() {
        String tipo = JOptionPane.showInputDialog(
                "Seleccione el tipo de vehículo:\n1. Automóvil\n2. Motocicleta\n3. Camión");

        if (tipo == null) {
            return;
        }

        Vehiculo nuevo = null;

        switch (tipo) {
            case "1":
                nuevo = new Automovil();
                break;
            case "2":
                nuevo = new Motocicleta();
                break;
            case "3":
                nuevo = new Camion();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de vehículo no válido.");
                return;
        }

        nuevo.ingresarDatos();
        vehiculos.add(nuevo);
        JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
    }

    public static void consultarVehiculo() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del vehículo a buscar:");

        for (Vehiculo v : vehiculos) {
            if (v.getCodigo().equalsIgnoreCase(codigo)) {
                JOptionPane.showMessageDialog(null, v.mostrarDatos());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Vehículo no encontrado, no se puede mostrar.");
    }

    public static void eliminarVehiculo() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del vehículo a eliminar:");
        Vehiculo aEliminar = null;

        for (Vehiculo v : vehiculos) {
            if (v.getCodigo().equalsIgnoreCase(codigo)) {
                aEliminar = v;
                break;
            }
        }

        if (aEliminar != null) {
            vehiculos.remove(aEliminar);
            JOptionPane.showMessageDialog(null, "Vehículo eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado, no se puede eliminar.");
        }
    }

    public static void mostrarTodos() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos registrados.");
            return;
        }

        String listado = "";
        for (Vehiculo v : vehiculos) {
            listado += v.mostrarDatos() + "\n----------------------------\n";
        }

        JOptionPane.showMessageDialog(null, listado);
    }
}