class Logic
{
    void FindMax(int a , int b)
    {
        if(a>b)
        {
            System.out.println(a+" is Max number");
        }
        else
        {
            System.out.println(b+" is Max number");

        }
        
    }
}



class program1_3


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindMax(20 , 15);

    }
}