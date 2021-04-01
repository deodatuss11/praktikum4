/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poin3;

import java.util.Scanner;

/**
 *
 * @author Deodatuss
 */
public class Main {
    public static void main(String[] args) {
    // create an object of the static nested class
    // using the name of the outer class
    
    MotherBoard.USB a = new MotherBoard.USB();
    Scanner input = new Scanner(System.in);
    
    System.out.print("usb 2: ");
    int usb2 = input.nextInt();
    
    System.out.print("usb 3: ");
    int usb3 = input.nextInt();
    
    System.out.println("Port = "+a.getTotalPorts(usb2, usb3));
    
    

 }
}
