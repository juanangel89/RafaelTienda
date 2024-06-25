
package model;


public class Cliente {
    private int idClient;
    private String nombreCliente;
    private String telefono;
    
        public Cliente(String nombreCliente, String telefono) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        }

    public Cliente(int idClient, String nombreCliente, String telefono) {
        this.idClient = idClient;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.nombreCliente = NombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

