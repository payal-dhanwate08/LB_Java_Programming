class Logic
{
    void CheckSign(int num)
    {
        if(num > 0)
        {
            System.out.println(" It is positive number");
        }
        else if(num < 0)
        {
            System.out.println(" It is Negative number");
        }
        else
        {
           System.out.println(" Zero");

        }
        
    }
}

class program1_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }
}