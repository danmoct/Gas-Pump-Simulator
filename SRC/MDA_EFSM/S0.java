package MDA_EFSM;

import OP.*;

//Implementation of State pattern

public class S0 extends State
{
    public S0 (OP o)
    {
        O = o;
    }
    
    @Override
    public void start()
    {
        O.pay_Msg();
        O.initialize_Data();
        
            
    }
}