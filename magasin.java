public class magasin {
    public static int choixE = 2;
    public static int choixP = 2;
    public double Revenu;
    public double Depense;
    public ArticleElectromenager[] Ae;
    public ArticlePrimeur[] Ap;

    // constructeur
    public magasin() {
        Ae = new ArticleElectromenager[choixE];
        Ap = new ArticlePrimeur[choixP];
        Revenu = 0;
        Depense = 0;
    }

    // méthodes
    public double rendement() {
        return (Revenu - Depense) / Depense;
    }
}
public void info() {
    System.out.println("Les depenses du magasin: " + Depense);
    System.out.println("Les revenus du magasin: " + Revenu);
    System.out.println("Le rendement" + rendement());
    for (int i = 0; i < choixE; i++) Ae[i].info();
    for (int i = 0; i < choixP; i++) Ap[i].info();
}
