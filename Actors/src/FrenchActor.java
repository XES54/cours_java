public class FrenchActor {
    String prenom;
    String nom;

    FrenchActor(String prenom,String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    String dire(String phrase, FrenchActor interlocuteur) {
        return prenom + " " + nom + " dit à " + interlocuteur.prenom + " " + interlocuteur.nom;
    }
}


