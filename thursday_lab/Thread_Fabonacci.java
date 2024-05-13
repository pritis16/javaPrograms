package thursday_lab;

public class Thread_Fabonacci extends Thread
{
	public void run() 
	{
        int num = 20,next,first = 0, second = 1;
        System.out.println("To display 20 terms of Fibonacci series: ");
        System.out.print(first + " ");
        System.out.print(second + " ");
       
        for (int i =3; i < num; i++) 
        {
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
        System.out.println();
    }
}
