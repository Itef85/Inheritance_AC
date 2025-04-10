package FamilyTree;

import Utilities.Library;

import java.util.ArrayList;

//import Utilities.Library;

public class FamilyTreeMain {

    public static void run() {

        Person person1 = new Person("Bobbie", "Mexico");
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Germany"));
//generation 2
        //add child to Susan
        person1.children.get(0).addChild(new Person("Zain", "Germany"));
        //add child to Jill
        person1.children.get(1).addChild(new Person("Atticus", "IceLand"));
        //add child to Bobette
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
//generation 3
        //add child to Zain
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        //add children to Atticus
        person1.children.get(1).children.get(0).addChild(new Person("Bella", "USA"));
        //add child to Bob
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        //add child to Jasmine
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
//generation 4
        //add child to Bella
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Lucy", "Canada"));
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Ryder", "UK"));

        person1.addChild(new Person("Hans", "Canada")); //- 4th child
        person1.children.get(3).addChild(new Person("Alan", "England"));  //Hans' child



        printFamily(person1);
        System.out.println(countFamily(person1) + " People in total");
        System.out.println("People who live in Canada");
        printCanadians(person1);
        System.out.println("Who do you want to search by?");
        printFromHere(person1);


    }//run


    public static void printCanadians(Person Ptemp) {

        if (Ptemp.getCountry().equalsIgnoreCase("canada")) {
            System.out.println(Ptemp.getName());
            for (int i = 0; i < Ptemp.children.size(); i++) {
                printCanadians(Ptemp.children.get(i));
            }
        } else {
            for (int i = 0; i < Ptemp.children.size(); i++) {
                printCanadians(Ptemp.children.get(i));
            }
        }


    }

    ;//printcanadians

    public static int countFamily(Person ptemp) {
        int num = 1;

        if (ptemp.children.size() > 0) {
            for (int i = 0; i < ptemp.children.size(); i++) {
                num += countFamily(ptemp.children.get(i));
            }
        }


        return num;

    }

    ;//countfamily


    public static String printFamily(Person ptemp) {

        if (ptemp.children.size() == 0) {
            System.out.println(ptemp.getName());
        } else {
            System.out.println(ptemp.getName());
            for (int i = 0; i < ptemp.children.size(); i++) {
                printFamily(ptemp.children.get(i));
            }
        }

        return "";
    }

    ;//printfamily

    public static void printFromHere(Person ptemp){

        String who = Library.input.nextLine();
        searchByPerson(ptemp, who);




    }



    public static int searchByPerson(Person ptemp, String searchTerm ){

    if( ptemp.getName().equalsIgnoreCase(searchTerm)){
        printFamily(ptemp);
    }else{
        for (int i = 0; i < ptemp.children.size(); i++) {
            searchByPerson(ptemp.children.get(i), searchTerm);
        }
    }




return -1;
}//class


}//main
