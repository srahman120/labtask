/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        char[] char1 = input.toCharArray(); 
        for(int x = (input.length() - 1); x >= 0 ;x-- ){                                    
            System.out.print(char1[x]);       
        }
          
    }
    
}
