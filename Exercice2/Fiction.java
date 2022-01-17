public class Fiction extends Emission {

    private int yearsRelease;
    private String realisator;
    private boolean rebroadcast;

    public Fiction(String name, int duration, String realisator, boolean rebroadcast, int yearsRelease) {
        this.name = name;
        this.duration = duration;
        this.realisator = realisator;
        this.rebroadcast = rebroadcast;
        this.yearsRelease = yearsRelease;
        this.end = start + duration;
    }

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
    
    public void Affiche() {
        super.Affiche();
        System.out.println("horraire : " + start + "h à " +end+ "h (" +duration+ "h)");
        System.out.println("réalisé par " +realisator+ " (" +yearsRelease+ ")");
    }
}
