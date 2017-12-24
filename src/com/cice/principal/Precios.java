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
                paux.nuevoPrecio(lista);
            }
            else if (eleccion == 2){
                System.out.println("El precio medio es: " + paux.precioMedio(lista));
            }
            else if (eleccion == 3){
                System.out.println("El precio máximo es: " + paux.precioMaximo(lista));
            }
            else if (eleccion == 4){
                System.out.println("El precio mínimo es: " + paux.precioMinimo(lista));
            }
            else if (eleccion == 5){
                paux.mostrarPrecios(lista);
            }

        }
        while (eleccion != 0);

        System.out.println("Adios");

    }


}
