package NetworkMessage;
import Utilities.Library;

import java.util.ArrayList;


public class NetworkMessageMain {

    public static void run() {

        ArrayList <As1_Message> allMessages = new ArrayList();

        allMessages.add(new As1_Message("Client3: repeated login failure"));
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
                System.out.println("what is the message?");
                String newMessage = Library.input.nextLine();
                allMessages.add(new As1_Message(newMessage));


            } else if (option == 2) {
               boolean num = false;
                System.out.println("Security Message\tMachine ID\t  Machine Type");
                for (int i = 0; i < allMessages.size(); i++) {
                    //System.out.println(allMessages.get(i).getMessage());
                    for (int j = 0; j < allMessages.get(i).getMessage().length(); j++) {
                       if(num == false && allMessages.get(i).getMessage().charAt(j) == '0' ||allMessages.get(i).getMessage().charAt(j) == '1' || allMessages.get(i).getMessage().charAt(j) == '2' || allMessages.get(i).getMessage().charAt(j) == '3' || allMessages.get(i).getMessage().charAt(j) == '4' || allMessages.get(i).getMessage().charAt(j) == '5' || allMessages.get(i).getMessage().charAt(j) == '6' || allMessages.get(i).getMessage().charAt(j) == '7' || allMessages.get(i).getMessage().charAt(j) == '8' || allMessages.get(i).getMessage().charAt(j) == '9'){
                          num = true;
                           String first = allMessages.get(i).getMessage().substring(0, j);
                                String tfirst = first.trim();
                           String mid = allMessages.get(i).getMessage().substring(j, j+1);
                                String tmid = mid.trim();
                           String last = allMessages.get(i).getMessage().substring(j+2, allMessages.get(i).getMessage().length());
                                String tlast = last.trim();

                           System.out.println(tfirst + "___" + tmid + "___" + tlast + ".");
                       }
                    }

                }

            } else if (option == 3) {

            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//run






}//class