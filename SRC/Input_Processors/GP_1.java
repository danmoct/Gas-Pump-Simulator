package Input_Processors;

import Data_Store_Classes.*;
import Abstract_Factory.*;
import MDA_EFSM.*;
import OP.*;

public class GP_1
{
	private MDA_EFSM m;
	private Data_Store d;
        private Abstract_Factory gp1;
        
        
        public GP_1(MDA_EFSM md, Abstract_Factory af,Data_Store ds)
        { 
            gp1 = af; 
            m = md;
            d= ds;
            
        }

	public void activate(float a, float b)
	{
            if((a>0) && (b>0))
            {
                d.set_Data((double) a, "temp_a");
                d.set_Data((double) b, "temp_b");
               
                m.activate(); // calls on activate function of MDA-EFSM
            }
	}
	public void start()
	{	
            m.start(); // calls start on MDA-EFSM
	}
	public void payCredit()
	{
            m.payType(1); //   paytype is credit
	}
	public void reject()
	{
            m.reject();  //reject message 
	}
	public void payDebit(String p)
	{
            d.set_Data(p, "temp_p");
            m.payType(3);
	}
	public void pin(String x)
	{
            
            if(x.equals(d.get_Data("pin")))
            {
                 m.correct_Pin(); //correct pin method called
            }
            else
                m.incorrect_Pin();  //incorrect pin called
                
	}
	public void cancel()
	{
            m.cancel();  //cancel op called on m
	}
	public void approved()
	{
            m.approved();  // approved op called
	}
	public void diesel()
	{
            m.select_Gas(4); //diesel is 4 on selectgas op
	}
	public void regular()
	{
            m.select_Gas(1); //regular is 1 on selectgas op
	}
	public void startPump()
	{
            
            if( (float) d.get_Data("price") > 0)
            {
                 m.Continue();  //continue op
                 m.start_Pump();  //start pump op
            }
	}
	public void pumpGallon()
	{
            m.pump();  //pump op
	}
	public void stopPump()
	{
            m.stop_Pump();  //stop pump op
            m.receipt();  // receipt op
	}
	public void fullTank()
	{
            m.stop_Pump();  //stop pump op
            m.receipt();  //receipt op
	}
}