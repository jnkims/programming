/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnsboo;

/**
 *
 * @author Estelloso_CPE112
 */
import java.util.Scanner;
public class Jnsboo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         
         double x1;
         double x2;
         String x3;
         
         System.out.println("Hey calculator");
         System.out.println("please in put 2 numbers");
         
         while (true){
             System.out.println("input your first number");
             x1= input.nextDouble();
             System.out.println("input your second number");
             x2= input.nextDouble();
             System.out.println("please input your prefered operation");
             x3= input.next();
             
             switch (x3) {
                 case "+":
                     System.out.println(x1 + x2);
                     System.out.println("addition done, returning");
                     break;
                 case "-":
                     System.out.println(x1 - x2);
                     System.out.println("subtraction done, retuning");
                     break;
                 case "*":
                     System.out.println(x1 * x2);
                     System.out.println("multiplication done, returning");
                     break;
                 case "/":
                     System.out.println(x1 / x2);
                     System.out.println("Division done, returning");
                     break;
             }    
                System.out.println("Enter your number");
                int num = input.nextInt();
                if (num % 2 ==0){
                    System.out.println("Number is even :"+num); 
                }
                    
                else {
                    System.out.println("Number is odd :"+num);
                
                        
                }
                
                
                    
         }
         
         
     }         
        
}    
    

