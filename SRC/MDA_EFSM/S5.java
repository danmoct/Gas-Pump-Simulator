package MDA_EFSM;

import OP.OP;

//state pattern design

public class S5 extends State
{
    public S5 (OP o)
    {
        O = o;
    }
    public void pump()
    {
        O.pump_gas_unit();
        O.gas_pumped_msg();
    }

    public void stop_Pump()
    {
        O.stop_msg();
    }

}