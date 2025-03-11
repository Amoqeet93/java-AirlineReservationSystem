import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Seats seats = new Seats();

        while (true) {

            System.out.println("Please select from the following options: ");
            System.out.println("1. Reserve a seat");
            System.out.println("2. View All Seats");
            System.out.println("3. Exit");

            int userInput = input.nextInt();

            if (userInput == 1) {
                seats.reserveSeats();
            } else if (userInput == 2) {
                seats.viewAllSeats();

            }
        }
//I will be adding the prices of the different seats as well and have a totals at the end.

    }
}