package com.cice.principal;

import com.cice.gestion.Precio;

import java.util.ArrayList;
import java.util.Scanner;

public class Precios {
    public static void main (String[] args){

        ArrayList<Integer> lista = new ArrayList<Integer>();
        Precio paux = new Precio();
        int eleccion = -1;

        do {
            eleccion = paux.mostrarMenu();
            System.out.println("Opcion: " + eleccion );
            if (eleccion == 1){
                Precio.nuevoPrecio(lista);
            } else if (eleccion == 5){
                Precio.mostrarPrecios(lista);
            }

        }
        while (eleccion != 0);


    }


}
