package lab1_andresmejia;

import java.util.Scanner;
        

public class Lab1_AndresMejia {

    public static void main(String[] args) {
        
        Scanner read =new Scanner(System.in);
        System.out.println("-- Bienvenido al sistema de de calculo de promedio--" );
        System.out.print("Ingrese su nombre: "); //Se ingresa el nombre del usuario
        String nombre=read.nextLine();
        
        //Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = read.nextDouble();
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = read.nextDouble();
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = read.nextDouble();
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = read.nextDouble();
        
        //Se calcula el promedio 
        double sumaClase= primeraClase+segundaClase+terceraClase+cuartaClase;
        double promedio=sumaClase/4;
        
        //Se imprime el calculo del promedio
        System.out.println("----- " + nombre + " el promedio de las cuatro clases es: " + promedio);
        
        
        
 
    }
    
}
