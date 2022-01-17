public class Reportage extends Emission {

    // Attribut

    private String theme;

    // Constructeur

    public Reportage(String name, int duration, String theme){
        this.name = name;
        this.duration = duration;
        this.theme = theme;
        this.end = start + duration;
    }

    // Verifie si l'émission est programmable et si elle l'est, retourne true
    /* Un reportage est programmable que dans 1 cas : 
        - si ils ne durent qu'une heure ou moins et qu'ils soient dans une heure creuse (14h –18h et 0h-6h)
    */

    public boolean Programmer(int start){
        if (duration <= 1) {

            if ( ( start >= 14 && (start + duration) <= 18 ) || ( start >= 0 && (start + duration) <= 6 ) ) {
                this.start = start;
                this.end = start + duration;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    // Affiche les informations sur le reportage

    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("Thème : " +theme);
    }
}
