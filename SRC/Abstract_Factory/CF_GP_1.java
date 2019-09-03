
package Abstract_Factory;



import Data_Store_Classes.DS_1;
import Strategy_Classes.*;

//concrete factory of abstract factory design

        
public class CF_GP_1 extends Abstract_Factory{
    
    DS_1 d1;
    
    @Override
    public DS_1 create_Data_Store()
    {
        if (d1==null)
        {            
          d1 = new DS_1();
        }
        
        return d1;
    }

    @Override
    public Store_Price create_Store_Price() {
        return new SP_1();
    }

    @Override
    public Pay_Msg create_Pay_Msg() {
        return new PM_1();
    }

    @Override
    public Display_Menu create_Display_Menu() {
        return new DM_1();
    }

    @Override
    public Set_Init_Values create_Set_Init_Values() {
        return new SI_1();
    }

    @Override
    public Pump_Gas_Unit create_Pump_Gas_Unit() {
        return new PG_1();
    }

    @Override
    public Gas_Pump_Msg create_Gas_Pump_Msg() {
        return new GPM_1();
    }

    @Override
    public Enter_Pin_Msg create_Enter_Pin_Msg() {
        return new EP_1();
    }

    @Override
    public Initialize_Data create_Initialize_Data() {
        return new ID_1();
    }

    @Override
    public Store_Cash create_Store_Cash() {
        return null ; //new SC_1();
    }

    @Override
    public Reject_Msg create_Reject_Msg() {
        return new RM_1();
    }

    @Override
    public Set_Price create_Set_Price() {
        return new Set_P1();
    }

    @Override
    public Stop_Msg create_Stop_Msg() {
        return new SM_1();
    }

    @Override
    public Print_Receipt create_Print_Receipt() {
        return new PR_1();
    }

    @Override
    public Cancel_Msg create_Cancel_Msg() {
        return new CM_1();
    }

    @Override
    public Return_Cash create_Return_Cash() {
        return null; //new RC_1();
    }

    @Override
    public Wrong_Pin_Msg create_Wrong_Pin_Msg() {
        return new WPM_1();
    }

    @Override
    public Store_Pin create_Store_Pin() {
        return new STP_1();
    }
    
    @Override
    public Ready_Msg create_Ready_Msg()
    {
        return new Ready_M1();
    }
}
