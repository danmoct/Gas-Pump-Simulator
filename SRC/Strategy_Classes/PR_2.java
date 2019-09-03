
package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class PR_2 extends Print_Receipt {
    
    public void print_receipt(Data_Store d)
    {
        System.out.println("\n\t\t\tReceipt");
        
        System.out.println("Liters Sold: " + d.get_Data("L"));
        System.out.println("Total: " + d.get_Data("total"));
        if(d.get_Data("cash") != null)
        {
            System.out.println("Change: " + d.get_Data("cash"));
        }
        System.out.println("\n\n\nThank you for your business");
           
    }
    
}
