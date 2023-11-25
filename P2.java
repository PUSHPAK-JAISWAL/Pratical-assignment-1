// this is the calling program for P1
public class P2
{
    public static void main(String args[])
    {
        P1 obj = new P1();
        int result = P1.add(1,2);
        System.out.println(result);
        double result1 = P1.add(1,2,3);
        System.out.println(result1);
        float result2 = P1.add(11234,56789);
        System.out.println(result2);
    }
}