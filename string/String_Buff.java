package string;

import java.util.Scanner;

public class String_Buff {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String data;
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter your String");
		data=sc.nextLine();
		
		System.out.println("My String is ="+data);


		System.out.println(Integer.toHexString(System.identityHashCode(data)));
		data="Bye";
		System.out.println(Integer.toHexString(System.identityHashCode(data)));
		
		data="Good Morning";
		System.out.println(Integer.toHexString(System.identityHashCode(data)));
		*/
		
		/*
		System.out.println("Enter your first name");
		data=sc.nextLine();
		StringBuffer sb=new StringBuffer(data);
		String data1=sc.nextLine();
		System.out.println(Integer.toHexString(System.identityHashCode(sb)));
		
		System.out.println("My data is="+sb);
		sb.append(data1);
		System.out.println(Integer.toHexString(System.identityHashCode(sb)));
		
		System.out.println("name="+sb);
		
		*/
		
		
		System.out.println("Enter your city");
		String city=sc.nextLine();
		StringBuilder SB=new StringBuilder();
		SB.ensureCapacity(35);
		System.out.println("Initial capacity of SB:"+SB.capacity());
		SB.append(city);
		System.out.println("After adding city capacity of SB:"+SB.capacity());
		System.out.println("Enter your state");
		String state=sc.nextLine();
		SB.append("\n");
		SB.append(state);
		System.out.println("After Adding capacity of SB:"+SB.capacity());
		System.out.println("Address:\n"+SB);
		//(oldcapacity*2)+2.	
		
	}

}
