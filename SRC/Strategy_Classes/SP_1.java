package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern


public class SP_1 extends Store_Price
{
	public void store_price(float a, float b, float c, Data_Store d)
        {
            
            d.set_Data(a, "Rprice");
            d.set_Data(b, "Dprice");
            
	}
}