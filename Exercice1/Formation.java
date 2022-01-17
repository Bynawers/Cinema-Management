import java.util.ArrayList;

public class Formation {

    // Attributs (Question.6)

    private String intitulé;
    private int nbrJours;
    ArrayList<Stagiaire> stagiaires = new ArrayList<>();

    // Constructeur (Question.6)

    public Formation(String intitulé, int nbrJours, ArrayList<Stagiaire> stagiaires) {
        this.intitulé = intitulé;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires;
    }

    // Getters et Setters (Question.6)

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

    // Retourne la moyenne des moyennes des stagiaires (Question.7)
    /* Somme la totalité des moyenne des stagiaires de la formation
    puis les divises par la taille du tableau de stagiaire (nombre de stagiaire) */

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

    // Retourne le premier stagiaire ayant la meilleure moyenne d’une formation (Question.8)
    /* Parcours le tableau de stagiaire de la formation pour trouver la moyenne la plus grande */

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

    // Retourne la note minimale du premier stagiaire ayant la meilleure moyenne d’une formation (Question.9)
    /* Cherche le premier stagiaire de la formation puis retourne sa note minimale*/

    public double afficherMinMax(){

        Stagiaire premier = afficherNomMax();
        return premier.trouverMin();           

    }

    // Retourne la moyenne du premier stagiaire dont le nom est passé en paramètre (Question.10)
    /* Parcours le tableau de stagiaire et cherche si le nom rentré
    en paramètre est égal au nom d'un des stagiaires dans le tableau*/

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

