/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero13;

import java.util.Scanner;
public class Actividad2parte1EjercicioNumero13 {

    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el peso de las tres esferas, el peso debe ser diferente");
        System.out.println("valor esfera a");
        a = input.nextDouble();
        System.out.println("valor esfera b");
        b = input.nextDouble();
        System.out.println("valor esfera c");
        c = input.nextDouble();
        if(a==b && a==c){
            System.out.println("las esferas tienen el mismo peso");
        }
        else if(a>b && a>c){
            System.out.println("la esfera a es la que pesa mas");
        }
        else if(b>a && b>c){
            System.out.println("la esfera b es la que pesa mas");
        }
        else{
            System.out.println("la esfera c es la que pesa mas");
        }
    }
}
