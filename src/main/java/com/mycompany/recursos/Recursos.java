//*Blanca Da Costa Gomez Carcamo
//202310010031
//Programa de cuatro metodos 
// Clase Recursos
package com.mycompany.recursos;
public class Recursos {
    
    //  1.Retorna un mensaje
    public String mostrarMensaje() {
        return "Programación Orientada a Objetos 2021";
    }

    // 2. Retorna si el estudiante es mayor o menor de edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    //3.  Retorna la multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // 4. Retorna una lista de números del 1 al X
    public int[] listaNumeros(int x) {
        int[] numeros = new int[x];
        for (int i = 0; i < x; i++) {
            numeros[i] = i + 1;
        }
        return numeros;
    }

    
    public static void main(String[] args) {
     
        Recursos recursos = new Recursos();

        
        System.out.println(recursos.mostrarMensaje());

      
        int edad = 22; 
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

       
        int a = 5, b = 10;
        System.out.println("Multiplicación de " + a + " * " + b + " = " + recursos.multiplicar(a, b));

   
        int x = 5;
        System.out.println("Lista de números del 1 al " + x + ":");
        int[] lista = recursos.listaNumeros(x);
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
    }
}