/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor2;

import java.util.Scanner;

/**
 *
 * @author 326128330
 */
public class JavaVetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         int n;

    // Lê o tamanho dos vetores
    System.out.print("Digite o número de elementos: ");
    n = sc.nextInt();

    int[] X = new int[n];
    int[] Y = new int[n];
    int[] Z = new int[2 * n]; // tamanho máximo possível
    int k = 0; // controla o tamanho real de Z

    // Lê o vetor X
    System.out.println("Digite os elementos do vetor X:");
    for (int i = 0; i < n; i++) {
        X[i] = sc.nextInt();
    }

    // Lê o vetor Y
    System.out.println("Digite os elementos do vetor Y:");
    for (int i = 0; i < n; i++) {
        Y[i] = sc.nextInt();
    }

    // Adiciona elementos de X em Z (sem repetição)
    for (int i = 0; i < n; i++) {
        boolean existe = false;

        for (int j = 0; j < k; j++) {
            if (Z[j] == X[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            Z[k] = X[i];
            k++;
        }
    }

    // Adiciona elementos de Y em Z (sem repetição)
    for (int i = 0; i < n; i++) {
        boolean existe = false;

        for (int j = 0; j < k; j++) {
            if (Z[j] == Y[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            Z[k] = Y[i];
            k++;
        }
    }

    // Exibe o vetor Z (união)
    System.out.print("Vetor Z (união sem repetição): ");
    for (int i = 0; i < k; i++) {
        System.out.print(Z[i] + " ");
    }

    sc.close();
}
        
        // TODO code application logic here
    }
    

