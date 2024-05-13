
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=5;
		
		System.out.println("***** About Yourself *****");
		System.out.println("Name:Shinde Priti Sahebrao");
		System.out.println("College Name:Samarth College of Computer Science");
		System.out.println("Hobbies:\nReading\nListen Music");
		System.out.println();
		System.out.println("***** Arithmetic Operator ******");
		int res;
		res=num1+num2;
		System.out.println("Addition:"+res);
		res=num1-num2;
		System.out.println("Subtraction:"+res);
		res=num1*num2;
		System.out.println("Multiplication:"+res);
		res=num1/num2;
		System.out.println("Division:"+res);
		res=num1%num2;
		System.out.println("Remainder:"+res);
		System.out.println();
		System.out.println("Assignment Operator");
		num1+=num2;
		System.out.println("Addition:"+num1);
		num1-=num2;
		System.out.println("Subtraction:"+num1);
		num1*=num2;
		System.out.println("Multiplication:"+num1);
		num1/=num2;
		System.out.println("Division:"+num1);
		num1%=num2;
		System.out.println("Remainder:"+num1);
		System.out.println();
		System.out.println("***** Logical and Comparison Operator *****");
		boolean result;
		result=(num1>num2)&&(num1<num2);
		System.out.println("Result: "+result);
		
		
	}

}
