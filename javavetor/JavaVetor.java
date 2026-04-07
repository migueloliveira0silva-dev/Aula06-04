/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor;
import java.util.Scanner;

/**
 *
 * @author 326128330
 */
public class JavaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();
        
        int[] X = new int[n];
        int[] Y = new int[n];
        
        System.out.println("Digite os " + n + " elemmentos do vetor X:");
        for (int i = 0; i < n; i++){
            System.out.print("X[" + i + "]: ");
            X[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            Y[i] = X[n - 1 - i];
        }
        
        System.out.print("Vetor Y (Inverso): {");
        for (int i = 0; i < n; i++){
            System.out.print(Y[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println("}");
        
        sc.close();
    }
}
        
    
        
        
        
        
        // TODO code application logic here
    
    

