package Strategy_Classes;

//strategy pattern

public class PM_1 extends Pay_Msg
{
	public void pay_msg(){
            System.out.println("\n\t \t \t Payment Methods");
            System.out.println("Credit");
            System.out.println("Debit");
            System.out.println("\n\nPlease select a payment method.\n");
	}
}