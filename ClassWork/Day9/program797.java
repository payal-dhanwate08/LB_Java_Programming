import java.util.*;

class program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter your current balance :");
        int Current_Balance = sobj.nextInt(); 

        System.out.println("Please Enter the Amount that you want to withdraw");
        int withdraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || withdraw_Amount <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(withdraw_Amount % 100 != 0)
        {
            System.out.println("Transection Filde : Withdrowal amount must be a multiple of 100");
        }
        else if(withdraw_Amount > 25000)
        {
            System.out.println("Transection Filde : Maximum withdrowal per transaction is 25,000");
        }
        else if(Current_Balance - withdraw_Amount < 1000)
        {
            System.out.println("Transection Filde : After withdrowal amount , balance must remain at least 1,000");
        }
        else
        {
            System.out.println("Transection Succesful");
            System.out.println("Reamaining balance :"+(Current_Balance - withdraw_Amount));
        }

    }
}