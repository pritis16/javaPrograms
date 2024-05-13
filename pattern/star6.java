package pattern;

public class star6 {

	public static void main(String[] args) {
		int i,j,k,row=2;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++)
				System.out.print("*");
			for(j=(row-i)*2;j>=1;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			for(k=row;k>=i;k--)
				System.out.print("*");
			for(k=(row-i)*2;k>=1;j--)
				System.out.print(" ");
//			System.out.println();
		}
	}

}
