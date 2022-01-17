import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Question 2 : Instanciation
        
        Divertissement d1 = new Divertissement("Jeux télévisés", "Andrew Polskiar");
        Fiction f1 = new Fiction("Interstellar", 2, "Christopher Nolan", true, 2014);
        Reportage r1 = new Reportage("Tornado Alley", 1, "Découverte");

        // Question 3 : Programmation des émissions

        System.out.println("------------------");
        System.out.println("Question 3, Programmation des émissions :");
        System.out.println("------------------");

        if (d1.Programmer(18)){
            System.out.println(d1.name+ " programmé");
        }
        else {
            System.out.println(d1.name+ " non programmé");
        }

        if (f1.Programmer(16)){
            System.out.println(f1.name+ " programmé");
        }
        else {
            System.out.println(f1.name+ " non programmé");
        }

        if (r1.Programmer(15)){
            System.out.println(f1.name+ " programmé");
        }
        else {
            System.out.println(f1.name+ " non programmé");
        }

        // Question 3 : Tableau d'Emissions hétérogènes
        /* Parcours le tableau d'émission et vérifie si elles ont été programmées
        Si c'est le cas, affiche les informations sur les émissions */

        System.out.println("------------------");
        System.out.println("Question 3, Création du tableau d'émissions :");
        System.out.println("------------------");

        int i = 0;
        int nbMax = 24; 
        Emission programme[] = new Emission[nbMax];
        programme[0] = d1; 
        programme[1] = f1; 
        programme[2] = r1; 
        int nbEmissions = 3;

        for (i=0; i<nbEmissions; i++){ 

            if (programme[i].isProgrammed()){

                System.out.print("> ");
                programme[i].Affiche();
            }
        }

        // Question 4 : algorithme qui test si il y a superposition d'émissions :
        /* Créer un tableau de boolean initialisé en false, parcours le tableau d'émission, vérifie si l'émision à bien été programmé
        si c'est le cas, récupère l'horraire de diffusion et set true dans le tableau de boolean dans les cases correspondantes.
        Si la valeur est déjà sur true : affiche le message "Superposition à Xh"
        EXEMPLE : Interstelar (16h -> 18h) : p1[16] = true et p1[17] = true */

        System.out.println("------------------");
        System.out.println("Question 4, algo superposition :");
        System.out.println("------------------");

        boolean[] p1 = new boolean [24]; 

        for (i=0; i<24; i++){
            p1[i] = false; 
        }

        for (i=0; i < nbEmissions; i++){

            if ( programme[i].isProgrammed() ) { 

                System.out.println("heure : " + programme[i].start );

                for (int j = programme[i].start; j < programme[i].end; j++){

                    if ( p1[j] == false ){
                        p1[j] = true; 
                    }

                    else {
                    System.out.println("Superposition à" + j + "h");
                    }
                }
            }
        }
        
        // Question 4 : algorithme qui affiche la liste des émissions programmées dans la journée :
        /* Créer un tableau d'entier et initialise sur -1. Parcours le tableau d'émission?
        affiche toutes les émissions qui ont été programmées et affecte les heures en entier
        */

        System.out.println("------------------");
        System.out.println("Question 4, algo liste émissions programmées :");
        System.out.println("------------------");

        int[] p2 = new int [24]; 

        for (i=0; i < 24; i++){
            p2[i] = -1; 
        }

        for (i=0; i < nbEmissions; i++) {

            if ( programme[i].isProgrammed() ) {

                programme[i].Affiche(); 

                for (int j = programme[i].start; j < programme[i].end; j++){

                    p2[j] = i ; 
                } 
            } 
        }

        // Question 4 : algorithme qui affiche heure par heure les émissions programmées :
        /* Parcours le tableau p2 contenant des -1 pour les heures non programmées
        et contenant les valeurs des emplacements des émissions */

        System.out.println("------------------");
        System.out.println("Question 4, algo affiche heure par heure les émissions :");
        System.out.println("------------------");

        for (i=0; i < 24; i++) { 

            System.out.println(i + "h :");

            if (p2[i] != -1){
                programme[p2[i]].Affiche(); 
            }
            else {
                System.out.println("Pas d'émission"); 
            }
        }
    }
}