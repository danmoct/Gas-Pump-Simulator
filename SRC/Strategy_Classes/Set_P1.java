
package Strategy_Classes;

import Data_Store_Classes.*;

//strategy pattern

public class Set_P1 extends Set_Price{
    
    public void set_price(int g, int M, Data_Store d)
    {
        float gprice= (float) 0.0;
        
        switch(g)
        {
            case 1:                 //Regular gas
            {
                if( M ==1)
                {
                    gprice = (float) ((1.1) * (float)(d.get_Data("Rprice")));
                }
                else
                    gprice = (float) d.get_Data("Rprice");
                System.out.println("\nREGULAR GAS SELECTED.\n");
                break;
            }
            
            case 2:                 //Super gas
            {
                if( M ==1)
                {
                    gprice = (float) ((1.1) * (float)(d.get_Data("Sprice")));
                }
                else
                    gprice = (float) d.get_Data("Sprice");
                System.out.println("\nSUPER GAS SELECTED.\n");
                break;
            }
            case 3:                 //Premium gas
            {
                if( M ==1)
                {
                    gprice = (float) ((1.1) * (float)(d.get_Data("Pprice")));
                }
                else
                    gprice = (float) d.get_Data("Pprice");
                System.out.println("\nPREMIUM GAS SELECTED\n");
                break;
            }
            case 4:                 //Diesel
            {
                if( M ==1)
                {
                    gprice = (float) ((1.1) * (float)(d.get_Data("Dprice")));
                }
                else
                    gprice = (float) d.get_Data("Dprice");
                System.out.println("\nDIESEL GAS SELECTED\n");
            }
            
        }
        
        d.set_Data((float) gprice, "price");
       
    }
    
}
