package MDA_EFSM;

import OP.OP;

//state pattern design

public class S3 extends State
{
    
     public S3 (OP o)
    {
        O = o;
    }
    
    public void select_Gas(int g, int m)
    {
        
        O.set_price(g, m);
        
    }

    public void cancel()
    {
        O.cancel_msg();
    }

    public void Continue()
    {        
        return;
    }
}