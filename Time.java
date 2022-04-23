package com.company;
/**
 *  this will implement the playground class
 * @author Walid mohamed ibrahim
 * @author adham mohamed gomaa		   
 * @version 1.1
 * @since june 2021
 */


/**
 * @param availableHours to detect the hours available
 * @param From_clock and To_clock is to determine range time of booking
 * @param Booked to describe booking process and confirm it
 *
 */
import java.util.Scanner;

/**
 *  diplay the hours availabl for  booking
 */
public class Time {
    Scanner Scan=new Scanner(System.in);


    /**
     * @param availableHours to detect the hours available
     * @param From_clock and To_clock is to determine range time of booking
     * @param Booked to describe booking process and confirm it
     *
     */
    int availableHours;
    int From_clock;
    int To_clock;
    int Booked;

    /**
     * asks the user to enter the details of booking to view the available playgrounds
     */
    void EnterDataTime()
    {
        System.out.println("availableHours :");
        availableHours=Scan.nextInt();
        System.out.println("From_clock :");
        From_clock=Scan.nextInt();
        System.out.println("To_clock :");
        To_clock=Scan.nextInt();
    }

    /**
     * diplay the hours available to reserve and your booking range time
     */

    void DisplayTime()
    {
        System.out.println("availableHours :"+availableHours);
        System.out.println("From_clock :"+From_clock);
        System.out.println("To_clock :"+To_clock);

    }
}
