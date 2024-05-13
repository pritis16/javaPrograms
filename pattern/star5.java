package pattern;

public class star5 {

	public static void main(String[] args) {
		int i,j,row=4;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print("*");
			for(j=(row-i)*2;j>=1;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

}
