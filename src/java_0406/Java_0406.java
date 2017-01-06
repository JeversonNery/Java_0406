/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0406;

import java.util.Scanner;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0406 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Informe o seu peso: ");
        double ps = scan.nextDouble();
        
        System.out.printf("Informe a sua altura: ");
        double al = scan.nextDouble();
        
        double imc = ps*al;
        
        System.out.println("Seu IMC: " + imc);
    }
    
}
