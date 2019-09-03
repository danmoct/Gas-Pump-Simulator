package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class SI_1 extends Set_Init_Values
{
	public void set_init_values(Data_Store d)
        {
            d.set_Data(0, "G");
            d.set_Data((float) 0, "total");
	}
}