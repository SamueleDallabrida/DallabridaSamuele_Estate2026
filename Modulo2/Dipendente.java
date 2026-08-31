package Modulo2;

/**
 * TESTO ESERCIZIO:
 * Realizzare un oggetto dipendente con le seguenti caratteristiche:
 * Dipendente( nome, cognome, eta, stipendio)
 * Dipendente( nome, congome, eta)
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 * 
 * Metodi utilizzati:
 * @setNome: Imposta un nome al dipendente (deve essere presente (non null o vuoto))
 * @setCognome: Imposta un cognome al dipendente (deve essere presente (non null o vuoto))
 * @setEta: Imposta un eta al dipendente (non può essere negativa)
 * @setStipendio: Imposta uno stipendio al dipendente (non può essere negativo)
 * @getNome: Restituisce il nome del dipendente
 * @getCognome: Restituisce il cognome del dipendente
 * @getEta: Restituisce l'età del dipendete
 * @getStipendio: Restituisce lo stipendio del dipendente
 */

public class Dipendente {
    private String nome;
    private String cognome;
    private int eta;
    private double stipendio;

    public Dipendente(String nome, String cognome, int eta, double stipendio) throws Exception{
        try {
            setNome(nome);
            setCognome(cognome);
            setEta(eta);
            setStipendio(stipendio);

        } catch (Exception e) {
            throw new Exception("Fail nella creazione dell'oggetto");
        }

    }

    public Dipendente(String nome, String cognome, int eta) throws Exception{
        try {
            setNome(nome);
            setCognome(cognome);
            setEta(eta);

        } catch (Exception e) {
            throw new Exception("Fail nella creazione dell'oggetto");
        }
    }

    public void setNome(String nome) throws Exception{
        if(nome.isBlank() || nome.isEmpty()) {
            throw new Exception("Il nome deve essere per forza presente");
        }
        else{
            this.nome = nome;
        }
    }

    public void setCognome(String cognome) throws Exception{
        if(cognome.isBlank() || cognome.isEmpty()) {
            throw new Exception("Il nome deve essere per forza presente");
        }
        else{
            this.cognome = cognome;
        }
    }

    public void setEta(int eta) throws Exception{
        if (this.eta < 0) {
            throw new Exception("L'eta non può essere negativo");
        }
        else {
            this.eta = eta;
        }
    }

    public void setStipendio(double stipendio) throws Exception{
        if (this.stipendio < 0) {
            throw new Exception("Lo stipendio non può essere negativo");
        }
        else {
            this.stipendio = stipendio;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public double getStipendio() {
        return stipendio;
    }
}
