package Data_Store_Classes;

public class DS_1 implements Data_Store
{
	float temp_a;
	float temp_b;
	String temp_p;
	String pin;
	float price;
	int G;
	float total;
	float Rprice;
	float Dprice;
        
        
        public Object get_Data(String type)
        {
            switch (type)
            {
                case "temp_a":
                    return get_temp_a();
                case "temp_b":
                    return get_temp_b();
                case "temp_p":
                    return get_temp_p();
                case "pin":
                    return get_pin();
                case "price":
                    return get_price();
                case "G":
                    return get_G();
                case "total":
                    return get_total();
                case "Rprice":
                    return get_Rprice();
                case "Dprice":
                    return get_Dprice();
                
            }
            return null;            
        }
        
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
                case "temp_p":
                {
                    set_temp_p((String) a);
                    break;
                }
                case "pin":
                {
                   
                    set_pin((String) a);
                    break;
                }
                case "price":
                {
                    set_price((float) a);
                    break;
                }
                case "G":
                {
                    set_G((int) a);
                    break;
                }
                case "total":
                {
                    set_total((float) a);
                    break;
                }
                case "Rprice":
                {
                    
                    set_Rprice((float) a);
                    
                    break;
                }
                case "Dprice":
                {
                    set_Dprice((float) a);
                    break;
                }
            }
        }

	public float get_temp_a()
	{
                return temp_a;
	}

	public void set_temp_a(double a)
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

	String get_temp_p()
	{
		return temp_p;
	}

	void set_temp_p(String tempp)
	{
		temp_p = tempp;
	}

	String get_pin()
	{
            return pin;
	}

	void set_pin(String tpin)
	{
		pin = tpin;
	}

	float get_price()
	{
		return price;
	}

	void set_price(float lprice)
	{
            price = (float) (Math.round( lprice*100.0)/100.0);
                
	}

	int get_G()
	{
		return G;
	}

	void set_G(int Gallon)
	{
		G = Gallon;
	}

	float get_total()
	{
		return total;
	}

	void set_total(double total1)
	{
		total = (float) (Math.round( total1*100.0)/100.0);
	}

	float get_Rprice()
	{
		return Rprice;
	}

	void set_Rprice(float R_price)
	{
		Rprice = (float) (Math.round( R_price*100.0)/100.0);
	}

	float get_Dprice()
	{
		return Dprice;
	}

	void set_Dprice(float D_price)
	{
		Dprice = (float) (Math.round( D_price*100.0)/100.0);
	}
}