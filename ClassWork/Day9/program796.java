import java.util.*;

class program796
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalDays = 0;
        int Fine = 0;

        System.out.println("Enter the number of days :");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(TotalDays <= 7)                       //No Fine applicabe
        {
            System.out.println("No fine Applicable");
            return;
        }
        else if(TotalDays >= 8 && TotalDays <=12)           // >8 and <= 12 fine 5ru
        {
            Fine = (TotalDays - 7) * 5;
        }
        else if(TotalDays > 12)                  //  > 12 fine is 10ru
        {
            Fine = (5 * 5) + ((TotalDays - 12) * 10);
        }
        System.out.println("Total fine to be paid :"+ Fine);
    }
}