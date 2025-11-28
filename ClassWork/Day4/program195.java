/*
   iRow : 4
   iCol : 4
   
*
*       *
*       *       *
*       *       *       *


Diagonal pattern
*/
import java.util.Scanner;

class Pattern
{
    // Filter for squer Matrix
    public void Display(int iRow,int iCol)
    {
        int i = 0,j = 0;

        if(iRow != iCol)
        {
            System.out.println("invlid input");
            System.out.println("row number and column nunber should be same");
            return;
        }
        
        for(i = 1; i<= iRow; i++)
        {
            for(j = 1; i>=j; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }  
}


class program195
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Column :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }   
}



















