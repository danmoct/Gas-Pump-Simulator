package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class GPM_2 extends Gas_Pump_Msg
{
	public void gas_pump_msg(Data_Store d)
        {
            int liters = (int) d.get_Data("L");
            float total = (float) d.get_Data("total");
            System.out.println("Gas pumped: " + liters + " liters \t \t \t Current total: " + total);
	}
}