package com.aulaenlanube.gestionnomina;

/**
 *
 * @author edwin
 */
public class Informatico extends Trabajador{
    private String titulacion;
    
    public Informatico(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Informatico{" + super.toString() + "titulacion=" + titulacion + '}';
    }
    
    
    
}
