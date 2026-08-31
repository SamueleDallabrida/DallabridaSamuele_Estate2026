package Modulo1;

/**
 * TESTO ESERCIZIO:
 * Creare una classe che sia in grado di gestire un array di numeri interi, e deve presentare le seguenti classi
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 * Metodi utilizzati:
 * @Vettore: Costruttore di default
 * @Vettore(int[] elementi): Costruttore con numero di elementi nel vettore 
 * @add(int element): Aggiungere un elemnto all'array, se l'array è pieno da l'Exception
 * @add(int element, int index): Aggiunge un elemento in una determinata posizione, se la posizione è occupata sposta l'intero array verso destra per liberare lo spazio desiderato
 * @get(int index): Restituisce l'elemento della posizione index desiderata
 * @remove(int index): Rimuove l'elemento presente nella posizone index e sposta l'array verso sinistra per "coprire" la posizione vuota
 * @replace(int element, int index): Sostituisce l'elemento nella posizione index, con un altro elemento desiderato
 * @clear: Pulizia totale dell'array, basta che andiamo ad impostare la dimensione a 0, e sarà già "considerato" vuoto
 * @sort: Riordina l'array in base al metodo selezionato
 * @
 */

public class Vettore {
    private int capacità;
    private int dimensione;
    private int[] elementi;

    public Vettore() {
        this.elementi = new int[10];
        this.dimensione = 0;
    }

    public Vettore(int capacità) {
        this.elementi = new int[capacità];
        this.dimensione = 0;
    }

    public void add(int element) throws Exception{
        if (dimensione == elementi.length) {
            throw new Exception("Non può essere inserito un nuovo elemento dato che l'array è pieno");
        }
        elementi[dimensione] = element;
        dimensione++; 
    }

    public void add(int element, int index) throws Exception {
        if (dimensione == elementi.length) {
            throw new Exception("L'array è pieno!");
        }
    
        for (int i = dimensione; i > index; i--) {
            elementi[i] = elementi[i - 1];
        }

        elementi[index] = element;
        dimensione++;
    }

    public int get(int index) {
        return elementi[index];
    }

    public void remove(int index) {
        for (int i = index; i < dimensione - 1; i++) {
            elementi[i] = elementi[i + 1];
        }
    
        dimensione--;
    }

    public void replace(int element, int index){
        elementi[index] = element;
    }

    public void clear() {
        dimensione = 0;
    }

    public void sort(AlgoritmoOrdinamento algoritmo) {
    switch (algoritmo) {
        case BUBBLE:
            for (int i = 0; i < dimensione - 1; i++) {
                for (int j = 0; j < dimensione - 1 - i; j++) {
                    if (elementi[j] > elementi[j + 1]) {
                        int temp = elementi[j];
                        elementi[j] = elementi[j + 1];
                        elementi[j + 1] = temp;
                    }
                }
            }
            break;
            
        case INSERTION:
            for (int i = 1; i < dimensione; i++) {
                int key = elementi[i];
                int j = i - 1;

                while (j >= 0 && elementi[j] > key) {
                    elementi[j + 1] = elementi[j];
                    j--;
                }
        
                elementi[j + 1] = key;
            }
            break;

        case SELECTION:
            for (int i = 0; i < dimensione - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < dimensione; j++) {
                    if (elementi[j] < elementi[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = elementi[minIndex];
                elementi[minIndex] = elementi[i];
                elementi[i] = temp;
            }
            break;
        }
    }

    @Override
    public String toString() {
        String testo = "[";
    
        for (int i = 0; i < dimensione; i++) {
            testo += elementi[i];
            if (i < dimensione - 1) {
                testo += ", "; // Aggiunge la virgola solo tra un elemento e l'altro
            }
        }
    
        testo += "]";
        return testo;
    }
}
