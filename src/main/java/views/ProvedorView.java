
package views;

import java.util.List;
import model.Provedor;

public class ProvedorView {
    
    public static void mostrarProvedores(List<Provedor> provedores){
            if (provedores.isEmpty()) {
                System.out.println("No hay clientes disponibles.");
            } else {
                System.out.println("\n--- Lista de Provedores ---");
                for (Provedor provedor : provedores) {
                    System.out.println(provedor.getIdProvedor() + ". " + provedor.getNombreProvedor() + ". " + provedor.getDireccion() + ". " + provedor.getTelefono());
            }
        }
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
