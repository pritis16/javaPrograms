package thursday_lab;
import java.util.Scanner;
public class HotelManagement 
{
	public static void main(String[] args) 
	{
		int choice,choice1,total=0,quantity=0;
		char innchoice,outchoice;
		String bill="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Priti's Restorant");
		System.out.println("_______________________________________\n");
		do
		{
			System.out.println("***** MENU *****");
			System.out.println("_______________________________________\n");
			System.out.println("1]Star.ter\n2]Main Course\n3]Drinks\n4]Dessert");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					do 
					{
						System.out.println(">>>>> Starter <<<<<");
						System.out.println("_______________________________________\n");
						System.out.println("1:Samosa\t20 Rs.\n2:Wada Pav\t15 Rs.\n3:Masala Papad\t30 Rs.");
						System.out.println("What do you want? ");
						choice1=sc.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=20*quantity;
								bill+="\nSamosa\t\t\t20 Rs"+"\t\t"+quantity;
								break;
							case 2:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=15*quantity;
								bill+="\nWada Pav\t\t15 Rs"+"\t\t"+quantity;
								break;
							case 3:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=30*quantity;
								bill+="\nMasala Papad\t\t30 Rs"+"\t\t"+quantity;
								break;
							default:
								System.out.println("Please choose correct item");
						}
						System.out.println("Do you want more Starter(y/n): ");
						innchoice=sc.next().charAt(0);
					}while(innchoice=='y' || innchoice=='Y');
					break;
				case 2:
					do
					{
						System.out.println(">>>>> Main Course <<<<<");
						System.out.println("_______________________________________\n");
						System.out.println("1:Panir Tikka\t\t200 Rs\n2:Misal\t\t\t80 Rs\n3:Soyabin Chilli\t180 Rs");
						System.out.println("What do you want? ");
						choice1=sc.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=200*quantity;
								bill+="\nPanir Tikka\t\t200 Rs"+"\t\t"+quantity;
								break;
							case 2:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=80*quantity;
								bill+="\nMisal\t\t\t80 Rs"+"\t\t"+quantity;
								break;
							case 3:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=180*quantity;
								bill+="\nSoyabin Chilli\t\t180 Rs"+"\t\t"+quantity;
								break;
							default:
								System.out.println("Please choose correct item");
						}
						System.out.println("Do you want more Main Course(y/n): ");
						innchoice=sc.next().charAt(0);
					}while(innchoice=='y' || innchoice=='Y');
					break;					
				case 3:
					do
					{
						System.out.println(">>>>> Drinks <<<<<");
						System.out.println("_______________________________________\n");
						System.out.println("\n1]Lassi\t\t50 Rs.\n2]Kokum Sharbat\t70 Rs.\n3]Orange Juice\t40 Rs.");
						System.out.println("What do you want? ");
						choice1=sc.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=50*quantity;
								bill+="\nLassi\t\t\t50 Rs."+"\t\t"+quantity;
								break;
							case 2:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=70*quantity;
								bill+="\nKokum Sharbat\t\t70 Rs."+"\t\t"+quantity;
								break;
							case 3:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=40*quantity;
								bill+="\nOrange Juice\t\t40 Rs."+"\t\t"+quantity;
								break;
							default:
								System.out.println("Please choose correct item");
						}
						System.out.println("Do you want more Drinks(y/n): ");
						innchoice=sc.next().charAt(0);
					}while(innchoice=='y' || innchoice=='Y');
					break;	
				case 4:
					do
					{
						System.out.println(">>>>> Dessert <<<<<");
						System.out.println("_______________________________________\n");
						System.out.println("1:Jalebi\t70 Rs.\n2:Kaju Katli\t50 Rs.\n3]Gulab jamun\t100 Rs.\n4:Shrikhand\t90 Rs.");
						System.out.println("What do you want? ");
						choice1=sc.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=70*quantity;
								bill+="\nJalebi\t\t\t70 Rs."+"\t\t"+quantity;
								break;
							case 2:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=50*quantity;
								bill+="\nKaju Katli\t\t50 Rs."+"\t\t"+quantity;
								break;
							case 3:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=100*quantity;
								bill+="\nGulab jamun\t\t100 Rs."+"\t\t"+quantity;
								break;
							case 4:
								System.out.println("Enter quantity: ");
								quantity=sc.nextInt();
								total+=90*quantity;
								bill+="\nShrikhand\t\t90 Rs."+"\t\t"+quantity;
								break;
							default:
								System.out.println("Please choose correct item");
						}
						System.out.println("Do you want more Dessert(y/n): ");
						innchoice=sc.next().charAt(0);
					}while(innchoice=='y' || innchoice=='Y');
					break;
				default:
					System.out.println("Sorry!! It is not Available in our restaurant\n Please choose another item\n");
			}	
			System.out.println("Do you want more item(y/n): ");
			outchoice=sc.next().charAt(0);
		}while(outchoice=='y' || outchoice=='Y');
		System.out.println("------------ BILL ------------");
		System.out.println("______________________________________________________");
		System.out.println("Item Name\t\tPrice\t\tQuantity");
		System.out.println("______________________________________________________");
		System.out.println(bill);
		System.out.println("______________________________________________________");
		System.out.println("Total Bill \t\t\t"+total+" Rs.\n");
		System.out.println("Thanks for Coming.....\nPlease, Come Again....");
	}

}
