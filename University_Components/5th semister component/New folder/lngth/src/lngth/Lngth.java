/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lngth;

/**
 *
 * @author snp
 */
import java.util.Scanner;
public class Lngth {

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
        System.out.println("Length of S = "+S.length());
        System.out.println("Length of T = "+ P.length());
    }
    
}
