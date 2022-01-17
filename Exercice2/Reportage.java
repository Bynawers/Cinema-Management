public class Reportage extends Emission {

    private String theme;

    public Reportage(String name, int duration, String theme){
        this.name = name;
        this.duration = duration;
        this.theme = theme;
        this.end = start + duration;
    }

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

    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("Thème : " +theme);
    }
}
