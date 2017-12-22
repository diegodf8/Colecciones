package com.cice.principal;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Coleccion {

    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<>();
        lista.add("pepe");
        lista.add("jose");
        lista.add("luis");

        lista.remove(1);

        for (String aux: lista) {
            System.out.println(aux);
        }
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.indexOf("pepe"));
        System.out.println(lista.contains("pepe"));

        Hashtable<Integer, String> lista2 = new Hashtable<Integer, String>();
        lista2.put(23, "Pepe");
        lista2.put( 45, "Luis");
        lista2.put(56, "Alberto");


        Enumeration aux = lista2.elements();

        while (aux.hasMoreElements()){
            System.out.println(aux.nextElement());


        }

    }
}
