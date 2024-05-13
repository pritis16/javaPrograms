package exception;

public class DivisionCalculator 
{
   public static int divInt(int number1, int number2) 
   {
      if (number2 == 0) 
      {
         throw new IllegalArgumentException("Cannot divide by 0!");
      }
      return number1 / number2;
   }
 
   // Real number divide. Return a double.
   public static double divReal(int number1, int number2) 
   {
      if (number2 == 0) 
      {
         throw new IllegalArgumentException("Cannot divide by 0!");
      }
      return (double) number1 / number2;
   }
}
