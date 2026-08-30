package Modulo1;

/**
 * TESTO ESERCIZIO:
 * I biglietti sono numerati a 6 cifre, se la somma delle prime 3 e ultime 3 è uguale allora, il russo avra una giornata fortunata;
 * Creare una classe che ti permetta di creare un biglietto, controllare se è fortunato e stamparlo.
 *
 * @author @SamueleDallabrida
 * @date 30/08/2026
 * Metodi utilizzati
 * @Biglietto: Costruttore con numero a 6 cifre o meno
 * @eBuonaGiornata: metodo per verificare se il biglietto è un biglietto "Buona giornata"
 * @stampa: Stampa il numero del biglietto
 */

public class Biglietto {
    private int numero;

    public Biglietto(int numero) {
        this.numero = numero;
    }

    public boolean eBuonaGiornata() {
        String s = Integer.toString(numero);
        
        while (s.length() < 6) {
            s = "0" + s;
        }

        int somma1 = Character.getNumericValue(s.charAt(0)) + 
                     Character.getNumericValue(s.charAt(1)) + 
                     Character.getNumericValue(s.charAt(2));

        int somma2 = Character.getNumericValue(s.charAt(3)) + 
                     Character.getNumericValue(s.charAt(4)) + 
                     Character.getNumericValue(s.charAt(5));

        return somma1 == somma2;
    }

    // Metodo per stampare il biglietto
    public void stampa() {
        String numeroFormattato = String.format("%06d", numero); //Chiesto a Gemini per mettere lo 0 visibile anche nella stampa
        //"%d" = numero intero
        //"6" = almeno 6 cifre
        //"0" = se il numero ha meno di 6 cifre riempi con 0 a partire da sinistra
        System.out.println("Biglietto N. " + numeroFormattato);
    }
}
