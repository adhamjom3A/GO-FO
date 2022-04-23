package com.company;
/**
 *
 * @author Walid mohamed ibrahim
 * @author adham mohamed gomaa
 * @version 1.1
 * @since june 2021
 */

import java.util.ArrayList;

/**
 * store all player functions
 */

public class Player  {

    /**
     * @param data aggregated from class userdata to take the data of the user
     * @param requestes aggregated from class Requests to store all the player requests in array
     * @param Books aggregated from class Requests to store all the player booking requests in array
     */
    UserData data;
    ArrayList<Requestes> requests;
    ArrayList<Requestes> Books;

    /**
     * @param location descrippe the playground place
     * @return null
     */
    public
    Playground SearchByLocation(Location location) {
        return null;
    }

    /**
     *
     * @param Price descripe the playground cost to be paid
     * @return null
     */
    Playground SearchByPrice(int Price) {
        return null;
    }

    /**
     *
     * @param time to make user able to search by range of time aavailable for him
     * @return null
     */
    Playground SearchByTime(Time time) {
        return null;
    }

    /**
     * this function descripes the procces of adding new requests and send them to playgrounds owners
     * @param Player allows player to request booking playground
     * @param playground object from class Playground to view avilable hours of booking to the player
     */
    void AddNewRequest(String Player,Playground playground)
    {
        playground.viewAllEmptyhours();
        Requestes NewRequest=new Requestes();
        Time time=new Time();
        time.EnterDataTime();
        NewRequest.player=Player;
        NewRequest.playground=playground.name;
        NewRequest.time=time;
        NewRequest.status=RequestStatus.pendingRequest;
        playground.Books.add(NewRequest);
        System.out.println("Request is become pendingRequest");
    }


}
