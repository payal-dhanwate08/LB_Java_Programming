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



/*

    Hexadecimal number formation

    1011      1111    1000    0101    0011    1011    1110    0001
    b          f        8       5       3       b       e       1

    No = 0xbf853be1
    




*/