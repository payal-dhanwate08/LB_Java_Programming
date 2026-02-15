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

    Decimal               Hexadecimal            Binary
       0                       0                  0000
       1                       1                  0001
       2                       2                  0010
       3                       3                      
       4                       4
       5                       5
       6                       6
       7                       7
       8                       8
       9                       9
       10                      a
       11                      b
       12                      c 
       13                      d 
       14                      e
       15                      f



1000
1001
1010
1011
1100
1101
1110
1111


*/