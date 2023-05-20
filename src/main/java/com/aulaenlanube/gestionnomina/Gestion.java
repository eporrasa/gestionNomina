package com.aulaenlanube.gestionnomina;

/**
 *
 * @author edwin
 */
public class Gestion extends Trabajador{
    private int antiguedad;
    
    public Gestion(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Gestion{" + "antiguedad=" + antiguedad + '}';
    }
    
}
