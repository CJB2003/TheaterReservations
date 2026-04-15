package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TheaterApp {

    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        //prompt user to enter name
        System.out.print("Please enter your name: ");
        String userName = myScanner.nextLine();

        //creating array names to split by space
        String[] names = userName.split(" ");
        //I always like checking to see what is being split even if I know
        System.out.println(Arrays.toString(names));
        //variables for storing first and last name from array
        String firstName = names[0];
        String lastName = names[1];


        //prompt user to choose a date in specific format
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String userDate = myScanner.nextLine();

        //prompt user to input how many tickets they want
        System.out.println("How many tickets would you like? ");
        int userTicket = myScanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(userDate, formatter);

        //checks whether user ticket is 1 or any other number changing what is output
        if (userTicket == 1) {
            System.out.println(userTicket + " ticket reserved for " + date + " under " + lastName + ", " + firstName);
        }
        else {
            System.out.println(userTicket + " tickets reserved for " + date + " under " + lastName + ", " + firstName);
        }

    }
}
