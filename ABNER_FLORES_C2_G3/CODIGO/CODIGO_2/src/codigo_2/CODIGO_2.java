
package codigo_2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Eliezer Abner
 */
public class CODIGO_2 {
        
    static ArrayList<Persona> listaPersonas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    eliminarPersona();
                    break;
                case 3:
                    editarPersona();
                    break;
                case 4:
                    listarPersonas();
                    break;
                case 5:
                    buscarPersona();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    static void mostrarMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Agregar persona");
        System.out.println("2. Eliminar persona");
        System.out.println("3. Editar persona");
        System.out.println("4. Listar personas");
        System.out.println("5. Buscar persona");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");
    }

    static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Opción inválida
        }
    }

    static void agregarPersona() {
        System.out.println("\nAgregar Persona");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = leerEntero();
        System.out.print("Talla: ");
        double talla = leerDouble();

        Persona persona = new Persona(nombre, apellidos, dni, edad, talla);
        listaPersonas.add(persona);
        System.out.println("Persona agregada correctamente.");
    }

    static void eliminarPersona() {
        System.out.println("\nEliminar Persona");
        System.out.print("Ingrese el DNI de la persona a eliminar: ");
        String dni = scanner.nextLine();

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getDni().equals(dni)) {
                listaPersonas.remove(i);
                System.out.println("Persona eliminada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ninguna persona con ese DNI.");
    }

    static void editarPersona() {
        System.out.println("\nEditar Persona");
        System.out.print("Ingrese el DNI de la persona a editar: ");
        String dni = scanner.nextLine();

        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                System.out.println("Persona encontrada. Ingrese los nuevos datos:");
                System.out.print("Nombre: ");
                persona.setNombre(scanner.nextLine());
                System.out.print("Apellidos: ");
                persona.setApellidos(scanner.nextLine());
                System.out.print("Edad: ");
                persona.setEdad(leerEntero());
                System.out.print("Talla: ");
                persona.setTalla(leerDouble());

                System.out.println("Persona actualizada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ninguna persona con ese DNI.");
    }

    static void listarPersonas() {
        System.out.println("\nListado de Personas");
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }

    static void buscarPersona() {
        System.out.println("\nBuscar Persona");
        System.out.print("Ingrese el DNI de la persona a buscar: ");
        String dni = scanner.nextLine();

        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                System.out.println("Persona encontrada:");
                System.out.println(persona);
                return;
            }
        }

        System.out.println("No se encontró ninguna persona con ese DNI.");
    }

    static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
            }
        }
    }

    static double leerDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número decimal: ");
            }
        }
    }
}

class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private double talla;

    public Persona(String nombre, String apellidos, String dni, int edad, double talla) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.talla = talla;
    }

    // Getters y setters para todos los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos +
               ", DNI: " + dni +
               ", Edad: " + edad +
               ", Talla: " + talla;
    }
}
    /**
     * @param args the command line arguments
     */
    
    
