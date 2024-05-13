/* 
"Taj Hotel" given the 5- list of Room types, cost per day Room types 
cost per day luxury 2500 a/c 2000 non a/c 1500 deluxe do the hotel 
reservation process.
*/

package thursday_lab_25_01;

import java.util.*;

public class TajHotel 
{
	int choice, numberOfDays,totalCost;
	char yesno;
	ArrayList<String> rooms=new ArrayList<>();
	ArrayList<Integer> cost=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		// Initialize room types and costs
		rooms.add("Luxury");
		rooms.add("A/C Room");
		rooms.add("Non A/C Room");
		rooms.add("Deluxe Room");
		rooms.add("Double Room");
		
		cost.add(2500);
		cost.add(2000);
		cost.add(1500);
		cost.add(1800);
		cost.add(3000);
	}
	
	public void display()
	{
		// Display available room types
        System.out.println("Available Room Types:");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println((i + 1) + ". " + rooms.get(i) + " - $" + cost.get(i) + " per day");
        }
	}
	
	public void SwitchCase()
	{
		accept();
		
		System.out.println("WELCOME TO TAJ HOTEL\n");
		System.out.println("-----------------------------------------");
		
		display();
        System.out.println();
        // Get user input for room selection
        System.out.println("Enter the number corresponding to your desired room type: ");
        choice = sc.nextInt();
        
		switch(choice)
		{
			case 1:
				calculate();
				break;
			case 2:
				calculate();
				break;
			case 3:
				calculate();
				break;
			case 4:
				calculate();
				break;
			case 5:
				calculate();
				break;
			default:
				System.out.println("This type of room is not valid.\nPlease select valid room");
		}
		reservationDetail();
		System.out.println("Thank you....!");
	}
	
	public void calculate()
	{
		// Calculate total cost for the reservation 
        System.out.println("How many days you want to stay: ");
        numberOfDays=sc.nextInt();
        
        totalCost = cost.get(choice - 1) * numberOfDays;
	}
	
	public void reservationDetail()
	{
		// Display reservation details
	    System.out.println("\nReservation Details:");
	    System.out.println("Room Type: " + rooms.get(choice - 1));
	    System.out.println("Cost per day: $" + cost.get(choice - 1));
	    System.out.println("Number of days: " + numberOfDays);
	    System.out.println("Total Cost: $" + totalCost);
	    System.out.println();
	}
	
	public static void main(String[] args) 
	{
		TajHotel tajhotel=new TajHotel();
		tajhotel.SwitchCase();
	}

}
