package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class SI_2 extends Set_Init_Values
{
	public void set_init_values(Data_Store d)
        {
             d.set_Data((int)0, "L");
            d.set_Data((float) 0, "total");

	}
}