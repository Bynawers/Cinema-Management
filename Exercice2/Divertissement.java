public class Divertissement extends Emission {

    private static int duration = 2;
    private String animator;

    public Divertissement(String name, String animator) {
        this.animator = animator;
        this.name = name;
        this.end = start + duration;
    }

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

    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("présenté par " +animator);
    }
}
