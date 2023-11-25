//Write a java program to find the index of a specific element in an integer array.
public class P5
{
    public static void main(String args[])
    {
        int find = 66;
        int Array[]={11,22,33,44,55,66,77,88,99};
        for (int i=0;i<Array.length;i++)
        {
            if ( find == Array[i])
            {
                System.out.println("the find is succesful the index value of the number is =");
                System.out.println(i);
                break;
            }
            else
            {
                System.out.println("find unsuccesful trying again");
            }
        }
    }
}