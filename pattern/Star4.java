package pattern;

public class Star4 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=5-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i*2;k++)
			{
				System.out.print((k%2==0)?"0":"1");
			}
			System.out.println();
		}
	}
}