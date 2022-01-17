import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        // Question 10 :

        /* Créations des tableaux de double notes1, notes2, notes3
        et ajout de valeurs réprésentant les notes d'un stagiaire */

        ArrayList<Double> notes1 = new ArrayList<>();
        ArrayList<Double> notes2 = new ArrayList<>();
        ArrayList<Double> notes3 = new ArrayList<>();
        notes1.add(10.0); notes1.add(0.0);
        notes2.add(20.0); notes2.add(17.0);
        notes3.add(5.0); notes3.add(10.0);

        /* Instanciation de la classe Stagiaire : 
        stagiaire1, stagiaire2, stagiaire3 (Théo, Paul, Aymeric) */

        Stagiaire stagiaire1 = new Stagiaire("Théo", notes1);
        Stagiaire stagiaire2 = new Stagiaire("Paul", notes2);
        Stagiaire stagiaire3 = new Stagiaire("Aymeric", notes3);

        /* Création d'un tableau de Stagiaire avec les 3 instances crées */
        
        ArrayList<Stagiaire> stagiairesList = new ArrayList<>();
        stagiairesList.add(stagiaire1);
        stagiairesList.add(stagiaire2);
        stagiairesList.add(stagiaire3);

        /* Instanciation de la classe Formation, la "Licence" contient les 3 stagiaires */

        Formation formation1 = new Formation("Licence", 250, stagiairesList);

        /* Test des différentes méthodes */
        
        System.out.println("Moyenne de " +stagiaire1.getName()+ " est : " +stagiaire1.calculerMoyenne());
        System.out.println("Meilleur note : " +stagiaire1.trouverMax()+ " / Pire note : " +stagiaire1.trouverMin());
        System.out.println("Moyenne de " +stagiaire2.getName()+ " est : " +stagiaire2.calculerMoyenne());
        System.out.println("Moyenne de " +stagiaire3.getName()+ " est : " +stagiaire3.calculerMoyenne());
        System.out.println("Moyenne de la formation " +formation1.getIntitulé()+ " est : " +formation1.calculerMoyenneFormation());
        System.out.println("Le premier de la formation est : " +formation1.afficherNomMax().getName());
        System.out.println("La pire note du premier de la formation est : " +formation1.afficherMinMax());
        System.out.println("La moyenne de théo est : " +formation1.trouverMoyenneParNom("Théo"));

    }
}