class Logic
{
    void FindMin(int a , int b , int c)
    {
        if(a<b && a<c)
        {
            System.out.println(a+" is Minimum number");
        }
        else if(b<a && b<c)
        {
            System.out.println(b+" is Minimum number");

        }
        else
        {
            System.out.println(c+" is Minimum number");


        }
        
    }
}



class program1_4


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindMin(3 , 7 , 2);

    }
}