package MDA_EFSM;

import OP.OP;

//state pattern design

public class Start extends State
{
    public Start (OP o)
    {
        O = o;
    }
    
    public void activate()
    {
        O.store_Price();
        System.out.println("\nGAS PUMP ACTIVATED\n");
    }
}