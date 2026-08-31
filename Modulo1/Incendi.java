package Modulo1;

/**
 * TESTO ESERCIZIO:
 * Realizzare la classe Incendi per localizzare gli incendi lungo il meridiano di Greenwich.
 * Le latitudini sono espresse in decimale e valide nell'emisfero boreale (da 0 a 90 gradi).
 * 
 * Incendi(dimensione): crea il vettore con la dimensione indicata
 * Incendi(): crea il vettore per memorizzare le latitudini di ogni parallelo (91 elementi)
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 *
 * Metodi utilizzati:
 * @inserisciLatitudine: Inserisce una latitudine nel vettore controllando spazio e range 0-90
 * @getNumeroLatitudini: Restituisce il numero di latitudini attualmente inserite
 * @toString: Restituisce l'elenco delle latitudini formattato tra %% e separate da &
 * @bubbleSort: Ordina le latitudini inserite in ordine crescente
 * @maxDistanza: Calcola la massima distanza in km tra due latitudini consecutive
 * @contaLatitudini: Restituisce un array con il conteggio delle occorrenze delle latitudini
 */

public class Incendi {
    private double[] latitudini;
    private int numeroLatitudini; // Contatore degli elementi effettivamente inseriti

    // Costruttore parametrico
    public Incendi(int dimensione) throws Exception {
        if (dimensione <= 0) {
            throw new Exception("La dimensione del vettore deve essere maggiore di zero.");
        }
        this.latitudini = new double[dimensione];
        this.numeroLatitudini = 0;
    }

    // Costruttore di default
    public Incendi() throws Exception {
        this(91);
    }

    
    public void inserisciLatitudine(double lat) throws Exception {
        if (numeroLatitudini >= latitudini.length) {
            throw new Exception("Spazio nel vettore esaurito!");
        }
        if (lat < 0.0 || lat > 90.0) {
            throw new Exception("Latitudine non valida! Deve essere compresa tra 0 e 90.");
        }
        latitudini[numeroLatitudini] = lat;
        numeroLatitudini++;
    }

    // Ritorna il numero di elementi inseriti
    public int getNumeroLatitudini() {
        return numeroLatitudini;
    }

    //toString
    @Override
    public String toString() {
        String s = "%%";
        for (int i = 0; i < numeroLatitudini; i++) {
            s += latitudini[i];
            if (i < numeroLatitudini - 1) {
                s += "&";
            }
        }
        s += "%%";
        return s;
    }

    //Bubble sort
    public void bubbleSort() {
        for (int i = 0; i < numeroLatitudini - 1; i++) {
            for (int j = 0; j < numeroLatitudini - 1 - i; j++) {
                if (latitudini[j] > latitudini[j + 1]) {
                    double temp = latitudini[j];
                    latitudini[j] = latitudini[j + 1];
                    latitudini[j + 1] = temp;
                }
            }
        }
    }

    //Distanza massima tra latitudini consecutive
    public double maxDistanza() {
        if (numeroLatitudini < 2) {
            return 0.0;
        }

        bubbleSort();

        double maxDiff = 0.0;
        for (int i = 0; i < numeroLatitudini - 1; i++) {
            double diff = latitudini[i + 1] - latitudini[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff * 111.0;
    }

    public double[] contaLatitudini() {
        if (numeroLatitudini == 0) {
            return new double[0];
        }

        //Il vettore deve essere ordinato
        bubbleSort();

        double[] risultato = new double[numeroLatitudini];
        int i = 0;

        while (i < numeroLatitudini) {
            double valoreCorrente = latitudini[i];
            int conteggio = 0;

            
            int j = i;
            while (j < numeroLatitudini && latitudini[j] == valoreCorrente) {
                conteggio++;
                j++;
            }
            risultato[i] = conteggio;
            i = j;
        }

        return risultato;
    }
}
