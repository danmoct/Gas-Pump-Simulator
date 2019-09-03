package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class PG_1 extends Pump_Gas_Unit
{
	public void pump_gas_unit(Data_Store d)
        {
            int gallons = (int) d.get_Data("G");
            gallons = gallons + 1;
            d.set_Data(gallons,"G");
            float total = gallons * ((float) d.get_Data("price"));
            d.set_Data(total, "total");

	}
}