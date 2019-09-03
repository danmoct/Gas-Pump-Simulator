package MDA_EFSM;

import OP.OP;

//state pattern design

public class S7 extends State
{
    
    public S7 (OP o)
    {
        O = o;
    }
    
    public void incorrect_Pin()
    {
        O.wrong_pin_msg();
    }

    public void correct_Pin()
    {
        O.display_menu();
    }

}