package Data_Store_Classes;

import java.lang.Math.*;


public class DS_2 implements Data_Store
{
	float temp_a;
	float temp_b;
	float temp_c;
	float temp_cash;
	float Sprice;
	float Rprice;
	float Pprice;
	float cash;
	float total;
	int L;
	float price;
        
         public void set_Data(Object a, String type)
        {
            switch (type)
            {
                case "temp_a":
                {
                    set_temp_a((double) a);
                    break;
                }
                case "temp_b":
                {
                    set_temp_b((double) a);
                    break;
                }
                case "temp_c":
                {
                    set_temp_c((double) a);
                    break;
                }
                case "temp_cash":
                {
                    set_temp_cash((int) a);
                    break;
                }
                case "Sprice":
                {
                    set_Sprice((float) a);
                    break;
                }
                
                case "Rprice":
                {
                    set_Rprice((float) a);
                    break;
                }
                case "Pprice":
                {
                    set_Pprice((float) a);
                    break;
                }
                
                case "L":
                {
                    set_L((int) a);
                    break;
                }
                
                case "cash":
                {
                    set_cash((float) a);
                    break;
                }
                case "total":
                {
                    set_total((float) a);
                    break;
                }
                case "price":
                {
                    set_price((float) a);
                    break;
                }
                
            }
        }
        
        
        public Object get_Data(String type)
        {
            switch (type)
            {
                case "temp_a":
                    return get_temp_a();
                case "temp_b":
                    return get_temp_b();
                case "temp_c":
                    return get_temp_c();
                case "temp_cash":
                    return get_temp_cash();
                case "L":
                    return get_L();
                case "total":
                    return get_total();
                case "Rprice":
                    return get_Rprice();
                case "Sprice":
                    return get_Sprice();
                case "Pprice":
                    return get_Pprice();
                case "price":
                    return get_price();
                case "cash":
                    return get_cash();
            }
            return null;            
        }

	float get_temp_a()
	{
		return temp_a;
	}

	void set_temp_a(double a)
	{
		temp_a = (float) (Math.round( a*100.0)/100.0);
	}

	float get_temp_b()
	{
		return temp_b;
	}

	void set_temp_b(double b)
	{
		temp_b = (float) (Math.round( b*100.0)/100.0);
	}

	float get_temp_c()
	{
		return temp_c;
	}

	void set_temp_c(double c)
	{
		temp_c = (float) (Math.round( c*100.0)/100.0);
	}

	float get_temp_cash()
	{
		return temp_cash;
	}

	void set_temp_cash(double tcash)
	{
		temp_cash = (float) (Math.round( tcash*100.0)/100.0);
	}

	float get_Sprice()
	{
		return Sprice;
	}

	void set_Sprice(double S_price)
	{
		Sprice = (float) (Math.round( S_price*100.0)/100.0);
	}

	float get_Rprice()
	{
		return Rprice;
	}

	void set_Rprice(double R_price)
	{
		Rprice = (float) (Math.round( R_price*100.0)/100.0);
	}

	float get_Pprice()
	{
		return Pprice;
	}

	void set_Pprice(double P_price)
	{
		Pprice = (float) (Math.round( P_price*100.0)/100.0);
	}

	float get_cash()
	{
		return cash;
	}

	void set_cash(double cash2)
	{
		cash = (float) (Math.round( cash2*100.0)/100.0);
	}

	float get_total()
	{
		return total;
	}

	void set_total(double total2)
	{
		total = (float) (Math.round( total2*100.0)/100.0);
	}

	int get_L()
	{
		return L;
	}

	void set_L(int Liter)
	{
		L = Liter;
	}

	float get_price()
	{
		return price;
	}

	void set_price(double price2)
	{
		price = (float) (Math.round( price2*100.0)/100.0);
	}
}