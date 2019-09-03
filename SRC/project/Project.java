
package project;

import Strategy_Classes.*;
import Data_Store_Classes.*;
import Abstract_Factory.*;
import Input_Processors.*;
import MDA_EFSM.*;
import OP.*;
import java.util.Scanner;


public class Project {
    
//this is the driver for the entire build    
    
    
    public static void main(String[] args) {
    
        Project check = new Project();
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        
        System.out.println("\n\n\n\n\n\t\t\t\tCS 586 Final Project: Gas Pump Simulation");
        System.out.println("\t\t\t\t\tby Daniel Moctezuma\n\n\n\n\n\n");
        System.out.println("Input Processors:");
        System.out.println("1)Gas Pump 1");
        System.out.println("2)Gas Pump 2\n\n\n\n");
        
        while((selection != 1) || (selection !=2))
        {
            try{
                System.out.println("Please select a Gas Pump to test:");
                selection = scan.nextInt();
                if (selection == 1)
                {
                    check.GP_1_Test();
                    break;
                }
                if (selection ==2)
                {
                    check.GP_2_Test();
                    break;
                }
            }
            catch(Exception e)
            {
                
                scan.next();
            }
            System.out.println("Not a valid selection.");
        }     
     
    }
    
    public void GP_1_Test()
    {
        //GP_1 initialization data
        GP_1 test;
        MDA_EFSM m;
        Abstract_Factory AF;
        Data_Store d; 
        State [] s = new State[9];
        float a =-1, b = -1;
        int cash;
        char ch;
        String pin;
        
        //create Abstract factory, data store and OP
        AF = new CF_GP_1();        
        d= AF.create_Data_Store();
        OP o = new OP(AF,d); 
        
        //initialize MDA_EFSM and States         
        s[0] = new Start(o);
        s[1] = new S0(o);
        s[2] = new S1(o);
        s[3] = new S2(o);
        s[4] = new S3(o);
        s[5] = new S4(o);
        s[6] = new S5(o);
        s[7] = new S6(o);
        s[8] = new S7(o);
        m= new MDA_EFSM(s);
        
        //initialize GP_1
        test = new GP_1(m,AF,d);
        
        //Menu
        System.out.println("\t\t\t\t\tGas Pump-1");
        System.out.println("\t\tOperation Menu");
        System.out.println("\t\t0. Activate(float, float)");
        System.out.println("\t\t1. Start()");
        System.out.println("\t\t2. PayCredit()");
        System.out.println("\t\t3. Reject()");
        System.out.println("\t\t4. PayDebit(String)");
        System.out.println("\t\t5. Pin(String)");
        System.out.println("\t\t6. Cancel()");
        System.out.println("\t\t7. Approved()");
        System.out.println("\t\t8. Diesel()");
        System.out.println("\t\t9. Regular()");
        System.out.println("\t\ta. StartPump()");
        System.out.println("\t\tb. PumpGallon()");
        System.out.println("\t\tc. StopPump()");
        System.out.println("\t\td. FullTank()");        
        System.out.println("\t\tq. Quit program");
        System.out.println("\n\t\tGasPump-1 Execution");
        System.out.println();
        
        Scanner reader = new Scanner(System.in);
        ch ='1';
        
        while (ch != 'q')
        {
            
            System.out.println("\nSelect an Operation: ");
            System.out.println("0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-PayDebit, 5-Pin, 6-Cancel, 7-Approved");
            System.out.println("8-Diesel, 9-Regular, a-StartPump, b-PumpGallon, c-StopPump, d-FullTank, q-quit");
            ch = (char) reader.next().charAt(0);
            
            switch (ch)
            {
                case '0':  //Activate
                {
                    System.out.println("\nOperation: Activate(float a, float b)");
                    while ((a>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive float value:");
                            a = reader.nextFloat();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(a<0)
                            System.out.println("Not a valid selection.");
                    }
                    while ((b>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive float value:");
                            b = reader.nextFloat();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(b<0)
                            System.out.println("Not a valid selection.");
                    }                  
                    test.activate(a,b);
                    break;
                }
                case '1': //Start
                {
                    System.out.println("\nOperation: Start()");
                    test.start();
                    break;
                }
                case '2': //PayCredit
                {
                    System.out.println("\nOperation PayCredit()");
                    test.payCredit();
                    break;
                }
                case '3': //Reject
                {
                    System.out.println("\nOperation: Reject()");
                    test.reject();
                    break;
                }
                case '4': //PayDebit
                {
                    System.out.println("\nOperation: Debit(String)");
                    System.out.println("Please enter a pin parameter: ");
                    pin = reader.next();
                    test.payDebit(pin);
                    break;
                }
                case '5': //Pin
                {
                    System.out.println("\nOperation: Pin(String)");
                    System.out.println("Enter Your Pin: ");
                    String pin2 = reader.next();
                    test.pin(pin2);
                    break;
                }
                case '6': //Cancel
                {
                    System.out.println("\nOperation: Cancel()");
                    test.cancel();
                    break;
                }
                case '7': //Approved
                {
                    System.out.println("\nOperation: Approved()");
                    test.approved();
                    break;
                }
                case '8': //Diesel
                {
                    System.out.println("\nOperation: Diesel()");
                    test.diesel();
                    break;
                }
                case '9': // Regular
                {
                    System.out.println("\nOperation: Regular()");
                    test.regular();
                    break;
                }
                case 'a': //Start Pump
                {
                    System.out.println("\nOperation: StartPump()");
                    test.startPump();
                    break;
                }
                case 'b' : //Pump Gallon 
                {
                    System.out.println("\nOperation: PumpGallon()");
                    test.pumpGallon();
                    break;
                }
                case 'c' : // Stop Pump
                {
                    System.out.println("\nOperation: StopPump()");
                    test.stopPump();
                    break;
                }
                case 'd' : //Full Tank
                {
                    System.out.println("\nOperation: FullTank()");
                    test.fullTank();
                    break;
                }
                case 'q' : //quit
                    break;
            }           
            
        }
    }
    
    
    public void GP_2_Test()
    {
        //GP_2 initialization data
        GP_2 test;
        MDA_EFSM m;
        Abstract_Factory AF;
        Data_Store d; 
        State [] s = new State[9];
        float a = -1,b = -1,c = -1;
        int cash= -1;
        char ch;
        
        //create Abstract factory, data store and OP
        AF = new CF_GP_2();        
        d= AF.create_Data_Store();
        OP o = new OP(AF,d); 
        
        //initialize MDA_EFSM and States         
        s[0] = new Start(o);
        s[1] = new S0(o);
        s[2] = new S1(o);
        s[3] = new S2(o);
        s[4] = new S3(o);
        s[5] = new S4(o);
        s[6] = new S5(o);
        s[7] = new S6(o);
        s[8] = new S7(o);
        m= new MDA_EFSM(s);
        
        //initialize GP_2
        test = new GP_2(m,AF,d);
        
        //Menu
        System.out.println("\t\t\t\t\tGas Pump-2");
        System.out.println("\t\tOperation Menu");
        System.out.println("\t\t0. Activate(float, float, float)");
        System.out.println("\t\t1. PayCash(int)");
        System.out.println("\t\t2. PayCredit()");
        System.out.println("\t\t3. Approved()");
        System.out.println("\t\t4. Reject()");
        System.out.println("\t\t5. Cancel()");
        System.out.println("\t\t6. Premium()");
        System.out.println("\t\t7. Regular()");
        System.out.println("\t\t8. Super()");
        System.out.println("\t\t9. StartPump()");
        System.out.println("\t\ta. PumpLiter()");
        System.out.println("\t\tb. Stop()");
        System.out.println("\t\tc. Receipt()");
        System.out.println("\t\td. NoReceipt()");
        System.out.println("\t\tq. Quit program");
        System.out.println("\n\t\tGasPump-2 Execution");
        System.out.println();
        
        Scanner reader = new Scanner(System.in);
        ch ='1';
        
        while (ch != 'q')
        {
            System.out.println("\nSelect an Operation: ");
            System.out.println("0-Activate, 1-PayCash, 2-PayCredit, 3-Approved, 4-Reject, 5-Cancel, 6-Premium, 7-Regular");
            System.out.println("8-Super, 9-StartPump, a-PumpLiter, b-Stop, c-Receipt, d-NoReceipt, q-quit");
            ch = (char) reader.next().charAt(0);
            
            switch (ch)
            {
                case '0':  //Activate
                {
                    System.out.println("\nOperation: Activate(float a, float b, float c");
                    while ((a>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive float value:");
                            a = reader.nextFloat();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(a<0)
                            System.out.println("Not a valid selection.");
                    }
                    while ((b>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive float value:");
                            b = reader.nextFloat();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(b<0)
                            System.out.println("Not a valid selection.");
                    }
                    while ((c>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive float value:");
                            c = reader.nextFloat();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(c<0)
                            System.out.println("Not a valid selection.");
                    }
                    
                    test.activate(a,b,c);
                    break;
                }
                case '1': //PayCash
                {
                    System.out.println("\nOperation: PayCash(int c");
                    while ((cash>0)==false)
                    {
                        try
                        {
                            System.out.println("Enter a positive int value for parameter 'c':");
                            cash = reader.nextInt();
                            
                        }
                        catch(Exception e)
                        {
                            reader.next();   
                        }
                        if(cash<0)
                            System.out.println("Not a valid selection.");
                    }
                    
                    test.payCash(cash);
                    break;
                }
                case '2': //PayCredit
                {
                    System.out.println("\nOperation PayCredit()");
                    test.payCredit();
                    break;
                }
                case '3': //Approved
                {
                    System.out.println("\nOperation: Approved()");
                    test.approved();
                    break;
                }
                case '4': //Reject
                {
                    System.out.println("\nOperation: Reject()");
                    test.reject();
                    break;
                }
                case '5': //Cancel
                {
                    System.out.println("\nOperation: Cancel()");
                    test.cancel();
                    break;
                }
                case '6': //Premium
                {
                    System.out.println("\nOperation: Premium()");
                    test.premium();
                    break;
                }
                case '7': //Regular
                {
                    System.out.println("\nOperation: Regular()");
                    test.regular();
                    break;
                }
                case '8': //Super
                {
                    System.out.println("\nOperation: Super()");
                    test.Super();
                    break;
                }
                case '9': // Start Pump
                {
                    System.out.println("\nOperation: StartPump()");
                    test.startPump();
                    break;
                }
                case 'a': //Pump Liter
                {
                    System.out.println("\nOperation: PumpLiter()");
                    test.pumpLiter();
                    break;
                }
                case 'b' : //Stop 
                {
                    System.out.println("\nOperation: Stop()");
                    test.stop();
                    break;
                }
                case 'c' : // Receipt
                {
                    System.out.println("\nOperation: Receipt()");
                    test.receipt();
                    break;
                }
                case 'd' : //No Receipt
                {
                    System.out.println("\nOperation: NoReceipt()");
                    test.noReceipt();
                    break;
                }
                case 'q' : //quit
                    break;
            }           
            
        }
        
        
        
        
    }
    
}
