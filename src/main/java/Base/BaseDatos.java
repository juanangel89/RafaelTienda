package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import controller.CategoriaController;
import controller.ProductoController;
import controller.ClienteController;

import panel.PanelInicio;
import javax.swing.JFrame;

public class BaseDatos {

    public static void main(String[] args) {
         /*
        CategoriaController categoriaController = new CategoriaController();
        categoriaController.mostrarMenu();
        
        ProductoController productoController = new ProductoController();
        productoController.mostrarMenu();
        
        ClienteController ClienteController = new ClienteController();
        ClienteController.mostrarMenu();
        */
         
        PanelInicio panelInicio = new PanelInicio ();
        panelInicio.setVisible(true);
        /*JFrame frame = new JFrame ("Base de Datos Juan");
        frame.getContentPane().add(panelcategoria);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);*/
        
    }
}
                