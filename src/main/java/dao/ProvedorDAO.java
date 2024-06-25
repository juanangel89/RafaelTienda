
package dao;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Provedor;

public class ProvedorDAO {
        private Connection conexion; //delcara preteterminado de SQL
    private ConexionBD conexionBD; //declara la conexionDB
    
    public ProvedorDAO(){
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }
    
    public void crearProvedor(Provedor provedor) {
        String sql = "INSERT INTO provedores (nombre, direccion, telefono) VALUES (?,?,?)";//comando a la SQL
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, provedor.getNombreProvedor());
            statement.setString(2, provedor.getDireccion());
            statement.setString(3, provedor.getTelefono());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    
    public List<Provedor> leerProvedores() {
        List<Provedor> listaProvedores = new ArrayList<>();
        String sql = "SELECT * FROM provedores";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int idProvedor = resultSet.getInt("idProvedor");
                String nombreProvedor = resultSet.getString("nombre");
                String direccion = resultSet.getString("direccion");
                String telefono = resultSet.getString("telefono");
                Provedor provedor = new Provedor(idProvedor,nombreProvedor,direccion,telefono);
                listaProvedores.add(provedor);
            }
        } catch (SQLException e) {
                System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return listaProvedores;
    }
    
    public void actualizarProvedor(Provedor provedor) {
        String sql = "UPDATE provedores SET nombre = ?, direccion = ?, telefono = ? WHERE idProvedor = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, provedor.getNombreProvedor());
            statement.setString(2, provedor.getDireccion());
            statement.setString(3, provedor.getTelefono());
            statement.setInt(4, provedor.getIdProvedor());
            statement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }
    
    public void eliminarProvedor(int idProvedor) {
        String sql = "DELETE FROM provedores WHERE idProvedor = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idProvedor);
            statement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }
    
    

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }
    
}
