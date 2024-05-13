//	*******
//	*     *
//	*     *
//	*******

package pattern;

public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<7;j++)
			{
				if(i==0 || i==3 || j==0 || j==6)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
