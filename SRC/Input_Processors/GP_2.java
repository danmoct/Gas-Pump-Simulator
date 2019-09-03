package Input_Processors;

import Data_Store_Classes.*;
import Abstract_Factory.*;
import MDA_EFSM.*;

public class GP_2
{
	
        private MDA_EFSM m;
	private Data_Store d;
        private Abstract_Factory gp2;
        
        public GP_2(MDA_EFSM M, Abstract_Factory gp, Data_Store d2)
        {
            gp2 = new CF_GP_2();
            d = d2;
            m = M;
        }

	public void activate(float a, float b, float c)
	{
            
            if ((a>0) && (b>0) && (c>0))
            {
                d.set_Data((double)a, "temp_a");
                d.set_Data((double)b,"temp_b");
                d.set_Data((double)c, "temp_c");
                m.activate(); //calls activate op
            }
	}
	public void payCash(int c)
	{
            if (c>0)
            {
                d.set_Data(c, "temp_cash");
                m.start(); // start op
                m.payType(2);  //paytype op, 2 is for cash
            }
	}
	public void payCredit()
	{
            m.start(); //m start op
            m.payType(1);  //1 is credit pay type in op
	}
	public void approved()
	{
            m.approved();  //calls approved op
	}
	public void reject()
	{
            m.reject();   // calls cancel op
	}
	public void cancel()
	{
            m.cancel(); //calls cancel op
	}
	public void premium()
	{
            m.select_Gas(3);  //3 is premium gas for select gas op
            m.Continue();  // continue op
	}
	public void regular()
	{
            m.select_Gas(1);  //1 is regular gas for select gas op
            m.Continue();  // continue op
	}
	public void Super()
	{
            m.select_Gas(2);  //2 is super gas for select gas op
            m.Continue();  // continue op
	}
	public void startPump()
	{
            m.start_Pump();  // start pump op
	}
	public void pumpLiter()
	{
            if (((float)d.get_Data("cash") > 0) && (((float) d.get_Data("cash")) < ((float) d.get_Data("price")*(((int)d.get_Data("L")+1)))))
            {
                m.stop_Pump(); // stop pump op
            }
            else
                m.pump(); //pump op
                
	}
	public void stop()
	{
            m.stop_Pump(); // stop pump op
	}
	public void receipt()
	{
            m.receipt(); // receipt op
	}
	public void noReceipt()
	{
            m.noReceipt();  // no receipt op
	}

}