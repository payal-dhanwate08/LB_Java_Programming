class Logic
{
    void CheckEvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println(+n  + " Number is Even");
        }
        else
        {
            System.out.println(+n+" Number is odd");
        }
    }
}



class program1_2


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);

    }
}