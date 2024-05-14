
package com.mycompany.fibonacci_factorial;

import java.util.Scanner;

public class Fibonacci_factorial {

    public static void main(String[] args) {
        
        float num1 = 1;
        float num2 = 1;
        float suma;
        int contador;
        
     
        
        System.out.println("¿Cuantos numeros de la serie fibonacci quieres?");
        Scanner entradaEscaner = new Scanner(System.in);
        contador = entradaEscaner.nextInt();
        
        System.out.println(0);
        System.out.println(num1);
        System.out.println(num2);
        
 
       for(int i=0;i<contador -2; i++){
           
            suma = num1+ num2;
            System.out.println(suma);
            num1 = num2;
            num2=suma;
    }
       
       int numfactorial;
       int solucion = 1;
       
       System.out.println("¿De qué numero quieres saber el factorial?");
       numfactorial= entradaEscaner.nextInt();
       
       for(int i= 1;i<numfactorial;i++){
           solucion =solucion + i;
       }
       System.out.println("Factorial: "+solucion);
       
       }
       
}
