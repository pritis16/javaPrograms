package pattern;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<5;k++)
			{
				System.out.print(k%2);
			}
			System.out.println();
		}
	}

}
