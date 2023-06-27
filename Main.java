package imc;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    
        double peso, altura, IMC;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Este programa puede calcular su IMC");
        System.out.println("");
        
        System.out.println("Introduzca su peso en kilogramos");
        peso = in.nextDouble();
        System.out.println("");
        
        System.out.println("Introduzca su altura en centimetros");
        altura = in.nextDouble()/100;
        System.out.println("");
        
        IMC = peso / (Math.pow(altura, 2));
        
        System.out.println("Para un peso de " + peso + " kilogramos y");
        System.out.println("Para una altura de " + altura + " metros");
        System.out.println("El indice de masa corporal es " + (int)IMC);
        System.out.println("");
        
        if(IMC < 16){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene delgadez severa");
            System.out.println("");
        } else if(IMC < 17){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene delgadez moderada");
            System.out.println("");
        } else if (IMC < 18.5){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene delgadez leve");
            System.out.println("");
        } else if (IMC < 25){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene un peso normal");
            System.out.println("");
        } else if (IMC < 30){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene sobrepeso");
            System.out.println("");
        } else if (IMC < 35){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene obesidad leve");
            System.out.println("");
        } else if (IMC < 40){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene obesidad moderada");
            System.out.println("");

    }
           else if (IMC >= 40){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene obesidad mórbida");
            System.out.println("");

    }
}
}