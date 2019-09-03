package MDA_EFSM;

import OP.OP;

//state pattern design

public class S6 extends State
{
    
    public S6 (OP o)
    {
        O = o;
    }
    
    
    public void receipt()
    {
        O.return_cash();
        O.print_receipt();
       
    }

    public void noReceipt()
    {
       System.out.println("\nNO RECEIPT SELECTED.\n"); 
       O.return_cash();
    }

}