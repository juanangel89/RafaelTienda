
package controller;

import dao.ProvedorDAO;
import java.util.List;
import java.util.Scanner;
import model.Provedor;
import views.ProvedorView;


public class ProvedorController {
    
    private ProvedorDAO provedorDAO;
    private Scanner scanner;

    public ProvedorController() {
        provedorDAO = new ProvedorDAO();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Proveedores ---");
            System.out.println("1. Crear Provedor");
            System.out.println("2. Leer Provedor");
            System.out.println("3. Actualizar Provedor");
            System.out.println("4. Eliminar Provedor");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    crearProvedor();
                    break;
                case 2:
                    leerProvedor();
                    break;
                case 3:
                    actualizarProvedor();
                    break;
                case 4:
                    eliminarProvedor();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }

    private void crearProvedor() {
        System.out.print("Ingrese el nombre del proveedor: ");
        String nombreProvedor = scanner.nextLine();
        System.out.print("Ingrese la direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el telefono: ");
        String telefono = scanner.nextLine();
        Provedor provedor = new Provedor(0, nombreProvedor, direccion, telefono);
        provedorDAO.crearProvedor(provedor);
        ProvedorView.mostrarMensaje("Cliente creado exitosamente.");
    }
    
        public void crearProvedorButton(String nombreProvedor,String direccion, String telefono) {
        Provedor provedor = new Provedor(0, nombreProvedor,direccion, telefono);
        provedorDAO.crearProvedor(provedor);
        
    }

    private void leerProvedor() {
        List<Provedor> provedores = provedorDAO.leerProvedores();
        ProvedorView.mostrarProvedores(provedores);
    }
    
        public List<Provedor> leerProvedoresButton() {      
        List<Provedor> provedores = provedorDAO.leerProvedores();
        return provedores;
    }

    private void actualizarProvedor() {
        leerProvedor();
        System.out.print("\nIngrese el ID del Proveedor que desea actualizar: ");
        int idProvedor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el nuevo nombre del proveedor: ");
        String nuevoNombreProvedor = scanner.nextLine();
                System.out.print("Ingrese la nueva direccion del proveedor: ");
        String nuevaDireccion = scanner.nextLine();
        System.out.print("Ingrese el nuevo telefono del proveedor: ");
        String nuevoTelefono = scanner.nextLine();
        Provedor provedor = new Provedor(idProvedor, nuevoNombreProvedor, nuevaDireccion, nuevoTelefono);
        provedorDAO.actualizarProvedor(provedor);
        ProvedorView.mostrarMensaje("Proveedor actualizado exitosamente.");
    }
    
        public void actualizarProvedorButton(int idProvedor, String nombreProvedor, String direccion,String telefono) {
            Provedor provedor = new Provedor(idProvedor, nombreProvedor, direccion, telefono);
            provedorDAO.actualizarProvedor(provedor);
        ProvedorView.mostrarMensaje("Proveedor actualizado exitosamente.");
    }

    private void eliminarProvedor() {
        leerProvedor();
        System.out.print("\nIngrese el ID del Proveedor que desea eliminar: ");
        int idProvedor = scanner.nextInt();
        provedorDAO.eliminarProvedor(idProvedor);
        ProvedorView.mostrarMensaje("Proveedor eliminado exitosamente.");
    }
        public void eliminarProvedorButton(int idProvedor) {
            provedorDAO.eliminarProvedor(idProvedor);
    }

    
}
