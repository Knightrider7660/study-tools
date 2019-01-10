/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author snp
 */
import java.util.Scanner;
public class Index {

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
        System.out.println("Index of 'p'in S = "+S.indexOf('p'));
        System.out.println("Index of 'the' in T = "+P.indexOf("the"));
        System.out.println("Index of 'then' in T = "+P.indexOf("then"));
        
    }
    
}
