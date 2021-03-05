/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide2;

import java.util.Scanner;

/**
 *
 * @author Flor Melanni Infante
 */
public class Piramide2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here5
        Scanner piramide=new Scanner (System.in);
        System.out.println("Ingrese el numero de filas: ");
        int n=piramide.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=n-i; j>0; j--){
            System.out.print(" "); 
            }
            for (int k=0; k<i; k++){
                System.out.print(" *");
            }
            System.out.println(""); 
        }
    }
}
