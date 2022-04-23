package com.company;
/**
 *  this will implement the playground class
 * @author Walid mohamed ibrahim
 * @author adham mohamed gomaa
 * @version 1.1
 * @since june 2021
 */

/**
 * the admin operates the playground as he can Activate,Suspend or even Delete the playground
 * using operation playground
 */
public class Administrator {
   UserData data;
   public void DeletePlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.DeletePlayground;
   }
   public void ActivePlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.ActivePlayground;
   }
   public void SuspendPlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.SuspendPlayground;
   }
}
