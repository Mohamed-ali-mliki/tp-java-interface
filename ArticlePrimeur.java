public class ArticlePrimeur {
    {
        public double stock;
// constructeur
public ArticlePrimeur(double pA, double pV, String n, String f){
        super(pA, pV, n, f);
        stock = 0.0;
    }
        // nouvelles méthodes
        public double RemplirStock(double qte) {
        stock = stock + qte;
        return prixAchat * qte;
    }
// méthode surécrite
        public void info() {
        super.info();
        System.out.println("Le stock du produit est " + stock + "kilogrammes.");
    }
// implementation de l'interface vendableKilo
        public double vendre(double qte){
        if (qte < stock) {
            stock = stock - qte;
            return qte * prixVente;
        } else {
            System.out.println("Stock insuffisant.");
            return 0;
        }
    }
    }
}
