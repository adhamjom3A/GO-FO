package com.company;
/**
 *  this will implement the playground class
 * @author Walid mohamed ibrahim
 * @author adham mohamed gomaa
 * @version 1.1
 * @since june 2021
 */

import java.util.ArrayList;

/**
 * storing all of the data related to users
 */
public class DataStorage {

    /**
     * @param ListOfPerson of type UserData holds list of users information
     * @param ListOfPlayground of type Playground holds list of playgrounds specifications
     */
    ArrayList<UserData> ListOfPerson=new ArrayList<UserData>();
    ArrayList<Playground> ListOfPlayground=new ArrayList<Playground>();

    /**
     * display the playgrounds list
     */
    void DisplayAllPlayground()
    {
        for (Playground N : ListOfPlayground)
        {
            N.DisplayPlayground();
        }
    }

    /**
     *
     * @param id holds the ID of playground as a method to keep it unique
     * @return playgrounds list
     */
    Playground ChoosePlayground(int id)
    {
        return ListOfPlayground.get(Playground.SSn=id);
    }

}
