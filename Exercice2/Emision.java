abstract class Emission { 
    
    protected String name; 
    protected int start = -1;
    protected int end;
    protected int duration;

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
