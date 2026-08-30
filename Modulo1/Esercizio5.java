package Modulo1;

import java.util.Random;
/**
 * TESTO ESERCIZIO:
 * Generare casualmente 30 numeri e memorizzarli in due vettori: il primo vettore deve contenere solo i numeri
 * pari mentre il secondo i numeri dispari
 *
 * @author @SamueleDallabrida
 * @date 30/08/2026
 */
public class Esercizio5 {
    
    public static void main(String[] args) {

        Random random = new Random();

        int[] pari = new int[30];
        int[] dispari = new int[30];
        int indPari = 0;
        int indDispari = 0;

        System.out.println("Scrivi i seguenti 30 numeri");

        for (int i = 0; i < 30; i++) {
            int num = random.nextInt(101);
    
            if (num % 2 == 0) {
                pari[indPari] = num;
                indPari++;
            } else {
                dispari[indDispari] = num;
                indDispari++;
            }
        }
        System.out.println("\nArray con numeri pari");
        for (int i = 0; i < indPari; i++) {
            System.out.println(pari[i]+ " ");
        }
        System.out.println("\nArray con numeri dispari");
        for (int i = 0; i < indDispari; i++) {
            System.out.println(dispari[i]+ " ");
        }
    }
}
