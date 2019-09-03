package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class SC_1 extends Store_Cash
{
	public void Store_Cash(Data_Store d)
	{
            float fcash;
            
            fcash = (float) d.get_Data("temp_cash");
            d.set_Data((float) fcash, "cash");
	}
}