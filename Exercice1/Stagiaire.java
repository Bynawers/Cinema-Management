import java.util.ArrayList;

public class Stagiaire {
    
    // Attributs (Question.2)

    private String name;
    private ArrayList<Double> notes = new ArrayList<>();

    // Getters et Setters (Question.2)

    public String getName() {
        return name;
    }
    public ArrayList<Double> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Constructeur (Question.3)
    
    public Stagiaire(String name, ArrayList<Double> notes){
        this.name = name;
        this.notes = notes;
    }

    // Retourne la moyenne d'un stagiaire (Question.4)

    public Double calculerMoyenne(){

        int i = 0;
        Double moyenne = 0.0;

        while (i < (notes.size())) {
            moyenne = moyenne + notes.get(i);
            i++;
        }
        moyenne = moyenne / i;
        return moyenne;
    }

    // retourne la note max du stagiaire (Question.5)

    public Double trouverMax(){

        int i = 1;
        double max = notes.get(0);

        while (i < notes.size()) {

            if (max < notes.get(i)){
                max = notes.get(i);
            }
            i++;
        }
        return max;
    }

    // retourne la note min du stagiaire (Question.5)

    public Double trouverMin(){

        int i = 1;
        double min = notes.get(0);

        while (i < notes.size()) {

            if (min > notes.get(i)){
                min = notes.get(i);
            }
            i++;
        }
        return min;
    }
}

