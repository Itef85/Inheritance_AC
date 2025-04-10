package NetworkMessage;
import Utilities.Library;

import java.util.ArrayList;


public class NetworkMessageMain {

    public static void run() {

        ArrayList <As1_Message> allMessages = new ArrayList();

        allMessages.add(new As1_Message("Client3:repeated login failure"));
        allMessages.add(new As1_Message("Client2:filed password reset on file"));
        allMessages.add(new As1_Message("Server1: file not found"));
        allMessages.add(new As1_Message("Server3: ping not returned"));
        allMessages.add(new As1_Message("Server1:write file error on disk DSK1"));
        allMessages.add(new As1_Message("Server2:disk failure on DSK2"));
        allMessages.add(new As1_Message("Server2:diskette diskette"));
        allMessages.add(new As1_Message("Client3:    diskette disk"));
        allMessages.add(new As1_Message("Router1: missing packet"));
        allMessages.add(new As1_Message("PC4: power surge detected"));





        System.out.println("Assign 1 Network Messages");

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = Library.input.nextInt();
            Library.input.nextLine();
            System.out.println();

            if (option == 1) {
                System.out.println("what is the Message");
                String newMessages = Library.input.nextLine();
                allMessages.add(new As1_Message(newMessages));


            } else if (option == 2) {
               boolean num = false;
                System.out.println("Security Message\tMachine ID\t  Machine Type");

                for (int i = 0; i < allMessages.size(); i++) {
                        String tfirst = allMessages.get(i).getMachineType();
                        String tmid = allMessages.get(i).getMachineId();
                        String tlast = allMessages.get(i).getWarning();

                    System.out.println( tmid   + "___" + tfirst  + "___" + tlast + ".");
                }


            } else if (option == 3) {
                boolean istrue = false;
                System.out.println("what is the error message?");
    String error = Library.input.nextLine();
                System.out.println("what is the keyword?");
    String key = Library.input.nextLine();


                for (int i = 0; i < allMessages.size(); i++ ){
        istrue = scanWarning(error, key);

        if(istrue == true){
            System.out.println(error + " contains the keyWord");
        } else{
        };
    }//for


            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//run


    public static boolean scanWarning(String message, String keyword){

        if(message.contains(keyword)){
            return true;
        }
        else {
            return false;
        }
    };



//public static boolean scanWarning(String message, String keyword){
//
//        if(message.contains(keyword)){
//            return true;
//        }
//        else {
//            return false;
//        }
//    };


//    boolean istrue = false;
//                System.out.println("what is the error message?");
//    String error = Library.input.nextLine();
//                System.out.println("what is the keyword?");
//    String key = Library.input.nextLine();
//
//
//                for (int i = 0; i < allMessages.size(); i++ ){
//        istrue = scanWarning(error, key);
//
//        if(istrue == true){
//            System.out.println(error + " contains the keyWord");
//        } else{
//            System.out.println(error + " dose not contain the keyWord");
//        }
//    }//for
//

        }//class