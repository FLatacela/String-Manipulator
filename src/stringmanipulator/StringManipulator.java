/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;

import java.util.Scanner;

/**
 *
 * @author Cissco
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter your favorite city: ");

Scanner scan = new Scanner(System.in);

String input = scan.nextLine();
String upper = input.toUpperCase();// all uppercase
String lower = input.toLowerCase();// all Lowercase
int size = input.length();// Number of characters
char inital = upper.charAt(0);// First Character



System.out.println(size);
System.out.println(upper);
System.out.println(lower);
System.out.println(inital);


    }
    
}
