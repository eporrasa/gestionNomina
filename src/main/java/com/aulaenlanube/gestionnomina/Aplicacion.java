package com.aulaenlanube.gestionnomina;

public class Aplicacion {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("800357464", "Proyecto Edwin");

        empresa.addTrabajador(new Auxiliar("147852", "Qazwsx", 150000, 5));
        empresa.addTrabajador(new Auxiliar("987654", "Wsxedc", 20000, 1));
        empresa.addTrabajador(new Programador("456123", "Edcrfv", 45000, "Ing."));
        empresa.addTrabajador(new Programador("123456", "Rfvtgb", 780000,"Tec"));
        empresa.addTrabajador(new Analista("159623", "Tgbyhn", 65400, "XXX"));
        empresa.addTrabajador(new Analista("753421", "Ujmik", 789570, "RRR"));
        empresa.addTrabajador(new Administrativo("854632", "Wasqwe", 325698, 8));
        empresa.addTrabajador(new Administrativo("652589", "Tfderg", 745896, 0));

        

    }

}
