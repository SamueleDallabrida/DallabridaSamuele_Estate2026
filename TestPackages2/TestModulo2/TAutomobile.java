package TestPackages2.TestModulo2;

import Modulo2.Automobile;

public class TAutomobile {
    public static void main(String[] args) throws Exception {
        //Creiamo l'automobile
        Automobile auto = new Automobile("BMW", "X3", 2000, 4.7, 1.9, 15.0, 60.0, 20.0);
        
        System.out.println("Automobile creata con successo! 🚗");

        //Metodo Percorri
        auto.percorri(150); // Percorriamo 150 km
        System.out.println(auto.getQuantitaBenzinaCorrente());
        
        //Metodo rifornimento parziale
        auto.faiBenzina(10);
        System.out.println(auto.getQuantitaBenzinaCorrente());
        
        //Metodo pieno
        auto.faiPieno();
        System.out.println(auto.getQuantitaBenzinaCorrente());
    }
}
