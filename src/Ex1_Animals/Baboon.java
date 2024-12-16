package Ex1_Animals;

public class Baboon extends Animal{

    int numBerries;

    public Baboon(  String name, int n  ){

        super(name);
        numBerries = n;

    }//constructor


    public String toString() {
        return  super.name + " Eats " + numBerries + " per day";
    }//toString
}