public class EnglishActor {
    String firstname;

    String lastname;

    EnglishActor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    String say(String sentence, EnglishActor interlocutor){
        return firstname + " " + lastname + " say to" + interlocutor.firstname + " " + interlocutor.lastname;
    };


}
