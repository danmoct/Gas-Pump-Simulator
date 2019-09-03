package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class PG_2 extends Pump_Gas_Unit
{
	public void pump_gas_unit(Data_Store d)
        {
            
            int liters = (int) d.get_Data("L");
            liters = liters + 1;
            
            d.set_Data(liters,"L");
            float total = liters * ((float) d.get_Data("price"));
            
            d.set_Data(total, "total");
	}
}