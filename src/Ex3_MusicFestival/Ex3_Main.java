package Ex3_MusicFestival;

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
        allEvents.add(new craftBooths( "Sally's Strings", "Craft", "Booth 1"));
        allEvents.add(new craftBooths( "Dolly's Dolls", "Craft", "Booth 2"));
        allEvents.add(new craftBooths( "Bianca's Bracelets", "Craft", "Booth 3"));
        allEvents.add(new craftBooths( "Wendy's WindChimes", "Craft", "Booth 4"));
        allEvents.add(new craftBooths( "Kent's KeyChains", "Craft", "Booth 5"));
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







            } else {

                break;
            }
        }

    }//run


}//class
