package com.exercise;

public class ejercicio9 {

    public static void main(String[] args) {

        double precioConIVA =  precioIVA(200000);

        System.out.println("El precio con IVA es: "+ precioConIVA + " pesos");


    }

    static double precioIVA(int price){
        return price+(price* 0.19);
    }


}
