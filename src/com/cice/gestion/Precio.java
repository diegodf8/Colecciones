package com.cice.gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Precio {

    public  int mostrarMenu(){

        int opcion = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("1.-Añadir Precio");
        System.out.println("2.-Precio Medio");
        System.out.println("3.-Precio Maximo");
        System.out.println("4.-Precio Minimo");
        System.out.println("5.-Mostrar todos los precios");
        System.out.println("0.-Salir");
        opcion = sc.nextInt();
        return opcion;

    }
    public static ArrayList<Integer> nuevoPrecio(ArrayList<Integer> lista){
        System.out.println("Introduce un nuevo precio: ");
        Scanner sc = new Scanner(System.in);
        Integer precio = sc.nextInt();
        lista.add(precio);
        return lista;
    }

    public static void mostrarPrecios(ArrayList<Integer> lista){

        for (int k: lista)
        {
            System.out.print(k +" ; ");
        }
        System.out.println();
    }

    public static double precioMedio(ArrayList<Integer> lista){

        double precio = 0;
        double aux = 0;
        for (int k: lista)
        {
            aux+=k;
        }
        precio = aux/lista.size();
        return precio;
    }

    public static int precioMaximo(ArrayList<Integer> lista){

        int precio = 0;

        for (int k: lista)
        {
            if (k > precio){
             precio = k;
            }
        }
        return precio;
    }

    public static int precioMinimo(ArrayList<Integer> lista){

        int precio = 9999;

        for (int k: lista)
        {
            if (k < precio){
                precio = k;
            }
        }
        return precio;
    }

}



