
package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class RC_1 extends Return_Cash{
    
    public void return_cash(Data_Store d)
    {
        float total1 = (float) d.get_Data("total");
        float cash1 = (float) d.get_Data("cash");
        float refund = cash1 - total1;
        d.set_Data((float) refund, "cash");
        System.out.println("\nCash Returned: " + refund);
        
    }
    
}
