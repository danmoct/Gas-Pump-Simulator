
package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class STP_1 extends Store_Pin{
    
    public void store_pin(Data_Store d)
    {
        
        String tpin = (String) d.get_Data("temp_p");
        
        d.set_Data(tpin, "pin");
        
    }
    
}
