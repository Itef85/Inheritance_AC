package Ex1_Animals;

import java.util.ArrayList;

public class Ex1_Main {
    public static void run(){
        ArrayList<Animal> allAnimals = new ArrayList<>();

        allAnimals.add(new Animal("peppy") );
        allAnimals.add(new Dog("Scout") );
        allAnimals.add(new Rotweiller("Rubble") );
        allAnimals.add(new Shihtzu("Bubbles") );
        allAnimals.add(new Trout("Slippery") );
        allAnimals.add(new Baboon("Chuckles", 750));

//        for(int i=0;i<allAnimals.size();i++){
////            System.out.println(allAnimals.get(i));
//            allAnimals.get(i).talk();
//        }//for


        System.out.println("What dose the dogs say?");
        for(int i=0;i<allAnimals.size();i++){

            if(   allAnimals.get(i) instanceof Dog  ) {
                allAnimals.get(i).talk();
            }


        }//for


        System.out.println( allAnimals.get(5));
        System.out.println();
        System.out.println("Stupid AP Question #1");
        Animal a = new Rotweiller("AngeryDog");
//        Rotweiller b = new Dog("butch");
        a.talk();


    }//run

}//main
