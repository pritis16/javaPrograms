/*
 * Q4. Write a Java program which creates only one object. If user attempts to create second object, he
 * should not be able to create it. (Using user defined Exception). 
 */

package thursday_lab;

class Object_one 
{
	static int cnt=0;
	Object_one() throws MoreOneObjectException
    {
         if (cnt == 0)
         {
              cnt++;
         }
         else
              throw new MoreOneObjectException();
    }
}

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			Object_one obj1=new Object_one();
			System.out.println("Object 1 created successfully.");
			Object_one obj2=new Object_one();
			System.out.println("Object 2 created successfully.");
		}
		catch(MoreOneObjectException ex)
		{
			System.out.println("Error: "+ex.getMessage());
		}
	}
}
