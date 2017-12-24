package com.cice.gestion;

import javax.net.ssl.SSLEngineResult;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Contacto {

    public  int mostrarMenu(){

        int opcion = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("1.-Añadir Contacto");
        System.out.println("2.-Eliminar Contacto");
        System.out.println("3.-Mostrar Contactos");
        System.out.println("0.-Salir");
        opcion = sc.nextInt();
        return opcion;

    }

    public void nuevoContacto(Hashtable<Integer, String> lista) {

        int dni = 0;
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del contacto: ");
        dni = sc.nextInt();
        System.out.println("Introduce el nombre del contacto");
        nombre = sc.next();
        if (lista.containsKey(dni) != true){
            lista.put(dni, nombre);
        } else {
            System.out.println("El contacto ya existe");
        }
    }

    public void eliminarContacto (Hashtable<Integer, String> lista){

        int dni = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI a eliminar: ");
        dni = sc.nextInt();
        if(lista.containsKey(dni) == true){
            lista.remove(dni);
        } else {
            System.out.println("El DNI no existe");
        }

    }


    public void mostrarContactos(Hashtable<Integer, String> lista){

        Enumeration elementos = lista.elements();
        Enumeration elementos2 = lista.keys();
        Integer aux;

        /*
        while (elementos.hasMoreElements()){
            System.out.print(elementos.nextElement() + " - ");
        }
        */

        while (elementos2.hasMoreElements()){
            aux = (Integer) elementos2.nextElement();
            System.out.println("DNI: " + aux + "// Nombre: " + lista.get(aux));
        }

    }
}




