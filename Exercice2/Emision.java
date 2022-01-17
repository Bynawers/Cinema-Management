abstract class Emission { 
    
    // (name) = nom / (start) = heure de début / (end) = heure de fin / (duration) = durée de l'émission

    protected String name; 
    protected int start = -1;
    protected int end;
    protected int duration;

    // Retourne vrai si l'emission est programmé et faux si elle ne l'est pas
    /* la valeur par défaut de l'heure du début (start) est -1,
    donc si (start) est différent de -1, cela signifit que l'émission est programmé */

    public boolean isProgrammed() { 
        if (start != -1){
            return true; 
        }
        else {
            return false;
        }
    }

    public boolean Programmer (int start){
        return false;
    }

    public void Affiche() {
        System.out.println("Emission : " + name);
    }
}
