/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author erick
 */
public class Users {
    String name;
    int edad;
    String correo;
    String usuario;
    String password;
    String clases;

    public Users() {
    }

    public Users(String name, int edad, String correo, String usuario, String password, String clases) {
        this.name = name;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
        this.clases = clases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Users{" + "user: " + usuario + '}';
    }
    
    
    
    
}
