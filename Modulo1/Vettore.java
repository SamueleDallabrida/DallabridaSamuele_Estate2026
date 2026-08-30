package Modulo1;

public class Vettore {
    private int capacità;
    private int dimensione;
    private int[] elementi;

    public Vettore() {
        this.elementi = new int[10];
        this.dimensione = 0;
    }

    public Vettore(int[] elementi) {
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

    public void sort() {
        
        for (int i = 0; i < dimensione - 1; i++) {
        
            for (int j = 0; j < dimensione - 1 - i; j++) {
            
                if (elementi[j] > elementi[j + 1]) {
                    int temp = elementi[j];
                    elementi[j] = elementi[j + 1];
                    elementi[j + 1] = temp;
                }
            }
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
