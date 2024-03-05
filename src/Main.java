// Gracie Hackworth, ALC, March 5th, 2024
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> personList = new ArrayList<>();



        //contact, no business
        Contact person1 = new Contact("Akira", "AkiraAkira@gmail.com");
        Contact person2 = new Contact("Ren","Ren@Persona5.com");

        //business
        Business person3 = new Business("Marayuki", "TheCounselor@Persona5.com","55502224444");


        //user input
        Scanner input = new Scanner(System.in);

        //retrieves user name
        System.out.println("What's your name?");
        String userName = input.nextLine();

        //retrieves user email
        System.out.println("What's your email?");
        String email = input.nextLine();

        //retrieves user phone number
        System.out.println("What's your phone number?");
        String phoneNum = input.nextLine();

        //creates an object using user's input
        Business user = new Business(userName,email,phoneNum);

        //adds all people to list
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(user);

        //display list
        System.out.println("\n*****Contact Information*****\n");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}

