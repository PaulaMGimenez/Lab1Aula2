/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1aula2;

/**
 *
 * @author Usuario
 */
public class Empleado {
    
    
    String nombre;
    String apellido;
    int dni;
    String categoria;
    double sueldo;
    String empresa;

    public Empleado(String nombre, String apellido, int dni, String categoria, double sueldo, String empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
}
