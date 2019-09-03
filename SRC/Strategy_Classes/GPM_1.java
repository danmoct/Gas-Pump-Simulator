package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class GPM_1 extends Gas_Pump_Msg
{
	public void gas_pump_msg(Data_Store d)
        {
            int gallons = (int) d.get_Data("G");
            float total = (float) d.get_Data("total");
             System.out.println("\nGas pumped: " + gallons + " gallons \t \t \t Current total: " + total + "\n");
                    
	}
}