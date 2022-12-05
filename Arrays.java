/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,total=0,average;
        Scanner sk=new Scanner(System.in);
        System.out.println("enter no of players");
        n=sk.nextInt();
        int runs[]=new int[n];
        System.out.println("enter runs");
        for (int i=0;i<n;i++)
        {
            runs[i]=sk.nextInt();
            total=total+runs[i];
        }
            average=total/n;
            System.out.println("total is"+total);
            System.out.println("average is"+average);
            System.out.println("run of player 5 is"+runs[5]);
            
            
            
            
            
            
            
            
            
         
            
        // TODO code application logic here
    }
    
}
