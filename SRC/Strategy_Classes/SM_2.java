
package Strategy_Classes;


//strategy pattern

public class SM_2 extends Stop_Msg {
    
    public void stop_msg()
    {
        System.out.println("\nPUMP STOPPED.  Would you like a receipt?");
        System.out.println("Receipt");
        System.out.println("NoReceipt\n");;
        
    }
    
}
