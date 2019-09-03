package Strategy_Classes;

import java.io.*;

class test
{
	public static void main (String[] args)	
	{
		Display_Menu check = new DM_1();
		DM_1 try1 = new DM_1();
		check = try1;
		check.display_menu();
	}

}