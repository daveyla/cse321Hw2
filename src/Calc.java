// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   public static int subtract(int a, int b) {
	   return a - b;
   }
   
   public static int multiply(int a, int b) {
	   return a * b;
   }
   
   public static float divide(int a, int b) {
	   return (float)a / b;
   }
}
