package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class ID_1 extends Initialize_Data
{
	public void initialize_data(Data_Store d){
            d.set_Data((float) 0.0, "price");
	}
}