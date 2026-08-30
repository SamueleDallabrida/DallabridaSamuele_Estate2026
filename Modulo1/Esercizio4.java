package Modulo1;

import java.util.Scanner;

/**
 * acquisire in input 10 numeri interi e visualizzarli in sequenza senza stampare uno stesso numero più di una
 * volta.
 * @author Samuele Dallabrida
 * @date 30/08/2026
 */

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        int[] numeri = new int[10];

        System.out.println("Inserisci i 10 numeri nell'array");

        for (int i = 0; i < 10; i++) {

            numeri[i] = tastiera.nextInt();
        }

        System.out.println("\nNumeri senza Duplicati:");

        for (int i = 0; i < numeri.length; i++) {
            boolean giaPresente = false;
            
            for (int j = 0; j < i; j++) {
                
                if (numeri[i] == numeri[j]) {
                    giaPresente = true;
                    break;
                }
            }

            if (!giaPresente) {
                System.out.println(numeri[i]);
            }
            tastiera.close();
        }
    }
}
