import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 
        Divertissement d1 = new Divertissement("Jeux télévisés", "Andrew Polskiar");
        Fiction f1 = new Fiction("Interstellar", 2, "Christopher Nolan", true, 2014);
        Reportage r1 = new Reportage("Tornado Alley", 1, "Découverte");

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