import java.util.*;

class program799
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;

        float DiscountAmount = 0.0f;
        float finalAmount = 0.0f;
        String MembershipType = null;

        System.out.println("Enter purchase amount :");
        Amount = sobj.nextInt();

        System.out.println("Enter type membership :(Premium/Regular)");
        MembershipType = sobj.next();

        if(
            (Amount < 0) || 
            ((MembershipType.equalsIgnoreCase("Premium") == false) &&
            (MembershipType.equalsIgnoreCase("Regular") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }
        
        if(Amount > 5000)        // 20%
        {
            DiscountAmount = (Amount * 0.2f); 
        }
        else if(Amount > 200)    // 10%
        {
            DiscountAmount = (Amount * 0.10f); 
        }
        else                       //0%
        {
            DiscountAmount = 0.0f;
        }
        finalAmount = Amount - DiscountAmount;

        if(MembershipType.equalsIgnoreCase("Premium"))
        {
            DiscountAmount = DiscountAmount + (finalAmount*0.05f);
            finalAmount = Amount - DiscountAmount;
        }
        System.out.println("Orignal Amount :"+Amount);
        System.out.println("Total Discounted:"+DiscountAmount);
        System.out.println("Final payable Amount:"+finalAmount);

    }
}