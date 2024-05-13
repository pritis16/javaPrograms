package thursday_lab_15feb;
import java.util.*;

class Doctor
{
	int id;
	String name,speciality;
	
	public Doctor(int drID,String drName,String drSpeciality)
	{
		this.id=drID;
		this.name=drName;
		this.speciality=drSpeciality;
	}
}

class DoctorMethods 
{
	ArrayList<Doctor> doctorList=new ArrayList<>();
	int drID;
	String drName,drSpeciality;
	
	Scanner sc=new Scanner(System.in);
	
	public void addDoctor()
	{
		int num,i;
		
		System.out.println("How many doctor detail you want to enter: ");
		num=sc.nextInt();
		
		System.out.println("Enter "+num+" Doctor Detail");
		for(i=0;i<num;i++)
		{
			System.out.println("Enter doctor ID: ");
			drID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter doctor name: ");
			drName=sc.nextLine();
			System.out.println("Enter doctor speciality: ");
			drSpeciality=sc.nextLine();
			
			Doctor dr=new Doctor(drID, drName, drSpeciality);
			doctorList.add(dr);
		}
	}
	
	public void displayDoctors() 
	{
	    if (doctorList.isEmpty()) 
	    {
	        System.out.println("No doctors available.");
	    } 
	    else 
	    {
	    	System.out.println("---------------------------------------------");
	        System.out.println("List of Doctors:");
	        System.out.println("---------------------------------------------");
	        System.out.println("ID\tName\t\tSpeciality");
	        System.out.println("---------------------------------------------");
	        for (Doctor doctor : doctorList) 
	        {
	            System.out.println(doctor.id + "\t" + doctor.name + "\t\t" + doctor.speciality);
	        }
	        System.out.println("---------------------------------------------");
	    }
	}
	
	public void updateDoctor(int id) 
	{
	    for (Doctor doctor : doctorList) 
	    {
	        if (doctor.id == id) 
	        {
	            // Prompt user to enter updated information
	        	sc.nextLine();
	            System.out.println("Enter updated doctor name: ");
	            doctor.name = sc.nextLine();
	            System.out.println("Enter updated doctor speciality: ");
	            doctor.speciality = sc.nextLine();
	            System.out.println("Doctor details updated successfully.");
	            return;
	        }
	    }
	    System.out.println("Doctor with ID " + id + " not found.");
	}

	public void switchCase()
	{
		int choice;
		
		while(true)
		{
			System.out.println("Welcome to Hospital Management");
			System.out.println("---------------------------------------------");
			System.out.println("1. Add Doctor Detail\n2. View Doctor Detail\n3. Update Doctor Detail\n4. Exit");
			System.out.println("---------------------------------------------");
			System.out.println();
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					addDoctor();
					break;
				case 2:
					displayDoctors();
					break;
				case 3:
					int id;
					System.out.println("Enter doctor id you want to update: ");
					id=sc.nextInt();
					updateDoctor(id);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter valid case");
			}
		}
	}
}