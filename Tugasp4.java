/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp4;

/**
 *
 * @author Deodatuss
 */
public class Tugasp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix A= new Matrix(a);
        System.out.println("Matrix A");
        A.show();
        System.out.println();
        
        System.out.println("Matrix B");
        Matrix B = A.transpose();
        B.show();
        System.out.println();
        
        System.out.println("Matrix Identitas");
        A.identity(3).show();
        System.out.println();
        
        System.out.println("Matrix A + B");
        A.plus(B).show();
        System.out.println();
        
        
        System.out.println("Matrix B * A");
        B.times(A).show();
        System.out.println();
        

    }
    
}
