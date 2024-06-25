
package model;


public class Provedor {
    private int idProvedor;
    private String nombreProvedor;
    private String direccion;
    private String telefono;

    public Provedor(int idProvedor, String nombreProvedor, String direccion, String telefono) {
        this.idProvedor = idProvedor;
        this.nombreProvedor = nombreProvedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
