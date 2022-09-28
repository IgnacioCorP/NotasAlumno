
package notaalumno;

import java.util.Scanner;


public class NotaAlumno {
   
    public static Scanner ent = new Scanner (System.in);

    public static void main(String[] args) {
       
       System.out.println("\t\tBIENVENIDO A LA APLICACIÓN\n\n");
       System.out.print("Introducir nota del alumno: ");  
       
       float n = ent.nextFloat();
      
       while(n<0 || n>10){
           System.out.print("Introduzca una nota entre cero y diez: ");
           n = ent.nextFloat();
       }  
       
       if(n<5){
           System.out.println("El alumno ha suspendido");
       }else if(n>=5 & n<=6){
           System.out.println("El alumno tiene un aprobado");
       }else if(n>6 & n<7){
           System.out.println("El alumno tiene Bien");
       }else if(n>=7 & n<9){
           System.out.println("El alumno tiene un notable");
       }else if(n>=9 & n<=10){
           System.out.println("El alumno tiene un sobresaliente");
       }
    }
}
