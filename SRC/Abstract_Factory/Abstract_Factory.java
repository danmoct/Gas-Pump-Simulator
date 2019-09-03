package Abstract_Factory;

import Strategy_Classes.*;
import Data_Store_Classes.*;

//abstract factory design pattern

public abstract class Abstract_Factory
{
	public abstract Data_Store create_Data_Store();
	public abstract Store_Price create_Store_Price();
	public abstract Pay_Msg create_Pay_Msg();
	public abstract Display_Menu create_Display_Menu();
	public abstract Set_Init_Values create_Set_Init_Values();
	public abstract Pump_Gas_Unit create_Pump_Gas_Unit();
	public abstract Gas_Pump_Msg create_Gas_Pump_Msg();
	public abstract Enter_Pin_Msg create_Enter_Pin_Msg();
	public abstract Initialize_Data create_Initialize_Data();
        public abstract Store_Cash create_Store_Cash();
        public abstract Reject_Msg create_Reject_Msg();
        public abstract Set_Price create_Set_Price();
        public abstract Stop_Msg create_Stop_Msg();
        public abstract Print_Receipt create_Print_Receipt();
        public abstract Cancel_Msg create_Cancel_Msg();
        public abstract Return_Cash create_Return_Cash();
        public abstract Wrong_Pin_Msg create_Wrong_Pin_Msg();
        public abstract Store_Pin create_Store_Pin();
        public abstract Ready_Msg create_Ready_Msg();
        
        
}