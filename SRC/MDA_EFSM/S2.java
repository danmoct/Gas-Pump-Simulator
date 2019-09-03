package MDA_EFSM;

import OP.OP;

//state pattern design

public class S2 extends State
{
     public S2 (OP o)
    {
        O = o;
    }
    
    public void approved()
    {
        System.out.println("\n CARD IS APPROVED. \n");
        O.display_menu();
    }

    public void reject()
    {
        
        O.reject_msg();
    }
}