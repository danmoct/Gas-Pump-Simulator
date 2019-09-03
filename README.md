# Gas Pump Simulator

## Description:
This was the final project for my Systems Architecture class while in Graduate School.  The main motivation for the project was to create a software application whose architecture would contain a platform independent design, ensuring the application could be reusable, maintainable, extensible and robust.  Through the use of Design Patterns, MDA-EFSM (Model Driven Architecture- Extended Finite State Machine) and UML diagrams, the application was built with low-coupled, highly-cohesive parts that allow for multiple configurations of a gas pump, such as: pumping in gallons or liters; paying with cash, debit or credit; and printing or displaying a receipt.  A full report including, MDA-EFSM, Class Diagrams, Sequence Diagrams and Class descriptions can be found in the "DOC" folder.  

## Installation:

This program is a java executable and will run from within the java runtime environment.  Apart from the java runtime environment, it requires no additional installation.  

## Usage:
The project can be found in the "DIST" folder and is a java executable.  Using the command line, from the "DIST" directory, run the program by typing the following:
##### java -jar Project.jar

The program will then give the user the option of choosing between two "Input Processors," two different gas pumps.  By following the MDA-EFSM diagram in the report (which can be found in the "DOC" folder), the user can simulate the use of a gas pump by appropriately choosing the correct steps from the operation menu.  An example of a successful sequence of selections in the simulation would be:

Gas Pump 1 -> Activate -> PayCredit -> Approved -> Regular -> StartPump -> PumpLiter -> PumpLiter -> Stop -> NoReceipt -> Quit program

If a selection cannot be made, based on the state of the gas pump, the user will be prompted to select another operation.  

If the user wishes to quit the program without finishing the simulation, they need only to choose "quit program" from the operation menu.
