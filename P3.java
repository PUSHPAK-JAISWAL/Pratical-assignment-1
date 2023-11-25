// Write a  program to create an object which contains a method and call that class method in the main method.
public class P3
{
    public static int add(int a , int b, int c)// operation method of the class
    {
          return a+b+c;
    }
    
    public static void main(String args[])// calling method of the class
    {
      P3 obj = new P3();
      int result = P3.add(3,4,123);
      System.out.println("the sum of 3,4,123 is as follows");
      System.out.println(result);
    }
}