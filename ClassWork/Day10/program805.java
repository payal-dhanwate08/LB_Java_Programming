// Dynamic Programing 
// Type - memorisetion

import java.util.*;

class program805
{
    

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements in series :");
        int size = sobj.nextInt();

        long dp[] = new long[size+1];            //space complesity

        dp[0] = 0;
        dp[1] = 1;

        int i = 0;

        System.out.print(dp[0]+" ");
        System.out.print(dp[1]+" ");

        for(i = 2; i <= size; i++)               // time complesity
        {
            dp[i] = dp[i-1] + dp[i-2];
            System.out.print(dp[i]+" ");
        }
        System.out.println();


    }
}
