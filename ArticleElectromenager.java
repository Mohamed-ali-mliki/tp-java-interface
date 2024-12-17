public class ArticleElectromenager {
    public class ArticleElectromenager extends Article implements vendablePiece, solde {
        public int stock;

        // constructeur
        public ArticleElectromenager(double pA, double pV, String n, String f) {
            super(pA, pV, n, f);
            stock = 0;
        }

        // nouvelles méthodes
        public double RemplirStock(int qte) {
            stock = stock + qte;
            return prixAchat * qte;
        }

        // méthode surécrite
        public void info() {
            super.info();
            System.out.println("Le stock du produit est " + stock + "pièces.");
        }

        // implementation de l'interface vendablePiece
        public double vendre(int qte) {
            if (qte < stock) {
                stock = stock - qte;
                return qte * prixVente;
            } else {
                System.out.println("Stock insuffisant.");
                return 0;
            }
        }

        // implementation de l'interface solde
        public void StartSolde(double Pourcentage) {
            prixVente -= prixVente * Pourcentage / 100;
        }

        public void EndSolde(double Pourcentage) {
            prixVente += prixVente * Pourcentage / 100;
        }
    }
    }
