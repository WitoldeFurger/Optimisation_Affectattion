public class Etudiant {
    //Attributs:
    String login;
    Choix choix;
    Boolean connected;
    AffectationEtudiant affectation;


    //Get and Set:

    public AffectationEtudiant getAffectation() {
        return affectation;
    }
    public void setAffectation(AffectationEtudiant affectation) {
        this.affectation = affectation;
    }

    public Choix getChoix() {
        return choix;
    }
    public void setChoix(Choix choix) {
        this.choix = choix;
    }

    public Boolean getConnected() {
        return connected;
    }
    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    //Methodes:
    
}
