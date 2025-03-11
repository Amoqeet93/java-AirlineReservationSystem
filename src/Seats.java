import java.util.Arrays;
import java.util.Scanner;

public class Seats {
    private int selectedSeat;
    boolean[] seats = new boolean[10];



    public void reserveSeats() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seat number: ");
        selectedSeat = input.nextInt();

        if (seats[selectedSeat - 1] == false) {
            seats[selectedSeat - 1] = true;
            System.out.println("This seat is available");
        } else {
            System.out.println("This seat is unavailable");
        }

    }

    public void viewAllSeats(){
        for(int i = 0 ; i < seats.length; i++){
            System.out.println("The seat at number " + (i + 1) + " - " );
            if(seats[i] == true){
                System.out.println("Reserved");
            } else{
                System.out.println("Available");
            }
        }
    }

}

