import java.util.ArrayList;

public class Formation {

    private String intitulé;
    private int nbrJours;
    ArrayList<Stagiaire> stagiaires = new ArrayList<>();

    public Formation(String intitulé, int nbrJours, ArrayList<Stagiaire> stagiaires) {
        this.intitulé = intitulé;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires;
    }

    public String getIntitulé() {
        return intitulé;
    }
    public int getNbrJours() {
        return nbrJours;
    }
    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }
    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public double calculerMoyenneFormation(){

        int i = 1;
        double moyenne = stagiaires.get(0).calculerMoyenne();

        while (i < stagiaires.size()) {

            moyenne = moyenne + stagiaires.get(i).calculerMoyenne();
            i++;
        }
        moyenne = moyenne / i;
        return moyenne;
    }

    public Stagiaire afficherNomMax(){

        int i = 0;
        double premier = 0;
        int indexPremier = 0;

        while (i < stagiaires.size()) {

            if (premier < stagiaires.get(i).calculerMoyenne()) {
                premier = stagiaires.get(i).calculerMoyenne();
                indexPremier = i;
            }
            i++;
        }
        return stagiaires.get(indexPremier);
    }

    public double afficherMinMax(){

        Stagiaire premier = afficherNomMax();
        return premier.trouverMin();           

    }

    public double trouverMoyenneParNom(String nom){

        int i = 0;

        while (i < stagiaires.size()) {
            
            if (nom == stagiaires.get(i).getName()) {
                return stagiaires.get(i).calculerMoyenne();
            }
            i++;
        }
        System.out.println("Aucun stagiaire de ce nom dans la formation");
        return 0.0;
    }
}

