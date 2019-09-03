package MDA_EFSM;

import OP.OP;

//state pattern design

public class S1 extends State
{
    public S1 (OP o)
    {
        O = o;
    }
    
    
	public void payType(int t)
        {
            switch (t)
            {
                case 1:
                    System.out.println("\n\nCHECKING CARD. PLEASE WAIT\n\n");
                    break;
                case 2:
                    O.store_cash();
                    O.display_menu();
                   
                    break;
                case 3:
                    O.enter_pin();
                    O.store_pin();
                    break;
            }
        }
}