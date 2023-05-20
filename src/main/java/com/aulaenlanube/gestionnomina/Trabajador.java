package com.aulaenlanube.gestionnomina;

/**
 *
 * @author edwin
 */
public abstract class Trabajador {
    private String dni;
    private String nombre;
    private double salarioBase;

    public Trabajador(String dni, String nombre, double salarioBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + ", salarioBase=" + salarioBase + '}';
    }

    
}
