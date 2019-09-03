package MDA_EFSM;

import OP.OP;

//state pattern design

public class S4 extends State
{
    
    public S4 (OP o)
    {
        O = o;
    }
    
    public void start_Pump()
    {
       
        O.set_init_values();
        O.ready_msg();
    }

}