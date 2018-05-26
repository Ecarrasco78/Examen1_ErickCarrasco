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
public class classes {
    String methods;
    String atributos;
    String clases;

    public classes() {
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "classes{" + "clases=" + clases + '}';
    }
    
    
}
