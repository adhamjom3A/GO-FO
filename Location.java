package com.company;
/**
 *  this will implement the playground class
 * @author Walid mohamed ibrahim
 * @author adham mohamed gomaa
 * @version 1.1
 * @since june 2021
 */
import java.util.Scanner;

/**
 * this class "location" used to know the fixed place of the playground or player
 */
public class Location {

    /**
     * @param Street,City,Governorate helps to detect the exact location
     */
        Scanner Scan=new Scanner(System.in);
        int NumberOfStreet=0;
        String Street="";
        String City="";
        String Governorate="";
        void EnterDataLocation()
        {
            System.out.println("NumberOfStreet :");
            NumberOfStreet=Scan.nextInt();
            System.out.println("Street :");
            Street=Scan.next();
            System.out.println("City :");
            City=Scan.next();
            System.out.println("Governorate :");
            Governorate=Scan.next();
        }

    /**
     * this function is to display the location exactly
     */
    void DisPlayLocation()
        {
            System.out.println("NumberOfStreet :"+NumberOfStreet);
            System.out.println("Street :"+Street);
            System.out.println("City :"+City);
            System.out.println("Governorate :"+Governorate);


        }

}
