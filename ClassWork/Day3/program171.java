/*
   input : 5
   outpu : a   b  c  d   e
   index : 1   2  3  4   5
   ASCII : 97 98 99 100 101

*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
       int iCnt = 0;
       int i = 96;

       for(iCnt =  0; iCnt <= iNo; iCnt++)
       {
            System.out.printf("%d\t",i+iCnt);
       }
        System.out.println();
    }
   
}

class program171
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequncy :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }   
}





