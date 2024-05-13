

package loop;

import java.util.Scanner;
public class For_Loop {

	public static void main(String[] args) {
		int result,num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			result=i*num;
			System.out.println(num+"x"+i+"="+result);
		}

	}

}
