package com.ejercicioOB;

import java.io.*;
import java.util.*;

public class Main {




    public static void main(String[] args) {
        // este es el String al reves
        String result =reverse("Hola mundo");
        System.out.println(result);
        //array unidimensional
        String[] nombres = {"Esteban", "Enrique", "Fernando", "Laura"};
        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        //Array bidimensional
        int[][] numeros = {
                { 1,2,3,4,5},
                {10,20,30,40,50}
        };
        for(int i = 0; i<numeros.length; i++) {
            for (int j = 0; j<numeros[1].length;j++){
                System.out.println("posicion i :" + i+ " posicion j: "+ j);
                System.out.println(numeros[i][j]);
            }
        }

        Vector<String> vector = new Vector<>();
        vector.add("Jose");
        vector.add("Manuel");
        vector.add("Victor");
        vector.add("Enrique");
        vector.add("Manuela");

        vector.remove(2);
        vector.remove(3);

        System.out.println(vector);

        /*
        el problema de usar la capacidad por defecto cuando se tienen 1000 elementos
        es que si este sobrepasa los 1000 asi sea por 1 elemento se duplicaria su capacidad
        lo que aumentaria el consumo en memoria innecesariamente
         */


       //ArrayList y LinkedList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Como");
        lista.add("Estan");
        lista.add("Todos");

        LinkedList<String> linked = new LinkedList<>(lista);

        for (int i = 0 ;i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        for(int i = 0; i< linked.size(); i++){
            System.out.println(linked.get(i));
        }

        //Array list llenado por bucle

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        for(int i = 0 ; i< numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
            }
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //excepcion divideporcero

        try{
            dividePorCero(4,0);
        }catch (Exception e){
            System.out.println("Lo siento esto no se puede hacer " + e.getClass());
        } finally {
            System.out.println("Demo de codigo");
        }


        }






    


    public static String reverse(String texto) {

        //acá inicializo un String para despues retornarlo
            String reversed = "";
        //implemento el for de tal forma que se devuelva
        for (int i = texto.length() - 1; i >= 0; i--) {
            //utilizo la variable y le sumo los chars del parametro desde la ultima
            // posicion para que asi quede al reves
            reversed += texto.charAt(i);
        }

        return reversed;
    }

    public static int dividePorCero (int a, int b) throws ArithmeticException{
        var result = 0;

        try {
            result = a/b;
        }catch(ArithmeticException e ){
            throw new ArithmeticException();
        }
        return result;
    }

    static void copiaFichero(byte fichero, byte fichero2){
        try{
            InputStream filein = new FileInputStream("doc.txt");
            byte[] datos = filein.readAllBytes();

            PrintStream fileout = new PrintStream("destino.txt");
            fileout.write(datos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
