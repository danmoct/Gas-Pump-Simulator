package OP;

import Data_Store_Classes.*;
import MDA_EFSM.*;
import Strategy_Classes.*;
import Abstract_Factory.*;

public class OP
{
	Data_Store d;	
        Abstract_Factory AF;        
        Store_Price SP;
        Display_Menu DM;
        Pump_Gas_Unit PG;
        Gas_Pump_Msg GPM;
        Pay_Msg PM;
        Set_Init_Values SI;
        Enter_Pin_Msg EPM;
        Initialize_Data ID;
        Store_Cash SC;
        Store_Pin STP_1;
        Wrong_Pin_Msg WPM;
        Reject_Msg RM;
        Return_Cash RC;
        Ready_Msg Ready;
        Print_Receipt PR;
        Cancel_Msg CM;
        Set_Price Set_P;
        Stop_Msg SM;
        
        public OP(Abstract_Factory AF1, Data_Store ds)
        {
            AF= AF1;
            d = ds;
            
            
        }
        
        
        
        public void store_Price()
        {
           
                
            
            SP = AF.create_Store_Price();
             
           
            float a,b,c;            
            a = (float) d.get_Data("temp_a");
            
            b = (float) d.get_Data("temp_b");
            
            if ((d.get_Data("temp_c")) == null)
                c = 0;
            else
                c = (float) d.get_Data("temp_c");            
            SP.store_price(a, b, c, d);
        }
        
        public void pay_Msg()
        {
            PM = AF.create_Pay_Msg();
            if (PM!= null)
                PM.pay_msg();
        }
        
        public void store_cash()
        {
            SC= AF.create_Store_Cash();
            SC.Store_Cash(d);
        }
        
        public void display_menu()
        {
            DM = AF.create_Display_Menu();
            DM.display_menu();
        }
        
        public void reject_msg()
        {
            RM = AF.create_Reject_Msg();
            RM.reject_msg();
        }
        
        public void set_price(int g, int M)
        {
            Set_P = AF.create_Set_Price();
            Set_P.set_price(g, M, d);
        }
        
        public void set_init_values()
        {
            SI = AF.create_Set_Init_Values();
            SI.set_init_values(d);
        }
        
        public void ready_msg()
        {
            Ready = AF.create_Ready_Msg();
            Ready.ready_msg();
        }
        
        public void pump_gas_unit()
        {
            PG = AF.create_Pump_Gas_Unit();
            PG.pump_gas_unit(d);
        }
        
        public void gas_pumped_msg()
        {
            GPM = AF.create_Gas_Pump_Msg();
            GPM.gas_pump_msg(d);
        }
        
        public void stop_msg()
        {
            SM = AF.create_Stop_Msg();
            SM.stop_msg();
        }
        
        public void print_receipt()
        {
            PR = AF.create_Print_Receipt();
            PR.print_receipt(d);
        }
        
        public void cancel_msg()
        {
            CM = AF.create_Cancel_Msg();
            CM.cancel_msg();
        }
        
        public void return_cash()
        {
            RC = AF.create_Return_Cash();
            if (RC != null)
            {
                if((float) d.get_Data("cash") !=0)
                    RC.return_cash(d);
            }
            
        }
        
        public void wrong_pin_msg()
        {
            WPM = AF.create_Wrong_Pin_Msg();
            WPM.wrong_pin_msg();
        }
        
        public void store_pin()
        {
            STP_1 = AF.create_Store_Pin();
            STP_1.store_pin(d);
        }
        
        public void enter_pin()
        {
            EPM= AF.create_Enter_Pin_Msg();
            EPM.enter_pin_msg();
        }
        
        public void initialize_Data()
        {
            ID = AF.create_Initialize_Data();
            ID.initialize_data(d);
        }
        
       
        
        
        
}