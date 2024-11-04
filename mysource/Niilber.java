/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysource;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Niilber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("тоо оруул");
        System.out.print("Эхний тоог оруулна уу: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Хоёр дахь тоог оруулна уу: ");
        int secondNumber = scanner.nextInt();
        
        int sum = firstNumber + secondNumber;
        
        System.out.println("Нийлбэр: " + sum);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
