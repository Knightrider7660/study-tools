/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatanation;

import java.util.Scanner;

/**
 *
 * @author snp
 */
import java.util.Scanner;
public class Concatanation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String S;
        String P;
        System.out.print("Enter the value of S: ");
        S = input.nextLine();
        
        System.out.print("Enter the value of P: ");
        P = input.nextLine();
        System.out.println("Concatenation of S & T = "+S+" "+P);
        
    }
    
}
