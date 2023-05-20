package com.aulaenlanube.gestionnomina;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cif;
    private String nombre;
    private List<Trabajador> trabajadores;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }
    
    public void addTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    
}
