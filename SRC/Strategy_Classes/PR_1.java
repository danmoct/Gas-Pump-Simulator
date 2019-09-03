
package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class PR_1 extends Print_Receipt{
    
    public void print_receipt(Data_Store d)
    {
        System.out.println("\n\t\t\tReceipt");
        System.out.println("\nGallons Sold: " + d.get_Data("G"));
        System.out.println("Total: " + d.get_Data("total"));
        System.out.println("Thank you for your business \n \n \n");
        
        
    }
    
}
