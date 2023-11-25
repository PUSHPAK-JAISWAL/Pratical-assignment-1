//Write a java program  to calculate the sum of all elements in an integer array.
public class P4
{
    public static void main(String args[])
    {
        int Array[]={1,22,333,4444,55555,666666,7777777,88888888,999999999};
        int result=0;
        for(int i=0;i<Array.length;i++)
        {
            result += Array[i];
        }
        System.out.println(result);
    }
}