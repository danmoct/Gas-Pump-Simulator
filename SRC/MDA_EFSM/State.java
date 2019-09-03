package MDA_EFSM;

import OP.*;

public class State
{
        
	OP O;
       //state pattern design
        
        
        

	public void activate(){ System.out.println("wrong state");};
	public void start(){};
	public void payType(int a){};
	public void approved(){};
	public void reject(){};
	public void select_Gas(int g, int m){};
	public void cancel(){};
	public void Continue(){};
	public void start_Pump(){};
	public void pump(){};
	public void stop_Pump(){};
	public void receipt(){};
	public void noReceipt(){};
	public void incorrect_Pin(){};
	public void correct_Pin(){};
}