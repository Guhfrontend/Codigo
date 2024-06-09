package br.com.todolist;

import br.com.todolist.Model.Entites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scan.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scan.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scan.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Enter data to update the reservation: ");
            System.out.print("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }

    }
}
