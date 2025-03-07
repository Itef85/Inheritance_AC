package FamilyTree;

import java.util.ArrayList;

public class FamilyTreeMain {

    public static void run(){

        Person person1 = new Person("Bobbie", "Mexico");
        person1.addChild(    new Person("Susan", "Canada")   );
        person1.addChild(    new Person("Jill", "Canada")   );
        person1.addChild(    new Person("Bobette", "Germany")   );
//generation 2
        //add child to Susan
        person1.children.get(0).addChild( new Person("Zain","Germany")  );
        //add child to Jill
        person1.children.get(1).addChild( new Person("Atticus","USA")  );
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
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Lucy", "Canada") );
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Lucy", "UK") );


    }//run

   public static int countFamily (Person ptemp){
        int num = 0;

        return num;
   };//countfamily

    public static void printCanadians(Person Ptemp){


    };//printcanadians

    public static String printFamily(Person ptemp){




    };//printfamily



}//class
