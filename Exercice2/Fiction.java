public class Fiction extends Emission {

    // Attributs

    private int yearsRelease;
    private String realisator;
    private boolean rebroadcast;

    // Constructeur

    public Fiction(String name, int duration, String realisator, boolean rebroadcast, int yearsRelease) {
        this.name = name;
        this.duration = duration;
        this.realisator = realisator;
        this.rebroadcast = rebroadcast;
        this.yearsRelease = yearsRelease;
        this.end = start + duration;
    }

    // Verifie si l'émission est programmable et si elle l'est, retourne true
    /* Une fiction est programmable dans 2 cas : 
        - Si c'est une rediffusion : peu importe l'heure
        - Si c'est n'est pas une rediffusion : 21h seulement acceptée
    */

    public boolean Programmer(int start){

        if (rebroadcast == false){
            if (start == 21) {
                this.start = start;
                this.end = start + duration;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            this.start = start;
            this.end = start + duration;
            return true;
        }
    }

    // Affiche les informations sur la fiction

    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("réalisé par " +realisator+ " (" +yearsRelease+ ")");
    }
}
