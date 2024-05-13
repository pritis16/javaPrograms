/*.Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.

*/

package thursday_lab;

public class Generate_Thread {

	public static void main(String[] args) 
	{
		Thread_Fabonacci tf=new Thread_Fabonacci();
		tf.start();
		Reverse_Order ro=new Reverse_Order();
		ro.start();
	}

}
