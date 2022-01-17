public class Divertissement extends Emission {

    // Attributs

    private static int duration = 2;
    private String animator;

    // Constructeur

    public Divertissement(String name, String animator) {
        this.animator = animator;
        this.name = name;
        this.end = start + duration;
    }

    // Verifie si l'émission est programmable et si elle l'est, retourne true
    /* Un divertissement est programmable que dans 1 cas : 
        - Ils ne sont programmables seulement entre 18h et 23h
    */

    public boolean Programmer(int start){
        if (start >= 18 && (start + duration) <= 23) {
            this.start = start;
            this.end = start + duration;
            return true;
        }
        else {
            return false;
        }
    }

    // Affiche les informations sur le divertissement

    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("présenté par " +animator);
    }
}
