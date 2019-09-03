
package Strategy_Classes;


//strategy pattern

public class RM_1 extends Reject_Msg{    
    
    public void reject_msg()
    {
        System.out.println("\nCard rejected.  Transaction canceled.\n");
    }
}
