/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        animal();
    }
    public static void animal() {
        String animal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre de algun animal con la primera letra en mayúscula:");
        animal=entrada.next();
        if ("Pulpo".equals(animal)){
        System.out.println("Los octópodos son animales marinos de la familia de los moluscos cefalópodos que carecen de esqueleto: ni interno ni externo.");
        }
        if("Araña".equals(animal)){
            System.out.println("Este tipo de animales son artrópodos");
        }
        if("Mosca".equals(animal)){
            System.out.println("La mosca es un insecto terrestre, con gran presencia en el medio ambiente, que pertenece a la clase Insecta");
        }
         if("Mantis".equals(animal)){
            System.out.println("La mantis es un insecto solitario, que solamente se aproxima a otros en época de apareamiento.");
        }
         if("Puma".equals(animal)){
            System.out.println("El puma, león de montaña o león americano es un mamífero carnívoro de la familia Felidae nativo de América.");
        }
    }
    
}
