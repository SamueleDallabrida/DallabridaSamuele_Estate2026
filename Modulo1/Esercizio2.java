package Modulo1;

import java.util.Scanner;
/**
 * TESTO ESERCIZIO:
 * Dopo aver acquisito in input un numero positivo inferiore a 10000, calcolarne i divisori, memorizzarli in un
 * vettore e stamparli a video
 *
 * @author Samuele Dallabrida
 * @date 23/08/2026
 */

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Inserisci un numero positivo di valore inferiore a 1000");
            numero = tastiera.nextInt();
        } while (numero <= 0 || numero >= 10000);

        int conteggio = 0;

        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0) {
                conteggio++;
            }
        }

        int[] ArrayDivisori = new int[conteggio];
        int indice = 0;
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0) {
                ArrayDivisori[indice] = i;
                indice++;
            }
        }

        System.out.println("I divisori sono:");
        for (int i = 0; i < ArrayDivisori.length; i++) {
            System.out.println(ArrayDivisori[i]);
        }

        tastiera.close();
    }
}
