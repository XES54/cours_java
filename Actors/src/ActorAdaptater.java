public class ActorAdapter {

    static FrenchActor adaptToFrench(EnglishActor englishActor){
        return new FrenchActor(englishActor.firstname, englishActor.lastname);
    }

    static EnglishActor adaptToEnglish(FrenchActor frenchActor){
        return new EnglishActor(frenchActor.prenom, frenchActor.nom);
    }
}