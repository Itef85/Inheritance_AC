package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){
        ArrayList<Event> allEvents = new ArrayList<>();
        //main event and curry truck
        allEvents.add(new MainStageEvent ( "Walk Off The Earth", "Music"));
        allEvents.add(new MainStageEvent ( "The Black Pumas", "Music"));
        allEvents.add(new NonMusicEvent ( "Curry Connection", "Food Truck", "Truck 9"));
        allEvents.add(new MainStageEvent( "Cold Play", "Music"));
        allEvents.add(new MainStageEvent( "Taylor Swift", "Music"));
        allEvents.add(new MainStageEvent( "Johnny Stimson", "Music"));
        //CraftBooths
        allEvents.add(new craftBooths( "Sallys Strings", "Craft", "Booth 1"));
        allEvents.add(new craftBooths( "Dollys Dolls", "Craft", "Booth 2"));
        allEvents.add(new craftBooths( "Biancas Bracelets", "Craft", "Booth 3"));
        allEvents.add(new craftBooths( "Wendys WindChimes", "Craft", "Booth 4"));
        allEvents.add(new craftBooths( "Kents KeyChains", "Craft", "Booth 5"));
        //smallStage
        allEvents.add(new SmallStage( "Caity Krone", "Music", 1));
        allEvents.add(new SmallStage( "Mimi Bay", "Music", 1));
        allEvents.add(new SmallStage( "Holland Teed", "Music", 1));
        allEvents.add(new SmallStage( "Tank and The Bangas", "Music", 4));
        allEvents.add(new SmallStage( "jakubi", "Music", 5));







        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");
//        ((MainStageEvent)allEvents.get(1)).addTech("Nothing");

        for (int i = 0; i < allEvents.size(); i++) {

            System.out.println(allEvents.get(i).getEventName());

            if(allEvents.get(i) instanceof MainStageEvent ) {
                ((MainStageEvent)allEvents.get(i)).printTech();
            };


        }//for

        while (true) {
            System.out.println();
            System.out.println("Press 1 To Add An Event.\nPress 2 to Search for Event\nPress 3 to Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {


                System.out.println("What type of Event is this? \nMainStage\nSmallStage\nCraft");
                String event = Library.input.nextLine();

                if (event.equalsIgnoreCase("MainStage")) {
                    System.out.println("What Is The Name of The Proformers");
                    String name = Library.input.nextLine();
                    System.out.println("What Type of Proformace is it ");
                    String type = Library.input.nextLine();
                    allEvents.add(new MainStageEvent(name, type));

                    for (int i = 0; i < allEvents.size(); i++) {

                        System.out.println(allEvents.get(i).getEventName());

                    }//for

                } else if (event.equalsIgnoreCase("SmallStage")) {
                    System.out.println("What Is The Name of The Proformers");
                    String name = Library.input.nextLine();
                    System.out.println("What Is The type of Proformance");
                    String type = Library.input.nextLine();
                    System.out.println("How many Members?");
                    int nummem = Library.input.nextInt();

                    allEvents.add(new SmallStage(name, type, nummem));

                    for (int i = 0; i < allEvents.size(); i++) {

                        System.out.println(allEvents.get(i).getEventName());

                    }//for

                } else if (event.equalsIgnoreCase("Craft")) {
                    System.out.println("What is The Name of The Booth?");
                    String Name = Library.input.nextLine();

                    allEvents.add(new craftBooths(Name, "Craft", "empty booth"));

                    for (int i = 0; i < allEvents.size(); i++) {

                        System.out.println(allEvents.get(i).getEventName());

                    }//for

                }

            } else if (choice == 2){

                System.out.println("What is The Name of The Event?");
                String Name = Library.input.nextLine();

                int foundIndex = searchByName(allEvents, Name);
                if(foundIndex > -1  ){



                if(allEvents.get(foundIndex) instanceof MainStageEvent){
                    System.out.println("yup");
                } else  if(allEvents.get(foundIndex) instanceof craftBooths){
                    System.out.println("yup4");
                } else if(allEvents.get(foundIndex) instanceof NonMusicEvent){
                    System.out.println("yup2");
                } else if(allEvents.get(foundIndex) instanceof SmallStage){
                    System.out.println("yup3");
                }






                }else{
                    System.out.println(foundIndex);
                    System.out.println("Team not found please try again");
                }


            } else {

                break;
            }
        }

    }//run


    public static int searchByName( ArrayList<Event> list, String searchTerm ){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase( list.get(i).getEventName() )){
                return i;
            }
        }
        return -1;
    }


}//class
