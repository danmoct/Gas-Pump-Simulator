package MDA_EFSM;

import OP.*;

//MDA_EFSM Class and the context class for state pattern 
public class MDA_EFSM
{
	
	private State current_state;
	private State[] s = new State[9];
	private int m;

	public MDA_EFSM(State [] st)
	{
           s = st;
           current_state= s[0];
           m=1;
	}
        
	public void activate()
	{
            if(current_state == s[0])
            {
                current_state.activate();
                current_state= s[1];  // s[0] in our state and class diagram
                
                        
            }
            
	}

	public void start()
	{
            if (current_state ==s[1])
            {
               
                current_state.start();
                current_state = s[2]; //s[1] in or diagram
            }
	}

	public void payType(int t)
	{
            if (current_state==s[2])
            {
                current_state.payType(t);
                switch(t)
                {
                    case 1:                 //credit
                    {   
                        
                        current_state=s[3]; // s[2] in diagram
                        
                        break;
                    }
                    case 2:                 //cash
                    {
                        m=0;
                        current_state= s[4]; //s[3] in diagram
                        break;
                    }    
                    case 3:                 //debit
                    {
                        current_state= s[8]; //s7 in class diagram (or s[8] in state diagram)
                    
                    }
                }
            }
                    
                    
	}

	public void approved()          //card approved
	{
            if(current_state == s[3])
            {
                
                current_state.approved();
                current_state = s[4];
                
            }
	}

	public void reject()            //card rejected
	{
            if(current_state == s[3])
            {
                current_state.reject();
                current_state = s[1];
            }
	}

	public void select_Gas(int g) //1= regular, 2= super, 3= premium, 4 = diesel
	{
            if(current_state == s[4])
            {    
                current_state.select_Gas(g,m);
            }
             // does not change states, gas selected
	}

	public void cancel()
	{
            if(current_state == s[4])
            {  
                current_state.cancel();
                current_state = s[1];  // S0
            }
	}

	public void Continue()
	{
            if(current_state == s[4])
            {  
                current_state.Continue();
                current_state = s[5];  // goto s4 
            }
	}

	public void start_Pump()
	{
            if(current_state == s[5])
            {  
                current_state.start_Pump();
                current_state = s[6];   //go to s5 to begin pumping
            }
	}

	public void pump()
	{
            if(current_state == s[6])
            {  
                current_state.pump();   //no state change
            }
	}

	public void stop_Pump()
	{
            if(current_state == s[6])
            {  
                current_state.stop_Pump();
                current_state = s[7];   //stop pumping, go to s6
            }
	}

	public void receipt()
	{
            if(current_state == s[7])
            {  
                current_state.receipt();
                current_state = s[1];   //end transaction
            }
	}

	public void noReceipt()     
	{
            if(current_state == s[7])
            {  
                current_state.noReceipt();
                current_state = s[1];   //end transaction
            }
	}

	public void incorrect_Pin() //cancel transaction
	{
            if(current_state == s[8])
            {
                current_state.incorrect_Pin();
                current_state = s[1];   //end transaction
            }
	}

	public void correct_Pin()
	{
            if(current_state == s[8])
            {
                current_state.correct_Pin();
                current_state = s[4];  //  s3
            }
	}

}