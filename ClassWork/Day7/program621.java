import java.util.Scanner;

class program621
{
    public static void main(String A[])   
    {
        Scanner sobj = new Scanner(System.in);
        int no = 10;
        int iDigit = 0;
        int iCount = 0;

        System.out.println("Enter the number :");
        no = sobj.nextInt();

        while(no != 0)
        {
            iDigit = no % 2;
            iCount = iCount + iDigit;
            no = no/2;
  
        }
        System.out.println("Count of 1 is :"+iCount);
        
        
    }
}
