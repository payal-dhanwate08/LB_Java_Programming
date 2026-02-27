// 0   1   1   2   3   5   8   13  21  ......

import java.util.*;

class program804
{
    public static long Fibonacci(int N)
    {
        if(N <= 1)
        {
            return N;
        }
        return Fibonacci(N - 1) + Fibonacci(N - 2);
                //Second            //First                //return Next
    }

public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the number of elements in series :");
    int size = sobj.nextInt();

    int i = 0;

    for(i = 0; i <= size;i++)
    {
        System.out.println(Fibonacci(i)+" ");
    }
    System.out.println();
    
}
}
