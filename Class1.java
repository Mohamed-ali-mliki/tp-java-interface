public class Class1 {
    {
        public static void main (String[]args){
        Magasin CBA1 = new Magasin();
// les produits a vendre
        CBA1.Ae[0] = new ArticleElectromenager(27000, 35000, "télé", "Samsung");
        CBA1.Ae[1] = new ArticleElectromenager(5000, 15000, "radio", "Sony");
        CBA1.Ap[0] = new ArticlePrimeur(100, 200, "tomate", "Elore MgTsz");
        CBA1.Ap[1] = new ArticlePrimeur(50, 500, "tomate", "Avanti Sarl, Esapgne");
// remplir les stocks
        for (int i = 0; i < CBA1.choixE; i++) CBA1.Depense += CBA1.Ae[i].RemplirStock(50);
        for (int i = 0; i < CBA1.choixP; i++) CBA1.Depense += CBA1.Ap[i].RemplirStock(100);
        // avoir les info
        CBA1.info();
    }
    }
}
