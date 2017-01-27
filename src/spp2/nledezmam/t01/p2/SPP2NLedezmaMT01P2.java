/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.t01.p2;
import java.util.Scanner;

/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NORMA ALEJANDRA LEDEZMA MARTINEZ - IIS
        //A01411460
        System.out.println("Calculadora de perímeto y superficie de un rectángulo");
        //Variables
        double base, altu, sup, per; 
        
        //Objeto para recibir datos
        Scanner tecl = new Scanner (System.in);
        
        //Asignar valores
         System.out.println("Introduce cuanto mide la base:");
        base=tecl.nextDouble();
         System.out.println("Introduce cuanto mide la altura:");
        altu=tecl.nextDouble();
        
        //Operaciones
        sup = base * altu ;
        per = (base * 2) + (altu *2);
        
        //Mostrar resultado
        System.out.println("Resultados:" +
                "\n"+ "Superficie: " + sup +
                "\n"+ "Perímetro: " + per);
    }
    
}
