import java.util.Scanner;
public class Array_demo {

	public static void main(String[] args) 
	{
		int i,calc,size;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		size=sc.nextInt();
		int num[]=new int[size];  //Array
		//Accept numbers in array
		System.out.println("Enter number: ");
		for(i=0;i<size;i++)
			num[i]=sc.nextInt();
		calc=num[0];
		//Display Array
		System.out.println("The numbers are");
		for(i=0;i<size;i++)
		{
			System.out.print("\t"+num[i]);
			if(num[i]>calc)
				calc=num[i];
		}
		
		System.out.println("Greatest number is: "+calc);
	}

}
